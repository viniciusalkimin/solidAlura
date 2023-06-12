package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodoEntreUltimoReajuste implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        Long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataAtual,dataUltimoReajuste);

        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo de reajuste deve ser maior que 6 meses!");
        }
    }
}
