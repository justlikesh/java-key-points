package poly.overriding;

public class Child extends Parent{
    public String value = "child";

    public void childmethod(){
        System.out.println("Child.method");
    }

    @Override
    public void parentmethod(){
        System.out.println("Child.method");
    }
}
