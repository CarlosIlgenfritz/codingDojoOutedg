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
    void deve_criar_um_caixa_eletronico_com_valor_da_nota() {
        BigDecimal valorDaNota = BigDecimal.valueOf(faker.number().randomDigitNotZero());

        CaixaEletronico caixaEletronico = new CaixaEletronico(quantidadeDeNotas, valorDaNota);

        assertEquals(caixaEletronico.getValorDaNota(), valorDaNota);
    }

    @Test
    void deve_fornecer_a_menor_quantidade_de_notas_possiveis() {

        assertEquals();
    }
}
