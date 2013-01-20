package legendary.progress.utils;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RarityTest {

	private Rarity r;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testFromString() {
		String s = "basic";
		try {
			Rarity r = Rarity.fromString(s);
			assert(r == Rarity.BASIC);
		} catch (IOException io) {
			fail(io.getMessage());
		}
		s = "fine";
		try {
			Rarity r = Rarity.fromString(s);
			assert(r == Rarity.FINE);
		} catch (IOException io) {
			fail(io.getMessage());
		}
		s = "masterwork";
		try {
			Rarity r = Rarity.fromString(s);
			assert(r == Rarity.MASTERWORK);
		} catch (IOException io) {
			fail(io.getMessage());
		}
		s = "rare";
		try {
			Rarity r = Rarity.fromString(s);
			assert(r == Rarity.RARE);
		} catch (IOException io) {
			fail(io.getMessage());
		}
		s = "exotic";
		try {
			Rarity r = Rarity.fromString(s);
			assert(r == Rarity.EXOTIC);
		} catch (IOException io) {
			fail(io.getMessage());
		}
		s = "ascended";
		try {
			Rarity r = Rarity.fromString(s);
			assert(r == Rarity.ASCENDED);
		} catch (IOException io) {
			fail(io.getMessage());
		}
		s = "LEGENDARY";
		try {
			Rarity r = Rarity.fromString(s);
			assert(r == Rarity.LEGENDARY);
		} catch (IOException io) {
			fail(io.getMessage());
		}
	}
	
	@Test(expected=IOException.class)
	public void testFromStringException() throws IOException {
		String s = "RandomStuff";
		r = Rarity.fromString(s);
	}
	
	@Test
	public void testToString() {
		Rarity r = Rarity.BASIC;
		try {
			assert(r.toString(r).equalsIgnoreCase("basic"));
		} catch (IOException io) {
			fail(io.getMessage());
		}
		r = Rarity.BASIC;
		try {
			assert(r.toString(r).equalsIgnoreCase("basic"));
		} catch (IOException io) {
			fail(io.getMessage());
		}
		r = Rarity.FINE;
		try {
			assert(r.toString(r).equalsIgnoreCase("FINE"));
		} catch (IOException io) {
			fail(io.getMessage());
		}
		r = Rarity.MASTERWORK;
		try {
			assert(r.toString(r).equalsIgnoreCase("MASTERWORK"));
		} catch (IOException io) {
			fail(io.getMessage());
		}
		r = Rarity.EXOTIC;
		try {
			assert(r.toString(r).equalsIgnoreCase("EXOTIC"));
		} catch (IOException io) {
			fail(io.getMessage());
		}
		r = Rarity.ASCENDED;
		try {
			assert(r.toString(r).equalsIgnoreCase("ASCENDED"));
		} catch (IOException io) {
			fail(io.getMessage());
		}
		r = Rarity.LEGENDARY;
		try {
			assert(r.toString(r).equalsIgnoreCase("legendary"));
		} catch (IOException io) {
			fail(io.getMessage());
		}
	}
	
	/* Testcase reproduceable?
	@Test(expected=IOException.class)
	public void testToStringException() throws IOException {
		String s = "RandomStuff";
		Rarity r = Rarity.fromString(s);
	}
	*/

}
