package com.masudbappy.employeemanagement.entities;

import com.masudbappy.employeemanagement.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Education extends BaseEntity{

    private String university;

    private String college;

    private String school;

    @ManyToOne
    private Employee employee;

    public Education() {
        super();
    }

    public Education(String university, String college, String school) {
        this();
        this.university = university;
        this.college = college;
        this.school = school;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
