
package com.burakkutbay.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="arabus")
public class Araba {
   
    private String dt;

    public Araba() {
    }

    
    public Araba(String dt) {
        this.dt = dt;
    }

    
    
    
    @XmlElement(name="car-adi")
    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }
    
    
}
