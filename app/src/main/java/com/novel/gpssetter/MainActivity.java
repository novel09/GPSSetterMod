package com.novel.gpssetter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private boolean isSpoofing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spoofButton = findViewById(R.id.button_spoof);
        spoofButton.setOnClickListener(view -> {
            isSpoofing = !isSpoofing;
            if (isSpoofing) {
                Toast.makeText(this, "GPS Spoof ON", Toast.LENGTH_SHORT).show();
                // Trigger spoof location
            } else {
                Toast.makeText(this, "GPS Spoof OFF", Toast.LENGTH_SHORT).show();
                // Stop spoof
            }
        });
    }
}
