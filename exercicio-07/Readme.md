# Projeto: Série de Fibonacci em Java

Este projeto implementa a geração da série de **Fibonacci** utilizando **Java puro**, com boas práticas de organização em camadas (`model`, `service`, `test`) e **sem utilizar frameworks como Spring**. Desenvolvido com foco em clareza, reutilização de código e testes automatizados com **JUnit 4**.

---

## 📌 Descrição

A sequência de Fibonacci é uma série de números inteiros onde cada número, a partir do terceiro, é a soma dos dois anteriores. A sequência começa com `0` e `1`.  
Exemplo:  
`0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...`

Neste projeto:
- O usuário informa um número inteiro não negativo.
- O programa imprime a série de Fibonacci até o n-ésimo termo (inclusive).
- O código é estruturado de forma modular e testável.

---

## ✅ Tecnologias Utilizadas

- **Java 17**
- **JUnit 4.13.2**
- **Hamcrest Core 1.3**
- **Execução via terminal ou IDE**
- **Sem frameworks (como Spring Boot)**

---

## 📁 Estrutura do Projeto

```
fibonacci/
├── lib/
│   ├── junit-4.13.2.jar
│   └── hamcrest-core-1.3.jar
├── model/
│   └── Fibonacci.java
├── service/
│   └── FibonacciService.java
├── test/
│   └── FibonacciServiceTest.java
├── Main.java
└── README.md
```

---

## ▶️ Como Executar

### 1. Compilar

**Windows:**
```bash
javac -cp ".;lib/*" Main.java model/Fibonacci.java service/FibonacciService.java test/FibonacciServiceTest.java
```

**Linux/Mac:**
```bash
javac -cp ".:lib/*" Main.java model/Fibonacci.java service/FibonacciService.java test/FibonacciServiceTest.java
```

### 2. Executar

```bash
java Main
```

### 3. Rodar Testes

**Windows:**
```bash
java -cp ".;lib/*" org.junit.runner.JUnitCore test.FibonacciServiceTest
```

**Linux/Mac:**
```bash
java -cp ".:lib/*" org.junit.runner.JUnitCore test.FibonacciServiceTest
```

---

## 📦 Exemplo de Uso

```
Informe um número inteiro não negativo: 9
Série de Fibonacci até F(9):
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
```

---

## 🧪 Testes Unitários

A classe `FibonacciServiceTest` cobre os seguintes casos:

- ✅ Geração da sequência até `n = 9`
- ✅ Verificação da sequência para `n = 0` e `n = 1`
- ✅ Teste para entrada negativa (deve retornar lista vazia)
- ✅ Mensagens de erro mais claras em caso de falha

Exemplo:
```java
assertEquals("A sequência gerada para n=9 está incorreta", expected, result.getSequence());
```

---

## 🧼 Boas Práticas Adotadas

- **Separação por camadas**: model, service, testes.
- **Encerramento do Scanner** após leitura na `Main`.
- **Lógica centralizada** na `FibonacciService`, mantendo a `Main` limpa.
- **Testes automatizados** para garantir confiabilidade e manutenção.
- **Mensagens de erro informativas nos testes unitários.**

---

## 👨‍💻 Autor

Projeto desenvolvido com fins educacionais para demonstrar boas práticas em Java orientado a objetos com testes unitários e estrutura limpa, sem uso de frameworks externos.
****