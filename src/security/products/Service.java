/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security.products;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author sandr
 */
public class Service extends Product{
    protected String activedTime, type;
    protected LocalDateTime startWork, finishWork;
    protected DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


    public Service() {
    }

    public Service(String activedTime, String type,String dateStart, String dateFinish) {
        this.activedTime = activedTime;
        this.type = type;
        this.setStartWork(dateStart);
        this.setFinishWork(dateFinish);
        
    }

    public String getActivedTime() {
        return activedTime;
    }

    public LocalDateTime getStartWork() {
        return startWork;
    }

    public void setStartWork(String startWork) {
           
            this.startWork = LocalDateTime.parse(startWork, format);
    }

    public LocalDateTime getFinishWork() {
        return finishWork;
    }

    public void setFinishWork(String finishWork) {
        this.startWork = LocalDateTime.parse(finishWork, format);
    }

    public void setActivedTime(String activedTime) {
        this.activedTime = activedTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}
