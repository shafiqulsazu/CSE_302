package com.example.hstuism;

public class Student {
    private String studentId;
    private String studentName;
    private String phone;
    private String batch;
    private String hall;
    private String password;
    private String dist;
    private String faculty;

    // Constructor
    public Student(String studentId, String studentName, String phone, String dist, String password, String hall, String faculty, String batch) {
        setStudentId(studentId);
        setStudentName(studentName);
        setPhone(phone);
        setDist(dist);
        setPassword(password);
        setHall(hall);
        setFaculty(faculty);
        setBatch(batch);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // toString method for file storage
    @Override
    public String toString() {
        return studentId + "," + studentName + "," + phone + "," + dist + "," + password + "," + hall + "," + faculty + "," + batch + "\n";
    }
}
