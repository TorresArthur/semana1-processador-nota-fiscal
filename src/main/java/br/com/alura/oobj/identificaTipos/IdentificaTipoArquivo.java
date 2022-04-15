package br.com.alura.oobj;

import br.com.alura.oobj.leitura.Leitor;
import br.com.alura.oobj.leitura.LeitorCsv;
import br.com.alura.oobj.leitura.LeitorXml;

import java.util.List;
import java.util.Objects;

public class IdentificaTipoArquivo {

    public Leitor identificaTipoArquivo(String arquivo){

        String result = arquivo.substring(arquivo.indexOf("."));
        List<ItemPedido> itemPedido;

        if (Objects.equals(result, ".csv")){
            Leitor arquivoASerLido = new LeitorCsv();
            return arquivoASerLido;
        }else if (Objects.equals(result, ".xml")) {
            Leitor arquivoASerLido = new LeitorXml();
            return arquivoASerLido;
        }else{
            throw new IllegalArgumentException("Formato de arquivo inválido: " + arquivo);
        }
    }
}
