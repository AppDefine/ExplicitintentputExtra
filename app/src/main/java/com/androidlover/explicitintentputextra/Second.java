package com.androidlover.explicitintentputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=(TextView)findViewById(R.id.et2);

        Bundle bundle=getIntent().getExtras();
        String string=bundle.getString("KEY");
        textView.setText(string);

    }
}