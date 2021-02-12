package Stoneby;

public class Calcul {
    private int a=0, b=0;
    private char c=' ';
    private int suma=0;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(char c) {
        this.c = c;
    }

    public String Chet(){
        String sumany="";
        switch (c){
            case '+':{
                suma=a+b;
                sumany=String.valueOf(suma);
                return sumany;
            }
            case '-':{
                suma=a-b;
                sumany=String.valueOf(suma);
                return sumany;
            }
            default:{
                suma=0;
                return sumany;
            }
        }
    }
}
