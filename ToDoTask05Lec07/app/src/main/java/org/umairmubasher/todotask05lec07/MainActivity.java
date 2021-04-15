package org.umairmubasher.todotask05lec07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textViewCounter);
        button=findViewById(R.id.buttonCount);
        Log.d("ALC","onCreate() called");

        if(savedInstanceState!=null)
        {
            count=savedInstanceState.getInt("value");
            textView.setText(String.valueOf(count));
        }
    }
    public void increaseNumber(View view)
    {
        count = Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(String.valueOf(count));
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC","onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC","onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC","onPause() called");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC","onStop() called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC","onDestroyed() called");

    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value", count);
    }

    public void MoveActivity2(View View)
    {
        Intent intent=new Intent(this,Activity2.class);
        startActivity(intent);
    }
    public void MoveActivity3(View View)
    {
        Intent intent=new Intent(this,Activity3.class);
        startActivity(intent);
    }

}