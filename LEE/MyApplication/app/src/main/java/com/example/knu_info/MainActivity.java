package com.example.knu_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnchat;
    //Button btntime;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btnchat=(Button)findViewById(R.id.btnchat);
            Button btntime = (Button) findViewById(R.id.btntime);
            String stId=getIntent().getStringExtra("id");
            btntime.setOnClickListener((view) ->
            {
                Intent in = new Intent(MainActivity.this, TimetableActivity.class);
                startActivity(in);
            });

            btnchat.setOnClickListener((view)->{
                Intent in = new Intent(MainActivity.this,ChatActivity.class) ;
                in.putExtra("id",stId);

                startActivity(in);
            });

        }
}
