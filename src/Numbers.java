class num {
    num(){}
    void change(int a){
        a = 98;
    }
}
public class Numbers {

    static int add(int a, int b){
        return a+b;
    }
    static void tellJoke(){
        System.out.println("this is the joke");
    }
    static  void tellJoke(int a){
        System.out.println("this is the joke with number");
    }
    public static void main(String[] args) {
//        int a=20;
//        Integer b = new Integer(20);
//        num obj = new num();
//        obj.change(a);
//        obj.change(b);
//        System.out.println(add(a,b));
//        System.out.println(a);
//        System.out.println(b);
        tellJoke();
        tellJoke(3);
    }
}
