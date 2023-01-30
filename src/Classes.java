
class A{

    protected int a;
    protected int b;
    public A(int a,int b){
        this.a=a;
        this.b=b;
    }
    public A(){}
    public int geta(){
        return a;
    }
    public  int getb(){
        return b;
    }
    public  int sum(){
        return a+b;
    }
}

class B extends A{
    public B(int a, int b){
        this.a = a;
        this.b= b;
    }
}

public class Classes {

    public static void main(String[] args) {

        A obj = new A(5,6);
        System.out.println(obj.sum());
        B obj1 = new B(9,7);
        System.out.println(obj1.sum());

    }
}
