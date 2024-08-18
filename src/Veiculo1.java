public class Veiculo1 {
    private  String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Veiculo1(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método acelerar
    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    // Método frear
    public void frear() {
        System.out.println("O veículo está freiando.");
    }

    @Override
    public String toString() {
        return "Veiculo1 [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
    }
}
