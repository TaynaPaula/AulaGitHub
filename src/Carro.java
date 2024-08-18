public class Carro extends Veiculo1 {
    private String tipoDeCombustivel;

    // Construtor
    public Carro(String marca, String modelo, int ano, String tipoDeCombustivel) {
        super(marca, modelo, ano);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    @Override
    public void acelerar() {
        System.out.println("O Carro está acelerando com " + tipoDeCombustivel + ".");
    }

    // Método específico para Carro
    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    @Override
    public void frear() {
        System.out.println("O Carro está freiando.");
    }
}
    