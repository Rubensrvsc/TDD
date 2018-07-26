package CoversorRomano;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import junit.framework.*;
public class TesteNumeroRomano {
	@Test
	public void TestaNumeroIRomano(){
		NumeroRomano nr=new NumeroRomano("I");
		int result=nr.converte();
		assertEquals(result,1);
	}
	
	@Test
	public void TestaNumeroVRomano(){
		NumeroRomano nr=new NumeroRomano("V");
		int result=nr.converte();
		assertEquals(result,5);
	}
	
	@Test
	public void TestaNumeroXRomano(){
		NumeroRomano nr=new NumeroRomano("X");
		int result=nr.converte();
		assertEquals(result,10);
	}
	
	@Test
	public void TestaNumeroLRomano(){
		NumeroRomano nr=new NumeroRomano("L");
		int result=nr.converte();
		assertEquals(result,50);
	}
}
