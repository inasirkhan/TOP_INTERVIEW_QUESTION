package top150.practice3;

public class PrimeNumber {

    public static boolean isPrimNumber(int num){
        if(num == 0 || num == 1)
            return false;
        for(int i=2;i<num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimNumber(2));
        System.out.println(isPrimNumber(8));
    }
}
