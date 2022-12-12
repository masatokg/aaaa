interface SayHello{
    public void hello();
}
class Greeting{
    static void greet(SayHello s){
        s.hello();
    }
}
public class AnonymousClassExample02 {
    public static void main(String[] args){
        // class Person implements SayHello{
        //     @Override
        //     public void hello() {
        //         System.out.println("こんにちは");
        //     }
        // }
        // Person p = new Person();
        // Greeting.greet(p);

        // Greeting.greet(new SayHello(){
        //     public void hello(){
        //         System.out.println("こんにちは");
        //     }
        // });

        // Greeting.greet( ()->{System.out.println("こんにちは");} );
    }    
}
