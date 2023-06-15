package exam_practice;

public class Book2 {
    String title;
    String writer;
    void printBook() {
        System.out.println(" * 도서명: "+title+" 작가: "+writer);
    }
}

class Cartoon extends Book2{
    boolean webtoon;

    @Override
    void printBook() {
        super.printBook();
        if(webtoon){
            System.out.println("이 만화는 웹툰 입니다.");
        }
        else{
            System.out.println("이 만화는 웹툰이 아닙니다.");
        }
    }
}

class Major extends Book2{
    String subject;

    @Override
    void printBook() {
        super.printBook();
        System.out.println("전공 분야는 "+subject+"입니다.");
    }
}

class BookMain2{
    public static void main(String[] args) {
        Cartoon c1 = new Cartoon();
        Major m1 = new Major();

        c1.title = "오등분의 신부";
        c1.writer = "하루바 네기";
        c1.webtoon = true;

        m1.title = "유지보수 어렵게 코드 짜는 법";
        m1.writer = "외국인";
        m1.subject = "창체";

        c1.printBook();
        m1.printBook();
    }
}
