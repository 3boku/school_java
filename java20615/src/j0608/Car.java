package j0608;

public class Car {
    String name = "차";
    String color;
    int velocity;

    String print(){
        return "[나는" + name + "이다.]";
    }
    void speedUp() {
        velocity += 5;
        System.out.println("속도 " + velocity + " 증가");
    }
    void speedDown() {
        velocity -= 5;
        System.out.println("속도 " + velocity + " 감소");
    }
}
