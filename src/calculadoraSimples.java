import java.util.Scanner;

public class calculadoraSimples {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        double x, y,menu = 0;
        
        while(menu < 1){

            System.out.println("Gostaria de realizar mais algum calculo ? \n \n Digite 0 para SIM. \n Digite 1 para Finalizar.");
            menu = leia.nextDouble();

            if (menu == 1){
                System.out.println("Programa Finalizado!");
                break;
            }
        
        System.out.println("Informe o valor de X: ");
        x = leia.nextDouble();

        System.out.println("Informe o valor de Y: ");
        y = leia.nextDouble();



        System.out.println("___________________________________");
        System.out.println("                                   ");


        System.out.println("SOMA:\n");
        System.out.println(x+" + "+y+"= "+(x+y));
        System.out.println("\n___________________________________");
        System.out.println("                                   ");

        System.out.println("SUBTRACAO:\n");
        System.out.println(x+" - "+y+"= "+(x-y));
        System.out.println("\n___________________________________");
        System.out.println("                                   ");

        System.out.println("MULTIPLICACAO:\n");
        System.out.println(x+" x "+y+"= "+(x*y));
        System.out.println("\n___________________________________");
        System.out.println("                                   ");
         
        
        System.out.println("DIVISAO:\n");
        System.out.println(x+" / "+y+"= "+(x/y));
        System.out.println("\n___________________________________");
        System.out.println("                                   ");
        

        System.out.println("POTENCIA:\n");
        System.out.println(x+" Elevado a potencia de 0"+y+" = "+Math.pow(x,y));
        
        System.out.println("                                   ");
        System.out.println("                                   ");
        System.out.println("___________________________________");
        




        }

        
        


        



    }
    
}
