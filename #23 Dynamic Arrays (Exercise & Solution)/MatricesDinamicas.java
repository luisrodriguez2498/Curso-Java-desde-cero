import java.util.Scanner;

public class MatricesDinamicas {
    public static void main(String[] args) {
        int filas = 0, columnas = 0, contador = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas filas deseas?: ");
        filas = sc.nextInt();
        System.out.println("¿Cuantas columnas deseas?: ");
        columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = contador;
                contador++;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        sc.close();
    }
}