package com.example.softwise.studyapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.softwise.adapter.BaseExpandablelistAdapter;
import com.softwise.adapter.Group;
import com.softwise.adapter.Item;

import java.util.ArrayList;

public class BuChongActivity extends AppCompatActivity {

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
        //加载布局和更改toolbar文字
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_base);
        TextView textView = (TextView) findViewById(R.id.tv_mytitle);
        textView.setText("补充部分");
        //加载expand列表
        mContext = BuChongActivity.this;
        ev_changshi = (ExpandableListView) findViewById(R.id.el_changshi);
        //准备数据
        gData = new ArrayList<Group>();
        iData = new ArrayList<ArrayList<Item>>();
        //第一组数据
        gData.add(new Group("疑问词"));
        cData = new ArrayList<Item>();
        cData.add(new Item(R.drawable.page241));
        cData.add(new Item(R.drawable.page242));
        cData.add(new Item(R.drawable.page243));
        cData.add(new Item(R.drawable.page244));
        cData.add(new Item(R.drawable.page245));
        cData.add(new Item(R.drawable.page246));
        iData.add(cData);
        //第二组数据
        gData.add(new Group("小词·PART1"));
        cData = new ArrayList<Item>();
        cData.add(new Item(R.drawable.page247));
        cData.add(new Item(R.drawable.page248));
        cData.add(new Item(R.drawable.page249));
        cData.add(new Item(R.drawable.page250));
        cData.add(new Item(R.drawable.page251));
        cData.add(new Item(R.drawable.page252));
        cData.add(new Item(R.drawable.page253));
        cData.add(new Item(R.drawable.page254));
        cData.add(new Item(R.drawable.page255));
        cData.add(new Item(R.drawable.page256));
        iData.add(cData);
        //第一组数据
        gData.add(new Group("小词·PART2"));
        cData = new ArrayList<Item>();
        cData.add(new Item(R.drawable.page256));
        cData.add(new Item(R.drawable.page257));
        cData.add(new Item(R.drawable.page258));
        cData.add(new Item(R.drawable.page259));
        cData.add(new Item(R.drawable.page260));
        cData.add(new Item(R.drawable.page261));
        cData.add(new Item(R.drawable.page262));
        cData.add(new Item(R.drawable.page263));
        cData.add(new Item(R.drawable.page264));
        cData.add(new Item(R.drawable.page265));
        cData.add(new Item(R.drawable.page266));
        cData.add(new Item(R.drawable.page267));
        cData.add(new Item(R.drawable.page268));
        cData.add(new Item(R.drawable.page269));
        iData.add(cData);

        //加载适配
        myAdapter = new BaseExpandablelistAdapter(gData, iData, mContext);
        ev_changshi.setAdapter(myAdapter);
    }
}
