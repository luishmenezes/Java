package br.unicap.poo.atividade.questao7;

public class Main {
    public static void main(String[] args) {
        perfilUsuario u1 = new perfilUsuario("luis","escreva sua bio aqui", 8000);
        perfilUsuario u2 = new perfilUsuario("marcos","escreva sua bio aqui", 10000);
        perfilUsuario u3 = new perfilUsuario("luan","escreva sua bio aqui", 4000);

        u1.mostrarPerfilUsuario();
        u2.mostrarPerfilUsuario();
        u3.mostrarPerfilUsuario();
    }
}
