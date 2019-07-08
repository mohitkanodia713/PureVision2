package com.purevision.purevision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView simpleGrid;
    Button addStream;

    public static ArrayList<String> cam_url = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleGrid = findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter = new CustomAdapter(this, cam_url);
        simpleGrid.setAdapter(customAdapter);

        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("url", cam_url.get(position));
                startActivity(intent);
            }
        });

        addStream = findViewById(R.id.addStream);

        addStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                startActivity(intent);
            }
        });
    }
}
