-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# CorrecaoProva — Correção comentada da prova

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-Wrapper-007ec6?style=for-the-badge&logo=apachemaven&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Código usado na correção de questões da prova, permitindo executar e verificar o comportamento de cada trecho.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

- **`Correcao`** — questões sobre:
  - **Questão 2:** avaliação de expressões lógicas e relacionais com `&&`, `||` e `!`;
  - **Questão 4:** pré e pós-incremento (`++r` e `r++`) dentro de um laço;
  - **Questão 7:** *overflow* de inteiros em um laço `for` (explicação nos comentários).
- **`Questao5` + `A`** — construtores, valores padrão de atributos e *getters*/*setters* (com comentário sobre o tipo de retorno correto de um *setter*).
- **`Questao6`** — referências a objetos (`m = k` aponta para o mesmo objeto), atributos `static` e `Random`.

## 🧠 Principais conceitos abordados

- **Expressões lógicas** — precedência e curto-circuito
- **Incremento** — pré-incremento × pós-incremento
- **Overflow de inteiros** — o que acontece quando um `int` ultrapassa `Integer.MAX_VALUE`
- **Orientação a objetos** — construtores, encapsulamento, referências e membros `static`
- **Valores padrão** — atributos não inicializados (`int` = 0)
- **Caixas de diálogo** — `JOptionPane` para entrada e saída

## 📁 Estrutura do projeto

```
CorrecaoProva/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── prova/
                ├── A.java
                ├── Correcao.java
                ├── Questao5.java
                └── Questao6.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| Build | Apache Maven via Maven Wrapper (`mvnw` / `mvnw.cmd`) |
| Compilador | `maven-compiler-plugin` 3.11.0 com `source` e `target` = **17** |
| Dependências do `pom.xml` | JavaFX 17.0.6 (`javafx-controls`, `javafx-fxml`) e JUnit Jupiter 5.9.2 — herdadas do template de projeto da IDE |
| IDE | IntelliJ IDEA |

## ▶️ Como executar

**Pela IDE (recomendado):** abra a pasta do projeto no IntelliJ IDEA, aguarde a importação do Maven e execute o método `main` da classe desejada.

**Pelo terminal:**

```bash
# Compilar (Linux/macOS)
./mvnw compile

# Compilar (Windows)
mvnw.cmd compile

# Executar
java -cp target/classes prova.Correcao
java -cp target/classes prova.Questao5
java -cp target/classes prova.Questao6
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
