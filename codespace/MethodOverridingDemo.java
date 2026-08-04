class Parent {
    void display() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is Child class method");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent obj = new Child(); 
        obj.display();            
    }
}