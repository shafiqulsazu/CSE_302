package com.example.hstuism;

public class Profile {

    private String studentName;
    private String faculty;
    private String batch;
    private String dist;
    private String phone;

    // Constructor
    public Profile(String studentName, String phone, String dist, String faculty, String batch) {
        setStudentName(studentName);
        setPhone(phone);
        setDistrict(dist);
        setFaculty(faculty);
        setBatch(batch);
    }

    // Getters and Setters with basic validation
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        if (studentName != null && !studentName.isEmpty()) {
            this.studentName = studentName;
        } else {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.matches("\\d{10,13}")) { // Basic phone number validation
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone number.");
        }
    }

    public String getDistrict() {
        return dist;
    }

    public void setDistrict(String dist) {
        if (dist != null && !dist.isEmpty()) {
            this.dist = dist;
        } else {
            throw new IllegalArgumentException("District cannot be empty.");
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        if (faculty != null && !faculty.isEmpty()) {
            this.faculty = faculty;
        } else {
            throw new IllegalArgumentException("Faculty cannot be empty.");
        }
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        if (batch != null && !batch.isEmpty()) {
            this.batch = batch;
        } else {
            throw new IllegalArgumentException("Batch cannot be empty.");
        }
    }

    // toString method for file storage
    @Override
    public String toString() {
        return studentName + "," + faculty + "," + batch + "," + dist + "," + phone + "\n";
    }

}
