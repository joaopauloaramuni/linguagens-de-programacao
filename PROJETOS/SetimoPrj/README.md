-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# SetimoPrj — Conversão entre Java e JSON com Gson

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/IDE-Eclipse-007ec6?style=for-the-badge&logo=eclipseide&logoColor=white) ![Gson](https://img.shields.io/badge/Gson-2.10.1-007ec6?style=for-the-badge&logo=google&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Serialização e desserialização de objetos Java em **JSON** utilizando a biblioteca **Gson**, do Google.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

- **`Informacoes`** — classe modelo com `cod_id`, `nome` e uma lista de linguagens preferidas.
- **`ConverterJavaJSON`** — converte um objeto `Informacoes` em JSON com `gson.toJson(...)` e grava o resultado em `file.json`.
- **`ConverterJSONJava`** — lê `file.json` e reconstrói o objeto com `gson.fromJson(..., Informacoes.class)`.

Exemplo do JSON gerado:

```json
{"cod_id":500,"nome":"Aramuni","listaPreferencias":["Python","JavaScript","Java"]}
```

## 🧠 Principais conceitos abordados

- **JSON** — formato de troca de dados baseado em pares chave/valor e listas
- **Serialização / desserialização** — `toJson` (objeto → JSON) e `fromJson` (JSON → objeto)
- **Bibliotecas externas** — uso de um `.jar` de terceiros no *classpath*
- **Coleções** — `List<String>` como atributo de classe
- **Arquivos** — `FileWriter` e `BufferedReader` para gravar e ler o JSON

## 📁 Estrutura do projeto

```
SetimoPrj/
├── file.json
├── gson-2.10.1.jar
└── src/
    └── meuapp/
        ├── ConverterJSONJava.java
        ├── ConverterJavaJSON.java
        ├── Informacoes.java
        └── exemplo.json
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | Eclipse IDE (projeto Java com pastas `src/` e `bin/`) |
| Biblioteca | Gson **2.10.1** (`gson-2.10.1.jar`, incluído na pasta do projeto) |

## ▶️ Como executar

**Pela IDE:** importe a pasta do projeto no Eclipse (*File → Import → Existing Projects into Workspace*) ou abra-a no IntelliJ IDEA e execute o método `main` da classe desejada.

**Pelo terminal** (a partir da pasta do projeto):

```bash
# Compilar
javac -cp gson-2.10.1.jar -d bin $(find src -name "*.java")

# Executar
java -cp bin:gson-2.10.1.jar meuapp.ConverterJavaJSON
java -cp bin:gson-2.10.1.jar meuapp.ConverterJSONJava
```

> No Windows, troque `:` por `;` no *classpath* (`-cp bin;gson-2.10.1.jar`).

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [🌘 Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/)
- [🧩 Gson – Repositório oficial (Google)](https://github.com/google/gson)
- [📖 Gson User Guide](https://github.com/google/gson/blob/main/UserGuide.md)
- [🌐 Introdução ao JSON](https://www.json.org/json-pt.html)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
