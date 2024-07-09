package extends1.overriding;

public class ElectricCar extends Car {

    @Override        //부모의 기능을 자식이 새로 재정의하는것을 메서드 오버라이딩이라고 한다.
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다");
    }

    public void charge(){
        System.out.println("기름을 주유합니다");
    }
}
