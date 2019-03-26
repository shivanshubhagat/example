package com.example.example_heterogenous_rv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class CombinedView extends AppCompatActivity {

    private ImageView v1_imageView, v2_imageView;
    ;
    private TextView v1_textView1, v1_textView2, v2_textView, v3_textView;

    public ImageView getV1_imageView() {
        return v1_imageView;
    }

    public void setV1_imageView(ImageView v1_imageView) {
        this.v1_imageView = v1_imageView;
    }

    public ImageView getV2_imageView() {
        return v2_imageView;
    }

    public void setV2_imageView(ImageView v2_imageView) {
        this.v2_imageView = v2_imageView;
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

    public TextView getV2_textView() {
        return v2_textView;
    }

    public void setV2_textView(TextView v2_textView) {
        this.v2_textView = v2_textView;
    }

    public TextView getV3_textView() {
        return v3_textView;
    }

    public void setV3_textView(TextView v3_textView) {
        this.v3_textView = v3_textView;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combined_view);

        v1_imageView = findViewById(R.id.v1_image);
        v1_textView1 = findViewById(R.id.v1_text1);
        v1_textView2 = findViewById(R.id.v1_text2);
        v2_imageView = findViewById(R.id.v2_image);
        v2_textView = findViewById(R.id.v1_text2);
        v3_textView = findViewById(R.id.v3_text);
    }
}
