package logistica.estrategia;

public class EntregaConvencional implements ModalidadeEntrega {
    @Override
    public double calcularCusto(double peso, double distancia) {
        double custo = (peso * 0.5) + (distancia * 1.2);
        return custo;
    }

    @Override
    public int calcularPrazo(double distancia) {
        int prazo = (int) (distancia / 50) + 2;
        return prazo;
    }
}
