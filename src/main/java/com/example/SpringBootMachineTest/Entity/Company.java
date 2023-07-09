package com.example.SpringBootMachineTest.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private int yearOfEstablishment;

    public Company() {
    }

    public Company(Long id, String companyName, int yearOfEstablishment) {
        this.id = id;
        this.companyName = companyName;
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public Long id() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }
}

