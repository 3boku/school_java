package j0608;

public class Animal {
    Animal(){
        System.out.println("동물 생성");
    }
    
}

class Dog extends Animal {
    Dog(){
        System.out.println("강아지생성");
    }
}

class Cat extends Animal {
    Cat(){
        System.out.println("고양이 생성");
    }
    
}

class AnimalMain{
    public static void main(String[] args) {
        System.out.println("Animal main");

        Dog d = new Dog();
        Animal a = new Dog();
        Animal b = new Cat();
        Dog c = (Dog)new Animal();
    }
}