package com.hugomachadodev.CalculaIdadeTsi2025.Services;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MathService {
    public static String calcularIdade(String nomeCompleto, String nascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(nascimento, formatter);
        LocalDate atual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, atual);

        return geraInformacoes(nomeCompleto, periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }

    public static String geraInformacoes(String nomeCompleto, int anos, int meses, int dias) {
        return String.format("Olá, %s! Você tem %d anos, %d meses e %d dias.", nomeCompleto, anos, meses, dias);
    }
}
