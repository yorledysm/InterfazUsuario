package com.example.myinterfazusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pantMenu(View vista){
        Intent ventanaMenu=new Intent(getApplicationContext(),MenuLogin.class);
        startActivity(ventanaMenu);
    }
    public void pantResgistro(View vista){
        Intent ventanaunoResgistro=new Intent(getApplicationContext(), RegistroActivity.class);
        startActivity(ventanaunoResgistro);
    }
}