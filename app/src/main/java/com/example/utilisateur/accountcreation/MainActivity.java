package com.example.utilisateur.accountcreation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getBaseContext(),"nom d'utilisateur : "+getIntent().getStringExtra("id"),Toast.LENGTH_SHORT).show();
        Toast.makeText(getBaseContext(),"mot de passe : "+getIntent().getStringExtra("password"),Toast.LENGTH_SHORT).show();
        Toast.makeText(getBaseContext(),"email : "+getIntent().getStringExtra("mail"),Toast.LENGTH_SHORT).show();
    }

    public void creation(View v){
        Intent intent = new Intent(this,accountcreationactivity.class);
        startActivity(intent);
    }

}
