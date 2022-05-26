package teste;
import javax.swing.JOptionPane;
public class condicional {
	   public static void main(String[] args) {
	        String num1, num2;
	        int n1, n2;
	        num1 = JOptionPane.showInputDialog("Digite o 1o número: ");
	        n1 = Integer.parseInt(num1);
	        num2 = JOptionPane.showInputDialog("Digite o 2o número: ");
	        n2 = Integer.parseInt(num2);
	        // condicionais
	        if (n1 > n2){
	            JOptionPane.showMessageDialog(null, "O maior é: " + n1);
	        } else {
	            JOptionPane.showMessageDialog(null, "O maior é: " + n2);
	        }
	    }
}
