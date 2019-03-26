package com.example.example_heterogenous_rv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class View3 extends AppCompatActivity {

    private TextView v3_textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view3);

        v3_textView = findViewById(R.id.v3_text);
    }
}
