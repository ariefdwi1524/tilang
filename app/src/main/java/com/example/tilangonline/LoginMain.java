package com.example.tilangonline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginMain extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText etusername, etpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        etusername = findViewById(R.id.et_username);
        etpassword = findViewById(R.id.et_password);

        Button btn_Register = findViewById(R.id.btn_Register);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goRegister = new Intent( LoginMain. this, RegisterMain.class);
                startActivity(goRegister);
                finish();
            }
        });

        FloatingActionButton fablogin = findViewById(R.id.fab_Login);
        fablogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String unsername = etusername.getText().toString();
                String password = etpassword.getText().toString();

                if (unsername.equals("")) {
                    Toast.makeText(LoginMain.this, " Silahkan input username anda",
                            Toast.LENGTH_SHORT).show();
                }else if (password.equals("")) {
                    Toast.makeText(LoginMain.this, " Silahkan input password anda",
                            Toast.LENGTH_SHORT).show();
                } else {
                    mAuth.signInWithEmailAndPassword(unsername, password)
                            .addOnCompleteListener(LoginMain.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information
                                        FirebaseUser user = mAuth.getCurrentUser();

                                        Toast.makeText(LoginMain.this, "Login berhasil.",
                                                Toast.LENGTH_SHORT).show();

                                        Intent goUtama = new Intent(LoginMain.this, MenuPilihMain.class);
                                                startActivity(goUtama);

                                    } else {
                                        // If sign in fails, display a message to the user.
                                        Toast.makeText(LoginMain.this, "Username dan password salah.",
                                                Toast.LENGTH_SHORT).show();
                                    }

                                    // ...
                                }
                            });
                }}
        });
    }



    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}


