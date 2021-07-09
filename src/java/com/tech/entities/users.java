
package com.tech.entities;


public class users {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String cource;
    private String address;
    private String phnnum;
    private String password;
    
    public users(int id, String name, String email, String gender, String cource, String address, String phnnum) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.cource = cource;
        this.address = address;
        this.phnnum = phnnum;
        //this.fess=fess;
        this.password=password;
    }

    
    public users() {
    }

    public users(String name, String email, String gender, String cource, String address, String phnnum, String password) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.cource = cource;
        this.address = address;
        this.phnnum = phnnum;
        this.password= password;
    }
    
    // getters and setters
    public String getpassword()
    {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhnnum() {
        return phnnum;
    }

    public void setPhnnum(String phnnum) {
        this.phnnum = phnnum;
    }

    
    
    
    
    
    
    
}
