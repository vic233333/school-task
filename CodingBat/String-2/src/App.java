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

    // countHi method 1
    public int countHi(String str) {
        int k = 0;
        int sum = 0;
        while (str.indexOf("hi", k) != -1) {
            sum++;
            k = str.indexOf("hi", k) + 1;
        }
        return sum;
    }

    // countHi method 2
    // public int countHi(String str) {
    // int count = 0;
    // for(int i = 0; i < str.length() - 1; i++) {
    // if (str.substring(i, i + 2).equals("hi")) {
    // count++;
    // }
    // }
    // return count;
    // }

    // catDog method 1
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

    // catDog method 2
    // public boolean catDog(String str) {
    // int countCat = 0;
    // int countDog = 0;
    // for (int i = 0; i < str.length() - 2; i++) {
    // if (str.substring(i, i + 3).equals("cat")) {
    // countCat++;
    // }
    // }
    // for (int i = 0; i < str.length() - 2; i++) {
    // if (str.substring(i, i + 3).equals("dog")) {
    // countDog++;
    // }
    // }
    // return countCat == countDog;
    // }

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

    // endOther method 1
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        int aLen = a.length();

        b = b.toLowerCase();
        int bLen = b.length();

        if (aLen < bLen)
            return b.substring(bLen - aLen).equals(a);
        else
            return a.substring(aLen - bLen).equals(b);
    }

    // endOther method 2
    // public boolean endOther(String a, String b)
    // {
    // String maxn, minn;
    // a = a.toLowerCase();
    // b = b.toLowerCase();
    // if (a.length() > b.length())
    // {
    // maxn = a.toLowerCase();
    // minn = b.toLowerCase();
    // }
    // else
    // {
    // maxn = b.toLowerCase();
    // minn = a.toLowerCase();
    // }

    // //method 2 1
    // // return maxn.indexOf(minn, maxn.length() - minn.length()) != -1;

    // //method 2 2
    // // return maxn.substring(maxn.length() - minn.length()).equals(minn);

    // //method 2 3
    // return a.indexOf(b, a.length() - b.length()) != -1
    // || b.indexOf(a, b.length() - a.length()) != -1;
    // }

    public boolean xyzThere(String str) {
        boolean flag = false;
        int index = 0;
        while (str.indexOf("xyz", index) != -1) {
            index = str.indexOf("xyz", index);
            if (index == 0 || str.indexOf(".", index - 1) + 1 != index) {
                flag = true;
            }
            index++;
        }
        return flag;
    }

    public boolean bobThere(String str) {
        boolean flag = false;
        int index = 0;
        while (str.indexOf("b", index) != -1) {
            index = str.indexOf("b", index);
            if (index == str.indexOf("b", index + 2) - 2) {
                flag = true;
            }
            index += 3;
        }
        return flag;
    }

    // xyBalance method 1
    public boolean xyBalance(String str) {
        boolean flag_x = false;
        boolean flag_y = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.subSequence(i, i + 1).equals("y")) {
                flag_y = true;
            } else if (str.subSequence(i, i + 1).equals("x")) {
                flag_x = true;
            }
            if (!flag_y && flag_x) {
                return false;
            }
        }
        return true;
    }

    // xyBalance method 2
    // public boolean xyBalance(String str) {
    // for (int i = 0; i < str.length(); i++) {
    // if (str.substring(i, i + 1).equals("x") &&
    // str.indexOf("y", i) == -1) {
    // return false;
    // }
    // }
    // return true;
    // }

    public String mixString(String a, String b) {
        String minn;
        boolean flag_b_bigger;// false 表示a大. true 表示b大
        String ans = new String("");
        if (a.length() > b.length()) {
            minn = b;
            flag_b_bigger = false;
        } else {
            minn = a;
            flag_b_bigger = true;
        }
        for (int i = 0; i < minn.length(); i++) {
            ans += a.substring(i, i + 1) + b.substring(i, i + 1);
        }
        if (flag_b_bigger) {
            ans += b.substring(a.length());
        } else {
            ans += a.substring(b.length());
        }
        return ans;
    }

    public String repeatEnd(String str, int n) {
        String ans = new String("");
        for (int i = 0; i < n; i++) {
            ans += str.substring(str.length() - n);
        }
        return ans;
    }

    public String repeatFront(String str, int n) {
        String ans = new String("");
        for (int i = n; i > 0; i--) {
            ans += str.substring(0, i);
        }
        return ans;
    }
}