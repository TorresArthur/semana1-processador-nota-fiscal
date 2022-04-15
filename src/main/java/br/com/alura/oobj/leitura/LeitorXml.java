package br.com.alura.oobj.leitura;

import br.com.alura.oobj.ItemPedido;
import br.com.alura.oobj.Pedido;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class LeitorXml implements Leitor {

    @Override
    public List<ItemPedido> ler(String arquivo) {
        List<ItemPedido> itensPedido;
        try {
            Reader reader = new FileReader(arquivo);
            XmlMapper mapper = new XmlMapper();

            Pedido pedido = mapper.readValue(reader, Pedido.class);
            itensPedido = pedido.getItens();
        } catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
        return itensPedido;
    }
}
