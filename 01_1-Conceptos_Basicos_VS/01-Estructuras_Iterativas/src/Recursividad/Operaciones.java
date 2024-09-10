package Recursividad;

public class Operaciones {

    private int n;

    public Operaciones(){
        this.n=1;
    

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n=(n<=0)?1:n;

    }

    //iterativo 
    public void imprimir (){

        int i=1;
        do {
            System.out.println("Hola mundo");
            i++;
        } while (i<this.n);
    }

    //Recursivo 
    public void imprimir (int n){
        //caso base
        if (n==1) {
            System.out.println("Hola mundo");
        }else{
            //caso general 
            System.out.println("Hola mundo");
            imprimir(n-1);
        }     
    }




}
