package org.example;
public class Workshop extends Evento {
    private int maxParticipantes = 30;
    private int totalParticipantes = 0;

    public Workshop(String nome, String data) {
        super(nome, data);
    }

    public boolean inscreverParticipante(String participante) {
        if (totalParticipantes < maxParticipantes) {
            totalParticipantes++;
            return true;
        }
        return false;
    }

    @Override
    public boolean validar() {
        return totalParticipantes <= maxParticipantes;
    }
}
