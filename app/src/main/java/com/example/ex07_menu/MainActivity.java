package com.example.ex07_menu;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText1;
    ImageView imgView1;
    String rotationValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex07_menu7_1);
        setTitle("제주도 풍경");

        textView = (TextView) findViewById(R.id.text1);
        editText1 = (EditText) findViewById(R.id.editText1);
        imgView1 = (ImageView) findViewById(R.id.imgView1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            // rotationValue가 비어있을 경우 회전 0도로 설정
            case R.id.rotation:
                rotationValue = editText1.getText().toString();
                if(TextUtils.isEmpty(rotationValue)){
                    imgView1.setRotation(0);
                } else {
                    imgView1.setRotation(Integer.parseInt(editText1.getText().toString()));
                }
                break;
            case R.id.item1:
                item.setChecked(true);
                imgView1.setImageResource(R.drawable.jeju1);
                break;
            case R.id.item2:
                item.setChecked(true);
                imgView1.setImageResource(R.drawable.jeju2);
                break;
            case R.id.item3:
                item.setChecked(true);
                imgView1.setImageResource(R.drawable.jeju3);
                break;
        }
        return true;
    }
}