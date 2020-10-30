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
abstract class PhysicalProduct extends Product implements storable{
    protected double hight, width, deep, weight;
    protected String location;
    protected int stock;

    public PhysicalProduct() {
    }

    public PhysicalProduct(double hight, double width, double deep, double weight, String code, String name, double price, String location, int stock) {
        super(code, name, price);
        this.hight = hight;
        this.location = location;
        this.width = width;
        this.deep = deep;
        this.weight = weight;
        this.stock = stock;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDeep() {
        return deep;
    }

    public void setDeep(double deep) {
        this.deep = deep;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
     public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
     public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public double volume() {
        return ((this.getWeight())*(this.getHight())*(this.getDeep()));
    }

    @Override
    public String location() {
        return this.getLocation();
    }

   
    


   

    

   

   
   
    
}
