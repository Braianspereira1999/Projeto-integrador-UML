# Sistema de Gestão Escolar - Backend

## Descrição

Este é o backend do **Sistema de Gestão Escolar**, desenvolvido em **Java** utilizando o **Spring Boot**. O backend oferece serviços RESTful para o gerenciamento de alunos, professores, fornecedores, contratos, e notas. Os dados são armazenados em um banco de dados e o sistema é projetado para ser escalável e de fácil manutenção.

---

## Estrutura do Projeto

O backend segue a arquitetura tradicional do Spring Boot e está dividido nas seguintes camadas:

- **Controller**: Gerencia as requisições HTTP e interage com o serviço.
- **Service**: Contém a lógica de negócios.
- **Repository**: Interage diretamente com o banco de dados para realizar operações CRUD.
- **Model**: Define as entidades do sistema, como `Aluno`, `Professor`, `Contrato`, etc.

---

## Requisitos

- **Java 11** ou superior.
- **Maven** para gerenciamento de dependências.
- **Banco de Dados**: O projeto está configurado para usar **H2** por padrão (um banco de dados em memória), mas pode ser facilmente adaptado para outros bancos, como **MySQL** ou **PostgreSQL**.

---

## Configuração do Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio-backend.git
   cd seu-repositorio-backend
