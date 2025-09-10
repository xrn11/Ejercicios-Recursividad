
/**
1. Encuentra un m´etodo que permita definir la potencia de un n´umero. Los datos son a y b y lo que se desea
es calcular a elevado a la b.
a=2, b=3 2*2*2
 */
public class Ej1{
    public int potencia(int a, int b){
        int res;
        if(a>=0 && b==0)
            res=1;
            else
            res=a*potencia(a, b-1);
        return res;
    }
}
