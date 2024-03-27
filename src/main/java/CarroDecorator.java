public abstract class CarroDecorator implements Carro {

    private Carro carro;
    public String configuracao;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getPercentualDeCustoDoOpcional();

    public float getCusto() {
        return this.carro.getCusto() * (1 + (this.getPercentualDeCustoDoOpcional() / 100));
    }

    public abstract String getNomeConfiguracao();

    public String getConfiguracao() {
        return this.carro.getConfiguracao() + "/" + this.getNomeConfiguracao();
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
}
