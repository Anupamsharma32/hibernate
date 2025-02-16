package org.example;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    private Certificate certificate;
    @Id
    private int id;
    private String name;
    private String city;
    public Student(){
        super();
    }
    public Student(int id,String name, String city){
        super();
        this.id=id;
        this.name=name;
        this.city=city;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
}
