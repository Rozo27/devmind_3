package com.devmind.mvn;


import lombok.ToString;

@ToString
public class School {
    private String name;
    private Address address;
    public static int counter = 0;

    public School(String name, Address address) {
        this.name = name;
        this.address = address;
        counter += 1;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isPalindrome(){
        return this.name.equals(new StringBuilder(this.name).reverse().toString());
    }
    private void init() {
        System.out.println("com.devmind.course5.School initialized");
    }

    private void destroy() {
        System.out.println("com.devmind.course5.School destructured");
    }
}
