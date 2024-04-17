import javax.swing.JOptionPane; //é necessário importar a classe, pior não é parte do níucleo 

public class SomaDoisNumeros {
    public static void main(String[] args) {
        double primeiroValor, segundoValor, resultado;
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite primeiro valor: "));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        //processamento
        resultado = primeiroValor + segundoValor;
        //saída
        JOptionPane.showMessageDialog(null, "Soma = " + resultado);
    }

}
