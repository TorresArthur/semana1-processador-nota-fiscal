package br.com.alura.oobj;

import br.com.alura.oobj.calculoPrecos.SubTotalPorClasseFiscal;
import br.com.alura.oobj.leitura.LeitorDeArquivos;
import br.com.alura.oobj.pedido.ItemPedido;
import br.com.alura.oobj.pedido.Pedido;

import java.math.BigDecimal;
import java.util.List;
import java.util.TreeMap;

public class Main {


  public static void main(String[] args) {

    if (args.length <= 0) {
      throw new IllegalArgumentException("Forneça um nome de arquivo.");
    }

    String arquivo = args[0];

    LeitorDeArquivos arquivoASerLido = new LeitorDeArquivos();
    List<ItemPedido> itensDoPedido = arquivoASerLido.lerArquivos(arquivo);

    Pedido pedido = new Pedido(itensDoPedido);
    BigDecimal totalPedido = pedido.retornaValorTotal();

    SubTotalPorClasseFiscal subTotalClasseFiscal = new SubTotalPorClasseFiscal();
    TreeMap<String, BigDecimal> subTotalPorClasseFiscal = subTotalClasseFiscal.calculaSubTotal(itensDoPedido);


    System.out.println("## Total do pedido: " + totalPedido);
    System.out.println("\n## Subtotal por classe fiscal");
    for (String classeFiscal : subTotalPorClasseFiscal.keySet()) {
      System.out.println("\n\tClasse fiscal: " + classeFiscal);
      BigDecimal subtotal = subTotalPorClasseFiscal.get(classeFiscal);
      System.out.println("\tSubtotal: " + subtotal);
    }

  }

}
