/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecurityServers;
import security.products.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
/**
 *
 * @author sandr
 */
public class testProduct {
     public static String showDataEquipments(Equipment eq) {
         
        return "Codigo identificacion: " + eq.getCode() + " stock: " +eq.getStock() + " Con un precio de :" + eq.getPrice() + "€, almacenado en " + eq.location() + " con un volumen de "
               + eq.volume() + "cm2";
        }
     public static String showDataSoftware(software sw) {
        return "Codigo identificacion: " + sw.getCode() +" Software de  " + sw.getOperatiiveSistem() +" "+ sw.getName() +" "+ "Con un precio de :" + sw.getPrice() +"€";
        }
     public static String showDataService(Service sv) {
         
           return "El trabajo de " + sv.getType() + " horas facturables " + sv.getActivedTime() + " iniciado en : " + sv.getStartWork() + " finalizado el: " + sv.getStartWork();
         
        }
     
      public static void main(String[] args) {
          Equipment p = new Equipment("Intel Xeon E5-1650v4 - 6c/ 12t - 3.6GHz/ 4GHz","32GB DDR4 ECC 2400 MHz","2x4TB HDD SATA Soft RAID","Windows",10.50, 20.00, 15.00, 25.00,"E01","Servidor Asus",98.25,"F2C5", 5);
          System.out.println(showDataEquipments(p));
          
          software s = new software(25, "Seguridad", "S01", "Antivirus 3000", 25.9, "linux");
          System.out.println(showDataSoftware(s));
            LocalDateTime startWork = LocalDateTime.now();
            LocalDateTime finishWork = startWork.plusDays(3);
            
        
          Service serv = new Service("7h", "Soporte Presencial","25-02-2020 20:08:22","27-02-2020 09:12:55");
          
         System.out.println(showDataService(serv));
          
      }
}
