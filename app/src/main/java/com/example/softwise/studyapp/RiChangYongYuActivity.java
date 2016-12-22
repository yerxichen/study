package com.example.softwise.studyapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.softwise.adapter.BaseExpandablelistAdapter;
import com.softwise.adapter.Group;
import com.softwise.adapter.Item;

import java.util.ArrayList;

public class RiChangYongYuActivity extends AppCompatActivity {
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
        //加载自定义标
        TextView textView= (TextView) findViewById(R.id.tv_mytitle);
        textView.setText("日常用语");
        //实例组件
        mContext=RiChangYongYuActivity.this;
        ev_changshi= (ExpandableListView) findViewById(R.id.el_changshi);
        //准备数据
        gData=new ArrayList<Group>();
        iData=new ArrayList<ArrayList<Item>>();
        //group数据
        gData.add(new Group("日常用语"));
        //item数据
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page236));
        cData.add(new Item(R.drawable.page237));
        cData.add(new Item(R.drawable.page238));
        cData.add(new Item(R.drawable.page239));
        cData.add(new Item(R.drawable.page240));
        cData.add(new Item(R.drawable.page241));
        iData.add(cData);
        //加载适配
        myAdapter = new BaseExpandablelistAdapter(gData, iData, mContext);
        ev_changshi.setAdapter(myAdapter);


    }
}