/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security.products;

/**
 *
 * @author sandr
 */
public abstract class Product implements marketable{
 
    protected double price;
    protected String code,name;

    public Product() {
    }

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
      
    }

    @Override
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

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 

    
}
