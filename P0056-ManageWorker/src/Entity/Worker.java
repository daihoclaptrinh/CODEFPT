/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import COMMON.Constant;
import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Worker implements Serializable{
    private String id;
    private String  name;
    private int age;
    private double salary;
    private String workLocation;

    public Worker(String id, String name, int age, double salary, String workLocation) {
        
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + getId() + ", name=" + getName() + ", age=" + getAge() + ", salary=" + getSalary() + ", workLocation=" + getWorkLocation() + '}';
    }
    
}
