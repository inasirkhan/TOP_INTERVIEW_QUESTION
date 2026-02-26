package top150.deqode.intuit.day3;

public class PrintStartPattern {

    public static void main(String[] args) {
        int n =5;
        for (int i=0;i<n;i++){

            for (int j=n-i-1;j>0;j--){
                System.out.print("  ");
            }
            for (int k=0;k<=i*2;k++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}
