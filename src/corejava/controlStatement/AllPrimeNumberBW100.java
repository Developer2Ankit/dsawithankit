package corejava.controlStatement;

public class AllPrimeNumberBW100 {
    public static void main(String[] args) {
        int n=100;
        String primeNumber="";
        for (int i=1;i<=100;i++){
            boolean prime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                if(primeNumber==""){
                    primeNumber=String.valueOf(i);
                }else{
                    primeNumber=primeNumber+","+i;
                }
            }
        }
        System.out.println(primeNumber);
    }
}
