/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security.products;
import security.products.PhysicalProduct;

/**
 *
 * @author sandr
 */
public class Equipment extends PhysicalProduct{
    protected String processor, memory, storage, OperativeSystem;

     public Equipment(String processor, String memory, String storage, String OperativeSystem, double hight, double width, double deep, double weight, String code, String name, double price, String location, int stock) {
        super(hight, width, deep, weight, code, name, price, location, stock);
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.OperativeSystem = OperativeSystem;
    }

    public Equipment() {
    }
    
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getOperativeSystem() {
        return OperativeSystem;
    }

    public void setOperativeSystem(String OperativeSystem) {
        this.OperativeSystem = OperativeSystem;
    }

  
   
    @Override
    public boolean isFragile() {
        return true;
    }
}
