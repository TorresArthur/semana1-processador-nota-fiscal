package br.com.alura.oobj;

import java.math.BigDecimal;
import java.util.List;
import java.util.TreeMap;

public class SubTotalPorClasseFiscal {

    public TreeMap<String, BigDecimal> calculaSubTotal(List<ItemPedido> itenPedido) {

        TreeMap<String, BigDecimal> subTotalClasseFiscal = new TreeMap<>();

        for (ItemPedido itemPedido : itenPedido) {
            BigDecimal novoSubTotal = itemPedido.getValorUnitario().multiply(BigDecimal.valueOf(itemPedido.getQuantidade()));
            String classeFiscal = itemPedido.getClasseFiscal();
            BigDecimal subTotal = subTotalClasseFiscal.get(classeFiscal);
            if (subTotal != null) {
                subTotalClasseFiscal.put(classeFiscal, subTotal.add(novoSubTotal));
            } else {
                subTotalClasseFiscal.put(classeFiscal, novoSubTotal);
            }
        }
        return subTotalClasseFiscal;
    }
}

