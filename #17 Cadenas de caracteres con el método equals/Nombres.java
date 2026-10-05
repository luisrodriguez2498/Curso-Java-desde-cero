import java.util.Scanner;

public class Nombres{
    public static void main(String[] args) {
        
        String nombre_uno = "", nombre_dos = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favorcito jefecito, zampe el primer nombre: ");
        nombre_uno = entrada.nextLine();
        System.out.print("Ahora, el segundo nombre del individudo individual: ");
        nombre_dos = entrada.nextLine();

        if (nombre_uno.equals(nombre_dos)) {
            System.out.println("¡Vaya! Ambos nombres son iguales, abuebooo: " + nombre_uno);
        } else {
            System.out.println("Los nombres son diferentes, ya valio: " + nombre_uno + " y " + nombre_dos);
        }
        entrada.close();


    }
}