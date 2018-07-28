package CoversorRomano;

import java.util.ArrayList;

public class NumeroRomano {
	ArrayList<String> numeros=new ArrayList<String>();
	
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
		}if(numero=="C"){
			return 100;
		}if(numero=="D"){
			return 500;
		}if(numero=="M"){
			return 1000;
		}else{
			return 0;
		}
	}
	
	public int operacaoComUmNumero(){
		int num=0;
		if(numeros.size()==1){
			num=converte(numeros.get(0).toUpperCase());
			return num;
		}else{
			return 0;
		}
	}

	public int operacoesDoisNumeros(){
		if(numeros.size()==2){
			int num1=converte(numeros.get(0).toUpperCase());
			int num2=converte(numeros.get(1).toUpperCase());
		
			if(num1<num2){
				return num2-num1;
			}if(num1>num2){
				return num1+num2;
			}if(num1==num2){
				return num2+num1;
			}else{
				return 0;
			}
		
		}else{
			return 0;
		}
	}
	
	public void adicionarNovoAlgarismo(String numero){
		numeros.add(numero);
	}
}
