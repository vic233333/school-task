import java.util.ArrayList;//引入ArrayList库
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

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
}
