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
public class Client extends Person implements StakeHolder{
    
    protected String dni,Password, FacturationAddress;
    protected int Total;

    public Client() {
    }

   
    public Client(String code,String dni,String Password, String FacturationAddress, int Total, String name, String phone, String address, String email) {
        super(code, name, phone, address, email);
        this.Password = Password;
        this.dni = dni;
        this.FacturationAddress = FacturationAddress;
        this.Total = Total;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
   

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFacturationAddress() {
        return FacturationAddress;
    }

    public void setFacturationAddress(String FacturationAddress) {
        this.FacturationAddress = FacturationAddress;
    }


    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    @Override
    public String getType() {
        return "Client";
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
