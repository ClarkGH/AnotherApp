package com.example.clarkhinchcliff.anotherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText myTextField = (EditText) findViewById(R.id.textField);

    public void clickEvent(View view) {
        //        Log.i("Message", myTextField.toString());
        Log.i("Message", "hi");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
