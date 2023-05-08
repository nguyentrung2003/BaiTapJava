

import java.util.ArrayList;
import java.util.Iterator;

public class slide18 {
    public static void main(String[] args) {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.7f);
        arrListFloat.add(7.7f);
        arrListFloat.add(8.7f);
        arrListFloat.add(9.7f);

        Iterator<Float> iterator = arrListFloat.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }

    }

}
