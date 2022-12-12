interface SimpleInterface{
    public int doSomething(int n);
}

public class LambdaExample {
    static void printout(SimpleInterface i){
        System.out.println(i.doSomething(2));
    }
    public static void main(String[] args){
        // 省略形前のラムダ式を使った処理
        printout( (int n )->{ return n+1; } );
        // 省略語のラムダ式を使った処理

    }
}
