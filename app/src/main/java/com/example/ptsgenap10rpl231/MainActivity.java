package com.example.ptsgenap10rpl231;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText txtemail, txtsandi;
    private Button btnmasuk;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtemail = (EditText)findViewById(R.id.txtemail);
        txtsandi = (EditText)findViewById(R.id.txtsandi);
        btnmasuk = (Button) findViewById(R.id.btnmasuk);
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtemail.getText().toString();
                String pass = txtsandi.getText().toString();
                if (email.equalsIgnoreCase(  "Stevie@gmail.com")
                        &&(pass.equalsIgnoreCase("123456"))){
                    Toast.makeText(MainActivity.this, "Sukses Login",
                            Toast.LENGTH_SHORT).show();
                    openActivity2();
                }else {
                    Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(MainActivity.this, DashboardMenu.class);
        startActivity(intent);
    }
}
