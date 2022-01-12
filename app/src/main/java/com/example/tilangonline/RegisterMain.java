package com.example.tilangonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterMain extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText lgusername, lgpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();
        lgusername = findViewById(R.id.login_username);
        lgpassword = findViewById(R.id.login_password);

        Button btn_fabregis = findViewById(R.id.logintregis);
        btn_fabregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gologin = new Intent(RegisterMain.this, LoginMain.class);
                startActivity(gologin);
                finish();
            }
        });
        FloatingActionButton fabregis = findViewById(R.id.fab_regis);
        fabregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String unsername = lgusername.getText().toString();
                String password = lgpassword.getText().toString();

                if (unsername.equals("")) {
                    Toast.makeText(RegisterMain.this, " Tolong isi username anda",
                            Toast.LENGTH_SHORT).show();
                }else if (password.equals("")) {
                    Toast.makeText(RegisterMain.this, " Tolong isi password anda",
                            Toast.LENGTH_SHORT).show();
                }else {

                mAuth.createUserWithEmailAndPassword(unsername, password)
                        .addOnCompleteListener(RegisterMain.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    FirebaseUser user = mAuth.getCurrentUser();

                                    Toast.makeText(RegisterMain.this, "Register success.",
                                            Toast.LENGTH_SHORT).show();
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(RegisterMain.this, "Register failed.",
                                            Toast.LENGTH_SHORT).show();
                                }

                                // ...
                            }
                        });
            }}
        });
    }

    @Override
    public void onBackPressed() {
        Intent gologin = new Intent( RegisterMain.this, LoginMain.class);
        startActivity(gologin);
        finish();
    }
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }

}
