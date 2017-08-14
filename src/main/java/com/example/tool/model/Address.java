package com.example.tool.model;

import javax.persistence.*;

/**
 * Created by sackmann on 07.08.2017.
 */
@Entity(name = "ADDR")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDR_ID")
    private Long id;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STREET")
    private String street;

    @Column(name = "HOUSE_NO")
    private String houseNo;

    @Embedded
    private Communication communication = new Communication();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    public Address(String city, String street, String houseNo, Communication communication) {
        this.city = city;
        this.street = street;
        this.houseNo = houseNo;
        this.communication = communication;
    }

    public Address(String city, String street, String houseNo) {
        this.city = city;
        this.street = street;
        this.houseNo = houseNo;
    }

    public Address() {
    }
}
