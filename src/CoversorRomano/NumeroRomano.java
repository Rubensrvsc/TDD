package CoversorRomano;

public class NumeroRomano {
	String numero;
	
	public NumeroRomano(String numero){
		this.numero=numero;
	}
	
	public int converte(){
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

}
