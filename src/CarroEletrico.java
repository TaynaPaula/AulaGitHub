public class CarroEletrico extends Carro {
    private int capacidadeBateria;

    // Construtor
    public CarroEletrico(String marca, String modelo, int ano, String tipoDeCombustivel, int capacidadeBateria) {
        super(marca, modelo, ano, tipoDeCombustivel);
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public void acelerar() {
        System.out.println("O Carro elétrico está acelerando com energia elétrica.");
    }

    public void carregarBateria() {
        System.out.println("Carregando a bateria de " + capacidadeBateria + " kWh.");
    }

    // Método específico para CarroEletrico
    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }
    
    @Override
    public void frear() {
        System.out.println("O Carro está freiando.");
    }
}