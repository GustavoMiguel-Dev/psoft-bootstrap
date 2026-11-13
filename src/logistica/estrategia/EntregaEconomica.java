package logistica.estrategia;

public class EntregaEconomica implements ModalidadeEntrega {
    @Override
    public double calcularCusto(double peso, double distancia) {
        double custo = (peso * 0.3) + (distancia * 0.8);
        return custo;
    }

    @Override
    public int calcularPrazo(double distancia) {
        int prazo = (int) (distancia / 30) + 5;
        return prazo;
    }
}
