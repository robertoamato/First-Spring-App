Projeto CRUD com Spring Boot
Este é um projeto simples de cadastro de produtos utilizando Spring Boot. O sistema permite criar, listar, atualizar e excluir produtos de um banco de dados H2 (em memória). O projeto foi desenvolvido como parte de um desafio para praticar conceitos de CRUD e APIs RESTful.

Funcionalidades
Criar: Adicionar um novo produto ao sistema.

Listar: Exibir todos os produtos cadastrados.

Atualizar: Editar as informações de um produto existente.

Deletar: Remover um produto do sistema.

Tecnologias Utilizadas
Java 17

Spring Boot 3.x

Spring Data JPA

H2 Database (banco de dados em memória)

Lombok (para reduzir boilerplate code)

Maven (gerenciamento de dependências)

Estrutura do Projeto

src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── demo/
│   │               ├── controller/         # Controllers da API
│   │               ├── model/              # Entidades do banco de dados
│   │               ├── repository/         # Repositórios JPA
│   │               ├── service/            # Lógica de negócio
│   │               └── DemoApplication.java # Classe principal
│   └── resources/
│       ├── application.properties          # Configurações do projeto
│       └── data.sql                        # Dados iniciais (opcional)
└── test/                                   # Testes unitários e integração
