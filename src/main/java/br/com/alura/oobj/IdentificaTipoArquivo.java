package br.com.alura.oobj;

public class IdentificaTipoArquivo {

    public String identificaTipoArquivo(String arquivo){
        String result = arquivo.substring(arquivo.indexOf("."));
        return result;
    }


}
