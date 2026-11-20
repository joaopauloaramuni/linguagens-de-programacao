-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# MontyHall — Simulação do problema de Monty Hall

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-Wrapper-007ec6?style=for-the-badge&logo=apachemaven&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![Swing](https://img.shields.io/badge/GUI-Java%20Swing-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Simulação do famoso problema de probabilidade de **Monty Hall**, em versão de console e com interface gráfica Swing.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

Regras do jogo:

1. O jogador escolhe uma entre três portas; atrás de uma delas há um prêmio.
2. O apresentador abre uma das outras portas que **está vazia**.
3. O jogador decide se mantém a porta escolhida ou se **troca** para a outra porta fechada.

Trocar de porta aumenta a chance de vitória de 1/3 para 2/3 — um resultado contraintuitivo que pode ser verificado jogando várias vezes.

- **`MontyHall.java`** — versão de console com `Scanner`.
- **`MontyHallGUI.java`** — versão Swing com botão **Jogar** e diálogos `JOptionPane`.

## 🧠 Principais conceitos abordados

- **Simulação e probabilidade** — sorteio da porta premiada e da porta vazia com `Random`
- **Laços `do-while`** — sorteio repetido até obter uma porta válida
- **Validação de entrada** — aceitar apenas portas 1, 2 ou 3
- **Interface gráfica** — `JFrame`, `JButton`, `JOptionPane` e `ActionListener`
- **Conversão de tipos** — `Integer.parseInt` e `equalsIgnoreCase`

## 📁 Estrutura do projeto

```
MontyHall/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── montyhall/
                ├── MontyHall.java
                └── MontyHallGUI.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| Build | Apache Maven via Maven Wrapper (`mvnw` / `mvnw.cmd`) |
| Compilador | `maven-compiler-plugin` 3.11.0 com `source` e `target` = **17** |
| Dependências do `pom.xml` | JavaFX 17.0.6 (`javafx-controls`, `javafx-fxml`) e JUnit Jupiter 5.9.2 — herdadas do template de projeto da IDE |
| IDE | IntelliJ IDEA |
| GUI | Java Swing |

## ▶️ Como executar

**Pela IDE (recomendado):** abra a pasta do projeto no IntelliJ IDEA, aguarde a importação do Maven e execute o método `main` da classe desejada.

**Pelo terminal:**

```bash
# Compilar (Linux/macOS)
./mvnw compile

# Compilar (Windows)
mvnw.cmd compile

# Executar
java -cp target/classes montyhall.MontyHall
java -cp target/classes montyhall.MontyHallGUI
```

> ℹ️ O `javafx-maven-plugin` do `pom.xml` aponta para uma classe `HelloApplication` do template da IDE, que não faz parte do projeto. Por isso, execute as classes diretamente com `java -cp target/classes`.

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [📦 Apache Maven – Guia de introdução](https://maven.apache.org/guides/getting-started/)
- [🧰 Maven Wrapper](https://maven.apache.org/wrapper/)
- [🚪 Problema de Monty Hall (Wikipédia)](https://pt.wikipedia.org/wiki/Problema_de_Monty_Hall)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
