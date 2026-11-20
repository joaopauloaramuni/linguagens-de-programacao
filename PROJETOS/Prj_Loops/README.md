-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# Prj_Loops — Exercícios de estruturas de repetição

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Exercícios sobre laços com condição de parada definida pelo usuário (valor sentinela).

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

A classe `Main` executa três exercícios:

1. Ler números até que o usuário digite `0` e informar quantos são pares e quantos são ímpares.
2. Ler números até que o usuário digite `-1` e exibir a quantidade digitada e a soma.
3. Ler três notas com `for` e exibir a média aritmética.

## 🧠 Principais conceitos abordados

- **Laço `while` com sentinela** — repetição até um valor de parada (`0` ou `-1`)
- **Laço `for`** — repetição com número fixo de iterações
- **Operador de módulo** — `num % 2` para identificar pares e ímpares
- **Contadores e acumuladores** — `contpar++`, `soma += num`
- **Classes *wrapper*** — uso de `Double`
- **Entrada de dados** — `Scanner`

## 📁 Estrutura do projeto

```
Prj_Loops/
└── src/
    └── Main.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | IntelliJ IDEA (módulo Java simples, arquivo `.iml`) |

## ▶️ Como executar

**Pela IDE:** abra a pasta do projeto no IntelliJ IDEA e execute o método `main` da classe `Main`.

**Pelo terminal** (a partir da pasta do projeto):

```bash
javac -d out src/*.java
java -cp out Main
```

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
