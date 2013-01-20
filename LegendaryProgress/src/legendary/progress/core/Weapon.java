package legendary.progress.core;

import java.io.IOException;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import legendary.progress.utils.Rarity;

@XmlRootElement
public class Weapon {
 
	String name;
	Rarity rarity;
	String id;
 
	public String getName() {
		return name;
	}
 
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public Rarity getRarity() {
		return rarity;
	}
 
	@XmlElement
	public void setRarity(String r) {
		try {
			this.rarity = Rarity.fromString(r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public String getId() {
		return id;
	}
 
	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}
 
}
