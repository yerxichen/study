package com.softwise.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.softwise.studyapp.R;

import java.util.ArrayList;


/**
 * Created by softwise on 2016/12/15.
 */

public class BaseExpandablelistAdapter extends BaseExpandableListAdapter {

    private ArrayList<Group> gData;
    private ArrayList<ArrayList<Item>> iData;
    private Context mContext;

    public BaseExpandablelistAdapter(ArrayList<Group> gData, ArrayList<ArrayList<Item>> iData, Context mContext) {
        this.gData = gData;
        this.iData = iData;
        this.mContext = mContext;
    }

    @Override
    public int getGroupCount() {
        return gData.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return iData.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return gData.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return iData.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    //取得给定分组的视图
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ViewHolderGroup holderGroup;
        //判断convertView是否被初始化过
        if (convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.base_group,parent,false);
            holderGroup=new ViewHolderGroup();
            holderGroup.tv_group= (TextView) convertView.findViewById(R.id.tv_groupTitle);
            convertView.setTag(holderGroup);
        }else{
            holderGroup= (ViewHolderGroup) convertView.getTag();
        }
        holderGroup.tv_group.setText(gData.get(groupPosition).getGroup());
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ViewHolderItem holderItem;
        if (convertView==null){
            convertView=LayoutInflater.from(mContext).inflate(R.layout.base_item,parent,false);
            holderItem=new ViewHolderItem();
            holderItem.iv_item= (ImageView) convertView.findViewById(R.id.iv_item);

            convertView.setTag(holderItem);
        }else {
            holderItem= (ViewHolderItem) convertView.getTag();
        }
        holderItem.iv_item.setImageResource(iData.get(groupPosition).get(childPosition).getItem());

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    //优化适配器
    private static class ViewHolderGroup{
        private TextView tv_group;
    }

    private  static class ViewHolderItem{
        private ImageView iv_item;
    }
}
