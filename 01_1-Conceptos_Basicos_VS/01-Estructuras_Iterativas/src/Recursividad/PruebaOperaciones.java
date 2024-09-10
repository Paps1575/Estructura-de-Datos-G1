package Recursividad;
import javax.swing.JOptionPane;

public class PruebaOperaciones {
    public static void main(String[] args) {
        ejecutar();
    }
    public static String menu(){
        String menu = "Menu principal\n" +
                      "1) Imprimir iterativo\n"+
                      "2) Imprimir recursivo\n"+
                      "3)Salir\n"+
                      "Elegir opcion:";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar(){
        String opcion= "";
        boolean sentinel = true;
        int n = 0 ;
        Operaciones ope1=new Operaciones();

        do {
            opcion = menu();
            switch (opcion) {
                case "1"://iterativo
                n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
                ope1.setN(n);
                ope1.imprimir();
                    break;


                case "2":
                n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));

                ope1.setN(n);
                ope1.imprimir(ope1.getN());
                    break; 


                case "3":
                JOptionPane.showMessageDialog(null, "I'll be back");
                sentinel = false;
                    break;  
                    
            
                default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
                    break;
            }

        } while (sentinel);
    }

}
