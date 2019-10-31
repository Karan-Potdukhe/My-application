package com.printya.printcopy;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup_Form extends AppCompatActivity {

    EditText txt_fullName, txt_username, txt_email, txt_password, txt_conformpassword, txt_contactnumber;
    Button btn_register;

    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__form);
        getSupportActionBar().setTitle("Signup Form");

        txt_fullName = (EditText) findViewById(R.id.txt_fullname);
        txt_username = (EditText) findViewById(R.id.txt_username);
        txt_email = (EditText) findViewById(R.id.txt_email);
        txt_password = (EditText) findViewById(R.id.txt_password);
        txt_conformpassword = (EditText) findViewById(R.id.txt_conformpassword);
        txt_contactnumber = (EditText) findViewById(R.id.txt_contactnumber);
        btn_register = (Button) findViewById(R.id.btn_register);

        databaseReference = FirebaseDatabase.getInstance().getReference("Registration");

        firebaseAuth = FirebaseAuth.getInstance();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String fullName = txt_fullName.getText().toString();
                final String userName = txt_username.getText().toString();
                final String email = txt_email.getText().toString();
                final String password = txt_password.getText().toString();
                final String conformpassword = txt_conformpassword.getText().toString();
                final String contactNumber = txt_contactnumber.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(Signup_Form.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(Signup_Form.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(conformpassword)) {
                    Toast.makeText(Signup_Form.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(fullName)) {
                    Toast.makeText(Signup_Form.this, "Please Enter FullName", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(userName)) {
                    Toast.makeText(Signup_Form.this, "Please Enter UserName", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(contactNumber)) {
                    Toast.makeText(Signup_Form.this, "Please Enter ContactNumber", Toast.LENGTH_SHORT).show();
                }


                firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Signup_Form.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    registration information = new registration(
                                            fullName,
                                            userName,
                                            email,
                                            password,
                                            conformpassword,
                                            contactNumber

                                    );

                                    FirebaseDatabase.getInstance().getReference("Registration")
                                            .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                            .setValue(information).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            Toast.makeText(Signup_Form.this, "Registration Complete", Toast.LENGTH_SHORT).show();
                                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                        }
                                    });

                                }
//                                else {
//
//
//                                }
                            }
                        });

            }


        });

    }
}

