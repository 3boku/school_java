package j0629;

public class User {
    public static void main(String[] args) {
        Radio radio = new Radio();
        TV tv = new TV();

        radio.SoundUp(5);
        System.out.println("라디오: " + radio.getR_Sound());
        radio.SoundUp(7);
        System.out.println("라디오: " + radio.getR_Sound());
        radio.SoundDown(10);
        System.out.println("라디오: " + radio.getR_Sound());

        tv.SoundUp(10);
        tv.SoundDown(20);
    }
}
