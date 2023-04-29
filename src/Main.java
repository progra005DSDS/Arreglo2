import java.util.Arrays;

public class Main {
    public static void main(String[] args) {am();
    }
    public static void au (){
        int[] enteros= new int [5];//arreglo de una dimencion
        enteros[2] = 6;
        enteros[4] = 1;

        for( int i=0;i<enteros.length;i++){
            System.out.println(enteros[i]);
        }
    }
    public static void am(){

       // int [][][] tridimencional = new int[3][2][1]; // areglo tridimencional
     //int == tipo de dato que va a contener el arreglo ó (matriz)
     //[][] == indicadores de filas [] y columnas []

        int[][] bidimencional = new int[3][2]; //areglo bidimencional

        bidimencional[0][0]= 8;
        bidimencional[0][1]= 15;
        bidimencional[1][0]= 6;
        bidimencional[1][1]= 14;
        bidimencional[2][0]= 4;
        bidimencional[2][1]= 25;


        for (int i=0;i<bidimencional.length;i++){
            for (int j=0;j<bidimencional[i].length;j++){
                System.out.print(bidimencional[i][j]+ " " );
            }
        }

        System.out.println(Arrays.toString(bidimencional));
    }
}