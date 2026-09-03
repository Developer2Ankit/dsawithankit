package corejava.varriable;
public class CoreJava {
    static int a=10;
    int b=20;
    public static void main(String[] args) {
        CoreJava obj=new CoreJava();
        System.out.println("obj.a:"+obj.a);
        System.out.println("obj.b:"+obj.b);
        obj.a=1000;
        obj.b=2000;

        System.out.println("obj.a:"+obj.a);
        System.out.println("obj.b:"+obj.b);
        CoreJava obj2=new CoreJava();
        System.out.println("obj2.a:"+obj2.a);
        System.out.println("obj2.b:"+obj2.b);
    }
}
