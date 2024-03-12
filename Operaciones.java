import javax.swing.JOptionPane;

public class Operaciones{

    public static void main(String[] args){
        double num1, num2;
        String operacion;
        String resultado;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
        operacion = JOptionPane.showInputDialog("ingrese la operacion a realizar: ");

        switch (operacion){
            case"1":   //suma
                resultado = "El resultado de la suma es: " + (num1 + num2);
                break;
            case"2":   //resta
                resultado = "El resultado de la resta es: " + (num1 - num2);
                break;
            case"3":  //multiplicacion
                resultado = "El resultado de la multiplicacion es:" + (num1 * num2);
                break;
            case"4":   //division
                resultado = "El resultado de la division es: " + (num1 / num2);
                if (num2 == 0){
                    resultado = "No se puede dividir entre 0";
                } else {
                    resultado = "El resultado de la division es: " + (num1 / num2);
                }
                break;
            default:
                resultado = "Seleccione una opcion valida";
                break;


        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}