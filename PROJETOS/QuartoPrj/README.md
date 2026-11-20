-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# QuartoPrj — Máscaras de entrada com JFormattedTextField

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/IDE-Eclipse-007ec6?style=for-the-badge&logo=eclipseide&logoColor=white) ![Swing](https://img.shields.io/badge/GUI-Java%20Swing-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Formulário Swing com campos formatados por máscara (CEP, telefone, CPF e data) usando `JFormattedTextField` e `MaskFormatter`.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

A classe `TestandoJFormattedTextField` monta uma janela com *layout* absoluto (`setLayout(null)` + `setBounds`) contendo quatro rótulos e quatro campos formatados:

| Campo | Máscara |
|-------|---------|
| CEP | `#####-###` |
| Telefone | `(##)####-####` |
| CPF | `#########-##` |
| Data | `##/##/####` |

Cada máscara usa `_` como caractere de preenchimento (`setPlaceholderCharacter`). A criação das máscaras é protegida por `try/catch` de `ParseException`.

## 🧠 Principais conceitos abordados

- **`JFormattedTextField`** — campos de texto que validam a entrada segundo um formato
- **`MaskFormatter`** — definição de máscaras com `#` (dígito) e caractere de preenchimento
- **Layout absoluto** — posicionamento manual com `setBounds` (layout `null`)
- **Tratamento de exceções** — `ParseException` checada em `try/catch`
- **Swing** — `JFrame`, `JLabel`, `Container` e `setDefaultCloseOperation`

## 📁 Estrutura do projeto

```
QuartoPrj/
└── src/
    └── meuapp/
        └── TestandoJFormattedTextField.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | Eclipse IDE (projeto Java com pastas `src/` e `bin/`) |
| GUI | Java Swing (`javax.swing.text.MaskFormatter`) |

## ▶️ Como executar

**Pela IDE:** importe a pasta do projeto no Eclipse (*File → Import → Existing Projects into Workspace*) ou abra-a no IntelliJ IDEA e execute o método `main` da classe desejada.

**Pelo terminal** (a partir da pasta do projeto):

```bash
# Compilar
javac -d bin $(find src -name "*.java")

# Executar
java -cp bin meuapp.TestandoJFormattedTextField
```

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
