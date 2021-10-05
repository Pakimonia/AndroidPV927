package com.example.shopauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onClickRegister(View view) {
        int num = 0;
        TextInputLayout textFieldFirstName = findViewById(R.id.textFieldFirstName);
        TextInputLayout textFieldLastName= findViewById(R.id.textFieldLastName);
        TextInputLayout textFieldUsername = findViewById(R.id.textFieldEUsername);
        TextInputLayout textFieldEmail = findViewById(R.id.textFieldEmail);
        TextInputLayout textFieldPassword = findViewById(R.id.textFieldPassword);
        TextInputLayout textFieldConfirmPassword = findViewById(R.id.textFieldConfirmPassword);

        TextInputEditText txtName = findViewById(R.id.txtFirstName);
        TextInputEditText txtLastName = findViewById(R.id.txtLastName);
        TextInputEditText txtUserName = findViewById(R.id.txtUsername);
        TextInputEditText txtEmail = findViewById(R.id.txtEmail);
        TextInputEditText txtPassword= findViewById(R.id.txtPassword);
        TextInputEditText txtConfirmPassword= findViewById(R.id.txtConfirmPassword);

        String textFN = txtName.getText().toString();
        if(textFN.isEmpty()){
            textFieldFirstName.setError("Вкажіть імя");
        }
        else{
            textFieldFirstName.setError("");
            num++;
        }

        String textLN = txtLastName.getText().toString();
        if(textLN.isEmpty())
        {
            textFieldLastName.setError("Вкажіть прізвище");
        }
        else {
            textFieldLastName.setError("");
            num++;
        }

        String textUN = txtUserName.getText().toString();
        if(textUN.isEmpty())
        {
            textFieldUsername.setError("Вкажіть імя користувача");
        }
        else {
            textFieldUsername.setError("");
            num++;
        }

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

        String textCP = txtConfirmPassword.getText().toString();
        if(textCP.isEmpty())
        {
            textFieldConfirmPassword.setError("Повторіть пароль ");
        }
        else {
            textFieldConfirmPassword.setError("");
            num++;
        }

        if(!textCP.equals(textP))
        {
            textFieldConfirmPassword.setError("Повторіть паролль ");

        }
        else {
            textFieldConfirmPassword.setError("");
            num++;
        }

        if(num == 7){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}