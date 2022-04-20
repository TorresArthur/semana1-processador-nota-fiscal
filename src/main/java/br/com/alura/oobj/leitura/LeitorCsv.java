package br.com.alura.oobj.leitura;

import br.com.alura.oobj.pedido.ItemPedido;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class LeitorCsv implements Leitor {

    @Override
    public List<ItemPedido> ler(String arquivo) {
        List<ItemPedido> itensPedido;
        try {
            Reader reader = new FileReader(arquivo);
            CsvToBean<ItemPedido> csvToBean = new CsvToBeanBuilder<ItemPedido>(reader)
                    .withSeparator(';')
                    .withType(ItemPedido.class)
                    .build();
            itensPedido = csvToBean.parse();
        } catch (IOException ex) {
            throw new IllegalStateException(ex);
        }

        return itensPedido;
    }
}
