package dojocode.dominio;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class CaixaEletronico {

    private BigDecimal quantidadeDeNotas;

    public CaixaEletronico(BigDecimal deNotas, BigDecimal quantidadeDeNotas) {
    	this.quantidadeDeNotas = quantidadeDeNotas;
    }
}
