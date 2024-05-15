<h1 align="Center">
    Place Service
</h1>

<p align="Center">

</p>

Api para gerenciar lugares (CRUD) que faz parte [desse desafio](https://github.com/RocketBus/quero-ser-clickbus/tree/master/testes/backend-developer) para pessoas desenvolvedoras backend que se candidatam para a  ClickBus.

## Tecnologias

- [SpringBoot](https://spring.io/projects/spring-boot)
- [Spring Webflux](https://docs.spring.io/spring-framework/reference/web/webflux.html)
- [Spring Data + R2DBC](https://docs.spring.io/spring-framework/reference/data-access/r2dbc.html)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Slugify](https://github.com/slugify/slugify)

## Práticas adotadas

- SOLID
- Testes Automatizados
- Consultas com filtros dinâmicos usando o Query By Example
- Uso de DTOs para a API
- Injeção de Dependências
- Geração automática de Swagger com a OpenAPI 3
- Geração de Slugs automática com o Slugify
- Auditoria sobre criação e atualização de entidade

## Como executar

### Localmente
- Clonar repositório git
- Construir o projeto
````
./mvnw clean package
````
- Executar:
````
java -jar place-service/target/place-service-0.0.1-SNAPSHOT.jar
````

A API poderá ser  acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualisado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### Usando Docker

- Clonar repositório git
- Construir o projeto:
````
./mvnw clean package
````
- Construir a imagem:
````
./mvnw spring-boot:build-image
````
- Executar o container
````
docker run --name place-service -p 8080:8080  -d place-service:0.0.1-SNAPSHOT
````
A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

para fazer as requisições HTTP abaixo, foi utilizado a ferramenta [Postman](https://Postman.com)

- POST /places
```
Method: POST -URL = localhost:8080/places

{
    "name": "Exemplo de Lugar",
    "slug": "exemplo-de-lugar",
    "state": "Exemplo de Estado",
    "createdAt": "2024-05-14T21:03:29.6494913",
    "updatedAt": "2024-05-14T21:03:29.6494913"
}
```
