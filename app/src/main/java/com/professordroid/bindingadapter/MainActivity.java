package com.professordroid.bindingadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.ImageView;

import com.professordroid.bindingadapter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Buttons button = new Buttons("Diamond Button", 3);
        binding.setButton(button);
    }

    @BindingAdapter("app:youtubeButton")
    public static void youtubeButton(ImageView v, int subscriberCount) {
        if(subscriberCount == 1) {
            v.setImageResource(R.drawable.silver_button);
        } else if (subscriberCount == 2) {
            v.setImageResource(R.drawable.gold_button);
        } else if (subscriberCount == 3) {
            v.setImageResource(R.drawable.diamond_button);
        }
    }
}