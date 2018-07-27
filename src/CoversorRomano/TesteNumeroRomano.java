package CoversorRomano;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import junit.framework.*;
public class TesteNumeroRomano {
	@Test
	public void testaNumeroIRomano(){
		NumeroRomano nr=new NumeroRomano("I");
		String numero=nr.getNumeros().get(0);
		int result=nr.converte(numero);
		assertEquals(result,1);
	}
	
	@Test
	public void testaNumeroVRomano(){
		NumeroRomano nr=new NumeroRomano("V");
		String numero=nr.getNumeros().get(0);
		int result=nr.converte(numero);
		assertEquals(result,5);
	}
	
	@Test
	public void testaNumeroXRomano(){
		NumeroRomano nr=new NumeroRomano("X");
		String numero=nr.getNumeros().get(0);
		int result=nr.converte(numero);
		assertEquals(result,10);
	}
	
	@Test
	public void testaNumeroLRomano(){
		NumeroRomano nr=new NumeroRomano("L");
		String numero=nr.getNumeros().get(0);
		int result=nr.converte(numero);
		assertEquals(result,50);
	}
	@Test
	public void testaSubtracaoDoisNumerosRomanos(){
		NumeroRomano nr=new NumeroRomano("I","V");
		int result= nr.operacoesDoisNumeros();
		assertEquals(result,4);
		
	}
	@Test
	public void testaSomaDoisNumerosRomanos(){
		NumeroRomano nr=new NumeroRomano("X","I");
		int result= nr.operacoesDoisNumeros();
		assertEquals(result,11);
	}
	@Test
	public void testaIgualdadeEntreDoisNumerosRomanos(){
		NumeroRomano nr=new NumeroRomano("X","X");
		int result= nr.operacoesDoisNumeros();
		assertEquals(result,20);
	}
}
