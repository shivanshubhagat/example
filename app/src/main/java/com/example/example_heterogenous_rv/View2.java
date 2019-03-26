package com.example.example_heterogenous_rv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class View2 extends AppCompatActivity {

    private ImageView v2_imageView;
    private TextView v2_textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);

        v2_imageView = findViewById(R.id.v2_image);
        v2_textView = findViewById(R.id.v1_text2);
    }

    public ImageView getV2_imageView() {
        return v2_imageView;
    }

    public void setV2_imageView(ImageView v2_imageView) {
        this.v2_imageView = v2_imageView;
    }

    public TextView getV2_textView() {
        return v2_textView;
    }

    public void setV2_textView(TextView v2_textView) {
        this.v2_textView = v2_textView;
    }
}
