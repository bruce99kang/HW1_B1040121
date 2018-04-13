package com.example.user.b1040121;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView view = (TextView) findViewById(R.id.String1);

        Bundle bundle = getIntent().getExtras();
        String msg = bundle.getString("message");
        view.setText("B10401021："+ msg);
    }
}
