public class Example {
    public static int staticVar = 5;
    public int instanceVar = 10;
    
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        
        obj1.instanceVar = 20;
        obj2.staticVar = 15;
        
        System.out.println("Instance Var (obj1): " + obj1.instanceVar);
        System.out.println("Static Var: " + Example.staticVar);
    }
}