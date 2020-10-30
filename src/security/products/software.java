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
public class software extends Product{
    protected int weight;
    protected String type, OperatiiveSistem;

    public software() {
    }

    public software(int weight, String type, String code, String name, double price, String OperatiiveSistem) {
        super(code, name, price);
        this.OperatiiveSistem = OperatiiveSistem;
        this.weight = weight;
        this.type = type;
    }

    public String getOperatiiveSistem() {
        return OperatiiveSistem;
    }

    public void setOperatiiveSistem(String OperatiiveSistem) {
        this.OperatiiveSistem = OperatiiveSistem;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
