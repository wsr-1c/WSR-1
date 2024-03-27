package com.example.wsr_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.wsr.Home;

public class signin extends AppCompatActivity {
    /*
    окно входа
    26.03.2024
    Суриков Владислав
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signin);
        final TextView singup = requireViewById(R.id.sig);
        final TextView fass = requireViewById(R.id.fpass);
        final Button logb = requireViewById(R.id.loginbut);
        logb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(signin.this, com.example.wsr.Home.class);
            startActivity(intent);
            }
        });


        fass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signin.this, fogotpass.class);
                startActivity(intent); // переход на смену пароля
            }
        });

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signin.this, signup.class);
                startActivity(intent); // переход на регестрацию
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void loginn(View view){
        Intent intent = new Intent(signin.this, Home.class);
        startActivity(intent);
    }
}