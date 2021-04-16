package org.umairmubasher.todotask07lec09;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Animation(View view) {
        ImageView imageView=findViewById(R.id.imageView);
//        imageView.animate().alpha(0).setDuration(500);
//        imageView.animate().translationYBy(1000).setDuration(2000);
//        imageView.animate().rotation(720).setDuration(3500);
        imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }
}