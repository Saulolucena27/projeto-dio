API RESTful com Spring Boot

Este projeto é uma API RESTful desenvolvida em Spring Boot para o bootcamp da Avanade. Ele utiliza Spring Data JPA, MySQL, H2 Database e Spring Web para criar um CRUD (Create, Read, Update, Delete) básico.

🚀 Tecnologias Utilizadas

Java 17

Spring Boot 3

Spring Web

Spring Data JPA

MySQL

H2 Database (para testes)

Maven

IntelliJ IDEA

📁 Estrutura do Projeto

O projeto segue a estrutura padrão do Spring Boot:

⚙️ Configuração do Banco de Dados

No arquivo application.properties, configuramos o banco de dados MySQL:

Nota: O banco de dados MySQL deve estar rodando na porta 3307. Ajuste a porta caso necessário.

🛠 Endpoints Disponíveis

Criar um novo recurso (POST)

Corpo da Requisição (JSON):

Listar todos os recursos (GET)

Buscar um recurso por ID (GET)

Atualizar um recurso (PUT)

Corpo da Requisição (JSON):

Deletar um recurso (DELETE)

🛡 Segurança: Como Evitar Exposição de Senhas

Para evitar expor credenciais no GitHub:

Adicione .env ao .gitignore

Use variáveis de ambiente no application.properties

📜 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para usá-lo e melhorá-lo! 🚀
