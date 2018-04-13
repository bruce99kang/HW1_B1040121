package com.example.user.b1040121;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button click = (Button)findViewById(R.id.B10401021);
        final EditText editText = (EditText)findViewById(R.id.text_input);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("message", editText.getText().toString());
                Intent activity2 = new Intent(MainActivity.this, Main2Activity.class);
                activity2.putExtras(bundle);
                startActivity(activity2);
            }
        });
    }
}
