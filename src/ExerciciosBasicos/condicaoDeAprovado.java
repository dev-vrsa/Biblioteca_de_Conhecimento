package ExerciciosBasicos;

//PROXIMA LINHA CONTEM AS IMPORTACOES DAS BIBLIOTECAS UTILIZADAS.
import java.util.Scanner;


//PROXIMA LINHA CONTEM A CLASSE DE NOME: "condicaoDeAprovado" E INICIO DO METODO VAZIO STATICO.
public class condicaoDeAprovado {
    public static void main(String[] args) {

        // PROXIMA LINHA CRIAMOS O SCANNER QUE IRA LER OS DADOS INSERIDOS PELO USUARIO.
        Scanner read = new Scanner(System.in);


        // DA LINHA 13 ATE A LINHA 24 TEREMOS AS PERGUNTAS E ENTRADA DE DADOS DO USUARIO.
        //OBS: NA ENTRADA DE DADOS DO USUARIO JA CALCULAMOS 1/4 DO VALOR DA NOTA DO BIMESTRE MULTIPLICANDO O DADO DE ENTRADA POR "0.25".
        System.out.println("Nota do primeiro bimestre : ");
        double nota1Bimestre = (read.nextDouble() * 0.25);

        System.out.println("Nota do segundo bimestre: ");
        double nota2Bimestre = (read.nextDouble() * 0.25);

        System.out.println("Nota do terceiro bimestre: ");
        double nota3Bimestre = ((read.nextDouble()) * 0.25);

        System.out.println("Nota do quarto bimestre: ");
        double nota4Bimestre = (read.nextDouble() * 0.25);


        //NA PROXIMA LINHA CRIAMOS UMA VARIAVEL CHAMADA "MEDIA" E SOMAMOS AS NOTAS RESULTANTES DA ENTRADA DO USUARIO.
        double media = (nota1Bimestre + nota2Bimestre + nota3Bimestre + nota4Bimestre);


        // NA PROXIMA LINHA IMPRIMIMOS O VALOR ARMAZENADO NA MEMORIA DA VARIAVEL "MEDIA".
        System.out.println("\n A media do aluno foi: "+media);



        // DA LINHA 42 A LINHA 61 CRIAREMOS 3 CONDICOES:
        // PRIMEIRA DE APROVADO COM MEDIA ENTRE 7 E 10.
        // SEGUNDO RECUPERACAO COM MEDIA ENTRE 5 E 7.
        // TERCEIRO REPROVADO COM MEDIA ABAIXO DE 5.



        //PRIMEIRO BLOCO
        if (media > 7 && media < 10) {

            System.out.println("\n Aluno aprovado !!! ");
            System.out.println("Parabens !!!");

        }
        //FIM DO PRIMEIRO BLOCO


        //SEGUNDO BLOCO
        if (media > 5 && media < 7) {

            System.out.println("\n Aluno de recuperacao! ");
            System.out.println("Boa sorte!");

        }
        //FIM DO SEGUNDO BLOCO


        //TERCEIRO BLOCO
        if (media > 0 && media < 5) {

            System.out.println("\n Aluno reprovado! ");
            System.out.println("Estude mais!");

        }
        //FIM DO TERCEIRO BLOCO
    }
}

// CREDITOS:
// VICTOR SA (SOFTWARE DEVELOPER)
// THIAGO ARICA (SOFTWARE DEVELOPER)
