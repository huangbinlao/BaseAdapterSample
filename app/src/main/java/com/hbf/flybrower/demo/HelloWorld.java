package com.hbf.flybrower.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.hbf.R;


public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button _button = (Button) this.findViewById(R.id.flybrowerBtn);
        _button.setText("测试changed");
        // add new button
        Button _newButton = new Button(this);
        _newButton.setText("new button");

        RelativeLayout _rl =  (RelativeLayout) findViewById(R.id.main);
        _rl.addView(_newButton);

        Intent _intent = new Intent(this,TargetActivity.class);
        _intent.putExtra("flybrower.demo.FLYBROWERKEY","target 你好");

        startActivity(_intent);
       // Log.v("flybrower","verbose");
       // Log.d("flbyfss", "onCreate: hbf");
    }

}
