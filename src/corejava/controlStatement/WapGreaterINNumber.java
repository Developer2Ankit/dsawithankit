package corejava.controlStatement;

public class WapGreaterINNumber {
    public static void main(String[] args) {
        int a=15;
        int b=25;
        int c=35;
        if(a>b && a>c){
            System.out.println("a is greater number!");
        }else if(b>a && b>c){
            System.out.println("b is greater number!");
        }else{
            System.out.println("c is greater number!");
        }

        System.out.println("2nd Way-----//----------------------------");
        if(a>b){
            if(a>c){
                System.out.println("a is greater number!");
            }else{
                System.out.println("c is greater number!");
            }
        }else if(b>c){
           System.out.println("b is greater number!");
        }else{
            System.out.println("c is greater number!");
        }
    }
}
