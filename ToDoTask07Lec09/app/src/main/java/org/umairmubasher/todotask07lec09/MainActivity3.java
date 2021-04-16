package org.umairmubasher.todotask07lec09;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        SeekBar seekBar=findViewById(R.id.seekBar);
        seekBar.setMax(50);
        ListView listView=findViewById(R.id.listViewSeekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //generate Table with seekBar value
                int tableNumber=progress;
                ArrayList<String> tableArrayList=new ArrayList<String>();
                for(int i=1; i<11; i++)
                {
                    tableArrayList.add(Integer.toString(i*tableNumber));
                }
                ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity3.this, android.R.layout.simple_list_item_1,tableArrayList);
                listView.setAdapter(arrayAdapter);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}