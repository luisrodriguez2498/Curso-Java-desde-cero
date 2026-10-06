import javax.swing.*;

public class Formulario extends JFrame{
    
    public Formulario(){
        setLayout(null);
    }

    public static void main(String args[]){
        Formulario formulario1 = new Formulario(); // Instancia del formulario para usar JFrame
        formulario1.setBounds(0,0,400,550); // Tamaño del formulario y su posición en la pantalla
        formulario1.setVisible(true); // Hacer que el formulario sea visible
        formulario1.setLocationRelativeTo(null); // Centrar el formulario en la pantalla
        formulario1.setResizable(false); // Evitar que el formulario se pueda redimensionar
    }
}