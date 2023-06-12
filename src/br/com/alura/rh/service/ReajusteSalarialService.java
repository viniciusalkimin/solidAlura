package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ReajusteSalarialService {

    private List<ValidacaoReajuste> validacaoReajuste;

    public ReajusteSalarialService(List<ValidacaoReajuste> validacaoReajuste) {
        this.validacaoReajuste = validacaoReajuste;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {

        validacaoReajuste.forEach(v -> v.validar(funcionario,aumento));

        BigDecimal novoSalario = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(novoSalario);
    }
}
