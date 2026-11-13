package logistica.estrategia;

public interface ModalidadeEntrega {
    double calcularCusto(double peso, double distancia);
    int calcularPrazo(double distancia);
}
