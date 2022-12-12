package com.example.comsumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;

import java.nio.channels.AsynchronousByteChannel;
import java.util.HashMap;
import java.util.Map;

import WebServices.Asynchtask;
import WebServices.WebService;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        EditText txtusuario= findViewById(R.id.txtUser);
        EditText txtpass= findViewById(R.id.txtPass);
        Intent intent =new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);



    }


}