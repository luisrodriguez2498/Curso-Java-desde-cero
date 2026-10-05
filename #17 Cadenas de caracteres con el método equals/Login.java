import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String usuario="", contraseña="";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        usuario = entrada.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contraseña = entrada.nextLine();

        if (usuario.equals("luis") && contraseña.equals("123456")) {
            System.out.println("¡Bienvenido, " + usuario + "!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
        entrada.close();
        
    }
}
