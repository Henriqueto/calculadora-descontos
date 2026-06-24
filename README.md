# 🧮 API de Cálculo de Descontos com Design Patterns

API REST desenvolvida em **Java** com **Spring Boot** para consolidação dos conceitos de Padrões de Projeto (Design Patterns) aplicados a um cenário real de e-commerce. Projeto desenvolvido como desafio final do módulo de Padrões de Projeto no Bootcamp Java Backend da NTT DATA.

---

## 🧠 Padrões de Projeto Aplicados

O objetivo principal foi substituir estruturas complexas de decisão condicionais (`if/else` ou `switch` repetitivos) por padrões de projetos consolidados pelo GoF (Gang of Four):

* **Strategy:** Utilizado para isolar as diferentes regras de negócio de cálculo de desconto (`DescontoVIP`, `DescontoAniversario` e `DescontoComum`), permitindo que novas regras de desconto sejam criadas sem modificar os códigos existentes (princípio Aberto/Fechado do SOLID).
* **Facade:** A classe `PedidoFacade` abstrai a complexidade do sistema, servindo como uma interface unificada e simples para que o controlador da API execute o processamento do pedido sem precisar conhecer as regras internas de desconto.
* **Singleton:** Aplicado nativamente através do ecossistema do Spring Framework ao gerenciar a classe `PedidoFacade` como um Bean de escopo único (`@Service`), otimizando o uso de memória.

---

## 🚀 Tecnologias Utilizadas

* **Java**
* **Spring Boot 3.x** (Spring Web)
* **Maven** (Gerenciador de Dependências)
* **NetBeans IDE**

---

## 🚦 Como Rodar e Testar a API

### 1. Clonar o repositório
```bash
git clone [https://github.com/Henriqueto/calculadora-descontos.git](https://github.com/Henriqueto/calculadora-descontos.git)
