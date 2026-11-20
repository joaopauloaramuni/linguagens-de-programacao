-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# Excecoes — Tratamento de exceções e log em arquivo

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-Wrapper-007ec6?style=for-the-badge&logo=apachemaven&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Seis exemplos de tratamento de exceções em Java, registrando as mensagens de erro em arquivos de *log*.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

| Classe | O que demonstra |
|--------|-----------------|
| `Exemplo1` | `ArithmeticException` (divisão por zero) e múltiplos `catch` com códigos de erro |
| `Exemplo2` | `FileNotFoundException` e gravação do erro em `log.dat` com `ObjectOutputStream` |
| `Exemplo3` | *Multi-catch* (`ArrayIndexOutOfBoundsException \| NullPointerException`) |
| `Exemplo4` | Estrutura `try/catch/finally` |
| `Exemplo5` | `NumberFormatException` ao converter texto em número e propagação com `throws` |
| `Exemplo6` | Lançamento manual com `throw new IllegalArgumentException(...)` |

As mensagens de erro são acrescentadas ao arquivo `log.txt` (`FileWriter` em modo *append*).

## 🧠 Principais conceitos abordados

- **`try/catch/finally`** — captura e bloco de execução garantida
- **Hierarquia de exceções** — `Exception`, exceções checadas e não checadas (`RuntimeException`)
- **Multi-catch** — captura de vários tipos em um único `catch`
- **`throw` e `throws`** — lançamento manual e propagação
- **Log em arquivo** — `BufferedWriter`/`FileWriter` em modo *append* e `ObjectOutputStream`
- **Saída de erro** — `System.err`

## 📁 Estrutura do projeto

```
Excecoes/
├── log.dat
├── log.txt
├── pom.xml
└── src/
    └── main/
        └── java/
            ├── Exemplo1.java
            ├── Exemplo2.java
            ├── Exemplo3.java
            ├── Exemplo4.java
            ├── Exemplo5.java
            └── Exemplo6.java
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
java -cp target/classes Exemplo1
```

> ℹ️ O `javafx-maven-plugin` do `pom.xml` aponta para uma classe `HelloApplication` do template da IDE, que não faz parte do projeto. Por isso, execute as classes diretamente com `java -cp target/classes`.

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [📦 Apache Maven – Guia de introdução](https://maven.apache.org/guides/getting-started/)
- [🧰 Maven Wrapper](https://maven.apache.org/wrapper/)
- [⚠️ Exceptions – The Java Tutorials](https://docs.oracle.com/javase/tutorial/essential/exceptions/)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
