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
public class Provider extends Person implements StakeHolder{
    
    public Company companyData = new Company();
    public String NIF,delayPayment ,valoration;
    public double discount;

    public Provider() {
    }

    public Provider(String code, String NIF, String delayPayment, String valoration, double discount, String name, String phone, String address, String email) {
        super(code, name, phone, address, email);
        this.NIF = NIF;
        this.delayPayment = delayPayment;
        this.valoration = valoration;
        this.discount = discount;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

 
    public Company getCompanyData() {
        return companyData;
    }

    public void setCompanyData(Company companyData) {
        this.companyData = companyData;
    }

    public String getDelayPayment() {
        return delayPayment;
    }

    public void setDelayPayment(String delayPayment) {
        this.delayPayment = delayPayment;
    }

    public String getValoration() {
        return valoration;
    }

    public void setValoration(String valoration) {
        this.valoration = valoration;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String getType() {
        return "Proveedor";
    }

    @Override
    public String getDetails() {
       return this.getName() + " con telefono: " + this.getPhone() +" y dirección: " + this.getAddress();
    }

    @Override
    public String getCodes() {
        return this.getCode();
    }

    
    
    
}
