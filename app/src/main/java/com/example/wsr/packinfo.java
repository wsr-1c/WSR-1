package com.example.wsr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.wsr_3.R;

public class packinfo extends AppCompatActivity {
    /*
        окно информации о посылке
        27.03.2024
        Суриков Владислав
         */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Button suc = requireViewById(R.id.button7);
        final ImageButton back = requireViewById(R.id.imageButton10);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_packinfo);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(packinfo.this, Track.class); //переход на страницу с отслеживанием
                startActivity(intent);
            }
        });
        suc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(packinfo.this, succes.class); //переход на страницу оценивания и подтверждения
                startActivity(intent);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}