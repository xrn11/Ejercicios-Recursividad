
/**
 *
 */
public class Ej3{
    /*public int num(int n){
        int res=1;
        int aux=n/10;
        while(aux > 0){
            res=res+1;
            aux=aux/10;
        }
        return res;
    }*/
    public int num(int n){
        return num(n,0);
    }
    private int num(int n, int cont){
        int res;
        if(n<10){
            res=1;
        }
        if(n>0)  
            res=num(n/10,cont+1);
        else
            res=cont;
        return res;
    }
}
