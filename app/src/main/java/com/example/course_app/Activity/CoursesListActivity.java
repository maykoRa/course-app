package com.example.course_app.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.course_app.Adapter.CoursesAdapter;
import com.example.course_app.Domain.CoursesDomain;
import com.example.course_app.R;

import java.util.ArrayList;

public class CoursesListActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterCourseList;
    private RecyclerView recyclerViewCourse;
    private ConstraintLayout backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_courses_list);

        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain("Advanced certification program in AI",1000000 , R.drawable.ic_1));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 2000000, R.drawable.gc_1));
        items.add(new CoursesDomain("Fundamental of Java Programming", 3000000, R.drawable.ic_3));
        items.add(new CoursesDomain("Introduction to UI design history", 4000000, R.drawable.f));
        items.add(new CoursesDomain("PG Program in Big Data Engineering", 5000000, R.drawable.bd_1));

        ArrayList<CoursesDomain> items2 = new ArrayList<>();
        items2.add(new CoursesDomain("User Experience Design Fundamentals", 1500000, R.drawable.ux));
        items2.add(new CoursesDomain("UI Prototyping with Adobe XD", 1800000, R.drawable.adobe));
        items2.add(new CoursesDomain("Interaction Design Principles", 2000000, R.drawable.f));
        items2.add(new CoursesDomain("Responsive Web Design", 2200000, R.drawable.f));
        items2.add(new CoursesDomain("Mobile App Design", 2500000, R.drawable.as));

        ArrayList<CoursesDomain> items3 = new ArrayList<>();
        items3.add(new CoursesDomain("Introduction to Artificial Intelligence", 1200000, R.drawable.ic_1));
        items3.add(new CoursesDomain("Machine Learning Foundations", 1500000, R.drawable.ml));
        items3.add(new CoursesDomain("Deep Learning Basics", 1800000, R.drawable.ml));
        items3.add(new CoursesDomain("Natural Language Processing", 2000000, R.drawable.ml));
        items3.add(new CoursesDomain("Computer Vision", 2200000, R.drawable.ai));

        ArrayList<CoursesDomain> items4 = new ArrayList<>();
        items4.add(new CoursesDomain("Introduction to Information Technology", 1000000, R.drawable.it));
        items4.add(new CoursesDomain("Computer Networks Fundamentals", 1500000, R.drawable.cn));
        items4.add(new CoursesDomain("Database Management Systems", 1800000, R.drawable.database));
        items4.add(new CoursesDomain("Cybersecurity Essentials", 2000000, R.drawable.cs));
        items4.add(new CoursesDomain("IT Project Management", 2200000, R.drawable.itp));

        recyclerViewCourse=findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        Intent intent = getIntent();
        int buttonClicked = intent.getIntExtra("buttonClicked", 0);
        if (buttonClicked == 1) {
            adapterCourseList = new CoursesAdapter(items);
        } else if (buttonClicked == 2) {
            adapterCourseList = new CoursesAdapter(items2);
        } else if (buttonClicked == 3) {
            adapterCourseList = new CoursesAdapter(items3);
        } else {
            adapterCourseList = new CoursesAdapter(items4);
        }

        recyclerViewCourse.setAdapter(adapterCourseList);
    }

}