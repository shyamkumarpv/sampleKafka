package com.example.springbootkafkatutorial.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String firstname;
    private String lastname;
}