package com.hbf.flybrower.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.hbf.R;

public class TargetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        String _stringValue = this.getIntent().getExtras().getString("flybrower.demo.FLYBROWERKEY");
        Toast.makeText(this,_stringValue,Toast.LENGTH_LONG).show();
    }
}
