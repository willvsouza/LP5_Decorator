public class BancosDeCouro extends CarroDecorator {

    public BancosDeCouro(Carro carro) {
        super(carro);
    }

    public float getPercentualDeCustoDoOpcional() {
        return 5.0f;
    }

    public String getNomeConfiguracao() {
        return "Bancos de Couro";
    }
}
