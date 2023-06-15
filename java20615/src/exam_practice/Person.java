package exam_practice;

public class Person {
    String name;
    int age;

    void printInfo(){
        System.out.println(name+"의 나이는 "+age+"살 입니다.");
    }
}

class Student extends Person {
    boolean online;

    @Override
    void printInfo(){
        super.printInfo();
        if(online){
            System.out.println(name+"은 학생이며 현재 온라 수업 중입니다.");
        }
        else{
            System.out.println(name+"은 학생이며 현재 등교 수업 중입니다..");
        }
    }
}

class SoccerPlayer extends Person{
    String teamName;

    @Override
    void printInfo(){
        super.printInfo();
        System.out.println(name+"는 "+teamName+"팀 축구선수 입니다.");
    }
}

class PersonMain{
    public static void main(String[] args) {
        Student s1 = new Student();
        SoccerPlayer s2 = new SoccerPlayer();

        s1.name = "염미정";
        s1.age = 23;
        s1.online = true;
        s2.name = "이강인";
        s2.age = 25;
        s2.teamName = "PSG";

        s1.printInfo();
        s2.printInfo();
    }
}