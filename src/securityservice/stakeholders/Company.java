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
public class Company {
    protected String SocialReason, type;

    public Company() {
    }

    public Company(String SocialReason, String type) {
        this.SocialReason = SocialReason;
        this.type = type;
    }

    public String getSocialReason() {
        return SocialReason;
    }

    public void setSocialReason(String SocialReason) {
        this.SocialReason = SocialReason;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
