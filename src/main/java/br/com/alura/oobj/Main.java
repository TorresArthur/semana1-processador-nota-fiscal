package br.com.alura.oobj;

import br.com.alura.oobj.leitura.LeitorDeArquivos;

import java.math.BigDecimal;
import java.util.List;
import java.util.TreeMap;

public class Main {


  public static void main(String[] args) {

    if (args.length <= 0) {
      throw new IllegalArgumentException("Forneça um nome de arquivo.");
    }

    String arquivo = args[0];

    LeitorDeArquivos arquivoLido = new LeitorDeArquivos();
    CalculaPrecoTotal preco = new CalculaPrecoTotal();
    SubTotalPorClasseFiscal subTotalClasseFiscal = new SubTotalPorClasseFiscal();


    List<ItemPedido> itenPedido = arquivoLido.lerArquivos(arquivo);

    BigDecimal totalPedido = preco.calcularPrecoTotal(itenPedido);

    TreeMap<String, BigDecimal> subTotalPorClasseFiscal = subTotalClasseFiscal.calculaSubTotal(itenPedido);


    System.out.println("## Total do pedido: " + totalPedido);
    System.out.println("\n## Subtotal por classe fiscal");
    for (String classeFiscal : subTotalPorClasseFiscal.keySet()) {
      System.out.println("\n\tClasse fiscal: " + classeFiscal);
      BigDecimal subtotal = subTotalPorClasseFiscal.get(classeFiscal);
      System.out.println("\tSubtotal: " + subtotal);
    }


  }

}
