 class Animal {

    public String makesound(){
        return ("This is a Method");

    }
    
}
class Dog extends Animal {
     public String makesound(){
        return("Barking....");
}
}

class Cat extends Animal{
    public String makesound(){
        return("Meowing....");
    }
}

class Animals{
    public static void main(String[] args) {
      Animal a = new Cat();
      Animal b = new Dog();
       System.out.println("Cats Sound is " +a.makesound());
       System.out.println("Dogs Sound is " +b.makesound());
    }
}
