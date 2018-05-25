
package com.burakkutbay.jaxb;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ObjectWitList {
    
    private List<String> list;

    @XmlElementWrapper(name = "Benim-listim")
    @XmlElement(name="liste")
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
    
    
    
    
}
