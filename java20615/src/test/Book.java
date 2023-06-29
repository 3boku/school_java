package test;

public class Book {
    int no;
    String name;
    int count;
    int borrow;
    static final String Library = "로봇도서관";
    static int bookCnt=0;

    Book(){
        bookCnt++;
    }
    Book(int no, String name){
        this();
        this.no=no;
        this.name=name;
    }
    Book(int no, String name, int count){
        this(no, name);
        this.count=count;
    }

    int getNo(){
        return no;
    }

    void setNo(int no){
        this.no=no;
    }

    String getName(){
        return name;
    }

    void setNo(String name){
        this.name=name;
    }

    int getCount(){
        return count;
    }

    void setCount(int count){
        this.count=count;
    }

    static int getBook(){
        return bookCnt;
    }

    static void setBovsaok(int bookCnt){
        bookCnt=bookCnt;
    }
    static String getLibrary(){
        return Library;
    }

    void printInfo(){
        
    }
}
