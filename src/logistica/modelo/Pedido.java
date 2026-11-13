package logistica.modelo;

import logistica.estrategia.ModalidadeEntrega;

public class Pedido {
    private String cliente;
    private String enderecoOrigem;
    private String enderecoDestino;
    private double peso;
    private double distanciaEstimada;
    private boolean despachado;
    private ModalidadeEntrega modalidade;

    public Pedido(String cliente, String enderecoOrigem, String enderecoDestino, double peso, double distanciaEstimada) {
        this.cliente = cliente;
        this.enderecoOrigem = enderecoOrigem;
        this.enderecoDestino = enderecoDestino;
        this.peso = peso;
        this.distanciaEstimada = distanciaEstimada;
        this.despachado = false;
        this.modalidade = null;
    }

    public void alterarModalidade(ModalidadeEntrega novaModalidade) {
        this.modalidade = novaModalidade;
    }

    public double calcularCustoEstimado() {
        double custo = 0.0;

        if (this.modalidade != null) {
            custo = this.modalidade.calcularCusto(this.peso, this.distanciaEstimada);
        }

        return custo;
    }

    public int calcularPrazoEstimado() {
        int prazo = 0;

        if (this.modalidade != null) {
            prazo = this.modalidade.calcularPrazo(this.distanciaEstimada);
        }

        return prazo;
    }

    public String getCliente() {
        return this.cliente;
    }
}
