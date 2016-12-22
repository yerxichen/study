package com.example.softwise.studyapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.softwise.adapter.BaseExpandablelistAdapter;
import com.softwise.adapter.Group;
import com.softwise.adapter.Item;

import java.util.ArrayList;

public class CihuiYongfaActivity extends Activity {

    //声明要用的变量
    private ExpandableListView ev_changshi;
    private ArrayList<Group> gData=null;
    private  ArrayList<ArrayList<Item>> iData=null;
    private ArrayList<Item> cData=null;
    private Context mContext=null;
    private ExpandableListAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        //加载自定义标题
        TextView textView= (TextView) findViewById(R.id.tv_mytitle);
        textView.setText("词汇用法");
        //实例组件
        mContext=CihuiYongfaActivity.this;
        ev_changshi= (ExpandableListView) findViewById(R.id.el_changshi);
        //准备数据
        gData=new ArrayList<Group>();
        iData=new ArrayList<ArrayList<Item>>();
        //group数据
        gData.add(new Group("词汇用法一览"));
        //item数据
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page228));
        cData.add(new Item(R.drawable.page229));
        cData.add(new Item(R.drawable.page230));
        cData.add(new Item(R.drawable.page231));
        cData.add(new Item(R.drawable.page232));
        cData.add(new Item(R.drawable.page233));
        cData.add(new Item(R.drawable.page234));
        cData.add(new Item(R.drawable.page235));
        cData.add(new Item(R.drawable.page236));

        iData.add(cData);
        //加载适配
        myAdapter = new BaseExpandablelistAdapter(gData, iData, mContext);
        ev_changshi.setAdapter(myAdapter);

    }
}
