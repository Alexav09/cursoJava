package orientaObjetos.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		
		//Jogador j1= new Jogador();
		Monstro monstro= new Monstro();
		monstro.x=10;
		monstro.y=10;
		Heroi heroi= new Heroi();
		heroi.x=10;
		heroi.y=11;
		
		System.out.println("vida do Monstro = "+ monstro.vida);
		System.out.println("vida do Heroi = "+ heroi.vida);
		System.out.println("Posição x Monstro = "+ monstro.x);
		System.out.println("Posição y Monstro = "+ monstro.y);
		System.out.println("Posição x Heroi = "+ heroi.x);
		System.out.println("Posição y Heroi = "+ heroi.y);
		
		monstro.atacar(heroi);
		
		System.out.println("vida do Monstro = "+ monstro.vida);
		System.out.println("vida do Heroi = "+ heroi.vida);
		
		//j1.andar(Direcao.NORTE);
		//j1.andar(Direcao.NORTE);
		//j1.andar(Direcao.NORTE);
		//j1.andar(Direcao.NORTE);
		monstro.andar(Direcao.SUL);
		heroi.andar(Direcao.LESTE);
		
		System.out.println("Posição x Monstro = "+ monstro.x);
		System.out.println("Posição x Heroi = "+ heroi.x);
		System.out.println("Posição y Monstro = "+ monstro.y);
		System.out.println("Posição y Heroi = "+ heroi.y);
		
		heroi.atacar(monstro);
		
		System.out.println("vida do Monstro = "+ monstro.vida);
		System.out.println("vida do Heroi = "+ heroi.vida);
		
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.SUL);
		monstro.andar(Direcao.SUL);
		monstro.andar(Direcao.SUL);
		monstro.andar(Direcao.SUL);
		
		
		
		//System.out.println(j1.x);
		//System.out.println(j1.y);
		
		
		 
		
	}

}
