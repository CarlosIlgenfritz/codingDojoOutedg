package dojocode.dominio;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class CaixaEletronico {

    private BigDecimal quantidadeDeNotas;
    private BigDecimal valorDaNota;

    public CaixaEletronico(BigDecimal deNotas, BigDecimal valorDaNota) {
    	this.quantidadeDeNotas = quantidadeDeNotas;
    	this.valorDaNota = valorDaNota;
    }
}
