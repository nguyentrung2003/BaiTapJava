
import java.util.ArrayList;
import java.util.Iterator;

public class slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrListFloat = new ArrayList<>();
        arrListFloat.add('a');
        arrListFloat.add('b');
        arrListFloat.add('c');
        arrListFloat.add('d');

        Iterator<Character> iterator = arrListFloat.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }

    }

}
