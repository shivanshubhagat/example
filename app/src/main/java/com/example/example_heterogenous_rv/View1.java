package com.example.example_heterogenous_rv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class View1 extends AppCompatActivity {

    private ImageView v1_imageView;
    private TextView v1_textView1, v1_textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view1);
        v1_imageView = findViewById(R.id.v1_image);
        v1_textView1 = findViewById(R.id.v1_text1);
        v1_textView2 = findViewById(R.id.v1_text2);
    }

    public ImageView getV1_imageView() {
        return v1_imageView;
    }

    public void setV1_imageView(ImageView v1_imageView) {
        this.v1_imageView = v1_imageView;
    }

    public TextView getV1_textView1() {
        return v1_textView1;
    }

    public void setV1_textView1(TextView v1_textView1) {
        this.v1_textView1 = v1_textView1;
    }

    public TextView getV1_textView2() {
        return v1_textView2;
    }

    public void setV1_textView2(TextView v1_textView2) {
        this.v1_textView2 = v1_textView2;
    }
}
