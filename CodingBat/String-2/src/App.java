public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public String doubleChar(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans += str.substring(i, i + 1);
            ans += str.substring(i, i + 1);
        }
        return ans;
    }

    /**
     * countHi method 1:
     * <p>
     * Jumping index:
     * Use k to store the last "hi",
     * until next "hi" do not exist
     */
    public int countHi(String str) {
        int k = 0;
        int sum = 0;
        while (str.indexOf("hi", k) != -1) {
            sum++;
            k = str.indexOf("hi", k) + 1;
        }
        return sum;
    }

    /**
     * countHi method 2:
     * <p>
     * Jumping index:
     * Using indexOf() with a return of -1 when not found,
     * avoids redundant searches.
     */
    public int countHi2(String str) {
        int sum = 0;
        int k = str.indexOf("hi");
        while (k != -1) {
            sum++;
            k = str.indexOf("hi", k + 1);
        }
        return sum;
    }

    /**
     * countHi method 3：
     * <p>
     * Traverse
     */
    public int countHi3(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    /**
     * catDog method 1:
     * <p>
     * Use break and endless loop
     * <p>
     * NOT RECOMMENDED: break and endless loop DO NOT occur in AP CSA
     */
    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        int k = 0;
        for (; ; ) {
            k = str.indexOf("cat", k);
            if (k != -1) {
                countCat++;
                k++;
            } else {
                break;
            }
        }
        k = 0;
        for (; ; ) {
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

    /**
     * catDog method 2:
     * <p>
     * Find "cat" and "dog" in one loop
     */
    public boolean catDog2(String str) {
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

    /**
     * countCode method1:
     * <p>
     * Use break and endless loop
     * <p>
     * NOT RECOMMENDED: break and endless loop DO NOT occur in AP CSA
     */
    public int countCode(String str) {
        int sum = 0;
        int k = 0;
        for (; ; ) {
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

    /**
     * countCode method 2:
     * <p>
     * Find "co" and "e" that are one index apart
     */
    public int countCode2(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") &&
                    str.substring(i + 3, i + 4).equals("e")) {
                count++;
            }
        }
        return count;
    }

    /**
     * endOther method 1:
     * <p>
     * Search after judging the length
     */
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

    /**
     * endOther method 2:
     * <p>
     * Find before judging the length
     */
    public boolean endOther2(String a, String b) {
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

        /* method 2.1:
           Use indexOf()*/
        return maxn.indexOf(minn, maxn.length() - minn.length()) != -1;

        /* method 2.2:
           Use substring() and equals*/
//        return maxn.substring(maxn.length() - minn.length()).equals(minn);

        /* method 2.3:
           Use double indexOf()*/
//        return a.indexOf(b, a.length() - b.length()) != -1
//                || b.indexOf(a, b.length() - a.length()) != -1;
    }

    /**
     * xyzThere method 1:
     * <p>
     * Use while loop and jumping index
     */
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

    /**
     * xyzThere method 2:
     * <p>
     * Use one loop to find required "xyz"
     */
    public boolean xyzThere2(String str) {
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

    /**
     * xyzThere method 3:
     * <p>
     * Add one space at the start to avoid repeat "." judge
     */
    public boolean xyzThere3(String str) {
        str = " " + str;
        for (int i = 0; i < str.length() - 3; i++) {
            if (!str.substring(i, i + 1).equals(".") &&
                    str.substring(i + 1, i + 4).equals("xyz")) {
                return true;
            }
        }
        return false;
    }

    /**
     * bobThere method 1:
     * <p>
     * Always judge whether next possible position is "b"
     */
    public boolean bobThere(String str) {
        boolean flag = false;
        int index = 0;
        while (str.indexOf("b", index) != -1) {
            index = str.indexOf("b", index);
            if (index + 2 == str.indexOf("b", index + 2)) {
                flag = true;
            }
            index += 3;
        }
        return flag;
    }

    /**
     * bobThere method 2:
     * <p>
     * Find two required "b" in one loop
     */
    public boolean bobThere2(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("b") &&
                    str.substring(i + 2, i + 3).equals("b")) {
                return true;
            }
        }
        return false;
    }

    /**
     * xyBalance method 1:
     * <p>
     * Use flag
     */
    public boolean xyBalance(String str) {
        boolean flagX = false;
        boolean flagY = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.subSequence(i, i + 1).equals("y")) {
                flagY = true;
            } else if (str.subSequence(i, i + 1).equals("x")) {
                flagX = true;
            }
            if (!flagY && flagX) {
                return false;
            }
        }
        return true;
    }

    /**
     * xyBalance method 2:
     * <p>
     * Direct return
     */
    public boolean xyBalance2(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("x") &&
                    str.indexOf("y", i) == -1) {
                return false;
            }
        }
        return true;
    }

    public String mixString(String a, String b) {
        String ans = "";
        int i;
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

    /**
     * repeatEnd method 1:
     * <p>
     * Normal way
     */
    public String repeatEnd(String str, int n) {
        String ans = new String("");
        for (int i = 0; i < n; i++) {
            ans += str.substring(str.length() - n);
        }
        return ans;
    }

    /**
     * repeatEnd method 2:
     * <p>
     * Use temp String to avoid repeating substring()
     */
    public String repeatEnd2(String str, int n) {
        String ans = new String("");
        String temp = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            ans += temp;
        }
        return ans;
    }

    /**
     * repeatFront method 1:
     * <p>
     * Control with one variable
     */
    public String repeatFront(String str, int n) {
        String ans = new String("");
        for (int i = n; i > 0; i--) {
            ans += str.substring(0, i);
        }
        return ans;
    }

    /**
     * repeatFront method 2:
     * <p>
     * Control with one variable
     */
    public String repeatFront2(String str, int n) {
        String ans = new String("");
        for (int i = 0, count = n; i < n; i++, count--) {
            ans += str.substring(0, count);
        }
        return ans;
    }

    /**
     * repeatSeparator method 1:
     * <p>
     * Judge outside the loop
     */
    public String repeatSeparator(String word, String sep, int count) {
        String ans = new String("");
        for (int i = 0; i < count - 1; i++) {
            ans += word + sep;
        }
        if (count > 0) {
            ans += word;
        }
        return ans;
    }

    /**
     * repeatSeparator method 2：
     * <p>
     * Judge inside the loop
     * <p>
     * More versatile solution
     */
    public String repeatSeparator2(String word, String sep, int count) {
        String ans = new String("");
        for (int i = 0; i < count; i++) {
            ans += word;
            if (i < count - 1) {
                ans += sep;
            }
        }
        return ans;
    }

    public boolean prefixAgain(String str, int n) {
        if (str.indexOf(str.substring(0, n), n) != -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * xyzMiddle method 1:
     * <p>
     * Use Math.abs()
     * <p>
     * left side length of "xyz" - right side length of "xyz" <= 1
     */
    public boolean xyzMiddle(String str) {
        int k = str.indexOf("xyz"); // 寻找xyz第一次出现的位置
        while (k != -1) { // 如果找到了xyz就进行循环
            /* str.length() - k 表示xyz和左侧字符的长度
               k + 3 表示xyz和右侧字符的长度*/
            if (Math.abs((str.length() - k) - (k + 3)) <= 1) {
                return true;
            }
            // 跳指正，寻找下一个xyz
            k = str.indexOf("xyz", k + 1);
        }
        return false;
    }

    /**
     * xyzMiddle method 2:
     * <p>
     * Find whether the string in the middle is "xyz"
     */
    public boolean xyzMiddle2(String str) {
        if (str.length() < 3)
            return false;

        int start1 = str.length() / 2 - 2;
        int start2 = str.length() / 2 - 1;

        if (str.length() % 2 == 0) {
            return str.substring(start1, start1 + 3).equals("xyz") ||
                    str.substring(start2, start2 + 3).equals("xyz");
        }

        return str.substring(start2, start2 + 3).equals("xyz");
    }

    public String getSandwich(String str) {
        int first = -1; // 第一片面包的位置
        int last = -1; // 最后一片面包的位置
        int k = str.indexOf("bread");
        /*  跳过bread
            这边+5是因为bread有5个字
            这样可以把指针挪到bread后面
            才能够找到bread后面夹的内容
            如果不+5
            那么后面找到的内容会包含第一个bread*/
        first = k + 5;
        while (k != -1) {
            /*  把这一次找到的bread的位置赋给last
                保证last存的是上一次查找的bread的位置
                因为现在指针已经在bread的b上
                已经是包含内容的末尾
                所以不用进行操作*/
            last = k;
            /*  接下来跳指针更新k
                如果刚刚没有把k赋值给last
                那么bread的位置就丢失了
                循环的结束条件是k==-1
                所以退出循环的时候
                k一定会等于-1
                所以一定需要把值保存到last
                不然后面无法找到上一次循环时k的值*/
            k = str.indexOf("bread", k + 5);
        }
        // 最后一片面包的位置一定会在第一个后面
        if (last > first) {
            return str.substring(first, last);
        }
        return "";
    }

    public boolean sameStarChar(String str) {
        int k = str.indexOf("*");
        while (k != -1) {
            if (k > 0 &&
                    k < str.length() - 1 &&
                    !str.substring(k - 1, k).equals(str.substring(k + 1, k + 2))) {
                return false;
            }
            k = str.indexOf("*", k + 1);
        }
        return true;
    }

    public String oneTwo(String str) {
        String res = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            res = res + str.substring(i + 1, i + 3) + str.substring(i, i + 1);
        }
        return res;
    }

    /**
     * zipZap method 1:
     * <p>
     * Use for loop and accumulation method
     * <p>
     * No need to master
     */
    public String zipZap(String str) {
        int startZip = 0;
        int endZip = 0;
        String ans = new String("");
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("z") &&
                    str.substring(i + 2, i + 3).equals("p")) {
                startZip = i;
                ans += str.substring(endZip, startZip + 1);
                endZip = i + 2;
            }
        }
        ans += str.substring(endZip);
        return ans;
    }

    /**
     * zipZAP method 2:
     * <p>
     * Use for loop, i++ to skip zip and update String
     * <p>
     * No need to master
     */
    public String zipZap2(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("z") &&
                    str.substring(i + 2, i + 3).equals("p")) {
                str = str.substring(0, i + 1) + str.substring(i + 2);
                i++;
            }
        }
        return str;
    }

    /**
     * zipZap method 3:
     * <p>
     * Use while loop and update String
     * to find z*p combination
     */
    public String zipZap3(String str) {
        int k = str.indexOf("z");
        while (k != -1) {
            if (k + 2 < str.length() &&
                    str.substring(k + 2, k + 3).equals("p")) {
                str = str.substring(0, k + 1) + str.substring(k + 2);// update
            }
            k = str.indexOf("z", k + 1);
        }
        return str;
    }

    /**
     * zipZap method 4:
     * <p>
     * Use while loop and update String
     * <p>
     * Determine whether the distance between this "z" and the next "p" is 2
     */
    public String zipZap4(String str) {
        int k = str.indexOf("z");
        while (k != -1) {
            if (str.indexOf("p", k + 2) == k + 2) {
                str = str.substring(0, k + 1) + str.substring(k + 2);// update
            }
            k = str.indexOf("z", k + 1);
        }
        return str;
    }

    /**
     * starOut method 1:
     * <p>
     * Use one loop
     */
    public String starOut(String str) {
        str = " " + str + " ";
        int k = str.indexOf("*");
        while (k != -1) {
            if (str.indexOf("*", k + 1) == k + 1) {
                str = str.substring(0, k + 1) + str.substring(k + 2);// delete next *
            } else {// * + not a *
                str = str.substring(0, k - 1) + str.substring(k + 2);
            }
            k = str.indexOf("*");
        }
        return str.trim();// 删除前后多余空格
    }

    /**
     * starOut method 2:
     * <p>
     * Use two loop
     */
    public String starOut2(String str) {
        str = " " + str + " ";
        int i = str.indexOf("*");
        while (i != -1) {
            int j = i + 1;
            while (j < str.length() &&
                    str.substring(j, j + 1).equals("*")) {
                j++;
            }
            str = str.substring(0, i - 1) + str.substring(j + 1);
            i = str.indexOf("*");
        }
        return str.trim();
    }

    public String plusOut(String str, String word) {
        String res = new String("");
        for (int i = 0; i < str.length(); i++) {
            res += "+";
        }
        int i = str.indexOf(word);
        while (i != -1) {
            res = res.substring(0, i) + word + res.substring(i + word.length());
            i = str.indexOf(word, i + word.length());
        }
        return res;
    }

    /**
     * wordEnd method 1:
     * <p>
     * Use pure substring()
     */
    public String wordEnds(String str, String word) {
        String ans = "";
        str = " " + str + " ";
        for (int i = 0; i < str.length() - word.length() - 1; i++) {
            if (str.substring(i + 1, i + 1 + word.length()).equals(word)) {
                ans += str.substring(i, i + 1);
                ans += str.substring(i + 1 + word.length(), i + 1 + word.length() + 1);
            }
        }
        return ans.trim();
    }

    /**
     * wordEnd method 2:
     * <p>
     * Use indexOf()
     */
    public String wordEnds2(String str, String word) {
        String ans = "";
        str = " " + str + " ";
        int k = str.indexOf(word);
        while (k != -1) {
            ans += str.substring(k - 1, k);
            ans += str.substring(k + word.length(), k + word.length() + 1);
            k = str.indexOf(word, k + word.length());
        }
        return ans.trim();
    }
}