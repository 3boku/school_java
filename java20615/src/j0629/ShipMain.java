package j0629;

public class ShipMain extends Ship{
    String shipname;
    int p_count;
    int l_amount;
    public static void main(String[] args) {
        ShipMain s1 = new ShipMain();
        s1.l_amount = 100;
        s1.p_count = 200;

        System.out.println("최대 승객은 "+s1.p_count+"입니다.");
        System.out.println("최대 적재량은 "+s1.l_amount+"입니다.");
    }

    @Override
    int Passenger() {
        return p_count;
    }

    @Override
    int Luggage() {
        return l_amount;
    }
}

