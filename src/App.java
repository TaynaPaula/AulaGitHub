public class App { 
    public static void main(String[] args) {
      

        // Testando o Carro
        Carro carro = new Carro("Fiat", "Uno", 2006, "Gasolina");
        System.out.println("\nCarro:");
        carro.acelerar();
        carro.frear();
        System.out.println("Tipo de Combustível: " + carro.getTipoDeCombustivel());

        // Testando o CarroEletrico
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "S", 2024, "Elétrico", 200);
        System.out.println("\nCarro Elétrico:");
        carroEletrico.acelerar();
        carroEletrico.frear();
        System.out.println("Capacidade da Bateria: " + carroEletrico.getCapacidadeBateria() + " kWh");
        carroEletrico.carregarBateria();
    }
}

    