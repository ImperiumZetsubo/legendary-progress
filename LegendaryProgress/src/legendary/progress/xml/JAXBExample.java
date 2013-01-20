package legendary.progress.xml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import legendary.progress.core.Weapon;
 
public class JAXBExample {
	public static void main(String[] args) {
 
	  Weapon weapon = new Weapon();
	  weapon.setRarity("rare");
	  weapon.setName("mkyong");
	  weapon.setId("100000");
 
	  try {
		JAXBContext jaxbContext = JAXBContext.newInstance(Weapon.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(weapon, System.out);
 
	      } catch (JAXBException e) {
	    	  e.printStackTrace();
	      }
 
	}
}
