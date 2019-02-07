import javax.swing.JOptionPane;

public class EjercicioSuma{

  public static void main(String[] args){

    int a, b, suma;

    String numero = JOptionPane.showInputDialog("Ingrese un entero");
    a = Integer.parseInt(numero);
    numero = JOptionPane.showInputDialog("Ingrese otro entero");
    b = Integer.parseInt(numero);

    suma = a + b;

    String salida = String.format("El resultado es %d", suma);

    JOptionPane.showMessageDialog(null, salida);

  }
}
