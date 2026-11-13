package logistica.central;

import java.util.ArrayList;
import java.util.List;

import logistica.estrategia.ModalidadeEntrega;
import logistica.modelo.Pedido;

public class CentralLogistica {

    private static CentralLogistica instancia;

    private List<Pedido> pedidos;

    private CentralLogistica() {
        this.pedidos = new ArrayList<>();
    }

    public static CentralLogistica getInstance() {
        if (instancia == null) {
            instancia = new CentralLogistica();
        }

        return instancia;
    }

    public void registrarPedido(Pedido p) {
        if (p != null) {
            this.pedidos.add(p);
        }
    }

    public void selecionarModalidade(Pedido p, ModalidadeEntrega m) {
        if (p != null && m != null) {
            p.alterarModalidade(m);
        }
    }

    public void acompanharOperacoes() {
        for (Pedido pedido : this.pedidos) {
            System.out.println("Cliente: " + pedido.getCliente() +
                               " | Custo: " + pedido.calcularCustoEstimado() +
                               " | Prazo: " + pedido.calcularPrazoEstimado());
        }
    }
}
