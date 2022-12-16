package Implementation;
import javax.swing.*;

public class Print implements Rating{
    private int escolha;

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    void imprimir(){
        setEscolha(Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções \n 1 - Aprovado \n 2 - Passou \n 3 - Reprovado")));
        if (escolha == 1){
            System.out.println(aprovado);
        } else if (escolha == 2){
            System.out.println(passou);
        } else {
            System.out.println(reprovou);
        }
    }
}
