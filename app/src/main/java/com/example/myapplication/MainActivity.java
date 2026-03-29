package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    private boolean isModeA = true;
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

        Button fisrtButton = findViewById(R.id.button1);
        Button secondButton = findViewById(R.id.button2);

        fisrtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isModeA){
                    Toast.makeText(MainActivity.this, "Тушканов", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "ИНС-б-о-24-1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isModeA = !isModeA;
            }
        });





//        fisrtButton.setOnClickListener(commonListener);
//        secondButton.setOnClickListener(commonListener);
//        Button button1 = findViewById(R.id.button1);
//        Button button2 = findViewById(R.id.button2);
//        Button button3 = findViewById(R.id.button3);
//        View.OnClickListener commonListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (v.getId() == R.id.button1) {
//                    Toast.makeText(MainActivity.this, "Нажата кнопка 1", Toast.LENGTH_SHORT).show();
//                } else if (v.getId() == R.id.button2) {
//                    ((Button)v).setText("Тушканов");
//                    Toast.makeText(MainActivity.this, "Нажата кнопка 2", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "Нажата какая-то другая кнопка", Toast.LENGTH_SHORT).show();
//                }
//            }
//        };
//
//        button1.setOnClickListener(commonListener);
//        button2.setOnClickListener(commonListener);
//        button3.setOnClickListener(commonListener);

    }

}