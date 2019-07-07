package com.example.demo.stream_8;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@Setter
@ToString
public class Student {
    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumberList;

    public Student(String name, int age, Address address, List<MobileNumber> mobileNumberList) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumberList = mobileNumberList;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MobileNumber> getMobileNumberList() {
        return mobileNumberList;
    }

    public void setMobileNumberList(List<MobileNumber> mobileNumberList) {
        this.mobileNumberList = mobileNumberList;
    }
}
