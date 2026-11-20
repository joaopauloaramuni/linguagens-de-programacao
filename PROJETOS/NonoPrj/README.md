-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# NonoPrj — Acesso a banco de dados com JDBC e SQLite

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/IDE-Eclipse-007ec6?style=for-the-badge&logo=eclipseide&logoColor=white) ![SQLite](https://img.shields.io/badge/SQLite-JDBC-007ec6?style=for-the-badge&logo=sqlite&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Conexão de uma aplicação Java a um banco **SQLite** via **JDBC**, com script SQL de uma pequena biblioteca (livros, alunos e empréstimos).

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

- **`scripts/script.sql`** — cria as tabelas `Livro`, `Aluno` e `Emprestimo` (com chaves primárias, estrangeiras e índices) e traz exemplos de **CRUD** (`INSERT`, `SELECT`, `UPDATE`, `DELETE`) e de `INNER JOIN`.
- **`bd/BD`** — arquivo do banco SQLite.
- **`meuapp/TesteBD.java`** — abre a conexão com `DriverManager.getConnection`, executa `SELECT * FROM Livro WHERE Titulo LIKE 'Introdução%'` com `Statement` e percorre o `ResultSet`.
- **`lib/sqlite-jdbc-3.42.0.0.jar`** — driver JDBC do SQLite.

## 🧠 Principais conceitos abordados

- **JDBC** — `Connection`, `DriverManager`, `Statement` e `ResultSet`
- **SQL / DDL** — `CREATE TABLE`, `PRIMARY KEY`, `FOREIGN KEY`, `CREATE UNIQUE INDEX`, `DROP TABLE`
- **CRUD** — `INSERT`, `SELECT`, `UPDATE` e `DELETE`
- **Junções** — `INNER JOIN` entre empréstimos, livros e alunos
- **Tratamento de exceções** — `SQLException`
- **Módulos (JPMS)** — `module-info.java` com `requires java.sql`

## 📁 Estrutura do projeto

```
NonoPrj/
└── src/
    ├── bd/
    │   └── BD
    ├── lib/
    │   └── sqlite-jdbc-3.42.0.0.jar
    ├── meuapp/
    │   └── TesteBD.java
    ├── module-info.java
    └── scripts/
        └── script.sql
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | Eclipse IDE (projeto Java com pastas `src/` e `bin/`) |
| Módulos (JPMS) | `module-info.java` declarando o módulo `NonoPrj` |
| Banco de dados | SQLite |
| Driver | `sqlite-jdbc` **3.42.0.0** (em `src/lib/`) |

## ▶️ Como executar

**Pela IDE:** importe a pasta do projeto no Eclipse (*File → Import → Existing Projects into Workspace*) ou abra-a no IntelliJ IDEA e execute o método `main` da classe desejada.

**Pelo terminal** (a partir da pasta do projeto):

```bash
# Compilar
javac -cp src/lib/sqlite-jdbc-3.42.0.0.jar -d bin $(find src -name "*.java")

# Executar
java -cp bin:src/lib/sqlite-jdbc-3.42.0.0.jar meuapp.TesteBD
```

> ⚠️ A URL de conexão em `TesteBD.java` usa um caminho absoluto da máquina do professor. Antes de executar, ajuste-a para o caminho do banco no seu computador, por exemplo:
>
> ```java
> String url = "jdbc:sqlite:src/bd/BD";
> ```

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [🌘 Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/)
- [🔌 JDBC – Tutorial oficial (Oracle)](https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html)
- [🗄️ SQLite JDBC Driver (xerial)](https://github.com/xerial/sqlite-jdbc)
- [📗 Documentação do SQLite](https://www.sqlite.org/docs.html)
- [🖥️ DB Browser for SQLite](https://sqlitebrowser.org/)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
