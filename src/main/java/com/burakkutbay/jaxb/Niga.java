package com.burakkutbay.jaxb;

import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class Niga {
    public static void main(String[] args){
    
        try{
               // simplemSring();
               simplemGeneric();
        }catch(JAXBException er){
        
        
        }

    }
    
    private static void simplemGeneric()throws JAXBException{
        
        ObjectWithGenericList ob = new ObjectWithGenericList();
        
        
        List<Araba> t = new ArrayList<Araba>();
                    t.add(new Araba("focus"));
                    t.add(new Araba("BMW"));
                    t.add(new Araba("Mercedes"));
       
       List<Motor> m = new ArrayList<Motor>();
                  m.add(new Motor("semih"));
                  m.add(new Motor("soner"));
                  m.add(new Motor("sinan"));
                  
                ob.setMyList(t);
                //ob.setMyList(m);
                
                
                  
             JAXBContext jaxb = JAXBContext.newInstance(ObjectWithGenericList.class);
             Marshaller mar = jaxb.createMarshaller();
             
             mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
             mar.marshal(ob, System.out);
    }
    
    
    protected static void simplemSring()throws JAXBException{
    
        List<String> l = new ArrayList<String>();
                     l.add("Dermean");
                     l.add("agrı sızı");
                     l.add("Vefasız");
                     
                     
             ObjectWitList git = new ObjectWitList();
             git.setList(l);
             
             JAXBContext jaxb = JAXBContext.newInstance(ObjectWitList.class);
             Marshaller mar = jaxb.createMarshaller();
             
             mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
             mar.marshal(git, System.out);
             
             
    }
    
}
