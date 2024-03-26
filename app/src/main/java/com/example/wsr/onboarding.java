package com.example.wsr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class onboarding extends AppCompatActivity {
    public int onbclick = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_onboarding);
        final Button nextonb = findViewById(R.id.button4), skiponb = findViewById(R.id.button3);
        final ImageView onbim = findViewById(R.id.onboardimage), onbtext = findViewById(R.id.onboardtext);
        final ImageView onbim2 = findViewById(R.id.onbim2), onbtext2 = findViewById(R.id.onbt2);
        nextonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onbclick == 0) {
                    onbim.setVisibility(View.INVISIBLE);
                    onbim2.setVisibility(View.VISIBLE);
                    onbtext.setVisibility(View.INVISIBLE);
                    onbim2.setVisibility(View.VISIBLE);
                    onbclick++;
                }
                else {
                    onb5();
                }
            }
        });
        skiponb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onb5();
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onb5(){
        Intent intent = new Intent(onboarding.this, onb3.class);

    }

}