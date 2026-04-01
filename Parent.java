package workshop;
class Parent {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;
    
    public int getPrivateVar() {
        return privateVar;
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Protected Variable: " + protectedVar);
        
        System.out.println("Public Variable: " + publicVar);
   
        System.out.println("Private Variable (via method): " + getPrivateVar());
    }
}