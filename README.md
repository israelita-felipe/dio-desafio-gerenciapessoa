# Digital Innovation: Repositório do Projeto Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot

### Durante a sessão, serão desenvolvidos e abordados os seguintes tópicos:
    
URL padrão:

http://localhost:8080/api/v1/person

Foram utilizadas as sequintes ferramentas/tecnologias:

    -- Java 17
    -- Maven 3.6.3
    -- Spring Tool Suite - IDE de desenvolvimento
    -- Controle de versão com GIT 2.25.1
    -- GitHub para o armazenamento do projeto
    -- Spring Boot 2.6.2 (actuator, jpa, web, devtools)
    -- Lombok para redução de código redundante
    -- Mapstruct 1.4.2
    -- H2 como banco de dados embarcado (em memória)

As principais características dessa implementação são:

1. Camada de repositório extendendo as funcionalidades do JpaRepository;
2. Entidade de banco de dados genérica para extenção de outras classes de entidades;
3. Mapeamento genérico das entidades com seus respectivos DTO para auxílio na troca de informações. Utilizando Mapstruct (primeira vez utilizando a biblioteca, permitiu agregação de mais uma boa prática de desenvolvimento);
4. Camada de serviço (negócio) genérica e modularizada (duas camadas, listagem e registro) e extensível conforme necessidade do negócio;
5. Controlador genérico permitindo injeção de dependências pelo spring por meio de suas interfaces. Esse controlado permite a criação de um endpoint para um tipo de entidade sem a necessidade da reescrita dos métodos presentes na classe abstrata genérica;
