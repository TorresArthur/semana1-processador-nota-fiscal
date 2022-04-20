package br.com.alura.oobj.calculoPrecos;

import br.com.alura.oobj.pedido.ItemPedido;

import java.math.BigDecimal;
import java.util.List;
import java.util.TreeMap;

public class SubTotalPorClasseFiscal {

    public TreeMap<String, BigDecimal> calculaSubTotal(List<ItemPedido> itenPedido) {

        TreeMap<String, BigDecimal> subTotalClasseFiscal = new TreeMap<>();

        for (ItemPedido itemPedido : itenPedido) {
            BigDecimal novoSubTotal = itemPedido.getValorUnitario().multiply(BigDecimal.valueOf(itemPedido.getQuantidade()));
            String classeFiscal = itemPedido.getClasseFiscal();
            subTotalClasseFiscal.merge(classeFiscal, novoSubTotal, BigDecimal::add);
        }
        return subTotalClasseFiscal;
    }
}


