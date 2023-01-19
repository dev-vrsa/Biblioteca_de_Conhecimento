package ExerciciosBasicos;
//VETORES BIDIMENSIONAIS 2 x 2



public class ArrayListSimplificado {
    public static void main(String[] args) {


        //PODEMOS TAMBEM CRIAR VETORES VAZIOS DA SEGUINTE MANEIRA:
        // int[][] matriz2x2 = new int [2][2];


        //AQUI CRIAMOS UM VETOR DE 2 x 2 INSERINDO MANUALMENTE OS VALORES.
        int [][] matriz2x2 = { { 5, 7 }, { 10, 12 } };


        //AQUI UTILIZAMOS O FOR PARA PERCORRER AS POSICOES DO VETOR E IMPRIMIR OS DADOS PRESENTES NAS POSICOES EM SEQUENCIA.

        // Usando for (NA VERSAO COMPLETA)
        System.out.println("\nFOR NA VERSAO COMPLETA:\n");
        for (int i = 0; i < matriz2x2.length; i++) {
            for (int j = 0; j < matriz2x2[i].length; j++) {
                System.out.println(matriz2x2[i][j]);
            }
        }



        System.out.println("\n                                     \n");





        // Usando for (NA VERSAO SIMPLIFICADA)
        System.out.println("\n FOR NA VERSAO SIMPLIFICADA \n");
        for (int[] i : matriz2x2) {
            for (int j : i) System.out.println(j);
        }



        System.out.println("\n                                     \n");





        System.out.println("\n FOREACH SIMPLIFICADO\n");
        // Usando foreach
        for (int[] i : matriz2x2) {
            for (int j : i) System.out.println(j);
        }


    }
}
