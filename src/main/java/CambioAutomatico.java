public class CambioAutomatico extends CarroDecorator {

    public CambioAutomatico(Carro carro) {
        super(carro);
    }

    public float getPercentualDeCustoDoOpcional() {
        return 15.0f;
    }

    public String getNomeConfiguracao() {
        return "Câmbio Automático";
    }
}