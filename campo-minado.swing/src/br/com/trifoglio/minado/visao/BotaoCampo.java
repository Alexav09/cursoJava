package br.com.trifoglio.minado.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import br.com.trifoglio.minado.modelo.Campo;
import br.com.trifoglio.minado.modelo.CampoEvento;
import br.com.trifoglio.minado.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener{
	
	private final Color BG_PADRAO = new Color(184,184,184);
	private final Color BG_MARCAR = new Color(8,179,247);
	private final Color BG_EXPLODIR = new Color(189,66,68);
	private final Color TEXTO_VERDE = new Color(0,100,0);
	
	
	private Campo campo;
	
	
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0));
		
		addMouseListener(this);
		campo.registrarObservador(this);
		
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch(evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
			setBorder(BorderFactory.createBevelBorder(0));
		}
		
		// de forma a garantir que sempre a interface seja atualizada use os seguintes comandos
		SwingUtilities.invokeLater(()->{
			repaint();
			validate();
		});
		
		
	}

	private void aplicarEstiloPadrao() {
		setBackground(BG_PADRAO);
		setText("");
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setForeground(Color.WHITE);
		setText("X");
		
	}

	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCAR);
		setForeground(Color.BLACK);
		setText("M");
		
	}
	private void aplicarEstiloAbrir() {
		setBorder(BorderFactory.createLineBorder(Color.gray));

		if(campo.isMinado()) {
			setBackground(BG_EXPLODIR);
			return;
		}
		
		setBackground(BG_PADRAO);
		
		switch (campo.minasNaVizinhanca()) {
		case 1: 
			setForeground(TEXTO_VERDE);
			break;
		case 2: 
			setForeground(Color.BLUE);
			break;
		case 3: 
			setForeground(Color.YELLOW);
			break;
		case 4: 
		case 5: 
		case 6: 
			setForeground(Color.RED);
			break;
		default:
			setForeground(Color.PINK);
			break;
			
		}
		String valor = !campo.vizinhancaSegura() ?
				campo.minasNaVizinhanca()+"" :"";
		setText(valor);
		
	}
	
	//Interface dos Eventos do Mouse
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton()== 1) {
			campo.abrir();
//			System.out.println("Botão Esquerdo");
		} else {
			campo.alternarMarcacao();
//			System.out.println("outro botão!!!");
		}
	}
	
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
}
