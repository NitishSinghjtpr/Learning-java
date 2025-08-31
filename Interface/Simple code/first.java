interface I1 {
    //yanha ka method by default public & abstract hai isi liye hako class ke method ko public hi rakhna hoga.
     void print();
    
}
public class first implements I1 {
   public void print(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        first obj=new first();
        obj.print();
    }
}
