import java.util.ArrayList;

public class perfnum {
    public static void main(String[]args){
        int p = 2;
        int contador = 1;
        while(contador <= 100){
            if(primenum(p) == false){
                System.out.println(contador+": "+perfectnum(p));
                contador++;
            }
            p++;
        }
    }
    
    public static boolean primenum(int p){      
        boolean prime = false;
        ArrayList<Integer> primos = new ArrayList<Integer>();
        primos.add(2);
        primos.add(3);
        for(int i = 0; i < primos.size(); i++){
            if(p == 2 || p == 3){
                break;
            }
            if(p % primos.get(i) == 0){
                prime = true;
                break;
            }
        }
        if(prime == false){
            primos.add(p);
        }
        return(prime);
    }

    public static double perfectnum(int p){
        return(Math.pow(2, (p-1))*(Math.pow(2, p)-1));
    }
}
