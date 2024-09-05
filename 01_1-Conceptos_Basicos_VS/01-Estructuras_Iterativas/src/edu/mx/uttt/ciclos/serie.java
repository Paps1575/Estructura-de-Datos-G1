package edu.mx.uttt.ciclos;

public class serie {

    //variable de instancia 
    private int n;

    //Constructror (jamas tiene valor de retorno)
    public serie(){
        this.n=1;
    }


    public serie (int n){
        this.n =(n<=0)?1:n;
    }


    public int getN() {
        return n;
    }


    public void setN(int n) {
        this.n=(n<=0)?1:n;
    }

    public double calcularFor (){
        double r=0.0;
        double constante=1.0;
        
        for (int i = 1; i <this.n; i++) {
            
        }
        return r;
    }

    public double calcular (){
        double r=0.0;
        double constante=1.0;
        double i=1;
        
        while ( i <this.n){
        r+=constante/i;
        i++;
        }
        
        
        return r;
    }

    @Override
    public String toString() {
        return "serie [n=" + n + "]";
    }  
    


}
