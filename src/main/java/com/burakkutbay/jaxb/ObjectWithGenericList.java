
package com.burakkutbay.jaxb;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ObjectWithGenericList<T> {
    
    private List<T> myList;

    @XmlElementWrapper(name="MyGenericList")
    @XmlElement("Glist")
    public List<T> getMyList() {
        return myList;
    }

    public void setMyList(List<T> myList) {
        this.myList = myList;
    }
    
    
    
}
