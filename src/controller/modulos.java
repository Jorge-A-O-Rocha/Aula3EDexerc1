package controller;

public class modulos {
	public modulos() {
		super();
	}

	public int somatoria(int x) {
		
		//Condição de parada quando X chegar ao limite da soma, o 0.
		if (x <= 0) {
			return 0;
		}else{
			// O x irá somar com ele menos um: x=4
			//4 | 4-1= 3 | 3-1=2 | 2-1=1 | 1-1=0 | 4+3+2+1=10
			return  x + somatoria(x-1);
		}
	}

}
