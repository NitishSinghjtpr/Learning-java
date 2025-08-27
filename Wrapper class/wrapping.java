public class wrapping {
    public static void main(String[] args) {
        int a=5;
        Integer b=Integer.valueOf(a);
        Integer c=a;//autoboxing  (ye compiler karta hai)!
        int d=b.intValue();
        int e=c;//unboxing (ye compiler karta hai)!
        
        System.out.println("Wrapper class ="+b);
        System.out.println("Wrapper class ="+c);
        System.out.println("Premitive type ="+d);
        System.out.println("Premitive type ="+e);
    }
    
}
