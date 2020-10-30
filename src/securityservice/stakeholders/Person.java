/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securityservice.stakeholders;

/**
 *
 * @author sandr
 */
public abstract class Person{
    protected String code, name, phone,address, email;

    public Person() {
    }

    public Person(String code, String name, String phone, String address, String email) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
      
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
