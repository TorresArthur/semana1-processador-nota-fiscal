package br.com.alura.oobj.leitura;

import br.com.alura.oobj.pedido.ItemPedido;

import java.util.List;

public interface Leitor {
    List<ItemPedido> ler(String arquivo);
}
