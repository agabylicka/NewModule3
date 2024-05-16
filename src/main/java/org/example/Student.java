package org.example;

public class Student implements Comparable<Student> {
    private int age;

    public Student(int age, int height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    private int height;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    @Override
    public int compareTo(Student o) {
        int sortLastName = this.getLastName().compareTo(o.lastName);
        if(sortLastName != 0) {
            return sortLastName;
        }
        int sortAge = Integer.valueOf(this.getAge()).compareTo(o.getAge());
        if(sortAge != 0) {
            return sortAge;
        }
        return 0;
    }
}
