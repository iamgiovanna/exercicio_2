  import javax.swing.JOptionPane;
  
public class ExercicioValores {
 
    //método main
    public static void main(String[]args){

        double val = 0,val2 =0,calcular =0;
    
           
        val = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:: "));
        val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:: "));

        //criação de variável e chamando o método diferença
         diferenca(val,val2,calcular);
        //variavel        método   parametro

    } //final do método main

    static void diferenca(double v1, double v2, double calcular){
        calcular = v1 - v2;
        JOptionPane.showMessageDialog(null," A diferença dos valores é " +calcular  );
    }
}

