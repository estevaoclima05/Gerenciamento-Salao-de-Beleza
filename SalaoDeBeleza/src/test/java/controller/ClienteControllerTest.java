package controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteControllerTest {

    public ClienteControllerTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCadastrarCliente() {

        String nome = "Matheus";

        String telefone = "(81) 99999-9999";

        String email = "matheus@gmail.com";

        String endereco = "maranguape1";

        String whatsapp = "(81) 99999-9999";

        String alergia = "NÃO";

        ClienteController cliente = new ClienteController();

        try {

            cliente.cadastrarCliente(nome, email, telefone, endereco, whatsapp, alergia);

        } catch (Exception e) {

            fail("O método cadastrar lançou uma exceção: " + e.getMessage());
        }
    }

    @Test
    public void testAtualizarCliente() {

        int id = 1;

        String nome = "Matheus";

        String telefone = "(81) 99999-9999";

        String email = "matheus@gmail.com";

        String endereco = "maranguape1";

        String whatsapp = "(81) 99999-9999";

        String alergia = "NÃO";

        ClienteController cliente = new ClienteController();

        try {

            cliente.atualizarCliente(id, nome, email, telefone, endereco, whatsapp, alergia);

        } catch (Exception e) {

            fail("O método atualizar lançou uma exceção: " + e.getMessage());
        }
    }

    @Test
    public void testDeletarCliente() {

        int id = 1;

        ClienteController cliente = new ClienteController();

        try {

            cliente.deletarCliente(id);

        } catch (Exception e) {

            fail("O método deletar lançou uma exceção: " + e.getMessage());
        }
    }

}
