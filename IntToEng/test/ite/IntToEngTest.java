package ite;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import org.junit.Test;

public class IntToEngTest {
	@Test
	public void translateEngで0をzeroに変換() {
		IntToEng ite = new IntToEng();
		String ex = "zero";
		String act = ite.translateEng(0);
		assertThat(act,is(ex));
	}	

	@Test
	public void translateEngで1をoneに変換() {
		IntToEng ite = new IntToEng();
		String ex = "one";
		String act = ite.translateEng(1);
		assertThat(act,is(ex));
	}
	
	@Test
	public void translateEngで19をnineteenに変換() {
		IntToEng ite = new IntToEng();
		String ex = "nineteen";
		String act = ite.translateEng(19);
		assertThat(act,is(ex));
	}
	
	@Test
	public void translateEngで23をtwentythreeに変換() {
		IntToEng ite = new IntToEng();
		String ex = "twenty three";
		String act = ite.translateEng(23);
		assertThat(act,is(ex));
	}
	
	@Test
	public void translateEngで20をtwentyに変換() {
		IntToEng ite = new IntToEng();
		String ex = "twenty";
		String act = ite.translateEng(20);
		assertThat(act,is(ex));
	}
	
	@Test
	public void translateEngで99をninetynineに変換() {
		IntToEng ite = new IntToEng();
		String ex = "ninety nine";
		String act = ite.translateEng(99);
		assertThat(act,is(ex));
	}	
	
	@Test
	public void translateEngで100をone_hundredに変換() {
		IntToEng ite = new IntToEng();
		String ex = "one hundred";
		String act = ite.translateEng(100);
		assertThat(act,is(ex));
	}
	
	@Test
	public void translateEngで222をtwo_hundred_twenty_twoに変換() {
		IntToEng ite = new IntToEng();
		String ex = "two hundred twenty two";
		String act = ite.translateEng(222);
		assertThat(act,is(ex));
	}	
	@Test
	public void translateEngで1111をone_hundred_elevenに変換() {
		IntToEng ite = new IntToEng();
		String ex = "one hundred eleven";
		String act = ite.translateEng(111);
		assertThat(act,is(ex));
	}	

	@Test
	public void translateEngで999をnine_hundred_ninety_nineに変換() {
		IntToEng ite = new IntToEng();
		String ex = "nine hundred ninety nine";
		String act = ite.translateEng(999);
		assertThat(act,is(ex));
	}	
	@Test
	public void translateEngで1000をone_thousandに変換() {
		IntToEng ite = new IntToEng();
		String ex = "one thousand";
		String act = ite.translateEng(1000);
		assertThat(act,is(ex));
	}	
	@Test
	public void translateEngで1111をone_thousand_one_hundred_elevenに変換() {
		IntToEng ite = new IntToEng();
		String ex = "one thousand one hundred eleven";
		String act = ite.translateEng(1111);
		assertThat(act,is(ex));
	}	
	@Test
	public void translateEngで9999をnine_thousand_nine_hundred_ninety_nineに変換() {
		IntToEng ite = new IntToEng();
		String ex = "nine thousand nine hundred ninety nine";
		String act = ite.translateEng(9999);
		assertThat(act,is(ex));
	}	
	@Test
	public void translateEngで1001をone_thousand_oneに変換() {
		IntToEng ite = new IntToEng();
		String ex = "one thousand one";
		String act = ite.translateEng(1001);
		assertThat(act,is(ex));
	}	
	@Test
	public void translateEngで1010をone_thousand_tenに変換() {
		IntToEng ite = new IntToEng();
		String ex = "one thousand ten";
		String act = ite.translateEng(1010);
		assertThat(act,is(ex));
	}	
}