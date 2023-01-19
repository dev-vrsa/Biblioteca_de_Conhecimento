package ExerciciosBasicos;

import java.util.ArrayList;
import java.util.function.Consumer;


public class lambdaEmJava {
        public static void main(String[] args) {
            


            // AQUI ESTOU CRIANDO 4 ARRAYS PARA ARMAZENAR VALORES. 
            ArrayList<Integer> Valores = new ArrayList<Integer>(); // AQUI EU ARMAZENO OS VALORES ABAIXO
            ArrayList<Integer> Dobro = new ArrayList<Integer>(); // AQUI EU ARMAZENO O RESULTADO DE  VALORES * 2 
            ArrayList<Integer> Par = new ArrayList<Integer>(); // AQUI IREI ARMAZENAR OS NUMEROS PARES
            ArrayList<Integer> Impar = new ArrayList<Integer>(); // AQUI IREI OS NUMEROS IMPARES


            // AQUI COLOCO MANUALMENTE OS VALORES QUE EU QUERO NO ARRAY "VALORES"
            Valores.add(1);
            Valores.add(10);
            Valores.add(33);
            Valores.add(55);
            Valores.add(20);

        //AQUI UM EXEMPLO SIMPLIFICADO DE COMO USAR LAMBDA

        // Valores.forEach((v)->{Dobro.add(v*2);});
        // SE IMPRIMIR ESTA VARIAVEL DOBRO IREMOS ENCONTRAR O RESULTADO DESTA EQUACAO. 


        // AQUI UM EXEMPLO DE USO DE LAMBDA USANDO CONDICIONAL PARA ENCONTRAR TODOS OS RESULTADOS QUE NECESSITAMOS JA ARMAZENANDO ELES NOS ARRAYS ACIMA.

            
            Valores.forEach((v)->{
                Dobro.add(v*2);
                if(v%2 == 0){
                    Par.add(v);
                }else{
                    Impar.add(v);
                }
            });


// AGORA BASTAMOS IMPRIMIR AS VARIAVEIS E TEREMOS A QUANTIDADE DE ELEMENTOS NOS ARRAYS.




            System.out.println(Valores);
            System.out.println(Dobro);
            System.out.println(Par);
            System.out.println(Impar);





        }    
}
