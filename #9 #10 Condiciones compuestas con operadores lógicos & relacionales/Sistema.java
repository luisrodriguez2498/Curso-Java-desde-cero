import java.util.Scanner;

public class Sistema{

	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	String nombre;
	int clave, anios;

	System.out.println("nombre del chachito xd:");
	nombre = scanner.nextLine();

	System.out.println("Clave del chachito xdxd");
	clave = scanner.nextInt();

	System.out.println("tiempo laburando del chachito xdxdxd");
	anios = scanner.nextInt();

	
	if (clave == 1){
		if (anios == 1){
			System.out.println("El chachito " + nombre + " tiene derecho a 6 dias de vacaciones.");
		} else if (anios >= 2 && anios <= 6){
            System.out.println("El chachito " + nombre + " tiene derecho a 14 dias de vacaciones.");
        } else if (anios >= 7){
            System.out.println("El chachito " + nombre + " tiene derecho a 20 dias de vacaciones.");
        } else {
            System.out.println("El chachito " + nombre + " no tiene derecho a vacaciones.");
        }
	} else if (clave == 2){
        if (anios == 1){
            System.out.println("El chachito " + nombre + " tiene derecho a 7 dias de vacaciones.");
        } else if (anios >= 2 && anios <= 6){
            System.out.println("El chachito " + nombre + " tiene derecho a 15 dias de vacaciones.");
        } else if (anios >= 7){
            System.out.println("El chachito " + nombre + " tiene derecho a 22 dias de vacaciones.");
        } else {
            System.out.println("El chachito " + nombre + " no tiene derecho a vacaciones.");
        }
	} else if (clave == 3){
        if (anios == 1){
            System.out.println("El chachito " + nombre + " tiene derecho a 10 dias de vacaciones.");
        } else if (anios >= 2 && anios <= 6){
            System.out.println("El chachito " + nombre + " tiene derecho a 20 dias de vacaciones.");
        } else if (anios >= 7){
                System.out.println("El chachito " + nombre + " tiene derecho a 30 dias de vacaciones.");
            } else {
                System.out.println("El chachito " + nombre + " no tiene derecho a vacaciones.");
            }
        } else {
            System.out.println("Clave de departamento no válida.");
    }
}
}