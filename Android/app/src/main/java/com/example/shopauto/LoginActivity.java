package com.example.shopauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClickLogin(View view) {
        int num = 0;
        TextInputLayout textFieldEmail = findViewById(R.id.textFieldEmail);
        TextInputLayout textFieldPassword = findViewById(R.id.textFieldPassword);

        TextInputEditText txtEmail = findViewById(R.id.txtEmail);
        TextInputEditText txtPassword= findViewById(R.id.txtPassword);


        String textE = txtEmail.getText().toString();
        if(textE.isEmpty())
        {
            textFieldEmail.setError("Вкажіть пошту");
        }
        else {
            textFieldEmail.setError("");
            num++;
        }

        String textP = txtPassword.getText().toString();
        if(textP.isEmpty())
        {
            textFieldPassword.setError("Вкажіть пароль");
        }
        else {
            textFieldPassword.setError("");
            num++;
        }

        if(num == 2){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }


    }
}