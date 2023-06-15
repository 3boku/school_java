package exam_practice;

public class BookMain {
    public static void main(String[] args) {

        System.out.println(Book.getLibary()+"의 현재 도서는 "+Book.getBookCnt()+"권 입니다.");

        System.out.println("--------------------------------------------------------");

        Book b1 = new Book();
        b1.setNo(100);
        b1.setName("노르웨이의 숲");
        b1.setCount(10);

        Book b2 = new Book(101, "이방인");
        b2.setCount(5);

        Book b3 = new Book(102, "인간실격", 15);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();

        System.out.println("--------------------------------------------------------");
        System.out.println(Book.getLibary()+"의 현재 도서는 "+Book.getBookCnt()+"권 입니다.");
        System.out.println("--------------------------------------------------------");

        b1.borrowBook(15);
        b2.returnBook(2);
        b1.borrowBook(5);
        b3.borrowBook(10);
        b3.returnBook(5);

        System.out.println("--------------------------------------------------------");

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
    }
}
