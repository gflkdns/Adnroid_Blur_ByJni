package com.mqt.cmakedemo2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SampleActy extends AppCompatActivity {

    int r = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.timg);
        //  Bitmap src = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        final ImageView iv_blur = (ImageView) findViewById(R.id.iv_blur);
        iv_blur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r += 5;
                iv_blur.setImageBitmap(StackBlur.blurNatively(bitmap, r % 20, false));


            }
        });
    }
}
