package org.umairmubasher.todotask06lec08;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView textView=findViewById(R.id.textView);

        Intent intent=getIntent();
        textView.setText(intent.getStringExtra("friendName"));
    }
}