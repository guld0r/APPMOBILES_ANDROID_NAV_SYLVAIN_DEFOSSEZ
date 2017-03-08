package com.example.utilisateur.accountcreation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Utilisateur on 08/03/2017.
 */
public class accountcreationactivity extends Activity {

    EditText id;
    EditText password;
    EditText mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accountcreationactivity);

        id=(EditText)findViewById(R.id.txtId);
        password=(EditText)findViewById((R.id.txtPassword));
        mail=(EditText)findViewById(R.id.txtMail);
    }

    public void valeur(View v){
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("id",id.getText().toString());
        intent.putExtra("password",password.getText().toString());
        intent.putExtra("mail",mail.getText().toString());
        startActivity(intent);
    }

}
