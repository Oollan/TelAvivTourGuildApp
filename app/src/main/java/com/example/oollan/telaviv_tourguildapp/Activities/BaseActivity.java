package com.example.oollan.telaviv_tourguildapp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.oollan.telaviv_tourguildapp.Fragments.BaseFragment;
import com.example.oollan.telaviv_tourguildapp.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new BaseFragment()).commit();
    }
}
