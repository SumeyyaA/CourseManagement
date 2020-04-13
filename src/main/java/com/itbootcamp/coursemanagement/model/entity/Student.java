package com.itbootcamp.coursemanagement.model.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Student {
    @Id
    private UUID id;
    private String name;
    private String surname;
    private Date dateOfBirth ;
    private String eMailAddress;
    private String password;
    private List<Course> courses;
    private Course course;

    public Student(String name, String surname, Date dateOfBirth, String eMailAddress, String password, List<Course> courses, Course course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.eMailAddress = eMailAddress;
        this.password = password;
        this.courses = courses;
        this.course = course;

        
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public String getPassword() {
        return password;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Course getCourse() {
        return course;
    }
}
