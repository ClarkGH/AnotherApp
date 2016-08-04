package com.example.clarkhinchcliff.anotherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickEvent(View view) {
        Toast.makeText(getApplicationContext(), "Hi Clark", Toast.LENGTH_SHORT).show();
        EditText inputTextField = (EditText) findViewById(R.id.textField);
        Log.i("Message", inputTextField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
