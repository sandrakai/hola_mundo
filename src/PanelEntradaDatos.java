import javax.swing.*;

public class PanelEntradaDatos {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
       /*String nombre = JOptionPane.showInputDialog(ventana, "Introduce tu nombre");
        String apellido = JOptionPane.showInputDialog(ventana, "Introduce tu apellido");
        JOptionPane.showMessageDialog(ventana, "Tu nombre es: " + nombre + " y tu apellido: " + apellido);
        ventana.dispose();
        System.exit(0);*/
        String pass = "a123";
        String contrasena = JOptionPane.showInputDialog(ventana, "Introduce contraseña:");
        if (pass.equals(contrasena)){
            JOptionPane.showMessageDialog(ventana,"Contraseña correcta");
        }else{
            JOptionPane.showMessageDialog(ventana, "Conatreña incorrecta");
        }
        System.exit(0);
    }
}
