package com.example.sortowanie_tablic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText email = findViewById(R.id.email);
        EditText haslo = findViewById(R.id.haslo);
        EditText powtorzhaslo = findViewById(R.id.powtorzhaslo);
        TextView heh = findViewById(R.id.heh);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailtext = email.getText().toString();
                if (emailtext.contains("@")){
                    heh.setText("Witaj " +email.getText());
                }
                else {
                    Toast.makeText(MainActivity.this, "Nieprawidlowy email!", Toast.LENGTH_SHORT).show();
                }

                if (haslo.getText().toString().equals(powtorzhaslo.getText().toString().isEmpty())) {

                    Toast.makeText(MainActivity.this, "klasa", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "hasla sie roznia", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}