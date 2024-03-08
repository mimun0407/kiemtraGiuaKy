package org.example.demo21.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "khong dc de trong")
    private String fullName;
    private int age;
    private String Gender;
    private String BirthDate;
    private String address;
    private String email;
    private String Part;
    private String position;
    private String salary;
    private String StartDay;
    private String Status;
    private String information;

    public Staff(int id, String fullName, int age, String gender, String birthDate, String address, String email, String part, String position, String salary, String startDay, String status, String information) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        Gender = gender;
        BirthDate = birthDate;
        this.address = address;
        this.email = email;
        Part = part;
        this.position = position;
        this.salary = salary;
        StartDay = startDay;
        Status = status;
        this.information = information;
    }

    public Staff() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPart() {
        return Part;
    }

    public void setPart(String part) {
        Part = part;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getStartDay() {
        return StartDay;
    }

    public void setStartDay(String startDay) {
        StartDay = startDay;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}

