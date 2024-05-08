package com.example.sportial;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText verifyPasswordEditText;
    private Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LL_profileCreation), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
    }

    private void init() {
        emailEditText = findViewById(R.id.editTextTextEmailAddress4);
        verifyPasswordEditText = findViewById(R.id.editTextTextPassword2); // Use verifyPasswordEditText
        passwordEditText = findViewById(R.id.editTextTextPassword3);
        signupButton = findViewById(R.id.button2);
        signupButton.setOnClickListener(L -> signUp());
    }
    private void signUp() {
        String password = verifyPasswordEditText.getText().toString(); // Access here
        String verifiedPassword = passwordEditText.getText().toString();
        if(!password.equals(verifiedPassword)){
            Toast.makeText(this, "Passwords must be identical", 2).show();
        } else if (emailEditText.length() < 6) {
            Toast.makeText(this, "Email address not valid", 2).show();
        }else{
            // create an account and move to profile creation activity
        }
    }

}