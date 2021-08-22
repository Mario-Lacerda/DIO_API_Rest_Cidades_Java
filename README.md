# DIO_API_Rest_Cidades_Java

Construindo uma API Rest de consulta de cidades do Brasil do zero até a produção

Neste projeto você terá o desafio de desenvolver uma API Rest de consulta de cidades do Brasil com dados comparativos. Iremos navegar pelas boas práticas de Java e do Spring, popular o banco de dados Postgres e criar um serviço para o cálculo de distância entre cidades.

&nbsp;

Foi utilizado neste projeto:

- Java 11
- IntelliJ 2021.1.1
- Spring Boot 2.5.3
- PostgreSQL 13.3
- [cidade.sql](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)

&nbsp;

Retornando todas as Cidades:
- localhost:8080/cidades

![All](https://github.com/gusBernardi/DIO_API_Rest_Cidades_Java/blob/main/images/getAll.png)

Retornando apenas uma cidade por Id:
- localhost:8080/cidades/1

![Id](https://github.com/gusBernardi/DIO_API_Rest_Cidades_Java/blob/main/images/getById.png)

Calculando a distância em metros usando a extensão "earthdistance" e "cube" do PostgreSQL:
- localhost:8080/distancia/metros?origem=1&destino=2

![Dist](https://github.com/gusBernardi/DIO_API_Rest_Cidades_Java/blob/main/images/Distancia.png)



