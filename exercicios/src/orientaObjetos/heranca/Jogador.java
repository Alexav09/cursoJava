package orientaObjetos.heranca;

public class Jogador {
	
	int vida = 100;
	int x;
	int y;
	
	
	//quando criamos esse método gera erro nas outras classes pois ela não conseguem acessar o contrutor padrão
	Jogador(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//para resolver o erro acima se torna necessário criar o item abaixo: que é um construtor padrão
	Jogador(){
		this(0,0);
	}
	
	
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x- oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX ==0 && deltaY==1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX ==1 && deltaY==0) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;			
		}
		
	}
	
	
	boolean andar(Direcao direcao) {
		
		/** usando IF
		if(direcao == Direcao.NORTE) {
			y++;
		} else if (direcao == Direcao.LESTE){
			x++;
		} else if (direcao == Direcao.OESTE){
			x--;
		} else if (direcao == Direcao.SUL){
			y--;
		}**/
		
		//usando switch
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
			
		}
		
		
		
		
		return true;
	}

}
