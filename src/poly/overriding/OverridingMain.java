package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 지식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child Child");
        System.out.println("value = " + child.value);
        child.childmethod();
        child.parentmethod();
        //부모 변수가 부모 인스턴스 참조
        Parent poly = new Parent();
        System.out.println("Parent - > Parent");
        System.out.println("value = " + poly.value);
        poly.parentmethod();



//        Child child1 = new Parent(); //자식은 부모를 담을 수 없다.
//        poly.childmethod();
    }
}
