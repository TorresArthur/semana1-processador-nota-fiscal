package br.com.alura.oobj.leitura;

import br.com.alura.oobj.identificaTipos.IdentificaTipoArquivo;
import br.com.alura.oobj.pedido.ItemPedido;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

public class LeitorDeArquivos {

    public List<ItemPedido> lerArquivos(String arquivo) {
        List<ItemPedido> itemPedido;
        IdentificaTipoArquivo parametroArquivo = new IdentificaTipoArquivo();

        Leitor tipoDoArquivo = parametroArquivo.identificaTipoArquivo(arquivo);

        itemPedido = tipoDoArquivo.ler(arquivo);

        return itemPedido;
    }

}
