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

public class JiBenJuXing extends AppCompatActivity {

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
        TextView textView= (TextView) findViewById(R.id.tv_mytitle);
        textView.setText("基本句型");
        //加载expand列表
        mContext=JiBenJuXing.this;
        ev_changshi= (ExpandableListView) findViewById(R.id.el_changshi);
        //准备数据
        gData=new ArrayList<Group>();
        iData=new ArrayList<ArrayList<Item>>();
        gData.add(new Group("日语基本句型(共88)"));
        //第一组数据
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page184));
        cData.add(new Item(R.drawable.page185));
        cData.add(new Item(R.drawable.page186));
        cData.add(new Item(R.drawable.page187));
        cData.add(new Item(R.drawable.page188));
        cData.add(new Item(R.drawable.page189));
        cData.add(new Item(R.drawable.page190));
        cData.add(new Item(R.drawable.page191));
        cData.add(new Item(R.drawable.page192));
        cData.add(new Item(R.drawable.page193));
        cData.add(new Item(R.drawable.page194));
        cData.add(new Item(R.drawable.page195));
        cData.add(new Item(R.drawable.page196));
        cData.add(new Item(R.drawable.page197));
        cData.add(new Item(R.drawable.page198));
        cData.add(new Item(R.drawable.page199));
        cData.add(new Item(R.drawable.page200));
        cData.add(new Item(R.drawable.page201));
        cData.add(new Item(R.drawable.page202));
        cData.add(new Item(R.drawable.page203));
        cData.add(new Item(R.drawable.page204));
        cData.add(new Item(R.drawable.page205));
        cData.add(new Item(R.drawable.page206));
        cData.add(new Item(R.drawable.page207));
        cData.add(new Item(R.drawable.page208));
        cData.add(new Item(R.drawable.page209));
        cData.add(new Item(R.drawable.page210));
        cData.add(new Item(R.drawable.page211));
        cData.add(new Item(R.drawable.page212));
        cData.add(new Item(R.drawable.page213));
        cData.add(new Item(R.drawable.page214));
        cData.add(new Item(R.drawable.page215));
        cData.add(new Item(R.drawable.page216));
        cData.add(new Item(R.drawable.page217));
        cData.add(new Item(R.drawable.page218));
        cData.add(new Item(R.drawable.page219));
        cData.add(new Item(R.drawable.page220));
        cData.add(new Item(R.drawable.page221));
        cData.add(new Item(R.drawable.page222));
        cData.add(new Item(R.drawable.page223));
        cData.add(new Item(R.drawable.page224));
        cData.add(new Item(R.drawable.page225));
        cData.add(new Item(R.drawable.page226));
        cData.add(new Item(R.drawable.page227));
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
