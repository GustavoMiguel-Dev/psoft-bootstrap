package logistica.estrategia;

public class EntregaExpressa implements ModalidadeEntrega {
    @Override
    public double calcularCusto(double peso, double distancia) {
        double custo = (peso * 0.8) + (distancia * 2.5);
        return custo;
    }

    @Override
    public int calcularPrazo(double distancia) {
        int prazo = (int) (distancia / 80) + 1;
        return prazo;
    }
}
