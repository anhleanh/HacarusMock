package com.anhvu.hacarusmock.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.anhvu.hacarusmock.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.news_btn)
    Button mBtnNews;
    @Bind(R.id.coaching_btn)
    Button mBtnCoaching;
    @Bind(R.id.food_logging_btn)
    Button mBtnFoodLogging;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mBtnNews.setOnClickListener(this);
        mBtnCoaching.setOnClickListener(this);
        mBtnFoodLogging.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.news_btn:
                gotoNews();
                break;
            case R.id.coaching_btn:
                gotoCoaching();
                break;
            case R.id.food_logging_btn:
                gotoFoodLogging();
                break;
        }
    }

    private void gotoNews() {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
        // overridePendingTransition(R.anim.enter_left, R.anim.exit_left);
    }

    private void gotoCoaching() {
        Intent intent = new Intent(this, CoachingActivity.class);
        startActivity(intent);
        // overridePendingTransition(R.anim.enter_left, R.anim.exit_left);
    }

    private void gotoFoodLogging() {
        Intent intent = new Intent(this, FoodLoggingActivity.class);
        startActivity(intent);
        // overridePendingTransition(R.anim.enter_left, R.anim.exit_left);
    }
}
