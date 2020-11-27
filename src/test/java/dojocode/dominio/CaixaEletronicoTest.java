package dojocode.dominio;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaixaEletronicoTest {

    @Test
    void deve_criar_um_caixa_eletronico() {
        Faker faker = new Faker();
        BigDecimal quantidadeDeNotas = BigDecimal.valueOf(faker.number().randomDigit());
        
        CaixaEletronico caixaEletronico = new CaixaEletronico(quantidadeDeNotas);

        assertEquals(quantidadeDeNotas, caixaEletronico.getQuantidadeDeNotas());
    }
    
    @Test
    void deve_criar_um_caixa_eletronico_com_valor_a_ser_sacado() {
    	
    }
}
