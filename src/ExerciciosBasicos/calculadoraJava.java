package ExerciciosBasicos;

import java.util.Scanner;

public class calculadoraJava {

        public static void main(String[] args){

            Scanner read = new Scanner(System.in);

            double  x, y, r;
            String operacao;


            System.out.print("Insira a operacao:");
            x = read.nextDouble();
            operacao = read.next();;
            y = read.nextDouble();



            if (operacao.equals("+")){

                r = x + y;
                System.out.println(x+" + "+y+" = "+r);
            }

            if (operacao.equals("-")){

                r = x - y;
                System.out.println(x+" - "+y+" = "+r);
            }

            if (operacao.equals("*")){

                r = x * y;
                System.out.println(x+" * "+y+" = "+r);
            }

            if (operacao.equals("/")){

                r = x - y;
                System.out.println(x+" / "+y+" = "+r);
            }

            if (operacao.equals("p")){

                r = Math.pow(x,y);
                System.out.println(x+" elevado a "+y+" = "+r);
            }










        }






}


