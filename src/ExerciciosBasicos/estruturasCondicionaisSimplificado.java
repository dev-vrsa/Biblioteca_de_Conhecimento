package ExerciciosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class estruturasCondicionaisSimplificado {
    public static void main(String[] args) {

        //CRIAR SCANNER PARA LER OS DADOS DO USUARIO

        Scanner read = new Scanner(System.in);
        
        // EXEMPLO SIMPLES DE ESTRUTURAS CONDICIONAIS

        // CRIAREMOS UM PROGRAMA PARA LER OS DADOS DO USUARIO ARMAZENAR EM UMA LISTA PARES E IMAPRES E NO FINAL IMPRIMIR TUDO SEPARADO.

        // 1 - CRIAR UM ARRAY
        // 2 - CRIAR O LACO DE REPETICAO PARA LER OS DADOS DO USUARIO.
        // 3 - CRIAR A CONDICAO E ARMAZENAR NOS ARRAYS CORRESPONDENTES.

        ArrayList <Integer> Impares = new ArrayList<Integer>();
        ArrayList <Integer> Pares = new ArrayList<Integer>();


        //CRIAR AS VARIAVEIS QUE VAMOS USAR


        int x , aux; // vamo usar apenas uma variavel x para armazenar os dados de entrada e uma variavel chamada "aux" como auxilar para o loop do while.

        aux = 0; // a--------------------------tribuimos o valor de aux para 0 para que o while faca o primeiro loop.
        while(aux < 1 ){ // WHILE CRIA UM LACO DE REPETICAO.

            System.out.println("\n Digite um numero positivo maior que 0:\n");  // PEDIMOS AO USUARIO INSERIR O DADO.
             x = read.nextInt(); // NESTA LINHA O PROGRAMA IRAR LER ATRAVES DO SCANNER O DADO DIGITADO.

             if (x% 2 == 0){
                System.out.println("\n> O numero inserido foi ("+x+")");
                System.out.println("\n> ("+x+") e um numero par! ");
                Pares.add(x);
             }else {
                System.out.println("\n> O numero inserido foi ("+x+")");
                System.out.println("\n> ("+x+") e um numero impar! ");
                Impares.add(x);
             }


             System.out.println("\n_________________________________________________________________\n");
             System.out.println("\nDeseja continuar ?\n DIGITE: \n 0 -  PARA CONTINUAR \n 1 - PARA FINALIZAR");
            aux = read.nextInt();

        }

        System.out.println("\nNumeros pares armazenados: "+Pares);
        System.out.println("\n                                       ");
        System.out.println("\nNumeros impares armazenados: "+Impares);
        System.out.println("\n                                       ");



        
    


    }
    
}
