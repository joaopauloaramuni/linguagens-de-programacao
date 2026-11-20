-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# TerceiroPrj — Introdução a interfaces gráficas com Swing

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/IDE-Eclipse-007ec6?style=for-the-badge&logo=eclipseide&logoColor=white) ![Swing](https://img.shields.io/badge/GUI-Java%20Swing-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Primeiro contato com interfaces gráficas em Java usando a biblioteca **Swing**: janelas, componentes, caixas de diálogo, gerenciadores de layout e tratamento de eventos.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

- **`TesteJanela.java`** — janela simples (`JFrame`) com `JTextField`, `JButton` e `JLabel`. O botão **Limpar** possui *tooltip*, cursor de mão, atalho de teclado (`Alt+L`) e um `ActionListener` que limpa o campo de texto.
- **`ExemploJanela.java`** — catálogo de componentes e recursos: `JOptionPane` (entrada, mensagem, aviso e confirmação), `JLabel` com imagem, mnemônicos, `JCheckBox`, `JRadioButton` com `ButtonGroup`, `JMenuBar` e comparação entre os gerenciadores de layout `FlowLayout`, `GridLayout` e `BorderLayout`.

## 🧠 Principais conceitos abordados

- **Swing** — hierarquia `JFrame` → `ContentPane` → `JPanel` → componentes
- **Componentes** — `JButton`, `JLabel`, `JTextField`, `JCheckBox`, `JRadioButton`, `JMenuBar`
- **Caixas de diálogo** — `JOptionPane.showInputDialog`, `showMessageDialog` e `showConfirmDialog`
- **Gerenciadores de layout** — `FlowLayout`, `GridLayout` e `BorderLayout`
- **Eventos** — `ActionListener` com classe anônima
- **Usabilidade** — *tooltips*, mnemônicos (atalhos `Alt`), foco (`requestFocus`) e centralização da janela
- **Herança** — classes que estendem `JFrame`

## 📁 Estrutura do projeto

```
TerceiroPrj/
└── src/
    └── meuapp/
        ├── ExemploJanela.java
        └── TesteJanela.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | Eclipse IDE (projeto Java com pastas `src/` e `bin/`) |
| GUI | Java Swing / AWT (`javax.swing`, `java.awt`) |

## ▶️ Como executar

**Pela IDE:** importe a pasta do projeto no Eclipse (*File → Import → Existing Projects into Workspace*) ou abra-a no IntelliJ IDEA e execute o método `main` da classe desejada.

**Pelo terminal** (a partir da pasta do projeto):

```bash
# Compilar
javac -d bin $(find src -name "*.java")

# Executar
java -cp bin meuapp.TesteJanela
java -cp bin meuapp.ExemploJanela
```

> ℹ️ As imagens `javalogo.gif` e `javalogo2.gif` usadas em `ExemploJanela` não acompanham o projeto; sem elas, os componentes são exibidos apenas com texto.

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [🌘 Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
