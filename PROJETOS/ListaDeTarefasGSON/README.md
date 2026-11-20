-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# ListaDeTarefasGSON — Lista de tarefas com persistência em JSON

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-Wrapper-007ec6?style=for-the-badge&logo=apachemaven&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-007ec6?style=for-the-badge&logo=intellijidea&logoColor=white) ![Gson](https://img.shields.io/badge/Gson-2.10.1-007ec6?style=for-the-badge&logo=google&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Evolução do projeto **ListaDeTarefas**: as tarefas passam a ser objetos e podem ser exportadas e importadas em **JSON** com a biblioteca **Gson**.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

- **`Tarefa`** — classe modelo com `cod_tarefa` e `nome_tarefa`.
- **`ListaDeTarefas`** — menu com as opções:
  1. Adicionar tarefa;
  2. Remover tarefa;
  3. Listar tarefas;
  4. Gerar JSON com as tarefas (objeto → JSON) em `tarefas.json`;
  5. Ler o JSON e reconstruir a lista (JSON → objeto);
  6. Sair.

## 🧠 Principais conceitos abordados

- **Orientação a objetos** — classe modelo `Tarefa` com encapsulamento e `toString()`
- **Coleções de objetos** — `ArrayList<Tarefa>`
- **JSON com Gson** — `gson.toJson(...)` e `gson.fromJson(...)`
- **Persistência em arquivo** — `FileWriter` e `BufferedReader`
- **Bibliotecas externas** — uso do `gson-2.10.1.jar`

## 📁 Estrutura do projeto

```
ListaDeTarefasGSON/
├── gson-2.10.1.jar
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           ├── ListaDeTarefas.java
│           └── Tarefa.java
└── tarefas.json
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| Build | Apache Maven via Maven Wrapper (`mvnw` / `mvnw.cmd`) |
| Compilador | `maven-compiler-plugin` 3.11.0 com `source` e `target` = **17** |
| Dependências do `pom.xml` | JavaFX 17.0.6 (`javafx-controls`, `javafx-fxml`) e JUnit Jupiter 5.9.2 — herdadas do template de projeto da IDE |
| IDE | IntelliJ IDEA |
| Biblioteca | Gson **2.10.1** (`gson-2.10.1.jar`, incluído na pasta do projeto) |

## ▶️ Como executar

**Pela IDE (recomendado):** abra a pasta do projeto no IntelliJ IDEA, aguarde a importação do Maven e execute o método `main` da classe desejada.

**Pelo terminal:**

```bash
# Compilar (Linux/macOS)
./mvnw compile

# Compilar (Windows)
mvnw.cmd compile

# Executar
java -cp target/classes:gson-2.10.1.jar ListaDeTarefas
```

> ℹ️ O `javafx-maven-plugin` do `pom.xml` aponta para uma classe `HelloApplication` do template da IDE, que não faz parte do projeto. Por isso, execute as classes diretamente com `java -cp target/classes`.

### 📦 Adicionando o Gson

O `gson-2.10.1.jar` está na pasta do projeto, mas não é declarado no `pom.xml`. Você pode adicioná-lo como biblioteca no IntelliJ (*File → Project Structure → Libraries*) ou incluir a dependência no `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [📦 Apache Maven – Guia de introdução](https://maven.apache.org/guides/getting-started/)
- [🧰 Maven Wrapper](https://maven.apache.org/wrapper/)
- [🧩 Gson – Repositório oficial (Google)](https://github.com/google/gson)
- [📖 Gson User Guide](https://github.com/google/gson/blob/main/UserGuide.md)
- [📦 Gson no Maven Central](https://central.sonatype.com/artifact/com.google.code.gson/gson)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
