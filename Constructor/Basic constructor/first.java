
public class first {
    //default constructor
    static void add(){
         {
        System.out.println(5+5);
    }
    }
   
    //this is no parameterize constructor
    first(){
        System.out.println("hello ");
    }
    //jab ham second time constructor banate hai to ham constructor ko overload karte hain to overloading ka concept use hoga!
    first(int a){
        System.out.println("world");
    }
    first(String a){
        System.out.println("how are u");
    }
    public static void main(String[] args) {
        // first ob=new first();
        add();
        first obj=new first();
        first obj2=new first(5);
        first obj3=new first("b");
        
    }
}
