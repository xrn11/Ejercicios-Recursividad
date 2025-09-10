
/**
 2. Escribe un proceso recursivo que permita decidir si un n´umero natural n es primo o no.
 */
public class Ej2{
    public boolean primo(int n){
        if(div(n)==2)
            return true;
        else
            return false;
    }
    private int div(int n){
        return div(n,1,0);
    }
    private int div(int n,int cont,int suma){
        if(n>=cont){
            if(n%cont == 0)
                return div(n,cont+1, suma+1);
            else
                return div(n,cont+1,suma);
        }
        return suma;
    }
}
