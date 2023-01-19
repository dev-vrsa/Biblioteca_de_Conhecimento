package ExerciciosPolimorfismoHerenca;

public class Funcoes {

    static leitor l1 = new leitor();


    public void  areaRetangulo() {

        double res = l1.lerX() * l1.lerY();

        System.out.println(res);


    }


    public void areaPI() {

        double res = l1.lerX() * 3.1416;

        System.out.println(res);



    }
}




