# Exercício 07 - Série de Fibonacci até um limite

Este projeto em Java (sem uso de frameworks como Spring) calcula a série de Fibonacci até atingir um valor limite informado pelo usuário. A estrutura do projeto segue uma arquitetura simples com separação em pacotes `model`, `service` e `test`.

## 🧠 Requisitos do exercício

> Altere o exercício 7 para o algoritmo contar a série Fibonacci até um determinado número.  
> Por exemplo, caso declarado o número 25, o resultado seria:  
> `0, 1, 1, 2, 3, 5, 8, 13, 21`

## 📁 Estrutura do Projeto

```
exercicio-07/
├── src/
│   ├── app/
│   │   └── Main.java
│   ├── model/
│   │   └── Fibonacci.java
│   └── service/
│       └── FibonacciService.java
├── test/
│   └── FibonacciServiceTest.java
```

## 🧮 Lógica da Série Fibonacci

A série começa em:
- `F(0) = 0`
- `F(1) = 1`

E os próximos elementos seguem:
- `F(n) = F(n-1) + F(n-2)`

A geração para até um valor limite (por exemplo, 25) resulta em:
```
0, 1, 1, 2, 3, 5, 8, 13, 21
```

## ✅ Exemplos de Testes

Testes incluídos:
- Limite 25 → saída esperada: `[0, 1, 1, 2, 3, 5, 8, 13, 21]`
- Limite 0 → `[0]`
- Limite negativo → exceção esperada

## 🧪 Executando Testes

Para rodar os testes com JUnit:

```bash
javac -cp .;junit-4.13.2.jar;hamcrest-core-1.3.jar src/service/FibonacciService.java test/FibonacciServiceTest.java
java -cp .;junit-4.13.2.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore FibonacciServiceTest
```

## 👩‍💻 Autor(a)

Brunna Dornelles

## 📝 Licença

Este projeto é livre para uso educacional.
