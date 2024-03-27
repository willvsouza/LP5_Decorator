public class AirBag extends CarroDecorator {

    public AirBag(Carro carro) {
        super(carro);
    }

    public float getPercentualDeCustoDoOpcional() {
        return 10.0f;
    }

    public String getNomeConfiguracao() {
        return "Air Bags";
    }
}