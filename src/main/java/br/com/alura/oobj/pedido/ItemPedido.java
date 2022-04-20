package br.com.alura.oobj.pedido;

import com.opencsv.bean.CsvBindByName;

import java.math.BigDecimal;

public class ItemPedido {

  @CsvBindByName
  private Long codigo;

  @CsvBindByName
  private String descricao;

  @CsvBindByName
  private Integer quantidade;

  @CsvBindByName
  private BigDecimal valorUnitario;

  @CsvBindByName
  private String classeFiscal;

  public Long getCodigo() {
    return codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public BigDecimal getValorUnitario() {
    return valorUnitario;
  }

  public String getClasseFiscal() {
    return classeFiscal;
  }

  public BigDecimal retornaSubTotal(){
    BigDecimal subTotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));
    return subTotal;
  }

  @Override
  public String toString() {
    return "ItemPedido{" +
        "codigo=" + codigo +
        ", descricao='" + descricao + '\'' +
        ", quantidade=" + quantidade +
        ", valorUnitario=" + valorUnitario +
        ", classeFiscal='" + classeFiscal + '\'' +
        '}';
  }
}
