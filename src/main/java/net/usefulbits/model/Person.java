	package net.usefulbits.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    private long fId;
    private String fName;
    private int fAge;
    
    public void setId(long id) {
        fId = id;
    }
    
    @Id
    public long getId() {
        return fId;
    }
    
    public void setName(String name) {
        fName = name;
    }
    
    public String getName() {
        return fName;
    }
    
    public void setAge(int age) {
        fAge = age;
    }
    
    public int getAge() {
        return fAge;
    }
}
