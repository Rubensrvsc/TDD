package CoversorRomano;

import java.util.ArrayList;

public class NumeroRomano {
	String numero;
	String numero2;
	ArrayList<String> numeros=new ArrayList<String>();
	
	public NumeroRomano(String numero){
		numeros.add(numero);
	}
	
	public NumeroRomano(String numero,String numero2){
		numeros.add(numero);
		numeros.add(numero2);
	}
	
	public ArrayList<String> getNumeros() {
		return numeros;
	}

	public int converte(String numero){
		if(numero=="I"){
			return 1;
		}if(numero=="V"){
			return 5;
		}if(numero=="X"){
			return 10;
		}if(numero=="L"){
			return 50;
		}else{
			return 0;
		}
	}

	public int somaDoisNumeros(){
		int num1=this.converte(getNumeros().get(0));
		int num2=this.converte(getNumeros().get(1));
		if(num1<num2){
			return num2-num1;
		}if(num1==num2){
			return num2+num1;
		}else{
			return 0;
		}
	}
	
}
