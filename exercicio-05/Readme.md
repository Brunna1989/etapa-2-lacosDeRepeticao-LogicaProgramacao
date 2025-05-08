# Projeto: Tabuada em Java Puro

Este projeto é uma aplicação Java simples para imprimir a tabuada de um número informado pelo usuário. A estrutura segue boas práticas de separação por camadas: `model`, `service`, `app` (Main) e `test`.

## ✅ Tecnologias Utilizadas

- Java 17
- JUnit 4.13.2
- Hamcrest 1.3

## 📁 Estrutura de Diretórios

```
📦 projeto-tabuada
├── 📁 app
│   └── Main.java
├── 📁 model
│   └── Numero.java
├── 📁 service
│   └── TabuadaService.java
├── 📁 test
│   └── TabuadaServiceTest.java
├── 📁 lib
│   ├── junit-4.13.2.jar
│   └── hamcrest-core-1.3.jar
```

## 🚀 Como Executar o Projeto

1. Compile os arquivos:

```
javac -cp ".;lib/*" app/Main.java model/Numero.java service/TabuadaService.java
```

2. Execute a aplicação:

```
java -cp ".;lib/*" app.Main
```

## 🧪 Como Executar os Testes

1. Compile os testes:

```
javac -cp ".;lib/*" test/TabuadaServiceTest.java
```

2. Execute os testes:

```
java -cp ".;lib/*" org.junit.runner.JUnitCore test.TabuadaServiceTest
```

> 💡 Use `:` no lugar de `;` no classpath se estiver em sistemas Unix (Linux/macOS).

## 🔍 Funcionalidades

- Lê um número inteiro do usuário via console.
- Exibe a tabuada do número de 1 a 10.
- Inclui testes automatizados para validar:
    - Tabuada de um número comum (ex: 2)
    - Tabuada do número 0
    - Cenário de erro (objeto `Numero` nulo)

## 📌 Observações

- O projeto não utiliza nenhuma framework adicional como Spring Boot.
- Todo o código é baseado em Java puro e estruturado em pacotes organizados.


