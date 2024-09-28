package br.unicap.poo.atividade.questao7;

public class Main {

    public static void main(String[] args) {
    Biblioteca b1 = new Biblioteca("biblioteca dos amigos", "Avenida Boa Viagem", 200, "10:00 as 19:00", 50);
    Usuario a1 = new Usuario("Luis Henrique", "6161", "999998055", "luisfake123@hotmail.com", "04/09/1999");
    Usuario a2 = new Usuario("marquinhos", "5248", "998523120", "marquinhos@gmail.com","08/10/2000");
    Usuario a3 = new Usuario("mirtes","4269","925368475","mirtes@yahoo.com.br","03/05/1999");

    b1.adicionarUsuario(a1);
    b1.adicionarUsuario(a2);
    b1.adicionarUsuario(a3);

    b1.removerUsuario("6161");


    b1.listarUsuarios();
    }
    

}
