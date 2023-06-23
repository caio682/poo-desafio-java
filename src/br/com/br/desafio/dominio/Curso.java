package br.com.br.desafio.dominio;

public class Curso extends Conteudo {
    private int CargaHoraria;
    @Override
    public double calcularXP() {
        return XP_PADRAO * CargaHoraria;
    }
    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", Description='" + getDescricao() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }


}
