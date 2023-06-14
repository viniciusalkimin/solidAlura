package br.com.alura.rh.model;

public class Terceirizado {

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(DadosPessoais dadosPessoais, String empresa) {
        this.dadosPessoais = dadosPessoais;
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
