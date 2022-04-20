package br.com.alura.oobj.pedido;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {

    public Pedido(List<ItemPedido> itens){
        this.itens = itens;
    }

    private List<ItemPedido> itens;

    public List<ItemPedido> getItens() {
        return itens;
  }

    public BigDecimal retornaValorTotal() {
        BigDecimal totalPedido = BigDecimal.ZERO;
        for (ItemPedido itemPedido : itens) {
            BigDecimal subtotal = itemPedido.retornaSubTotal();
            totalPedido = totalPedido.add(subtotal);
        }
        return totalPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "itens=" + itens +
                '}';
    }
  }

