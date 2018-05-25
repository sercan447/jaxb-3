
package com.burakkutbay.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="motorus")
public class Motor {
    
    private String dt;

    public Motor() {
    }

    
    
    public Motor(String dt) {
        this.dt = dt;
    }

    
    
    
    @XmlElement(name="gp-adi")
    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }
    
    
    
}
