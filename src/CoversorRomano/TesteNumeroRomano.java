package CoversorRomano;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import junit.framework.*;
public class TesteNumeroRomano {
	@Test
	public void testaUmNumeroRomano(){
		NumeroRomano nr=new NumeroRomano();
		nr.adicionarNovoAlgarismo("X");
		assertEquals(nr.operacaoComUmNumero(),10);
	}

	@Test
	public void testaSubtracaoDoisNumerosRomanos(){
		NumeroRomano nr=new NumeroRomano();
		nr.adicionarNovoAlgarismo("I");
		nr.adicionarNovoAlgarismo("V");
		assertEquals(nr.operacoesDoisNumeros(),4);
		
	}
	@Test
	public void testaSomaDoisNumerosRomanos(){
		NumeroRomano nr=new NumeroRomano();
		nr.adicionarNovoAlgarismo("X");
		nr.adicionarNovoAlgarismo("I");
		assertEquals(nr.operacoesDoisNumeros(),11);
	}
	@Test
	public void testaIgualdadeEntreDoisNumerosRomanos(){
		NumeroRomano nr=new NumeroRomano();
		nr.adicionarNovoAlgarismo("I");
		nr.adicionarNovoAlgarismo("I");
		assertEquals(nr.operacoesDoisNumeros(),2);
	}

}
