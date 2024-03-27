package com.example.wsr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.wsr_3.R;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

public class Track extends AppCompatActivity {
    /*
        окно отслеживания
        27.03.2024
        Суриков Владислав
         */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_track);
        final MapView mapw = requireViewById(R.id.mapView);
        final ImageButton pro = requireViewById(R.id.imageButton4), ho = requireViewById(R.id.imageButton2), wa = requireViewById(R.id.imageButton), tr = requireViewById(R.id.imageButton3);
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Track.this, Profile.class); //переход в профиль
                startActivity(intent);
            }
        });
        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Track.this, Home.class); //переход на стартовую
                startActivity(intent);
            }
        });
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Track.this, wallet.class); //переход в кошелёк
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