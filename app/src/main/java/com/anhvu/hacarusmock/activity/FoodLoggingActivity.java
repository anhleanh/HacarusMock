package com.anhvu.hacarusmock.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.anhvu.hacarusmock.R;
import com.anhvu.hacarusmock.databinding.ActivityFoodLoggingBinding;
import com.anhvu.hacarusmock.model.Carrot;

public class FoodLoggingActivity extends AppCompatActivity {

    private EditText mEdtValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_logging);

        mEdtValue = (EditText) this.findViewById(R.id.value_edt);

        final ActivityFoodLoggingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_food_logging);
        //FoodDetail foodDetail = new FoodDetail();
        final Carrot carrot = new Carrot();
        carrot.setTitle("Carrot");
        carrot.setValue(100);
        binding.setFooddetail(carrot);
        mEdtValue.setText("7474");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                carrot.setValue(20);

            }
        }, 4000);

    }

}
