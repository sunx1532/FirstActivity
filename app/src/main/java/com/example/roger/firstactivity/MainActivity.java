package com.example.roger.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Button btn1 = findViewById(R.id.btn1);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Click on Button", Toast.LENGTH_SHORT).show();
//            }
//        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                finish();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu first_activity_menu) {
        getMenuInflater().inflate(R.menu.menu, first_activity_menu);
        return super.onCreateOptionsMenu(first_activity_menu);
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem firstActivityMenuItem) {
//        switch (firstActivityMenuItem.getItemId()){
//            case R.id.menu_add:
//                Toast.makeText(MainActivity.this,"Click on Add",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.menu_remove:
//                Toast.makeText(MainActivity.this, "Click on Remove", Toast.LENGTH_SHORT).show();
//                break;
//            default:
//        }
//        return super.onOptionsItemSelected(firstActivityMenuItem);
//    }


    @Override
public boolean onOptionsItemSelected(MenuItem first_activity_menu_item) {
    switch (first_activity_menu_item.getItemId()){
        case (R.id.menu_add):
            Toast.makeText(MainActivity.this, "Click on Add", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onOptionsItemSelected: Click on Add");
            break;
        case (R.id.menu_remove):
            Toast.makeText(MainActivity.this, "Click on Remove", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onOptionsItemSelected: Click on Remove");
            break;
        default:
    }
    return super.onOptionsItemSelected(first_activity_menu_item);
}
}