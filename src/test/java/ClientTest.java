import io.restassured.http.ContentType;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ClientTest {

    String baseUrl = "http://localhost:8080/";
    String endpointClientes = "clientes";
    String endpointCliente = "cliente";
    String endpointDeletarTodos = "cliente/apagaTodos";

    String respostaComCorpoVazio = "{}";
    String clienteParaCadastro = "";
    @Test
    @DisplayName("Dado que não existem usuários cadastrados, quando for acessado o endpoint base da API, então o status da requisição será 200 e o corpo estará vazio")
    public void getAcessarEndpointBaseSemUsuariosCadastradosRecebendoRespostaVazia(){

        deleteExcluirTodosOsUsuarios();

        given()
                .contentType(ContentType.JSON)
        .when()
                .get(baseUrl)
        .then()
                .statusCode(200)
                .assertThat().body(new IsEqual<>(respostaComCorpoVazio));
    }

    @Test
    @DisplayName("Dado que não existem usuários cadastrados, quando for acessado o endpoint para todos os clientes, então o status da requisição será 200 e o corpo estará vazio.")
    public void getAcessarEndpointDeClientesSemUsuariosCadastradosRecebendoRespostaVazia(){

        deleteExcluirTodosOsUsuarios();

        given()
                .contentType(ContentType.JSON)
       .when()
                .get(baseUrl + endpointClientes)
       .then()
                .statusCode(200)
                .assertThat().body(new IsEqual<>(respostaComCorpoVazio));
    }

    @Test
    @DisplayName("Dado que existem usuários cadastrados, quando for acessado o endpoint especificando o ID do cliente, então o status da requisição será 200 e o corpo retornará os dados do cliente.")
    public void getAcessandoUsuarioPorIdRecebendoRespostaComDadosDoCliente(){



    }

    @Test
    @DisplayName("Dado que existem usuários cadastrados, quando for realizada a exclusão de todos os usuários, então o status da requisição será 200 e o corpo estará vazio")
    public void deleteExcluirTodosOsUsuarios(){

        given().contentType(ContentType.JSON)
        .when()
                .delete(baseUrl + endpointDeletarTodos)
        .then()
                .statusCode(200)
                .assertThat().body(new IsEqual<>(respostaComCorpoVazio));
    }

}
