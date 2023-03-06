package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria () {

    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getTitulo() + ", Descrição: " + this.getDescricao() + ", Data: " + this.data;
    }

    @Override
    public double calcularExperiencia() {
        return XP_PADRAO + 20d;
    }
}
