package com.example.day2part2.controller;


import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class home {
    @GetMapping("/")
    public List<StudentModel> getStudent(){
        ArrayList<StudentModel> list = new ArrayList<>();
        StudentModel student = new StudentModel(1, "kavya" , "kg@gmail.com");
        StudentModel student2 = new StudentModel(2, "shyam" , "sh@gmail.com");
        StudentModel student3 = new StudentModel(3, "sundar" , "su@gmail.com");
        StudentModel student4 = new StudentModel(4, "shivam" , "sv@gmail.com");
        StudentModel student5 = new StudentModel(5, "satyam" , "st@gmail.com");

        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        return list;



    }


}
