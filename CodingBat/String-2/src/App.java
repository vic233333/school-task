/*一般来说一道题有多个method的话
*第一个method就是自己写的。
*很符合我自己的逻辑，
*但是有时候方法会比较猪鼻.
*这里面对于函数定义的报错是正常的
*因为重复定义了一遍
*忽视即可:)
*注释掉的话自动格式化会
*把代码缩到一起
*非常难看:(
*/
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
    // 我自己的想法：用k来控制寻找开始的点
    // 然后寻找下一个hi直到找不到为止
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
    // 老师一轮循环下来找hi
    // 感觉效率更差一些
    // 不过老老实实的
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    // catDog method 1
    // 这玩意因为用break被老师吐槽了嘤嘤嘤
    // 就当仅供娱乐的代码好了
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
    // 老师的做法
    // 一轮循环找 cat 和 dog
    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        return countCat == countDog;
    }

    // countCode method1
    // 用了break，图一乐就行
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

    // countCode method 2
    // 老师的做法
    // 找 co 和距离一格的 e
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") &&
                    str.substring(i + 3, i + 4).equals("e")) {
                count++;
            }
        }
        return count;
    }

    // endOther method 1
    // 判断长短后找
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
    // 先给不定指针 maxn 和 minn 赋值
    // 然后再找
    public boolean endOther(String a, String b) {
        String maxn, minn;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length()) {
            maxn = a.toLowerCase();
            minn = b.toLowerCase();
        } else {
            maxn = b.toLowerCase();
            minn = a.toLowerCase();
        }

        // method 2 1
        // 使用indexOf
        return maxn.indexOf(minn, maxn.length() - minn.length()) != -1;

        // method 2 2
        // 使用substring和equals
        return maxn.substring(maxn.length() - minn.length()).equals(minn);

        // method 2 3
        // 使用两重indexOf
        // 此处不需要做大小判断了
        return a.indexOf(b, a.length() - b.length()) != -1
                || b.indexOf(a, b.length() - a.length()) != -1;
    }

    // xyzThere method 1
    // 我的做法
    // 用while和跳指针
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

    // xyzThere method 2
    // 老师的做法
    // 一个循环找符合条件的xyz
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (i == 0 &&
                    str.substring(i, i + 3).equals("xyz") ||
                    i < str.length() - 3 &&
                            !str.substring(i, i + 1).equals(".") &&
                            str.substring(i + 1, i + 4).equals("xyz")) {
                return true;
            }
        }
        return false;
    }

    // bobThere method 1
    // 我自己的想法：每次都寻找下一个b
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

    // bobThere method 2
    // 老师的做法
    // 一轮循环下来找两个相距一个字母的b
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("b") &&
                    str.substring(i + 2, i + 3).equals("b")) {
                return true;
            }
        }
        return false;
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
    public boolean xyBalance(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("x") &&
                    str.indexOf("y", i) == -1) {
                return false;
            }
        }
        return true;
    }

    // mixString method 1
    // 我的做法，我觉得很好
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

    // mixString method 2
    public String mixString(String a, String b) {
        String ans = "";
        int i = 0;
        for (i = 0; i < a.length() && i < b.length(); i++) {
            ans += a.substring(i, i + 1) + b.substring(i, i + 1);
        }
        if (i < a.length()) {
            ans += a.substring(i);
        } else {
            ans += b.substring(i);
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