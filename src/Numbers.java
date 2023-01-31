class num {
    num(){}
    void change(int a){
        a = 98;
    }
}
public class Numbers {

    static int add(int ...arr){
        int res = 0;
        for(int x : arr){
            res += x;
        }
        return res;
    }
//    static void tellJoke(){
//        System.out.println("this is the joke");
//    }
//    static  void tellJoke(int a){
//        System.out.println("this is the joke with number");
//    }
    public static void main(String[] args) {
//        int a=20;
//        Integer b = new Integer(20);
//        num obj = new num();
//        obj.change(a);
//        obj.change(b);
//        System.out.println(add(a,b));
//        System.out.println(a);
//        System.out.println(b);
//        tellJoke();
//        tellJoke(3);
        System.out.println(add(1));
        System.out.println(add(2,5));
        System.out.println(add(42,64,23,87));
    }
}
