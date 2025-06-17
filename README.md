# 📘 Projeto: Estudo com Spring Data JPA – `JpaRepository`

Projeto desenvolvido com base na aula do professor Nelio Alves, com o objetivo de praticar os conceitos do `JpaRepository` do Spring Data JPA. A aplicação simula uma API simples para manipulação de usuários, com recursos como paginação e filtragem por salário.

---

## 🎯 Objetivo do Projeto

- Reforçar o uso de `JpaRepository` no Spring Data JPA  
- Implementar endpoints REST básicos  
- Realizar consultas com paginação  
- Aplicar filtros por faixa de valores (ex: salário)  
- Configurar e utilizar banco de dados H2 em memória

---

## ⚙️ Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Spring Data JPA  
- H2 Database  
- Maven

---

## 🧠 O que foi praticado

- Criação de entidades e repositórios JPA  
- Uso de `Pageable` para paginação automática  
- Criação de consultas personalizadas com Spring Data  
- Teste e uso do console H2  
- Exibição de SQL gerado pelo Hibernate

---

## 🔁 Endpoints disponíveis

| Método | Endpoint                           | Descrição                                   |
|--------|------------------------------------|---------------------------------------------|
| GET    | `/users`                          | Lista completa de usuários                  |
| GET    | `/users/page?page=0&size=10`      | Lista paginada de usuários                  |
| GET    | `/users/search-salary`            | Busca usuários com salário entre valores    |
| GET   | `/users/search-name`               | Busca usuários pelo nome                    |
---

## 🧪 Como executar

```bash
# Clone o repositório
git clone https://github.com/hisarxt/studies-jparepository.git

# Entre na pasta do projeto
cd studies-jparepository

# Execute a aplicação
./mvnw spring-boot:run
```
## 🧪 Acesse o H2 Console

👉 [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
**JDBC URL**: `jdbc:h2:mem:testdb`  
**Usuário**: `sa`  
**Senha**: *(em branco)*


