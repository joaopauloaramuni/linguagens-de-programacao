package meuapp;

import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class TestandoJFormattedTextField extends JFrame {
	
	// Método main
	public static void main(String[] args) throws ParseException{
		// Exemplo máscara
		MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		JFormattedTextField cpf = new JFormattedTextField(mascaraCpf);

		// Outros exemplos
		MaskFormatter mascaraCep = new MaskFormatter("#####-###");
		MaskFormatter mascaraTel = new MaskFormatter("(##) ####-####");
		
		new TestandoJFormattedTextField();
	}
	
	// Método construtor da classe
	public TestandoJFormattedTextField() {
		Container janela = getContentPane();
		getContentPane().setLayout(null);

		// Define os rótulos dos botões
		JLabel labelCep = new JLabel("CEP: ");
		JLabel labelTel = new JLabel("Telefone: ");
		JLabel labelCpf = new JLabel("CPF: ");
		JLabel labelData = new JLabel("Data: ");
		labelCep.setBounds(50, 40, 100, 20);
		labelTel.setBounds(50, 80, 100, 20);
		labelCpf.setBounds(50, 120, 100, 20);
		labelData.setBounds(50, 160, 100, 20);

		// Define as máscaras
		MaskFormatter mascaraCep = null;
		MaskFormatter mascaraTel = null;
		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraData = null;

		try {
			
			mascaraCep = new MaskFormatter("#####-###");
			mascaraTel = new MaskFormatter("(##)####-####");
			mascaraCpf = new MaskFormatter("#########-##");
			mascaraData = new MaskFormatter("##/##/####");
			
			mascaraCep.setPlaceholderCharacter('_');
			mascaraTel.setPlaceholderCharacter('_');
			mascaraCpf.setPlaceholderCharacter('_');
			mascaraData.setPlaceholderCharacter('_');
		} catch (ParseException excp) {
			System.err.println("Erro na formatação: " + excp.getMessage());
			System.exit(-1);
		}

		// Seta as máscaras nos objetos JFormattedTextField
		JFormattedTextField jFormattedTextCep = new JFormattedTextField(mascaraCep);
		JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
		JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
		JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);
		jFormattedTextCep.setBounds(150, 40, 100, 20);
		jFormattedTextTel.setBounds(150, 80, 100, 20);

		jFormattedTextCpf.setBounds(150, 120, 100, 20);
		jFormattedTextData.setBounds(150, 160, 100, 20);

		// Adiciona os rótulos e os campos de textos com máscaras na tela
		janela.add(labelCep);
		janela.add(labelTel);
		janela.add(labelCpf);
		janela.add(labelData);
		janela.add(jFormattedTextCep);
		janela.add(jFormattedTextTel);
		janela.add(jFormattedTextCpf);
		janela.add(jFormattedTextData);
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

}
