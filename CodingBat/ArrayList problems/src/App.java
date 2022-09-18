import java.util.ArrayList;//引入ArrayList库
import java.util.Arrays;
import java.util.List;

import org.w3c.dom.stylesheets.LinkStyle;

public class App {
    public int listSumEvenIndexes(List<Integer> numsList) {
        int sum = 0;
        for (int i = 0; i < numsList.size(); i += 2) {
            sum += numsList.get(i);
        }
        return sum;
    }

    public int listEvenCount(List<Integer> numsList) {
        int sum = 0;
        for (int i = 0; i < numsList.size(); i++) {
            if (numsList.get(i) % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }

    public int listFairlyOddNums(List<Integer> numsList) {
        int sum = 0;
        for (int i = 0; i < numsList.size(); i++) {
            if (i % 2 == 0 && numsList.get(i) % 2 == 1
                    || i % 2 == 1 && numsList.get(i) % 2 == 0) {
                sum += numsList.get(i);
            }
        }
        return sum;
    }

    public int listYucky7(List<Integer> numsList) {
        int sum = 0;
        for (int i = 0; i < numsList.size(); i++) {
            if (numsList.get(i) == 7
                    || i - 1 >= 0 && numsList.get(i - 1) == 7) {
                i++;
                continue;
            }
            sum += numsList.get(i);
            System.out.println(numsList.get(i) + " ");
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();
        numList = Arrays.asList(7, 4, 2, 3, 6, 7, 7, 8, 5);
        System.out.println(listYucky7);
    }
}
