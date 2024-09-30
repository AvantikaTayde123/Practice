public class InheritanceEx1 {

    private String name;
    private int age;
    
    public String getdetails(){
        return("Name: "+name+" age: "+age);
    }

    public void setdetails(String name, int age){
        this.name = name;
        if(age>0){
        this.age=age;
        }
        else{
            System.out.println("Age should be +ve");
        }
    }

}
    class Employee extends InheritanceEx1{
        private int salary;
        public int getsalary(){
            return (salary);
        }
        public void setsalary(int salary){
            this.salary = salary;
        }
    }

    class Main{
            public static void main(String[] args) {
        //InheritanceEx1 p=new InheritanceEx1();
       // p.setdetails("john",30);
        //System.out.println(p.getdetails());
        Employee e=new Employee();
        e.setdetails("Avani", 20);
        System.out.println(e.getdetails());
        e.setsalary(40000);
       System.out.println("Salary : "+e.getsalary());
    }
}
