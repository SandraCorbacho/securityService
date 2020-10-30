package securityservice.stakeholders;

public class CompanyClient extends Client implements StakeHolder{

    public Company companyData = new Company();

    public CompanyClient() {}

    public CompanyClient( String code, String dni,String Password, String FacturationAddress, int Total, String name, String phone, String address, String email, String socialReason, String type) {
        super(code, dni,Password, FacturationAddress, Total, name, phone, address, email);
        this.companyData.setSocialReason(socialReason);
        this.companyData.setType(type);
    }

 @Override
    public String toString() {
        return super.toString() + ";"
                + this.companyData.getSocialReason() + ";"
                + this.companyData.getType();
    }
    
    @Override
    public String getType() {
        return "Empresa Cliente";
    }
    
    @Override
    public String getDetails() {
        return this.getCode() + "de tipo: " + this.companyData.getType();
    }

    

    
   

}