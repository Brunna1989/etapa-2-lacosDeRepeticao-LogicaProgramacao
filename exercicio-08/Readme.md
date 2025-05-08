# 📘 Exercício 08 - Estruturas de Repetição em Java

## 📄 Descrição

Este projeto em Java tem como objetivo **ler números inteiros digitados pelo usuário até que o número `10` seja inserido**, utilizando estruturas de repetição. O projeto é implementado com boas práticas de organização em pacotes (`model`, `service` e `test`) e possui **100% de cobertura de testes unitários** com **JUnit 4.13.2**.

---

## 🧱 Estrutura do Projeto

```
exercicio-08/
│
├── lib/                           # Bibliotecas utilizadas (JUnit e Hamcrest)
│   ├── hamcrest-core-1.3.jar
│   └── junit-4.13.2.jar
│
├── src/
│   ├── model/                     # Representa a entidade 'Numero'
│   │   └── Numero.java
│   │
│   ├── service/                   # Contém a lógica de repetição
│   │   └── LeituraNumeroService.java
│   │
│   ├── test/                      # Testes unitários com cobertura total
│   │   └── LeituraNumeroServiceTest.java
│   │
│   └── Main.java                  # Classe principal (ponto de entrada do app)
│
├── .gitignore                     # Arquivos/diretórios ignorados pelo Git
├── exercicio-08.iml              # Arquivo de configuração do projeto IntelliJ
```

---

## 🚀 Como Executar

1. **Abra o projeto no IntelliJ IDEA** (ou outro IDE Java compatível).
2. Execute a classe `Main.java`.
3. Digite números no console até inserir o número `10`, que encerrará o programa.

---

## ✅ Testes

- Localizados em: `src/test/LeituraNumeroServiceTest.java`
- Framework utilizado: **JUnit 4.13.2**
- Biblioteca de asserção: **Hamcrest Core**
- **Cobertura**: 100% de classes e métodos testados, incluindo cenários negativos como:
    - Inserção de strings não numéricas (tratadas com `Scanner` e validação)
    - Sequência de números até a condição de parada (`10`)

---

## 📚 Requisitos

- Java 8 ou superior
- IntelliJ IDEA (opcional, mas recomendado)
- JUnit 4.13.2 (`lib/junit-4.13.2.jar`)
- Hamcrest Core (`lib/hamcrest-core-1.3.jar`)

---

## 👨‍💻 Autor

Projeto desenvolvido com fins educacionais para demonstrar boas práticas em Java orientado a objetos com testes unitários e estrutura limpa, sem uso de frameworks externos.
****