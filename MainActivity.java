package com.example.company;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {
    EditText txtname,txtpassword;
    Button btn_start;
    Context context;
   DatabaseReference reff;
   Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname=(EditText)findViewById(R.id.inputUserNmae);
        txtpassword=(EditText)findViewById(R.id.inputPwd) ;
        member=new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");
        btn_start= (Button) findViewById(R.id.login);
        Toast.makeText(this,"sucess", Toast.LENGTH_LONG).show();

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, ProductActivity.class);
                startActivity(a);

                member.setName(txtname.getText().toString().trim());
                member.setPassword(txtpassword.getText().toString().trim());
                reff.child("member10").setValue(member);
                Toast.makeText(MainActivity.this, "Data inserted successfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}
