package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando um workshop
        Workshop workshop = new Workshop("Workshop Java", "2024-10-10");
        for (int i = 1; i <= 30; i++) {
            System.out.println("Inscrição participante " + i + ": " + workshop.inscreverParticipante("Participante " + i));
        }

        // Tentando inscrever mais um participante
        System.out.println("Inscrição participante 31: " + workshop.inscreverParticipante("Participante 31"));

        // Criando uma reunião pública
        Reuniao reuniaoPublica = new Reuniao("Reunião Pública", "2024-11-10", false, null);
        System.out.println("Reunião pública válida: " + reuniaoPublica.validar());
        System.out.println("Acesso à reunião pública: " + reuniaoPublica.acessarReuniao(null));

        // Criando uma reunião privada
        Reuniao reuniaoPrivada = new Reuniao("Reunião Privada", "2024-11-10", true, "1234");
        System.out.println("Reunião privada válida: " + reuniaoPrivada.validar());
        System.out.println("Acesso à reunião privada com senha incorreta: " + reuniaoPrivada.acessarReuniao("0000"));
        System.out.println("Acesso à reunião privada com senha correta: " + reuniaoPrivada.acessarReuniao("1234"));

        // Criando um evento corporativo
        EventoCorporativo eventoCorporativo = new EventoCorporativo("Evento Corporativo", "2024-12-10", "Sala A", "Refeitório");
        System.out.println("Evento corporativo válido: " + eventoCorporativo.validar());
    }
}
