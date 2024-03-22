package exerciciosjava;

import java.util.Scanner;

public class codigo2do2 {
	

    public static void main(String[] args) {
        String usuario;
        String senha;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nDigite o seu nome de usuário: ");
        usuario = teclado.next();
        System.out.println("\nDigite sua senha: ");
        senha = teclado.next();

        if (usuario.equals(senha)) {
            System.out.println("Dados inválidos! Nome de usuário e senha não podem ser iguais.");
        } else {
            System.out.println("Dados válidos! Nome de usuário e senha são diferentes.");
        }

        teclado.close();

    }

}
