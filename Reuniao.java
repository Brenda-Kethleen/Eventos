package org.example;
public class Reuniao extends Evento {
    private boolean privada;
    private String senha;

    public Reuniao(String nome, String data, boolean privada, String senha) {
        super(nome, data);
        this.privada = privada;
        this.senha = senha;
    }

    public boolean acessarReuniao(String senha) {
        if (privada) {
            return this.senha != null && this.senha.equals(senha);
        }
        return true; // pública, sem senha
    }

    @Override
    public boolean validar() {
        return !privada || (privada && senha != null && !senha.isEmpty());
    }
}
