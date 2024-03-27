public class CarroSUV implements Carro {

    public float custo;

    public CarroSUV() {}

    public CarroSUV(float custo) {
        this.custo = custo;
    }

    public float getCusto() {
        return custo;
    }

    public String getConfiguracao() {
        return "SUV";
    }
}
