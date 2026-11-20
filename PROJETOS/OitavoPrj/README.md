-----

<img alt="newtonpaiva" src="https://joaopauloaramuni.github.io/image/newton-logo2.png?raw=true"/>

-----

# OitavoPrj — Recursividade, QuickSort e Javadoc

![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/IDE-Eclipse-007ec6?style=for-the-badge&logo=eclipseide&logoColor=white) ![License](https://img.shields.io/badge/License-MIT-007ec6?style=for-the-badge&logo=opensourceinitiative&logoColor=white)

Algoritmos recursivos clássicos, ordenação com **QuickSort** e geração de documentação com **Javadoc**.

> 🎓 Projeto da disciplina **Linguagens de Programação** dos cursos de **Ciência da Computação**, **Sistemas de Informação** e **Análise e Desenvolvimento de Sistemas** do **Centro Universitário Newton Paiva**.
>
> - 2°Sem 2023
> - 1°Sem 2024

-----

## 📌 Sobre o projeto

- **`ExemploRecursao`** — implementações recursivas comentadas com Javadoc: fatorial, MDC (algoritmo de Euclides), contagem de pares, potência e sequência de Fibonacci.
- **`QuickSort`** — gera um vetor de 100 inteiros aleatórios, ordena com QuickSort (particionamento pelo primeiro elemento como pivô) e mede o tempo de execução com `System.currentTimeMillis()`.
- **`doc/`** — documentação HTML gerada pela ferramenta `javadoc` a partir dos comentários do código.

## 🧠 Principais conceitos abordados

- **Recursividade** — caso base, passo recursivo e pilha de chamadas
- **Algoritmos clássicos** — fatorial, MDC de Euclides, potência e Fibonacci
- **Ordenação** — QuickSort — divisão e conquista com escolha de pivô e particionamento
- **Medição de desempenho** — tempo de execução com `System.currentTimeMillis()`
- **Javadoc** — comentários `/** ... */` com `@param` e `@return` e geração de HTML
- **Módulos (JPMS)** — `module-info.java`

## 📁 Estrutura do projeto

```
OitavoPrj/
├── doc/
└── src/
    ├── meuapp/
    │   ├── ExemploRecursao.java
    │   └── QuickSort.java
    └── module-info.java
```

## ☕ Versão do Java e tecnologias

| Item | Versão / Detalhe |
|------|------------------|
| Java (JDK) | **17 (LTS)** |
| IDE | Eclipse IDE (projeto Java com pastas `src/` e `bin/`) |
| Módulos (JPMS) | `module-info.java` declarando o módulo `OitavoPrj` |
| Documentação | Javadoc (HTML em `doc/`) |

## ▶️ Como executar

**Pela IDE:** importe a pasta do projeto no Eclipse (*File → Import → Existing Projects into Workspace*) ou abra-a no IntelliJ IDEA e execute o método `main` da classe desejada.

**Pelo terminal** (a partir da pasta do projeto):

```bash
# Compilar
javac -d bin $(find src -name "*.java")

# Executar
java -cp bin meuapp.ExemploRecursao
java -cp bin meuapp.QuickSort
```

**Gerar a documentação Javadoc:**

```bash
javadoc -d doc $(find src -name "*.java")
```

Depois, abra `doc/index.html` no navegador.

## 📚 Documentação e links úteis

- [☕ Documentação oficial do Java SE 17 (API)](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [📘 The Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- [📥 Download do JDK 17 (Eclipse Temurin)](https://adoptium.net/temurin/releases/?version=17)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [🌘 Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/)
- [📝 Como escrever comentários Javadoc (Oracle)](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)
- [🛠️ Ferramenta `javadoc` – Java 17](https://docs.oracle.com/en/java/javase/17/docs/specs/man/javadoc.html)

## 👨‍🏫 Professor

**João Paulo Aramuni** — [GitHub](https://github.com/joaopauloaramuni)

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](https://github.com/joaopauloaramuni/linguagens-de-programacao/blob/main/LICENSE) na raiz do repositório para mais detalhes.

Copyright (c) 2024 João Paulo Aramuni
