public class Employee {
   public int salary;
   public String name;

   public Employee(int salary,String name){
       this.salary=salary;
       this.name=name;
   }
   public int getSalary(){
       return salary;
   }
   public String getName(){
    return name;
   }
   public int setSalaey(int newSalary){
       return newSalary;
   }
   public String setName(String newName){
       this.name=newName;
       return newName;
   }

    public static void main(String[] args) {
        Employee emp=new Employee(30000,"Nitish");
        //System.out.println(emp.getSalary());
        //System.out.println(emp.getName());
        System.out.println( emp.setName("Sohan"));
        System.out.println(emp.setSalaey(45000));
    }
}


