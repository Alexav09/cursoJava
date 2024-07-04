package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto(); //podemos utilizar desta forma ou da forma do p2, o resultado é o mesmo
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.desconto);
		
		double precoFinal1 = p1.preco *(1-p1.desconto);//essa seria a forma não otimizada de código
		//double precoFinal1 = p1.precoComDesconto(); //desta forma usamos o método para reduzir a quantidade de processos
		double precoFinal2 = p2.precoComDesconto();
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		double precoCarrinho = precoFinal1 + precoFinal2;
		
		System.out.printf("Preço total do Carrinho =  %.2f", precoCarrinho);
		
		
		
	}
	
	
}
