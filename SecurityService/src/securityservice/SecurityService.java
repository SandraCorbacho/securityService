package securityservice;

import securityservice.stakeholders.Provider;
import securityservice.stakeholders.StakeHolder;
import securityservice.stakeholders.Client;
import securityservice.stakeholders.CompanyClient;

public class SecurityService {

    public static String showDataSH(StakeHolder sh) {
        return "Codigo identificacion: " +sh.getCodes() + "; Telefono de contacto:" + sh.getPhone() + "; Typo de empresa:"
                + sh.getType() + ";Detalles: " + sh.getDetails();
    }

    public static void main(String[] args) {
        Client c = new Client("03A", "47985874L","PasswordDificil", "C/falsa 123",55, "Ana", "60505033", "calle leon","ana@gmail.com");
        
        CompanyClient cc = new CompanyClient();
        cc.companyData.setSocialReason("Education");
        cc.companyData.setType("Primary School");
        CompanyClient Manolo = new CompanyClient("02A", "47797458K","Password123","c/ ldlldld", 552, "Maria","69586585", "c/dadadada","sandra@gmail.com" ,"Professional Capacities", "company Client");
        Provider p = new Provider("01A", "A08001851","Delay", "11223345t", 66.5, "manolo", "6666666", "sandra@gmail.com", "prpes@gmail.com");
        
        System.out.println(showDataSH(c));
        System.out.println(showDataSH(Manolo));
        System.out.println(showDataSH(p));
        System.out.println(showDataSH(cc));
               
    
        Client c2 = new Client ("A33", "45625841W","Password", "c/FacturationAddress", 35, "Sandra", "635252541", "c/real 123", "sandracorbacho@gmailc.om");
   

        System.out.println(c.toString());
        
        CompanyClient cc2 = new CompanyClient();
        cc2.companyData.setSocialReason("Education");
        cc2.companyData.setType("Primary School");
        
        CompanyClient MercadoSL = new CompanyClient("05M", "45625456P", "pass123", "c/ ldlldld", 552, "Maria","69586585", "c/dadadada","sandra@gmail.com" ,"Venta", "company Client");
        
        System.out.println("Dades de empresa de " + MercadoSL.getName() + ":");
        System.out.println( MercadoSL.companyData.getSocialReason() + ":" +
                            MercadoSL.companyData.getType());    
        System.out.println(MercadoSL.toString());
    
    }
}
