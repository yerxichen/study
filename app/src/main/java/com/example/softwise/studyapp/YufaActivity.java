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

public class YufaActivity extends AppCompatActivity {
    //声明要用的变量
    private ExpandableListView ev_changshi;
    private ArrayList<Group> gData=null;
    private ArrayList<ArrayList<Item>> iData=null;
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
        textView.setText("语法");
        //加载expand列表
        mContext=YufaActivity.this;
        ev_changshi= (ExpandableListView) findViewById(R.id.el_changshi);
        //准备数据
        gData=new ArrayList<Group>();
        iData=new ArrayList<ArrayList<Item>>();
        gData.add(new Group("1.判断句"));
        gData.add(new Group("2.存在句"));
        gData.add(new Group("3.愿望句式"));
        gData.add(new Group("4.形容词"));
        gData.add(new Group("5.形容动词"));
        gData.add(new Group("6.动词活用形式"));
        gData.add(new Group("7.动词·连体形&&连用形"));
        gData.add(new Group("8.动词·音便形"));
        gData.add(new Group("9.动词·未然形"));
        gData.add(new Group("10.动词·假定型"));
        gData.add(new Group("12.动词·命令型"));
        gData.add(new Group("13.动词·推量型"));
        gData.add(new Group("14.动词·授受关系"));
        gData.add(new Group("15.动词·使役态"));
        gData.add(new Group("16.动词·被动态"));
        //gData.add(new Group("7.助词、助动词"));
        gData.add(new Group("17.敬语"));
        //第一组数据
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page059));
        cData.add(new Item(R.drawable.page061));
        cData.add(new Item(R.drawable.page062));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page063));
        cData.add(new Item(R.drawable.page064));
        cData.add(new Item(R.drawable.page065));
        cData.add(new Item(R.drawable.page066));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page067));
        cData.add(new Item(R.drawable.page068));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page069));
        cData.add(new Item(R.drawable.page070));
        cData.add(new Item(R.drawable.page071));
        cData.add(new Item(R.drawable.page072));
        cData.add(new Item(R.drawable.page073));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page075));
        cData.add(new Item(R.drawable.page076));
        cData.add(new Item(R.drawable.page077));
        cData.add(new Item(R.drawable.page078));
        cData.add(new Item(R.drawable.page079));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page080));
        cData.add(new Item(R.drawable.page081));
        cData.add(new Item(R.drawable.page082));
        cData.add(new Item(R.drawable.page083));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page084));
        cData.add(new Item(R.drawable.page085));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page086));
        cData.add(new Item(R.drawable.page087));
        cData.add(new Item(R.drawable.page088));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page089));
        cData.add(new Item(R.drawable.page090));
        cData.add(new Item(R.drawable.page091));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page092));
        cData.add(new Item(R.drawable.page093));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page094));
        cData.add(new Item(R.drawable.page096));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page097));
        cData.add(new Item(R.drawable.page099));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page100));
        cData.add(new Item(R.drawable.page101));
        cData.add(new Item(R.drawable.page102));
        cData.add(new Item(R.drawable.page103));
        cData.add(new Item(R.drawable.page104));
        cData.add(new Item(R.drawable.page105));
        cData.add(new Item(R.drawable.page106));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page107));
        cData.add(new Item(R.drawable.page108));
        cData.add(new Item(R.drawable.page109));
        iData.add(cData);
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page110));
        cData.add(new Item(R.drawable.page111));
        cData.add(new Item(R.drawable.page112));
        cData.add(new Item(R.drawable.page113));
        cData.add(new Item(R.drawable.page114));
        cData.add(new Item(R.drawable.page115));
        cData.add(new Item(R.drawable.page116));
        cData.add(new Item(R.drawable.page117));
        cData.add(new Item(R.drawable.page118));
        iData.add(cData);
        //留给助动词
        cData=new ArrayList<Item>();
        cData.add(new Item(R.drawable.page173));
        cData.add(new Item(R.drawable.page174));
        cData.add(new Item(R.drawable.page175));
        cData.add(new Item(R.drawable.page176));
        cData.add(new Item(R.drawable.page177));
        cData.add(new Item(R.drawable.page178));
        cData.add(new Item(R.drawable.page179));
        cData.add(new Item(R.drawable.page180));
        cData.add(new Item(R.drawable.page181));
        cData.add(new Item(R.drawable.page182));
        cData.add(new Item(R.drawable.page183));
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
