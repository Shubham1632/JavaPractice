
class A{
     int a;
     int b;
    public A(int a,int b){
        this.a=a;
        this.b=b;
    }
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

public class Classes {

    public static void main(String[] args) {

        A obj = new A(5,6);
        System.out.println(obj.sum());

    }
}
