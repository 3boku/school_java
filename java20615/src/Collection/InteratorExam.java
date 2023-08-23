package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorExam {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("유재석");
        list.add("ㄱㄱㄱ");
        list.add("지석진");
        list.add("ㄱㄱㄱ");
        list.add("김종국");
        list.add("ㄱㄱㄱ");
        list.add("송지효");
        list.add("ㄱㄱㄱ");
        list.add("하하");

        System.out.println(list);

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("--------------------------------------------------------");

        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------------------------------------------------------");
        it = list.iterator();
        while (it.hasNext()) {
            String s=it.next();
            if(s.contains("ㄱㄱㄱ")){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
