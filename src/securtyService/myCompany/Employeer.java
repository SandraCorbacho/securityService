
package securtyService.myCompany;

import securityservice.stakeholders.Person;
import securityservice.stakeholders.StakeHolder;


public class Employeer extends Person implements StakeHolder{
    protected String num_SS;

    public Employeer() {
    }

    public Employeer(String code,String num_SS, String name, String phone, String address, String email) {
        super(code, name, phone, address, email);
        this.num_SS = num_SS;
    }

    public String getNum_SS() {
        return num_SS;
    }

    public void setNum_SS(String num_SS) {
        this.num_SS = num_SS;
    }

    @Override
    public String getType() {
       return "Empleado";
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
