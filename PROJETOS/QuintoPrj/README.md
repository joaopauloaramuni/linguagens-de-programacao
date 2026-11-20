-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# QuintoPrj — ArrayList e exceções personalizadas

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/IDE-Eclipse-007ec6?style=for-the-badge&logo=eclipseide&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Exemplos de coleções com `ArrayList` (inserção, remoção e formas de percorrer) e de tratamento de exceções, incluindo a criação de uma exceção própria.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

- **`ExemploArrayList`** — agenda de contatos em `ArrayList<String>`, percorrida por índice, *for-each* e `Iterator`; remoção por posição tratando `IndexOutOfBoundsException`.
- **`ExemploArrayList2`** — sorteio de 6 números distintos de 1 a 60 com `Random` e verificação de acerto com `contains`.
- **`ExemploArrayList3`** — menu de cadastro e listagem de pessoas em `ArrayList<Pessoa>`.
- **`Estoque` + `EIException`** — classe de estoque que lança a exceção checada personalizada `EIException` (*Estoque Insuficiente*) ao tentar retirar mais itens do que o disponível.
- **`ExemploExcecoes`** — uso de múltiplos `catch`, `finally`, relançamento de exceção (`throw e`) e leitura de objetos serializados (`ObjectInputStream`).

## 🧠 Principais conceitos abordados

- **Coleções** — `ArrayList` com *generics*: `add`, `get`, `remove`, `size`, `contains`
- **Formas de percorrer listas** — `for` com índice, *for-each* e `Iterator`
- **Exceções personalizadas** — classe que estende `Exception` com atributos e construtores próprios
- **`throw` / `throws`** — lançamento e propagação de exceções checadas
- **`try/catch/finally`** — múltiplos `catch` do mais específico ao mais genérico e relançamento
- **Números aleatórios** — `java.util.Random`
- **Orientação a objetos** — encapsulamento, construtores e *getters*

## 📁 Estrutura do projeto

```
QuintoPrj/
└── src/
    └── meuapp/
        ├── EIException.java
        ├── Estoque.java
        ├── ExemploArrayList.java
        ├── ExemploArrayList2.java
        ├── ExemploArrayList3.java
        └── ExemploExcecoes.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | Eclipse IDE (projeto Java com pastas `src/` e `bin/`) |

## ▶️ Como executar

**Pela IDE:** importe a pasta do projeto no Eclipse (*File → Import → Existing Projects into Workspace*) ou abra-a no IntelliJ IDEA e execute o método `main` da classe desejada.

**Pelo terminal** (a partir da pasta do projeto):

```bash
# Compilar
javac -d bin $(find src -name "*.java")

# Executar
java -cp bin meuapp.ExemploArrayList
java -cp bin meuapp.ExemploArrayList2
java -cp bin meuapp.ExemploExcecoes
```

> ⚠️ `ExemploArrayList3` utiliza uma classe `Pessoa` (com `nome`, `endereco`, `telefone`, `getNome()` e `toString()`) que não está no projeto — fica como exercício implementá-la antes de compilar. Para compilar os demais exemplos sem ela, remova `ExemploArrayList3.java` do comando `javac`.

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
