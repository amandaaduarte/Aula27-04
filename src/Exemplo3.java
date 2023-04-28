import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args){
        int dividendo, divisor;
        while (true){
            try {
                dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
                divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
                Exemplo3(dividendo, divisor);
                break;
            } catch (ArithmeticException e1){
                JOptionPane.showMessageDialog(null, "Não pode dividir por zero");
            }catch (NumberFormatException e2){
                JOptionPane.showMessageDialog(null, "Favor informar apenas números inteiros!");
            }
        }

    }
    public static void Exemplo3(int dividendo, int divisor) {
        System.out.println("Divisão = " + (dividendo/divisor));
    }
}
