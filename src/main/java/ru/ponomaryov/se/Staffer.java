package ru.ponomaryov.se;

public class Staffer {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Staffer() {
        name = "Unknown";
        position = "Unknown";
        email = "Unknown";
        phone = "Unknown";
        salary = 0.0;
        age = 0;
    }
    public Staffer(String argName, String argPosition, String argEmail, String argPhone, double argSalary, int argAge) {
        name = argName;
        position = argPosition;
        email = argEmail;
        phone = argPhone;
        salary = argSalary;
        age = argAge;
    }
    public void printStafferInfo() {
        System.out.println(this.name + ", " + this.position + ", " + this.email + ", " + this.phone + ", " + this.salary + ", " + this.age);
    }
    int getStaffAge() {
        return age;
    }
}
