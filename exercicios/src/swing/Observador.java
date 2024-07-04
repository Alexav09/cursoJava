package swing;

import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// entendendo o padrão Observer.....

public class Observador {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);
		// quando usamos o null isso indica que a tela ficará centralizada
		// a tela do computador

		JButton botao = new JButton("Clicar");
		janela.add(botao);

		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu");
		}); // esse código pode ser utilizado da forma acima, mas por se tratar
		// de uma interface funcional essa forma mais simples fica melhor 
//		para o código mais limpo

//		botao.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Evento ocorreu");
//				
//			}
//		});

		janela.setVisible(true);
	}

}
