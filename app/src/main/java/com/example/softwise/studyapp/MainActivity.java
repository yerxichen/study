package com.example.softwise.studyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private String[] hlist={"常识","各种常用词","语法","日语基本句型","词汇用法","日常用语","补充部分"};
    //实例listView对象
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.lv_homelist);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Intent intent1=new Intent(MainActivity.this,ChangshiActivity.class);
                this.startActivity(intent1);
                break;
            case 1:
                Intent intent2=new Intent(MainActivity.this,ChangyongciActivity.class);
                this.startActivity(intent2);
                break;
            case 2:
                Intent intent3=new Intent(MainActivity.this,YufaActivity.class);
                this.startActivity(intent3);
                break;
            case 3:
                Intent intent4=new Intent(MainActivity.this,JiBenJuXing.class);
                this.startActivity(intent4);
                break;
            case 4:
                Intent intent5=new Intent(MainActivity.this,CihuiYongfaActivity.class);
                this.startActivity(intent5);
                break;
            case 5:
                Intent intent6=new Intent(MainActivity.this,RiChangYongYuActivity.class);
                this.startActivity(intent6);
                break;
            case 6:
                Intent intent7=new Intent(MainActivity.this,BuChongActivity.class);
                this.startActivity(intent7);
                break;
        }
    }
}
