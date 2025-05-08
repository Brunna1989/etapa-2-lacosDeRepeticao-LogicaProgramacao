# Projeto: Geração e Análise de Números Aleatórios

## 📋 Descrição

Este projeto Java tem como objetivo gerar uma lista de números aleatórios e exibir o menor e o maior valor entre eles. Além disso, contém testes unitários completos que validam as funcionalidades, cobrindo inclusive listas vazias e nulas.

## 🛠 Tecnologias e Ferramentas

- **Java JDK 17**
- **JUnit 4.13.2**
- **Hamcrest Core 1.3**
- IDE recomendada: IntelliJ IDEA, Eclipse, VS Code, etc.
- Execução via terminal ou pela IDE

## 📁 Estrutura do Projeto

```
projeto/
│
├── lib/                      # Bibliotecas JUnit e Hamcrest
│   ├── junit-4.13.2.jar
│   └── hamcrest-core-1.3.jar
│
├── src/
│   ├── app/
│   │   └── Main.java         # Classe principal para execução
│   ├── model/
│   │   └── Numeros.java      # Classe de modelo que armazena a lista de inteiros
│   └── service/
│       └── NumerosService.java  # Classe com lógica de geração e exibição
│
├── test/
│   └── NumerosServiceTest.java  # Testes unitários com JUnit 4
│
└── README.md                # Documentação do projeto
```

## 🚀 Como Executar

1. **Clone o repositório ou baixe os arquivos.**

2. **Compile o projeto**:
   A partir da raiz do projeto:
   ```bash
   javac -cp "lib/*" -d bin src/model/Numeros.java src/service/NumerosService.java src/app/Main.java
   ```

3. **Execute o programa**:
   ```bash
   java -cp "bin" app.Main
   ```

4. **Executar os testes**:
   Compile os testes:
   ```bash
   javac -cp "lib/*;bin" -d bin test/NumerosServiceTest.java
   ```

   Execute os testes:
   ```bash
   java -cp "lib/*;bin" org.junit.runner.JUnitCore test.NumerosServiceTest
   ```

   > No Linux/Mac, substitua `;` por `:` no classpath, por exemplo: `lib/*:bin`

## ✅ Funcionalidades

- Geração de `n` números aleatórios entre 0 e 100.
- Impressão da lista gerada.
- Exibição do maior e menor número.
- Tratamento de listas nulas e vazias.
- Cobertura total de código com testes unitários.

## 🧪 Testes Unitários

- **Framework**: JUnit 4.13.2
- **Cobertura**:
    - Geração de lista com valores.
    - Lista vazia.
    - Lista nula.
    - Validação de limites dos números.
    - Comportamento correto do `for`.

## 📌 Observações

- O projeto não depende de Maven ou Gradle. As bibliotecas são adicionadas manualmente via pasta `lib`.
- Totalmente compatível com qualquer sistema operacional que suporte Java 17.



