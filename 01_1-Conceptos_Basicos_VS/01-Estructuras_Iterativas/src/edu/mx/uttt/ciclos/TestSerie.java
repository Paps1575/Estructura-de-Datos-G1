package edu.mx.uttt.ciclos;
import javax.swing.JOptionPane;

public class TestSerie {
    public static void main(String[] args) {
        String resultado = "";
        serie serie1 = new serie();
        serie serie2 = new serie(3);   
        
        resultado = "Sopas la venganza \n"+
                    "\nEl valor de n es: "+ serie1.getN()+
                    "\nEl resultado de la serie utilizando for es:"+serie1.calcularFor()
                    +"\nEl resultado con Do While es:"+serie1.calcularDoWhile()
                    +"\nel resultado con While es: "+serie1.calcularWhile()
                    +"resultado con  formato: "+serie1.toString()+"="+serie1.calcularFor();

                    System.out.println(serie2);
                    
        JOptionPane.showMessageDialog(null,resultado);            

    // int n = serie1.getN();
    // System.out.println("El valor de n es : "+n);
    // System.out.println(serie1);


    // System.out.println("el valor de n es: "+serie2.getN());
    // System.out.println(serie2);

    // serie1.setN(-4);
    // System.out.println("El valor de n es: "+serie1.getN());

    // serie2.setN(10);
    // System.out.println("El valor de n es: "+serie2.getN());

        




    }

}
