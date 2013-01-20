package legendary.progress.utils;

import java.io.IOException;

public enum Rarity {
	
	BASIC,FINE,MASTERWORK,RARE,EXOTIC,ASCENDED,LEGENDARY;

	public String toString(Rarity r) throws IOException {
		String name;
		switch(r) {
			case BASIC: name = "basic";
			case FINE: name = "fine";
			case MASTERWORK: name = "masterwork";
			case RARE: name = "rare";
			case EXOTIC: name = "exotic";
			case ASCENDED: name = "ascended";
			case LEGENDARY: name = "legendary";
			default: name = "default";
		}
		if (name == "default") throw new IOException();
		return name;
	}
	
	public static Rarity fromString(String s) throws IOException {
		if (s.equalsIgnoreCase("basic")) {
			return BASIC;
		} else if (s.equalsIgnoreCase("fine")) {
			return FINE;
		} else if (s.equalsIgnoreCase("masterwork")) {
			return MASTERWORK;
		} else if (s.equalsIgnoreCase("rare")) {
			return RARE;
		} else if (s.equalsIgnoreCase("exotic")) {
			return EXOTIC;
		} else if (s.equalsIgnoreCase("ascended")) {
			return ASCENDED;
		} else if (s.equalsIgnoreCase("legendary")) {
			return LEGENDARY;
		} else {
			throw new IOException();
		}
	}
}
