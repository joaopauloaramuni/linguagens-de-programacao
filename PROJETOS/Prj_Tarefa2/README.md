-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# Prj_Tarefa2 — Exercícios com laço for

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Exercícios resolvidos com a estrutura de repetição `for`, operador de módulo e *casting*.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

A classe `Main` executa três exercícios:

1. Contar quantos números pares de 2 a 1000 são múltiplos de 3 (`for` com passo `i += 2` e `%`).
2. Ler 10 números e calcular a média (com *cast* para `double`).
3. Ler largura e comprimento de 4 cômodos e calcular a área de cada um.

## 🧠 Principais conceitos abordados

- **Laço `for`** — inicialização, condição e incremento personalizado (`i += 2`)
- **Operador de módulo** — `%` para testar divisibilidade
- **Casting** — `(double) soma / 10` para evitar divisão inteira
- **Entrada de dados** — `Scanner`
- **Modularização** — métodos `private static`

## 📁 Estrutura do projeto

```
Prj_Tarefa2/
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
