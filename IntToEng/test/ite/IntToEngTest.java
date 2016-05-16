package ite;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import org.junit.Test;

public class IntToEngTest {

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
}