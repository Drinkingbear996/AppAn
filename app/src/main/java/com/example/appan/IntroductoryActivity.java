package com.example.appan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

public class IntroductoryActivity extends AppCompatActivity {


    ImageView logo,appName,splashImg;
    LottieAnimationView lottieAnimationView;

    private Button btn_mybut = null;
    private Button btn_mybut2 = null;
    private Button btn_mybut3 = null;
    private Button btn_mybut4 = null;
    private Button btn_mybut5 = null;
    private Button btn_mybut6 = null;
    private Button btn_mybut7 = null;
    private Button btn_mybut8 = null;

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        //设置标题居中
        // 获取ActionBar
        ActionBar actionBar = getSupportActionBar();

        // 允许自定义视图和Home图标显示在ActionBar上
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_SHOW_HOME);

        // 设置自定义视图为应用程序标题
        TextView titleView = new TextView(this);
        titleView.setText("招聘数据可视化");
        titleView.setTextSize(20);
        titleView.setTextColor(getResources().getColor(android.R.color.white));
        titleView.setGravity(Gravity.CENTER);

        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
        layoutParams.gravity = Gravity.CENTER;

        actionBar.setCustomView(titleView, layoutParams);
//    以下是背景和动画的滑动参数调整

        logo=findViewById(R.id.logo);
//        appName=findViewById(R.id.app_name);
        splashImg=findViewById(R.id.img);
        lottieAnimationView =findViewById(R.id.lottie);

        splashImg.animate().translationY(0).setDuration(1000).setStartDelay(4000);
//        appName.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(2600).setDuration(1000).setStartDelay(4000);
        //调整动画
        lottieAnimationView.animate().translationY(-2200).setDuration(3000).setStartDelay(4000);

//       按钮
        btn_mybut = (Button) findViewById(R.id.btn_mybut);
        btn_mybut7 = (Button) findViewById(R.id.btn_mybut7);
        btn_mybut2 = (Button) findViewById(R.id.btn_mybut2);
        btn_mybut3 = (Button) findViewById(R.id.btn_mybut3);
        btn_mybut4 = (Button) findViewById(R.id.btn_mybut4);
        btn_mybut5 = (Button) findViewById(R.id.btn_mybut5);
        btn_mybut6 = (Button) findViewById(R.id.btn_mybut6);
        btn_mybut8 = (Button) findViewById(R.id.btn_mybut8);
// 将所有的按钮添加到列表中
        List<Button> buttonList = new ArrayList<>();
        buttonList.add(btn_mybut);
        buttonList.add(btn_mybut2);
        buttonList.add(btn_mybut3);
        buttonList.add(btn_mybut4);
        buttonList.add(btn_mybut5);
        buttonList.add(btn_mybut6);
        buttonList.add(btn_mybut7);
        buttonList.add(btn_mybut8);

        //
        for (Button button : buttonList) {
            button.setVisibility(View.INVISIBLE); // 设置不可见
        }

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                for (Button button : buttonList) {
                    button.setTextColor(getResources().getColor(R.color.black)); //设置按钮为黑色
                    button.setShadowLayer(2, 0, 0, Color.BLACK);
                    button.setVisibility(View.VISIBLE); // 重新显示按钮
                }
            }
        }, 6000); // 3秒钟后运行代码



        btn_mybut.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.powerbi.com/view?r=eyJrIjoiZjEyOTQ5MGMtMzM4Yy00Yzk5LTk2YWMtOWVmNDMzODBjNDc3IiwidCI6Ijc2NWUxOWI5LWJjMmEtNGU1NC1iNzY5LWI2ZWY4ODQ2YWM5MyIsImMiOjEwfQ%3D%3D");
                Intent it = new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(uri);
                startActivity(it);
            }

        });
        btn_mybut2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.powerbi.com/view?r=eyJrIjoiYTU0YmVlMjctOWU3OS00YTY0LWFjNjUtYjI3MDVjZGVjNDJjIiwidCI6Ijc2NWUxOWI5LWJjMmEtNGU1NC1iNzY5LWI2ZWY4ODQ2YWM5MyIsImMiOjEwfQ%3D%3D");
                Intent it = new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(uri);
                startActivity(it);
            }

        });
        btn_mybut3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.powerbi.com/view?r=eyJrIjoiYzVjODVjNWQtYzczNi00NWNhLThhOWUtYTdjNjJlOTYyYWY4IiwidCI6Ijc2NWUxOWI5LWJjMmEtNGU1NC1iNzY5LWI2ZWY4ODQ2YWM5MyIsImMiOjEwfQ%3D%3D");
                Intent it = new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(uri);
                startActivity(it);
            }

        });
        btn_mybut4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.powerbi.com/view?r=eyJrIjoiZmFkYzc4MTctNDA2Ny00YjU0LWE5MTctZGE2Mjg3MTY1ZDc0IiwidCI6Ijc2NWUxOWI5LWJjMmEtNGU1NC1iNzY5LWI2ZWY4ODQ2YWM5MyIsImMiOjEwfQ%3D%3D");
                Intent it = new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(uri);
                startActivity(it);
            }

        });
        btn_mybut5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.powerbi.com/view?r=eyJrIjoiYTM2ZDBlYzktZGM5YS00M2QxLWE2MDAtODI3MTYxNTRiZGIzIiwidCI6Ijc2NWUxOWI5LWJjMmEtNGU1NC1iNzY5LWI2ZWY4ODQ2YWM5MyIsImMiOjEwfQ%3D%3D");
                Intent it = new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(uri);
                startActivity(it);
            }

        });
        btn_mybut6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.powerbi.com/view?r=eyJrIjoiMWViMmRjNjEtNWUyNy00MmZiLWEzZGItZDRjNTBkM2RiYzc2IiwidCI6Ijc2NWUxOWI5LWJjMmEtNGU1NC1iNzY5LWI2ZWY4ODQ2YWM5MyIsImMiOjEwfQ%3D%3D");
                Intent it = new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(uri);
                startActivity(it);
            }

        });
        btn_mybut7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.powerbi.com/view?r=eyJrIjoiMzRlZWU2YjMtZTNiYy00ZGI4LWIzYWEtMTA3ODI3YzRkN2I1IiwidCI6Ijc2NWUxOWI5LWJjMmEtNGU1NC1iNzY5LWI2ZWY4ODQ2YWM5MyIsImMiOjEwfQ%3D%3D");
                Intent it = new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(uri);
                startActivity(it);
            }

        });
        btn_mybut8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.powerbi.com/view?r=eyJrIjoiZjQ5MTg0N2MtNWVmYy00ODgyLThkZjUtNGFmMjI2YzAyY2U0IiwidCI6Ijc2NWUxOWI5LWJjMmEtNGU1NC1iNzY5LWI2ZWY4ODQ2YWM5MyIsImMiOjEwfQ%3D%3D");
                Intent it = new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(uri);
                startActivity(it);
            }

        });
    }


}