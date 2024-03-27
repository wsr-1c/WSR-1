package com.example.wsr_3;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class fogotpass extends AppCompatActivity {
    /*
    окно забыли пароль
    26.03.2024
    Суриков Владислав
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fogotpass);
        final TextView siga = requireViewById(R.id.sig);
        final TextView ema = requireViewById(R.id.emas);
        final Button otp = requireViewById(R.id.Otpv);
        if (ema.getText() != null)
        {
            otp.setBackground(Drawable.createFromPath("#0560FA"));
            boolean b = true;
            otp.setEnabled(b);
        }
        siga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fogotpass.this, signin.class);
                startActivity(intent); // переход на вход
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}