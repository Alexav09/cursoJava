package orientaObjetos.composicao.desafio;

//Aqui é onde entramos com todas as interaçoes com o sistema, as outras classes serão responsáveis pelo tratamento dos dados

public class Sistema {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 998.90), 1);

		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.adicionarCompra(compra1);// essa é a forma ideal usando o encapsulamento
		cliente.compras.add(compra2); // nesse modelo a lista fica exposta, não é o ideal

		System.out.println(cliente.obterValorTotal());

	}

}
