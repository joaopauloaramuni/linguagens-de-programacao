-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# Recursividade — Exemplos de funções recursivas

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-Wrapper-007ec6?style=for-the-badge&logo=apachemaven&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Coleção de exemplos que comparam soluções iterativas e recursivas, incluindo versões em uma linha com operador ternário.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

| Classe | Descrição |
|--------|-----------|
| `Fatorial_SemRecursao` | Fatorial com laço `for` |
| `Fatorial_ComRecursao` | Fatorial recursivo (com e sem operador ternário) |
| `ContarZeros_ComRecursao` | Conta os dígitos zero de um número |
| `ElementoPresente_ComRecursao` | Verifica se um elemento está em um `ArrayList` |
| `Palindromo_ComRecursao` | Verifica se uma palavra é palíndromo |
| `SomaArray_ComRecursao` | Soma os elementos de um `ArrayList` |
| `OutrosExemplos` | MDC, contagem de pares, potência, Fibonacci, contagem regressiva e inversão de palavra |
| `OutrosExemplosUmaLinha` | Os mesmos algoritmos escritos em uma linha com o operador ternário |

## 🧠 Principais conceitos abordados

- **Recursividade** — caso base e passo recursivo
- **Iteração × recursão** — comparação entre as duas abordagens para o mesmo problema
- **Pilha de chamadas** — como cada chamada recursiva é empilhada e resolvida
- **Operador ternário** — `condição ? valor1 : valor2` para funções recursivas compactas
- **Algoritmos clássicos** — fatorial, MDC, potência, Fibonacci e palíndromo

## 📁 Estrutura do projeto

```
Recursividade/
├── pom.xml
└── src/
    └── main/
        └── java/
            ├── ContarZeros_ComRecursao.java
            ├── ElementoPresente_ComRecursao.java
            ├── Fatorial_ComRecursao.java
            ├── Fatorial_SemRecursao.java
            ├── OutrosExemplos.java
            ├── OutrosExemplosUmaLinha.java
            ├── Palindromo_ComRecursao.java
            └── SomaArray_ComRecursao.java
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
java -cp target/classes Fatorial_ComRecursao
java -cp target/classes OutrosExemplos
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
