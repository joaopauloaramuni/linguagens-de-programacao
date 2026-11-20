-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# SegundoPrj — Laços, desvios e entrada formatada

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/IDE-Eclipse-007ec6?style=for-the-badge&logo=eclipseide&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Exemplos de estruturas de repetição, comandos de desvio (`break` e `continue`), leitura com `Scanner` e saída formatada com `printf`.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

O programa `Teste.java` apresenta, em sequência:

1. Um jogo de **adivinhar a letra** usando `do-while` aninhado e `System.in.read()` (descartando o restante da linha digitada).
2. Uso de **`break`** para encerrar um `for` quando `i * i >= 100`.
3. Uso de **`continue`** para imprimir apenas os números pares de 0 a 100.
4. Leitura de nome, idade e salário com **`Scanner`** (`nextLine`, `nextInt`, `nextDouble`).
5. **Formatação de números** com `System.out.printf` (separador de milhar, casas decimais e moeda).

## 🧠 Principais conceitos abordados

- **Laços de repetição** — `for`, `while` e `do-while` (inclusive aninhados)
- **Comandos de desvio** — `break` e `continue`
- **Leitura do teclado** — `System.in.read()` com *cast* para `char` e a classe `Scanner`
- **Saída formatada** — `printf` com especificadores como `%, .2f`
- **Casting** — conversão explícita de `int` para `char`

## 📁 Estrutura do projeto

```
SegundoPrj/
└── src/
    ├── meuapp/
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
