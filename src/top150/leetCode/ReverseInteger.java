package top150.leetCode;

public class ReverseInteger {

    public static int reverse(int x) {
        int rev = 0;
        while(x!=0){
            int r = x%10;
            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10)
                return 0;
            rev = rev*10 + r;
            x = x/10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int num = -321;
        System.out.println(reverse(num));
        System.out.println(reverse(1534236469));
    }
}
