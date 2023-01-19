package ExerciciosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class estruturasCondicionais { // INICIO DA CLASSE


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);  // Primeiro crio um scanner para ler dados digitados pelo usuario


        ArrayList<Integer> lista = new ArrayList<Integer>(); // depois crio  um array para armazenar os dados.

        int n, r = 0; // aqui crio 2 variaveis 1 para receber os numeros que serao adicionados a lista e outro para o loop do While.


            //PROJETO EM VS CODE CONSTRUIDO PARA APRENDIZAGEM

        while (r == 0 ) { // aqui comeca o while.
            System.out.println("Deseja adicionar um numero a lista ? ");
            System.out.println("Digite 0 para Sim ou 1 para Nao");
            r = read.nextInt();

            if (r == 0) {
                System.out.println(" Digite um numero para adicionar a lista: ");
                n = read.nextInt();
                lista.add(n);

            } else {
                System.out.println("Os numeros adicionados a lista sao :  ");
                System.out.println(lista);
            }
        }



    }
}