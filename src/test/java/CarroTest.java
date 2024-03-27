import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarCustoCarro() {
        Carro carro = new CarroSUV(150000.0f);

        assertEquals(150000.0f, carro.getCusto());
    }

    @Test
    void deveRetornarCustoCarroComBancosDeCouro() {
        Carro carro = new BancosDeCouro(new CarroSUV(150000.0f));

        assertEquals(157500.0f, carro.getCusto());
    }

    @Test
    void deveRetornarCustoCarroComCambioAutomatico() {
        Carro carro = new CambioAutomatico(new CarroSUV(150000.0f));

        assertEquals(172500.0f, carro.getCusto());
    }

    @Test
    void deveRetornarCustoCarroComAirbag() {
        Carro carro = new AirBag(new CarroSUV(150000.0f));

        assertEquals(165000.0f, carro.getCusto());
    }

    @Test
    void deveRetornarCustoCarroComBancosDeCouroMaisCambioAutomatico() {
        Carro carro = new BancosDeCouro(new CambioAutomatico(new CarroSUV(150000.0f)));

        assertEquals(181125.0f, carro.getCusto(), 0.1f);
    }

    @Test
    void deveRetornarCustoCarroComBancosDeCouroMaisAirbag() {
        Carro carro = new BancosDeCouro(new AirBag(new CarroSUV(150000.0f)));

        assertEquals(173250.0f, carro.getCusto(), 0.1f);
    }

    @Test
    void deveRetornarCustoCarroComCambioAutomaticoMaisAirbag() {
        Carro carro = new CambioAutomatico(new AirBag(new CarroSUV(150000.0f)));

        assertEquals(189750.0f, carro.getCusto(), 0.1f);
    }

    @Test
    void deveRetornarCustoCarroComCambioAutomaticoMaisAirbagMaisBancosDeCouro() {
        Carro carro = new CambioAutomatico(new AirBag(new BancosDeCouro(new CarroSUV(150000.0f))));

        assertEquals(199237.5f, carro.getCusto(), 0.1f);
    }

    @Test
    void deveRetornarConfiguracaoCarro() {
        Carro carro = new CarroSUV();

        assertEquals("SUV", carro.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoCarroComBancosDeCouro() {
        Carro carro = new BancosDeCouro(new CarroSUV());

        assertEquals("SUV/Bancos de Couro", carro.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoCarroComCambioAutomatico() {
        Carro carro = new CambioAutomatico(new CarroSUV());

        assertEquals("SUV/Câmbio Automático", carro.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoCarroComAirbag() {
        Carro carro = new AirBag(new CarroSUV());

        assertEquals("SUV/Air Bags", carro.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoCarroComBancosDeCouroMaisCambioAutomatico() {
        Carro carro = new CambioAutomatico(new BancosDeCouro(new CarroSUV()));

        assertEquals("SUV/Bancos de Couro/Câmbio Automático", carro.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoCarroComCambioAutomaticoMaisAirbag() {
        Carro carro = new AirBag(new CambioAutomatico(new CarroSUV()));

        assertEquals("SUV/Câmbio Automático/Air Bags", carro.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoCarroComAirbagMaisBancoDeCouro() {
        Carro carro = new BancosDeCouro(new AirBag(new CarroSUV()));

        assertEquals("SUV/Air Bags/Bancos de Couro", carro.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoCarroComCambioAutomaticoMaisAirbagMaisBancosDeCouro() {
        Carro carro = new BancosDeCouro(new AirBag(new CambioAutomatico(new CarroSUV())));

        assertEquals("SUV/Câmbio Automático/Air Bags/Bancos de Couro", carro.getConfiguracao());
    }
}