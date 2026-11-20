-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# Types App — Catálogo de tipos de dados

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Swing](https://img.shields.io/badge/GUI-Java%20Swing-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![SQLite](https://img.shields.io/badge/SQLite-JDBC-007ec6?style=for-the-badge&logo=sqlite&logoColor=white) ![Make](https://img.shields.io/badge/Build-Makefile-007ec6?style=for-the-badge&logo=gnu&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Aplicação desktop em **Java Swing** que funciona como um catálogo interativo de **tipos de dados** (`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `bool`, `string`…), com cadastro, consulta e exclusão persistidos em um banco **SQLite**.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

Projeto desenvolvido pelo aluno **Randolfo A. Gonçalves** (fev–abr/2024).

Cada tipo de dado pertence a uma **categoria** (por exemplo *Integer*, *Real*, *Logic*, *Text*) e registra nome, ícone, exemplo de uso, tamanho em bytes e valores mínimo e máximo. A aplicação possui telas para:

- **Menu principal** (`Gui_main`) — grade de ícones com os tipos cadastrados;
- **Informações** (`Gui_info`) — ficha detalhada do tipo selecionado, com efeito sonoro de “escrita”;
- **Inserção** (`Gui_insr`) — cadastro de novos tipos;
- **Exclusão** (`Gui_Delt`) — remoção de tipos.

**Banco de dados** (`sql/data.db`):

| Tabela | Campos principais |
|--------|-------------------|
| `Categories` | `_name`, `_brief`, `_color` |
| `Kinds` | `_name`, `_name_ctg` (FK → `Categories`), `_icon`, `_exemple`, `_size`, `_min`, `_max` |

As consultas parametrizadas usadas pela aplicação estão em `sql/querys.sql`.

## 🧠 Principais conceitos abordados

- **Orientação a objetos** — herança (`Types extends Category`, `Query extends Bank`, telas `extends Form extends JPanel`) e encapsulamento
- **Swing avançado** — navegação entre telas com `CardLayout` (classe `Manager`), menus e componentes personalizados
- **JDBC** — `Connection`, `PreparedStatement` com parâmetros `?`, `executeUpdate` e `ResultSet`
- **SQL** — tabelas com `AUTOINCREMENT`, `UNIQUE`, `DEFAULT` e `FOREIGN KEY`; operações de CRUD
- **Áudio** — efeitos sonoros com `javax.sound.sampled` (`AudioSystem` e `Clip`)
- **Recursos personalizados** — fontes TTF (`Font.createFont`), ícones e imagens
- **Pintura customizada** — sobrescrita de `paintComponent`
- **Dependências externas** — *drivers* `.jar` no *classpath*
- **Automação de build** — `Makefile` para compilar, executar e gerar `.jar`

## 📁 Estrutura do projeto

```
Types-App_types/
├── Makefile
├── rec/
│   ├── font/
│   ├── sound/
│   ├── types/
│   └── windown/
├── sql/
│   ├── data.db
│   ├── drive/
│   ├── inser_data.sql
│   ├── querys.sql
│   └── rules_bank.sqlite
└── src/
    ├── Bank.java
    ├── Category.java
    ├── Fonts.java
    ├── Form.java
    ├── Graph.java
    ├── Gui_Delt.java
    ├── Gui_info.java
    ├── Gui_insr.java
    ├── Gui_main.java
    ├── Main.java
    ├── Manager.java
    ├── Query.java
    ├── Sound.java
    ├── Sql.java
    └── Types.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | IntelliJ IDEA (módulo `.iml`) |
| Build | GNU Make (`Makefile`) + `javac`/`jar` |
| GUI | Java Swing / AWT |
| Banco de dados | SQLite (`sql/data.db`) |
| Driver JDBC | `sqlite-jdbc` **3.45.1.1** |
| Log | SLF4J API **2.0.9** + SLF4J Simple **2.0.12** |

## ▶️ Como executar

Os *drivers* necessários estão em `sql/drive/`.

**Linux / macOS** — dentro da pasta do projeto:

```bash
# Compilar
make

# Executar
make run

# Gerar o arquivo .jar
make jar
```

**Sem o `make`** (Linux/macOS, a partir da pasta do projeto):

```bash
javac -d bin src/*.java
java -cp ".:sql/drive/slf4j-api-2.0.9.jar:sql/drive/slf4j-simple-2.0.12.jar:sql/drive/sqlite-jdbc-3.45.1.1.jar:bin/" Main "$(pwd)/"
```

> ℹ️ O programa recebe como argumento o caminho da pasta raiz do projeto (com `/` no final), usado para localizar o banco e os recursos em `rec/`. No Windows, troque `:` por `;` no *classpath*.

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [🔌 JDBC – Tutorial oficial (Oracle)](https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html)
- [🗄️ SQLite JDBC Driver (xerial)](https://github.com/xerial/sqlite-jdbc)
- [🪵 SLF4J](https://www.slf4j.org/manual.html)
- [🃏 How to Use CardLayout (Oracle)](https://docs.oracle.com/javase/tutorial/uiswing/layout/card.html)
- [🔊 Java Sound API – Sampled Audio](https://docs.oracle.com/javase/tutorial/sound/sampled-overview.html)
- [🔧 GNU Make](https://www.gnu.org/software/make/manual/make.html)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
