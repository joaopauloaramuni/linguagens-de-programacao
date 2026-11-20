-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# Prova_BBB — Votação de eliminação do BBB

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![Swing](https://img.shields.io/badge/GUI-Java%20Swing-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Sistema de votação para eliminação de participantes do BBB 24, com versão de console e interface gráfica.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

- **`Jogador`** — classe com `nome` e `votos` e o método `incrementaUmVoto()`.
- **`Main`** — cadastra os participantes em um `ArrayList<Jogador>`, recebe votos pelo console até que o usuário digite `sair` e apura quem recebeu mais votos.
- **`GUI`** — versão Swing com os botões **Votar** e **Apurar resultado**, usando `JOptionPane`.

## 🧠 Principais conceitos abordados

- **Orientação a objetos** — classe `Jogador` com encapsulamento e comportamento próprio
- **Coleções de objetos** — `ArrayList<Jogador>` percorrido com *for-each*
- **Busca e contagem** — localizar o participante votado e encontrar o mais votado
- **Comparação de *strings*** — `equals` em vez de `==`
- **Interface gráfica** — `JFrame`, `JButton`, `JOptionPane` e `ActionListener`

## 📁 Estrutura do projeto

```
Prova_BBB/
└── src/
    ├── GUI.java
    ├── Jogador.java
    └── Main.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | IntelliJ IDEA (módulo Java simples, arquivo `.iml`) |
| GUI | Java Swing |

## ▶️ Como executar

**Pela IDE:** abra a pasta do projeto no IntelliJ IDEA e execute o método `main` da classe `Main`.

**Pelo terminal** (a partir da pasta do projeto):

```bash
javac -d out src/*.java
java -cp out Main
```

Para a versão gráfica, execute a classe `GUI` (`java -cp out GUI`).

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
