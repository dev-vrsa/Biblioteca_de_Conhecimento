package ExerciciosPolimorfismoHerenca;

public class leitor {

    public double lerX (){
        var read = new java.util.Scanner(System.in);

        System.out.println("Digite o valor de X ");
        return read.nextDouble();

    }


    public double lerY (){
        var read = new java.util.Scanner(System.in);

        System.out.println("Digite o valor de Y ");
        return read.nextDouble();

    }

}
