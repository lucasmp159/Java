import javax.swing.JOptionPane;
public class Login_Senha {
    public static void main(String[] args){
        //VARIAVEIS
        String cadsenha;
        String confsenha;
        double a;
        double b;
        //INPUTS
        cadsenha = JOptionPane.showInputDialog(null, "Password",
                "", JOptionPane.QUESTION_MESSAGE);
        a = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Primeiro Número", "", JOptionPane.QUESTION_MESSAGE));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Segundo Número", "", JOptionPane.QUESTION_MESSAGE));
        confsenha = JOptionPane.showInputDialog(null,
                "Digite uma senha","", JOptionPane.QUESTION_MESSAGE);
        if (confsenha.equals(cadsenha)){
            System.out.println(a/b);
        } else {
            System.out.println("Senha inválida");
        }
        System.exit(0);
    }
}
