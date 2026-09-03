package leet.code;

public class ReverseInteger {
    public static void main(String[] args) {
        int x=2147483647 ;
        int temp=0;
        int check=0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        while(x>0){
            if (temp > Integer.MAX_VALUE / 10) {
                temp=0;
                break;
            }
            check=x%10;
            temp=temp*10+check;
x=x/10;
        }
        System.out.println(temp);
    }
}
