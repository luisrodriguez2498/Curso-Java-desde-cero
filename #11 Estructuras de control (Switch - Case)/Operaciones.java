public class Operaciones{
    public static void main(String[] args) {
        int num_uno = 5, num_dos = 3, resultado = 0;
        int operacion = 1; // 1 = suma, 2 = resta, 3 = multiplicación, 4 = división

        switch(operacion){ // El parametro solo permite int y char
            case 1:
                resultado = num_uno + num_dos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num_uno - num_dos;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num_uno * num_dos;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                resultado = num_uno / num_dos;
                System.out.println("El resultado de la división es: " + resultado);
                break;
            default:
                System.out.println("Error, la opción no existe");
        }
    }
}