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
}