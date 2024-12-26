package main;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class MyFirstJavaProject {

	public static void main(String[] args) {
        JAXBContext jaxbContext = null;
        try {

            // Normal Jakarta XML Binding (JAXB) 
            jaxbContext = JAXBContext.newInstance(Fruit.class);;

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // set Pretty Format 
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Fruit o = new Fruit();
            o.setId(1);
            o.setName("Banana");
            o.setPrice("9.99");

            // output to XML file
            jaxbMarshaller.marshal(o, new File("C:\\Users\\DJK\\eclipse-workspace\\MyFirstJavaProject\\test\\fruit.xml"));

            // output to console
            // jaxbMarshaller.marshal(o, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
	}

}
