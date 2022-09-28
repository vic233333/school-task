import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public String doubleChar(String str) {
        String ans = new String();
        for (int i = 0; i < str.length(); i++) {
            ans += str.substring(i, i + 1);
            ans += str.substring(i, i + 1);
        }
        return ans;
    }

    //countHi method 1
    public int countHi(String str) {
        int k = 0;
        int sum = 0;
        while (str.indexOf("hi", k) != -1) {
            sum++;
            k = str.indexOf("hi", k) + 1;
        }
        return sum;
    }

    //countHi method 2
    // public int countHi(String str) {
    //     int count = 0;
    //     for(int i = 0; i < str.length() - 1; i++) {
    //         if (str.substring(i, i + 2).equals("hi")) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        int k = 0;
        for (;;) {
            k = str.indexOf("cat", k);
            if (k != -1) {
                countCat++;
                k++;
            } else {
                break;
            }
        }
        k = 0;
        for (;;) {
            k = str.indexOf("dog", k);
            if (k != -1) {
                countDog++;
                k++;
            } else {
                break;
            }
        }
        return countDog == countCat;
    }

    public int countCode(String str) {
        int sum = 0;
        int k = 0;
        for (;;) {
            k = str.indexOf("co", k);
            if (k == -1) {
                break;
            } else if (k <= str.length() - 4 && str.charAt(k + 3) == 'e') {
                sum++;
                k++;
            } else {
                k++;
            }
        }
        return sum;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        int aLen = a.length();

        b = b.toLowerCase();
        int bLen = b.length();

        if (aLen < bLen) {
            String temp = b.substring(bLen - aLen, bLen);
            if (temp.compareTo(a) == 0)
                return true;
            else
                return false;

        } else {
            String temp = a.substring(aLen - bLen, aLen);
            if (temp.compareTo(b) == 0)
                return true;
            else
                return false;
        }
    }


}