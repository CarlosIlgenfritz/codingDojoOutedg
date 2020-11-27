package dojocode.dominio;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CaixaEletronicoTest {

    private BigDecimal quantidadeDeNotas;
    private BigDecimal valorASerRetirado;
    private Faker faker;
    private CaixaEletronico caixaEletronico;

    @BeforeEach
    void init(){
        faker = new Faker();
        quantidadeDeNotas = BigDecimal.valueOf(faker.number().randomDigitNotZero());
        valorASerRetirado = BigDecimal.valueOf(faker.number().randomDigitNotZero());
    }

    @Test
    void deve_poder_criar_um_caixa_eletronico(){
        caixaEletronico = new CaixaEletronico(quantidadeDeNotas, valorASerRetirado);


    }
}
