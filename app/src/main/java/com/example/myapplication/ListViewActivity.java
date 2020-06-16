package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {

    private android.widget.ListView listView;
    private String[] options = {

            "Introduction",
            "My Bio App - Relative Layout",
            "My Bio App - Linear Layout",
            "D"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listView = findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, options);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i) {
                    case 0:

                        intent = new Intent(ListViewActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent = new Intent(ListViewActivity.this, MyBioRealtiveLayout.class);
                        startActivity(intent);
                        break;

                    case 2:
                        intent = new Intent(ListViewActivity.this, MyBioLinearLayout.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
