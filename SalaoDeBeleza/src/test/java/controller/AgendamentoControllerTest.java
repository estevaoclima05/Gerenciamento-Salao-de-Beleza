
package controller;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;



public class AgendamentoControllerTest {

    @Test
    public void testAgendar() throws Exception {

        String cliente = "Gabriel";
        String servico = "Corte";
        Double preco = 30.0;
        String data = "03/08/2023";
        String horario = "15:00";

        AgendamentoController agendamentoService = new AgendamentoController();

        try {

            agendamentoService.agendar(cliente, servico, preco, data, horario);

        } catch (Exception e) {

            fail("O método agendar lançou uma exceção: " + e.getMessage());
        }
    }

    @Test
    public void testAlterar() throws Exception {
        int id = 2;
        String cliente = "Gabriel";
        String servico = "Corte e Barba";
        Double preco = 50.0;
        String data = "03/08/2023";
        String horario = "15:00";

        AgendamentoController agendamentoService = new AgendamentoController();

        try {

            agendamentoService.alterar(id, cliente, servico, preco, data, horario);

        } catch (Exception e) {

            fail("O método alterar lançou uma exceção: " + e.getMessage());
        }

    }

    @Test
    public void testApagar() throws Exception {
        int id = 2;

        AgendamentoController agendamentoService = new AgendamentoController();

        try {

        agendamentoService.apagar(id);

        } catch (Exception e) {

            fail("O método apagar lançou uma exceção: " + e.getMessage());
        }

    }

}
