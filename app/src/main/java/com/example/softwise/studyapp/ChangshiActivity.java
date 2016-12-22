package com.example.softwise.studyapp;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import com.softwise.Util.ToDBC;
import com.softwise.adapter.BaseExpandablelistAdapter;
import com.softwise.adapter.Group;
import com.softwise.adapter.Item;

import java.util.ArrayList;
public class ChangshiActivity extends AppCompatActivity {

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
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_base);
        //加载自定义标题
        TextView textView= (TextView) findViewById(R.id.tv_mytitle);
        textView.setText("常识");
        //实例组件
        mContext=ChangshiActivity.this;
        ev_changshi= (ExpandableListView) findViewById(R.id.el_changshi);
        //准备数据
        gData=new ArrayList<Group>();
        iData=new ArrayList<ArrayList<Item>>();
        //group数据
        gData.add(new Group("1.50音及日语的音调（重音）"));
        gData.add(new Group("2.常用中国姓氏读法"));
        gData.add(new Group("3.常用日本姓氏读法"));
        gData.add(new Group("4.语法术语名"));
        gData.add(new Group("5.日语词汇分类及地名和读法"));
        gData.add(new Group("6.英文字母日语读法"));
        //item数据
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page025));
        cData.add(new Item(R.drawable.page026));
        cData.add(new Item(R.drawable.page027));
        cData.add(new Item(R.drawable.page028));
        cData.add(new Item(R.drawable.page029));
        cData.add(new Item(R.drawable.page030));
        cData.add(new Item(R.drawable.page031));
        cData.add(new Item(R.drawable.page032));
        cData.add(new Item(R.drawable.page033));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page034));
        cData.add(new Item(R.drawable.page035));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page036));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page037));
        cData.add(new Item(R.drawable.page038));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page039));
        cData.add(new Item(R.drawable.page040));
        cData.add(new Item(R.drawable.page041));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page042));
        iData.add(cData);

        //加载适配
        myAdapter=new BaseExpandablelistAdapter(gData,iData,mContext);
        ev_changshi.setAdapter(myAdapter);

//        ev_changshi.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//            @Override
//            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
//                Toast.makeText(mContext,"success",Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });

    }
}
