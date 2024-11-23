package org.example;

import javax.persistence.*;
import javax.sql.DataSource;
import java.util.Date;


@Entity
@Table(name = "student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private int id;
    @Column(length = 50,name="STREET")
    private int street;
    private String city;
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] image;

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
