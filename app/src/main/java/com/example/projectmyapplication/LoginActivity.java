package com.example.projectmyapplication;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button button;
    EditText userName;
    EditText password;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView txt = (TextView) findViewById(R.id.textView_lg);
        txt.setPaintFlags(txt.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        userName = (EditText) findViewById(R.id.id_userName_lg);
        password = (EditText)findViewById(R.id.id_pass_lg);
        button = (Button) findViewById(R.id.id_button_lg);
        textView = (TextView) findViewById(R.id.textView_lg);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                directSignUp();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String User = userName.getText().toString();
                String Pass = password.getText().toString();

                String userName_login = "DoTanTu";
                String passWord_login = "12345";
                if(User.equals(userName_login)==true && Pass.equals(passWord_login)==true) {
                    directHome();
                }else
                {
                    if(User.equals("") || Pass.equals(""))
                        Toast.makeText(LoginActivity.this,"You need to fill in information",Toast.LENGTH_SHORT).show();
                    else
                         Toast.makeText(LoginActivity.this,"Check again username or password",Toast.LENGTH_SHORT).show();

                }

            }

        });


    }
    public void directHome(){
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
    }
    public void directSignUp(){
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
}