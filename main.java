import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        classe numm = new classe();
        JOptionPane.showMessageDialog(null,"Bem vindo ao jogo de adivinhação");
        boolean sair =  false;
        while (sair == false){
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Deseja: \n[1] Jogar \n[2] Sair"));
            switch (menu){
                case 1:
                    Random numero = new Random();
                    int num = numero.nextInt(101);
                    int v = 0;
                    boolean s = false;
                    while (s == false) {
                        v += 1;
                        if (v < 6)
                        {
                            int guess = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar qual o número escolhido, de 1 a 100"));
                            switch(numm.Chance(guess,num)) {
                                case 1:
                                    JOptionPane.showMessageDialog(null, "O número que você colocou é maior que o sorteado");
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "O número que você colocou é menor  que o sorteado");
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, "Parabéns, você acertou, era" + " " + num);
                                    s = true;
                                    break;
                                }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Você perdeu, tente novamente, o número era" + " " + num);
                            s = true;
                        }
                    }
                    break;
                case 2:
                    sair = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Inválido");


            }

        }

    }
}
