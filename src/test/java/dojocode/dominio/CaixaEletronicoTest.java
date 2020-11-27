package dojocode.dominio;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaixaEletronicoTest {

    private Faker faker;
    private BigDecimal quantidadeDeNotas;

    @BeforeEach
    void init() {
        faker = new Faker();
        quantidadeDeNotas = BigDecimal.valueOf(faker.number().randomDigit());
    }

    @Test
    void deve_criar_um_caixa_eletronico() {
        CaixaEletronico caixaEletronico = new CaixaEletronico(quantidadeDeNotas, quantidadeDeNotas);

        assertEquals(quantidadeDeNotas, caixaEletronico.getQuantidadeDeNotas());
    }

    @Test
    void deve_criar_um_caixa_eletronico_com_valor_a_ser_sacado() {
        BigDecimal valorASerSacado = BigDecimal.valueOf(faker.number().randomDigitNotZero());

        CaixaEletronico caixaEletronico = new CaixaEletronico(quantidadeDeNotas, valorASerSacado);

        assertEquals();
    }
}
