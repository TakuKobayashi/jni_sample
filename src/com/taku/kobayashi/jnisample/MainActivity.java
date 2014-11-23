package com.taku.kobayashi.jnisample;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

  private Bitmap _bmp;
  private ImageView _imageView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final TextView textView = (TextView) findViewById(R.id.text);
    textView.setText("fuga");
    Button button = (Button) findViewById(R.id.button);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        textView.setText(hello());
      }
    });


    _bmp = BitmapFactory.decodeResource(getResources(), R.drawable.android_sample);
    _imageView = (ImageView) findViewById(R.id.image);
    _imageView.setImageBitmap(_bmp);
    Button imageButton = (Button) findViewById(R.id.ImageChangeButton);
    imageButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });

  }

  private native String hello();

  static {
    System.loadLibrary("jni_sample");
  }
}
