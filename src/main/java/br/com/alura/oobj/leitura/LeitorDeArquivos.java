package br.com.alura.oobj.leitura;

import br.com.alura.oobj.IdentificaTipoArquivo;
import br.com.alura.oobj.ItemPedido;

import java.util.List;
import java.util.Objects;

public class LeitorDeArquivos {

    public List<ItemPedido> lerArquivos(String arquivo) {
        List<ItemPedido> itemPedido;
        IdentificaTipoArquivo parametroArquivo = new IdentificaTipoArquivo();
        String tipoDoArquivo = parametroArquivo.identificaTipoArquivo(arquivo);

        if (Objects.equals(tipoDoArquivo, ".csv")){
            Leitor arquivoASerLido = new LeitorCsv();
            itemPedido = arquivoASerLido.ler(arquivo);
        }else if (Objects.equals(tipoDoArquivo, ".xml")) {
            Leitor arquivoASerLido = new LeitorXml();
            itemPedido = arquivoASerLido.ler(arquivo);
        }else{
            throw new IllegalArgumentException("Formato de arquivo inválido: " + arquivo);
        }

        return itemPedido;
    }
}
