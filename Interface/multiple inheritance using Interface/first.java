interface I1 {
    //yanha ka method by default public & abstract hai isi liye hako class ke method ko public hi rakhna hoga.
     void print();
    
}
 interface I2 {
 void display();
    
} 
public class first implements I1,I2{
    //ye wala method public hona chahiye nhi to error dega.
   public void print(){
        System.out.println("I1");
    }
    public void display(){
        System.out.println("I2");
    }
    public static void main(String[] args) {
        first obj=new first();
        obj.print();
        obj.display();
    }
}

