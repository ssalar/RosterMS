/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentMS.models;

import java.util.List;

    /**
     *
     * @author sindhu
     */
    public class Teacher {
        private int id;
        private String firstname;
        private String lastname;
        private String speciality;

        public Teacher(int id, String firstname, String lastname, String speciality) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
            this.speciality = speciality;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstname;
        }

        public void setFirstName(String Firstname) {
            this.firstname = firstname;
        }

        public String getLastName() {
            return lastname;
        }

        public void setLastName(String Lastname) {
            this.lastname = lastname;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String Lastname) {
            this.speciality = speciality;
        }
}
