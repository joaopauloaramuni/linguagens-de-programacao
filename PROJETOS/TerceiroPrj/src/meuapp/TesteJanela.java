package meuapp;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TesteJanela extends JFrame{

	// Atributos
	private JPanel painel = new JPanel();
	private JButton jButtonLimpar = new JButton("Limpar");
	private JTextField jTextFieldTexto = new JTextField("Teste", 20);
	private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");
	
	// Construtor
	public TesteJanela(){
		this.setTitle("Exemplo de Interface Gráfica");
		this.setSize(400,200);
		configurarComponentes();
		this.setLocationRelativeTo(null); // Centralizar janela
		this.setVisible(true); // Exibir janela
	}
	
	
	private void configurarComponentes() {
		jButtonLimpar.setToolTipText("Limpar formulário");
		jButtonLimpar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jButtonLimpar.setMnemonic('L');
		
		jButtonLimpar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				limparTela();
				
			}
		});
		
		
		painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		painel.setBackground(new Color(255,255,255));
		jTextFieldTexto.setFont(new Font("Arial", Font.PLAIN, 16));
		painel.add(jTextFieldTexto);
		painel.add(jButtonLimpar);
		painel.add(jLabelMensagem);
		this.getContentPane().add(painel);
	}


	private void limparTela() {
		jTextFieldTexto.setText("");
		jTextFieldTexto.requestFocus();
	}
	
	public static void main(String[] args) {
		new TesteJanela();
	}
}
