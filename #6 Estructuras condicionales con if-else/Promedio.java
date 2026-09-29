public class Promedio{
	public static void main(String args[]){
	int matemáticas = 5;
	int biología = 8;
	int quimica = 7;
	int promedio = 0;

	promedio = (matemáticas + biología + quimica)/3;
	
	if (promedio >= 6){
		System.out.println("El alumno aprobó con " + promedio);
		} else {
			System.out.println("El alumno reprobó con " + promedio);
		}
	}
}