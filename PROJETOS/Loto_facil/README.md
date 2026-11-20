-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# Loto_facil — Jogo de apostas no console e com interface gráfica

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-Wrapper-007ec6?style=for-the-badge&logo=apachemaven&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![Swing](https://img.shields.io/badge/GUI-Java%20Swing-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Jogo de apostas inspirado em loterias, com uma versão de console e outra com interface gráfica Swing.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

O jogador escolhe entre três modalidades:

1. **Apostar de 0 a 100** — compara o número digitado com um número sorteado por `Random`;
2. **Apostar de A a Z** — compara a letra digitada (convertida para maiúscula) com a letra premiada;
3. **Apostar em par ou ímpar** — verifica a paridade do número digitado.

- **`Lotofacil.java`** — versão de console com menu `do-while` + `switch` e tratamento de exceções.
- **`LotofacilGUI.java`** — versão Swing com três botões e `JOptionPane` para entrada e resultado.

## 🧠 Principais conceitos abordados

- **Números aleatórios** — `java.util.Random`
- **Manipulação de caracteres** — `Character.isLetter` e `Character.toUpperCase`
- **Menus de console** — `do-while` + `switch`
- **Interface gráfica** — `JFrame`, `JPanel`, `JButton`, `FlowLayout` e `JOptionPane`
- **Eventos** — `ActionListener` com classes anônimas
- **Tratamento de exceções** — `IOException`, `NullPointerException` e `Exception`

## 📁 Estrutura do projeto

```
Loto_facil/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── lotofacil/
                ├── Lotofacil.java
                └── LotofacilGUI.java
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
java -cp target/classes lotofacil.Lotofacil
java -cp target/classes lotofacil.LotofacilGUI
```

> ℹ️ O `javafx-maven-plugin` do `pom.xml` aponta para uma classe `HelloApplication` do template da IDE, que não faz parte do projeto. Por isso, execute as classes diretamente com `java -cp target/classes`.

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [📦 Apache Maven – Guia de introdução](https://maven.apache.org/guides/getting-started/)
- [🧰 Maven Wrapper](https://maven.apache.org/wrapper/)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
