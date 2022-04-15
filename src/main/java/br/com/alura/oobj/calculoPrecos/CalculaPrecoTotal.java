package br.com.alura.oobj;

import java.math.BigDecimal;
import java.util.List;

public class CalculaPrecoTotal {

    public BigDecimal calcularPrecoTotal(List<ItemPedido> itensPedido) {
        BigDecimal totalPedido = BigDecimal.ZERO;
        for (ItemPedido itemPedido : itensPedido) {
            BigDecimal subtotal = itemPedido.getValorUnitario().multiply(BigDecimal.valueOf(itemPedido.getQuantidade()));
            totalPedido = totalPedido.add(subtotal);
        }
        return totalPedido;
    }
}
