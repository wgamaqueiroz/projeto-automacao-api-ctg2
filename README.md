# projeto-automacao-api-ctg2
Este projeto tem como objetivo realizar a automação de uma API disponibilizada no curso Comunidade Tester Global 2.0 do professor Vinicius Pessoni.

API de estudos: https://github.com/vinnypessoni/api-clientes-exemplo-microservico

# Como os testes foram realizados
Considerei primeiramente o atual funcionamento da API como um funcionamento normal.

Realizei testes manuais através do Postman para verificar os fluxos da API.

Utilizei a documentação da própria API no Swagger para consultar os endpoints, respostas e códigos de respostas.

Após visualização do funcionamento da API, escrevi diversos casos de testes utilizando a sintaxe Gherkin do BDD (Dado que... Quando... Então...), os quais foram a base para as automações.

# Tecnologias utilizadas
**Java, JUnit5, Hamcrest, RestAssured, Gradle e Postman**

✅ Para escrita do código: Java

✅ Para execução dos testes manuais: Postman

✅ Para execução dos testes automatizados: JUnit5

✅ Para verificar resultados dos testes: JUnit5 e Hamcrest

✅ Para simplificar requisições e escrita em Java: RestAssured

✅ Para gerenciamento de dependências e visualização de relatórios: Gradle
