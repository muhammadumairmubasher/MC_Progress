package org.umairmubasher.todotask06lec10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

 public class MainActivity extends AppCompatActivity {

     ListView listview;
     EditText editText;
     ArrayList<String>  frinedArrayList;
     ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get Id of ListView
        listview = findViewById(R.id.myListView);
        Button button=findViewById(R.id.btnAdd);
        editText=findViewById(R.id.editTextAdd);

     //   String[] friendList = {"Numan Rana", "Nomi", "Ahmad"};

        //create ArrayList And Add items in it.
        frinedArrayList= new ArrayList<String>();
        frinedArrayList.add("Umar");
        frinedArrayList.add("Umair");
        frinedArrayList.add("Asad");
        frinedArrayList.add("Ali");

        //Create ArrayAdapter that Converts ArrayList of objects into Views Items
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frinedArrayList);
        listview.setAdapter(arrayAdapter);

        //This function does Sorting
        Collections.sort(frinedArrayList);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("You Clicked",frinedArrayList.get(position));
                Intent intent =new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("friendName",frinedArrayList.get(position));
                startActivity(intent);
            }

        });
    }

    public void AddItem(View view) {
        frinedArrayList.add(editText.getText().toString());
        //This update the Changes in Records
        arrayAdapter.notifyDataSetChanged();
        //This also update the Changes in Records. Both does same work
        // listview.setAdapter(arrayAdapter);

        // sort the data
        Collections.sort(frinedArrayList);
    }
 }