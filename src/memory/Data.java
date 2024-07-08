package memory;

public class Data {
    private int value;

    public Data(int value){
        System.out.println(value + " 하얀색value");
        System.out.println(this.value + " 분홍색벨류");
        this.value = value;
        System.out.println(this.value + " 분홍색벨류");
    }

    public int getValue() {
        System.out.println(value + " getvalue");
        return value;
    }
}
