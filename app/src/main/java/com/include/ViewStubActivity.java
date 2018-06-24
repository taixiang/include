package com.include;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewStub;

/**
 * @author tx
 * @date 2018/6/23
 */
public class ViewStubActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewstub);
        ViewStub viewstub = findViewById(R.id.viewstub);
        viewstub.inflate();

    }
}
