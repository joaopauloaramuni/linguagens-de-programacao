-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# SextoPrj — Arquivos de texto e serialização de objetos

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/IDE-Eclipse-007ec6?style=for-the-badge&logo=eclipseide&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Manipulação de arquivos em Java: escrita e leitura de texto com *buffers* e persistência de objetos com serialização.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

- **`TesteArquivos`** — lê uma linha digitada pelo usuário, grava em `teste.txt` com `BufferedWriter`/`FileWriter` e depois lê o arquivo linha a linha com `BufferedReader`/`FileReader`.
- **`TesteObjetos`** — grava um `Empregado` e um `Gerente` no arquivo binário `empregado.dat` com `ObjectOutputStream` e os recupera com `ObjectInputStream`.
- **`Empregado` / `Gerente`** — classes serializáveis (`implements Serializable`, com `serialVersionUID`); `Gerente` herda de `Empregado` e sobrescreve `toString()`.

## 🧠 Principais conceitos abordados

- **Arquivos de texto** — `FileWriter`, `BufferedWriter`, `FileReader`, `BufferedReader`
- **Serialização** — `Serializable`, `serialVersionUID`, `ObjectOutputStream` e `ObjectInputStream`
- **Herança e polimorfismo** — `Gerente extends Empregado` e sobrescrita de `toString()` com `@Override`
- **Exceções de E/S** — `IOException`, `FileNotFoundException` e `ClassNotFoundException`
- **Classe `File`** — verificação de existência de arquivos com `exists()`
- **Encapsulamento** — atributos privados com *getters* e *setters*

## 📁 Estrutura do projeto

```
SextoPrj/
├── empregado.dat
├── src/
│   ├── meuapp/
│   │   ├── Empregado.java
│   │   ├── Gerente.java
│   │   ├── TesteArquivos.java
│   │   └── TesteObjetos.java
│   └── module-info.java
└── teste.txt
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
java -cp bin meuapp.TesteArquivos
java -cp bin meuapp.TesteObjetos
```

> Os arquivos `teste.txt` e `empregado.dat` são criados/sobrescritos na pasta de onde o programa é executado.

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
