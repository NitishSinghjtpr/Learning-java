

public class allClassPublic {
    public class palying{
    void paly(){
        System.out.println("I am playing");
    }
  }

 public class running extends palying{
    void run(){
        System.out.println("I am running");
    }
 }

 public static void main(String[] args) {
    //jab all class public hoga to referance ka concept use hoga (main class ko referance lena hoga)
        allClassPublic obj=new allClassPublic();
       
        running obj2=obj.new running();
        obj2.run();
        obj2.paly();

    }
}
