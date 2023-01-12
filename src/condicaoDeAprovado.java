import java.util.Scanner;

public class condicaoDeAprovado {
    public static void main(String[] args) {

        // SCANNER
        Scanner read = new Scanner(System.in);


        //ENTRADAS DO USUARIO
        System.out.println("Nota do primeiro bimestre : ");
        double nota1Bimestre = (read.nextDouble() * 0.25);

        System.out.println("Nota do segundo bimestre: ");
        double nota2Bimestre = (read.nextDouble() * 0.25);

        System.out.println("Nota do terceiro bimestre: ");
        double nota3Bimestre = ((read.nextDouble()) * 0.25);

        System.out.println("Nota do quarto bimestre: ");
        double nota4Bimestre = (read.nextDouble() * 0.25);


        //CALCULO
        double media = (nota1Bimestre + nota2Bimestre + nota3Bimestre + nota4Bimestre);

        System.out.println("\n A media do aluno foi: "+media);
        //CONDICAO

        if (media > 7 && media < 10) {

            System.out.println("\n Aluno aprovado !!! ");
            System.out.println("Parabens !!!");

        }

        if (media > 5 && media < 7) {

            System.out.println("\n Aluno de recuperacao! ");
            System.out.println("Boa sorte!");

        }

        if (media > 0 && media < 5) {

            System.out.println("\n Aluno reprovado! ");
            System.out.println("Estude mais!");

        }
    }
}

// CREDITOS : Thiagao  Arica o brabo do java.