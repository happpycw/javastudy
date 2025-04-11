package proxy;

public class Run {
    
    public static void main(String[] args) {
    
        Developer man = new Aspect(new Man());
        Developer woman = new Aspect(new Woman());
        Developer child = new Aspect(new Child());
        
        man.develop();
        System.out.println("===============================");
        
        woman.develop();
        System.out.println("===============================");
        
        child.develop();
        System.out.println("===============================");
    }
}
