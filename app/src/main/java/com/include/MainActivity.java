package com.include;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.include:
                Intent intent1 = new Intent(this, IncludeActivity.class);
                startActivity(intent1);
                break;
            case R.id.merge:
                Intent intent2 = new Intent(this, MergeActivity.class);
                startActivity(intent2);
                break;
            case R.id.viewstub:
                Intent intent3 = new Intent(this, ViewStubActivity.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}
