-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# PrimeiroPrj — Primeiros passos em Java

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/IDE-Eclipse-007ec6?style=for-the-badge&logo=eclipseide&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Primeiro projeto da disciplina: um passeio pelos fundamentos da linguagem Java — tipos primitivos, operadores, escopo, entrada de dados e estruturas de controle.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

O projeto reúne dois programas de console:

- **`Teste.java`** — sequência de exemplos comentados sobre tipos primitivos (`byte`, `short`, `char`, `int`, `long`, `float`, `double`, `boolean`), sequências de escape, escopo de variáveis, operadores aritméticos, relacionais, lógicos e de curto-circuito, manipulação de bits em `char`, pré/pós-incremento e leitura de caracteres com `System.in.read()` (jogo de adivinhar a letra).
- **`Exemplo.java`** — menu interativo com `do-while` + `switch` que executa três exercícios: soma de 4 números, média de 3 notas e cálculo de aumento salarial de 25%.

## 🧠 Principais conceitos abordados

- **Tipos primitivos** — faixas de valores, literais (`L`, `f`) e conversões entre tipos
- **Operadores** — aritméticos (`/`, `%`), relacionais, lógicos (`&`, `|`, `^`, `!`) e de curto-circuito (`&&`, `||`)
- **Escopo de variáveis** — visibilidade de variáveis declaradas dentro de blocos `{ }`
- **Incremento** — diferença entre pré-incremento (`++x`) e pós-incremento (`x++`)
- **Entrada de dados** — `Scanner` e `System.in.read()`
- **Estruturas de controle** — `if`, `for`, `do-while` e `switch` para montar menus
- **Métodos estáticos** — organização do código em métodos `private static`

## 📁 Estrutura do projeto

```
PrimeiroPrj/
└── src/
    ├── meuapp/
    │   ├── Exemplo.java
    │   └── Teste.java
    └── module-info.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | Eclipse IDE (projeto Java com pastas `src/` e `bin/`) |
| Módulos (JPMS) | `module-info.java` declarando o módulo `meuapp` |

## ▶️ Como executar

**Pela IDE:** importe a pasta do projeto no Eclipse (*File → Import → Existing Projects into Workspace*) ou abra-a no IntelliJ IDEA e execute o método `main` da classe desejada.

**Pelo terminal** (a partir da pasta do projeto):

```bash
# Compilar
javac -d bin $(find src -name "*.java")

# Executar
java -cp bin meuapp.Teste
java -cp bin meuapp.Exemplo
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
