package meuapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.io.Serializable;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ExemploJanela extends JFrame {
	
	//Atributos
	private JPanel painel = new JPanel();
	private JButton jButtonLimpar = new JButton("Limpar");
	private JTextField jTextFieldTexto = new JTextField("Teste", 20);
	private JLabel jLabelMensagem = new JLabel("Exemplo Simples de Janela");
	
	//Construtor
	public ExemploJanela() {
		this.setTitle("Texto da Barra de Título");
		this.setSize(300,200);
		painel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
		painel.setBackground(new Color(255,255,255));
		painel.add(jTextFieldTexto);
		painel.add(jButtonLimpar);
		painel.add(jLabelMensagem);
		this.getContentPane().add(painel);
		this.setLocationRelativeTo(null); // Centralizar janela
		this.setVisible(true); // Exibir janela
		
		String codigo = JOptionPane.showInputDialog(null,"Informe o código do produto", 
				"Cadastro de Produtos", JOptionPane.QUESTION_MESSAGE);

		if ( codigo == null || !codigo.matches("[0-9]*")) return;
		JOptionPane.showMessageDialog(painel, "" + Integer.parseInt(codigo));
		

		if (jTextFieldTexto.getText().trim().equals("")) {
			/*
			 * No lugar do valor null no método JOptionPane.showMessageDialog(), você pode
			 * passar um componente específico como o "pai" da janela de diálogo. Isso fará
			 * com que a caixa de diálogo apareça no centro do componente pai, em vez de no
			 * centro da tela. Além disso, você pode usar diferentes tipos de componentes
			 * para personalizar a aparência da janela de diálogo.
			 */
		    JOptionPane.showMessageDialog(null, "Falta informar o código do produto.", 
		    		"Cadastro de Produtos", JOptionPane.WARNING_MESSAGE);
		    jTextFieldTexto.requestFocus();
		}
		
		if (JOptionPane.showConfirmDialog(null, "Confirmar a exclusão do produto" 
		+ jTextFieldTexto.getText().trim() + "?" , "Cadastro de Produtos", 
			JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION ) {
            return;
		}
		// JOptionPane.YES_NO_OPTION
		// JOptionPane.YES_OPTION
		// JOptionPane.NO_OPTION

		
		// Cria um label com texto
		JLabel label1 = new JLabel("Label1: Apenas texto");
		
		// Cria um label com texto e imagem
		JLabel label2 = new JLabel("Label2: Imagem e texto", new ImageIcon("javalogo.gif"), JLabel.CENTER);
		label2.setVerticalTextPosition(JLabel.BOTTOM);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		
		// Cria um campo de nome
		JTextField campoNome = new JTextField(10);
		JLabel labelNome = new JLabel("Nome: ");
		labelNome.setLabelFor(campoNome);
		labelNome.setDisplayedMnemonic('n'); // Alt-n
		
		// Cria um campo de email
		JTextField campoEmail = new JTextField(10);
		JLabel labelEmail = new JLabel("Email: ");
		labelEmail.setLabelFor(campoEmail);
		labelEmail.setDisplayedMnemonic('E'); // Alt-e
		
		// Cria um botão com texto
		JButton botao1 = new JButton("Botão Desabilitado");
		botao1.setEnabled(false);
		botao1.setToolTipText("Exemplo de um botão de texto");
		botao1.setMnemonic(KeyEvent.VK_D); // Alt-D
		
		// Cria um botão com texto e imagem
		JButton botao2 = new JButton("Botão Habilitado", new ImageIcon("javalogo.gif"));
		botao2.setToolTipText("Botão de texto e imagem");
		botao2.setMnemonic(KeyEvent.VK_H); // Alt-H
		botao2.setPressedIcon(new ImageIcon("javalogo2.gif"));
		
		// Exemplo de Checkbox
		JFrame f = new JFrame("Teste");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JCheckBox ci = new JCheckBox("Inglês", true);
		JCheckBox ce = new JCheckBox("Espanhol", true);
		JCheckBox cf = new JCheckBox("Francês");
		Container cp = f.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(ci);
		cp.add(ce);
		cp.add(cf);
		f.pack();
		f.setVisible(true);
		
		// Exemplo de RadioButton
		JFrame f2 = new JFrame("Teste");
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRadioButton bm = new JRadioButton("Masculino", true);
		JRadioButton bf = new JRadioButton("Feminino");
		ButtonGroup bg = new ButtonGroup();
		bg.add(bm);
		bg.add(bf);
		Container cp2 = f.getContentPane();
		cp2.setLayout(new FlowLayout());
		cp2.add(bm);
		cp2.add(bf);
		f2.pack();
		f2.setVisible(true);
		
		// Exemplo de JFrame
		JFrame janela = new JFrame("Exemplo de Janela");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel mensagem = new JLabel("Olá Mundo");
		janela.getContentPane().add(mensagem);
		janela.setLocationRelativeTo(null); // centraliza
		janela.setIconImage(new ImageIcon("javalogo2.gif").getImage());
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(new JMenu("Menu"));
		janela.setJMenuBar(menuBar);
		janela.pack();
		janela.setVisible(true);
		
		// Exemplo de Grid
		Container contentPane = janela.getContentPane();
		
		contentPane.setLayout(new GridLayout(0,2));
		
		contentPane.add(new JButton("Button 1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("Button 3"));
		contentPane.add(new JButton("Long-Named Button 4"));
		contentPane.add(new JButton("Button 5"));
		
		// Exemplo de Flow
		Container contentPane2 = janela.getContentPane();
		contentPane2.setLayout(new FlowLayout());
		
		contentPane2.add(new JButton("Button 1"));
		contentPane2.add(new JButton("2"));
		contentPane2.add(new JButton("Button 3"));
		contentPane2.add(new JButton("Long-Named Button 4"));
		contentPane2.add(new JButton("Button 5"));
		
		// Exemplo de Border
		Container contentPane3 = janela.getContentPane();
		//contentPane3.setLayout(new BorderLayout()); // Desnecessário
		
		contentPane3.add(new JButton("Button 1 (NORTH)"), BorderLayout.NORTH);
		contentPane3.add(new JButton("2 (CENTER)"), BorderLayout.CENTER);
		contentPane3.add(new JButton("Button 3 (WEST)"), BorderLayout.WEST);
		contentPane3.add(new JButton("Long-Named Button 4 (SOUTH)"), BorderLayout.SOUTH);
		contentPane3.add(new JButton("Button 5 (EAST)"), BorderLayout.EAST);
		
	}
	
	public static void main(String[] args) {
		new ExemploJanela();
	}
}
