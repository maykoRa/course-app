package com.example.course_app.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.course_app.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ConstraintLayout btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CoursesListActivity.class);
            intent.putExtra("buttonClicked", 1);
            startActivity(intent);
        });

        ConstraintLayout btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CoursesListActivity.class);
            intent.putExtra("buttonClicked", 2);
            startActivity(intent);
        });

        ConstraintLayout btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CoursesListActivity.class);
            intent.putExtra("buttonClicked", 3);
            startActivity(intent);
        });

        ConstraintLayout btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CoursesListActivity.class);
            intent.putExtra("buttonClicked", 4);
            startActivity(intent);
        });
    }
}