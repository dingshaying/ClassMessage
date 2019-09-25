package com.example.classmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ChooseActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

       initData();
       initView();
    }
    private List<String> data;
    private void initData() {
        data = new ArrayList<>();
        data.add("Android应用程序开发");
        data.add("移动应用程序测试");
        data.add("高等数学");
        data.add("高职英语");
        data.add("Java程序设计语言");
        data.add("Android游戏开发");
        data.add("心理健康");
        data.add("体育");

    }
    private void initView(){
        listView = findViewById(R.id.list_view);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,data
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String text = (String) parent.getItemAtPosition(position);
        if ("Android应用程序开发".equals(text)) {
            Intent intent = new Intent(ChooseActivity.this, IntrduceActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("text", "Android是一种基于Linux的自由及开放源代码的操作系统，Android 分为四个层，从高层到低层分别是应用程 序层、应用程序框架层、系统运行库层和 Linux 内核层。");
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if ("移动应用程序测试".equals(text)) {
            Intent intent = new Intent(ChooseActivity.this,IntrduceActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("text", "移动应用测试是指对移动应用进行测试，包括自动化测试和人工测试等");
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if ("高等数学".equals(text)) {
            Intent intent = new Intent(ChooseActivity.this,IntrduceActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("text", "广义地说，初等数学之外的数学都是高等数学，也有将中学较深入的代数、几何以及简单的集合论初步、逻辑初步称为中等数学的，将其作为中小学阶段的初等数学与大学阶段的高等数学的过渡。");
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if ("高职英语".equals(text)) {
            Intent intent = new Intent(ChooseActivity.this,IntrduceActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("text", "《高职英语》力图囊括高职学生毕业后在实际工作中可能用上的英语，力求以更多的、较为实用的“行业英语”知识来武装学生，使学生所学即所用。当前，许多高职院校使用的英语教材或注重英语语言知识的训练，或偏重应付各种等级考试，而与学生毕业后的实际工作有较大的距离，使得学生所学并非所用，偏离了高职教育的方向。");
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if ("Java程序设计语言".equals(text)) {
            Intent intent = new Intent(ChooseActivity.this,IntrduceActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("text", "Java语言是一种目前正在全世界得到迅速传播与广泛应用的面向对象的计算机程序设计语言。本书共分三篇17章。基础篇介绍了Java作为一种程序设计语言所具有的基本组成、语法规则、例外和线程等内容。应用篇介绍了若干类JavaApplet的实际应用。读者从网络上获得这些Applet资源后，可以立即应用到自己的主页中去。深入篇分析了Java语言几个显著的特点，包括输入\\输 出流、网络编程、抽象窗口工具箱AWT以及Applet的程序设计技巧等。");
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if ("Android游戏开发".equals(text)) {
            Intent intent = new Intent(ChooseActivity.this,IntrduceActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("text", "本书讨论如何将pc 上的3d 游戏移植到android 平台。作者从必备的技能和软件工具入手，逐步介绍如何从头构建纯java 游戏，如何混合使用opengl 3d 图形和jni，并以真实的pc 游戏wolfenstein 3d和doom 为例，介绍如何融合java 的优雅设计和c 的强大功能，使混合游戏达到最佳性能。");
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if ("心理健康".equals(text)) {
            Intent intent = new Intent(ChooseActivity.this,IntrduceActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("text", "心理健康的基本含义是指心理的各个方面及活动过程处于一种良好或正常的状态。心理健康的理想状态是保持性格完美、智力正常、认知正确、情感适当、意志合理、态度积极、行为恰当、适应良好的状态。");
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if ("体育".equals(text)) {
            Intent intent = new Intent(ChooseActivity.this,IntrduceActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("text", "体育运动是在人类发展过程中逐步开展起来的有意识地对自己 身体素质的培养的各种活动。采取了各种走、跑、跳、投以及舞蹈等多种形式的身体活动，这些活动就是人们通常称作的身体练习过程。");
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
