package orientaObjetos.composicao;

import java.util.ArrayList;

public class Compra {

	String nomeCliente;// em um programa real teríamos um outro objeto representando os clientes, e
						// teríamos apenas 1 item usado em cada compra
	ArrayList<Item> itens = new ArrayList<Item>();// desta forma uma compra tem muitos itens mas um item somente tem uma
													// compra

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}

		return total;
	}

}
