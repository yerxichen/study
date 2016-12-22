package com.example.softwise.studyapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import com.softwise.adapter.BaseExpandablelistAdapter;
import com.softwise.adapter.Group;
import com.softwise.adapter.Item;

import java.util.ArrayList;

public class ChangyongciActivity extends AppCompatActivity {

    //声明要用的变量
    private ExpandableListView ev_changshi;
    private ArrayList<Group> gData=null;
    private ArrayList<ArrayList<Item>> iData=null;
    private ArrayList<View> aList;
    private ArrayList<Item> cData=null;
    private Context mContext=null;
    private ExpandableListAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局和更改toolbar文字
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_base);
        TextView textView= (TextView) findViewById(R.id.tv_mytitle);
        textView.setText("常用词");
        //加载expand列表
        mContext=ChangyongciActivity.this;
        ev_changshi= (ExpandableListView) findViewById(R.id.el_changshi);
        //准备数据
        gData=new ArrayList<Group>();
        iData=new ArrayList<ArrayList<Item>>();
        gData.add(new Group("1.数词和量词"));
        gData.add(new Group("2.数量、顺序词汇的读法"));
        gData.add(new Group("3.星期的表示"));
        gData.add(new Group("4.日期表达法"));
        gData.add(new Group("5.月份表达法"));
        gData.add(new Group("6.四季表达法"));
        gData.add(new Group("7.时分秒表达法"));
        gData.add(new Group("8.其它时间相关表达法"));
        //第一组数据
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page043));
        cData.add(new Item(R.drawable.page044));
        cData.add(new Item(R.drawable.page045));
        cData.add(new Item(R.drawable.page046));
        cData.add(new Item(R.drawable.page047));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page048));
        cData.add(new Item(R.drawable.page049));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page050));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page051));
        cData.add(new Item(R.drawable.page052));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page053));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page054));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page055));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page056));
        cData.add(new Item(R.drawable.page057));
        cData.add(new Item(R.drawable.page058));
        iData.add(cData);


        //加载适配
        myAdapter=new BaseExpandablelistAdapter(gData,iData,mContext);
        ev_changshi.setAdapter(myAdapter);

        ev_changshi.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(mContext,"success",Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}
