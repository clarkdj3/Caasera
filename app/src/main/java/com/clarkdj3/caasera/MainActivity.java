package com.clarkdj3.caasera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtLoginName;
    EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtLoginName = (EditText) findViewById(R.id.edtLoginName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
    }

    public void btnLoginOnClick(View v) {
        Log.i("Click", "Login button was clicked.");
        Log.i("Click", edtLoginName.getText().toString());
        Log.i("Click", edtPassword.getText().toString());
        Toast.makeText(this, "You successfully Logged in: " + edtLoginName.getText().toString() + " " + "Password: " + edtPassword.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void btnCancelOnClick(View v) {
        Log.i("Click", "Cancel button was clicked.");
        Toast.makeText(this, "Login Cancelled", Toast.LENGTH_LONG).show();
    }
}
