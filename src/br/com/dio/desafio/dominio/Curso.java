package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(){

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getTitulo() + ", Descrição: " + this.getDescricao() + ", Carga Horária: " + this.cargaHoraria;
    }

    @Override
    public double calcularExperiencia() {
        return XP_PADRAO * cargaHoraria;
    }
}
