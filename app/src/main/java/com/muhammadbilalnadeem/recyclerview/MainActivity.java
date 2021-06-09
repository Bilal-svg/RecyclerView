package com.muhammadbilalnadeem.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.muhammadbilalnadeem.recyclerview.Adapter.RecyclerViewAdapter;
import com.muhammadbilalnadeem.recyclerview.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Student> studentList =new ArrayList<>();
RecyclerViewAdapter recyclerViewAdapter;
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        studentList.add(new Student(  "Bilal" , "191112"));
        studentList.add(new Student(  "Danish" , "999999"));
        studentList.add(new Student(  "Hafsa" , "777777"));
        studentList.add(new Student(  "Usama" , "444444"));
        studentList.add(new Student(  "Maham" , "111111"));
        studentList.add(new Student(  "Sanam" , "666666"));
        studentList.add(new Student(  "Huzaifa" , "222222"));
        studentList.add(new Student(  "Iqra" , "333333"));
        studentList.add(new Student(  "Rafia" , "555555"));
        recyclerViewAdapter = new RecyclerViewAdapter(studentList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerViewAdapter);



    }
}