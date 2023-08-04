package controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginCadastroFunControllerTest {

    private LoginCadastroFunController n;

    public LoginCadastroFunControllerTest() {
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
    public void testCadastrarFunc() throws Exception {

        String nome = "Isabele";
        String telefone = "(81) 99999-9999";
        String email = "isabele@gmail.com";
        String senha = "123456";

        LoginCadastroFunController funcionario = new LoginCadastroFunController();

        try {

            funcionario.cadastrarFunc(nome, telefone, email, senha);

        } catch (Exception e) {

            fail("O método cadastrar lançou uma exceção: " + e.getMessage());
        }

    }

    @Test
    public void testAutenticar() throws Exception {
        
        String email = "isabele@gmail.com";
        String senha = "123456";

        LoginCadastroFunController funcionario = new LoginCadastroFunController();

        try {

            boolean resultado = funcionario.autenticar(email, senha);
            assertTrue(resultado);

        } catch (Exception e) {
            fail("O método autenticar lançou uma exceção: " + e.getMessage());
        }

    }

    @Test
    public void testAutenticarFuncionarioInvalido() throws Exception {
        
        String email = "estevao@gmail.com";
        String senha = "112234";

        LoginCadastroFunController funcionario = new LoginCadastroFunController();

        try {
            
            boolean resultado = funcionario.autenticar(email, senha);
            assertFalse(resultado);

        } catch (Exception e) {

            fail("O método autenticar lançou uma exceção: " + e.getMessage());
        }

    }

}
