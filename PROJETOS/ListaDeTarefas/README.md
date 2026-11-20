-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# ListaDeTarefas — Aplicativo de lista de tarefas (console)

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-Wrapper-007ec6?style=for-the-badge&logo=apachemaven&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Aplicativo de console para gerenciar uma lista de tarefas em memória usando `ArrayList`.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

Menu interativo (`do-while` + `switch`) com as opções:

1. Adicionar tarefa;
2. Remover tarefa pelo índice;
3. Remover tarefa pelo nome;
4. Listar tarefas;
5. Sair.

As operações são implementadas em métodos separados, com **sobrecarga** do método `removerTarefa` (por `int` e por `String`).

## 🧠 Principais conceitos abordados

- **Coleções** — `ArrayList<String>`: `add`, `remove(int)`, `remove(Object)`, `size`
- **Sobrecarga de métodos** — `removerTarefa(lista, int)` × `removerTarefa(lista, String)`
- **Menus de console** — `do-while` + `switch`
- **Entrada de dados** — `Scanner` e o cuidado com `nextLine()` após `nextInt()`
- **Tratamento de exceções** — `IndexOutOfBoundsException` ao remover por um índice inválido

## 📁 Estrutura do projeto

```
ListaDeTarefas/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── ListaDeTarefas.java
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
java -cp target/classes ListaDeTarefas
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
