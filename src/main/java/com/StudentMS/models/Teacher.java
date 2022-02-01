/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentMS.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

/**
 *
 * @author sindhu
 */
public class Teacher {
    private int id;
    private String firstname;
    private String lastname;
    private String speciality;

    public Teacher(@JsonProperty("id") int id,
                   @JsonProperty("firstname") String firstname,
                   @JsonProperty("lastname") String lastname,
                   @JsonProperty("speciality") String speciality) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
    }

    public Teacher() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


}