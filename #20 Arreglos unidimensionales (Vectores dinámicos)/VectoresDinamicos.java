import java.util.Scanner;

public class VectoresDinamicos{
    public static void main(String args[]){
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuantos numeros deseas ingresar?: ");
        longitud = entrada.nextInt();

        int numeros[] = new int[longitud];

        for(int i = 0; i<numeros.length; i++){
            System.out.print("Por favor dame el valor #" + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Los numeros ingresados son: ");
        for (int j=0; j<numeros.length; j++){
            System.out.print("[" + numeros[j] + "]");
        }
    }
}