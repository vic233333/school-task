public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        String first = out.substring(0, 2);
        String last = out.substring(2);
        return first + word + last;
    }

    public String extraEnd(String str) {
        int len = str.length();
        String sub = str.substring(len - 2);
        return sub + sub + sub;
    }

    public String firstTwo(String str) {
        int end = str.length() >= 2 ? 2 : str.length();
        return str.substring(0, end);
    }

    public String firstHalf(String str) {
        int end = str.length() / 2;
        return str.substring(0, end);
    }

    public String withoutEnd(String str) {
        int end = str.length() >= 2 ? str.length() - 1 : str.length();
        int first = str.length() >= 2 ? 1 : 0;
        return str.substring(first, end);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {// 交换两个字符串
            String temp;
            temp = a;
            a = b;
            b = temp;
        }
        return b + a + b;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        String first = str.substring(0, 2);
        String last = str.length() > 2 ? str.substring(2) : "";
        return last + first;
    }

    public String right2(String str) {
        String first = str.substring(0, str.length() - 2);
        String last = str.substring(str.length() - 2, str.length());
        return last + first;
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String withouEnd2(String str) {
        return str.length() >= 2 ? str.substring(1, str.length() - 1) : "";
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        int first = str.length() >= 2 ? str.length() - 2 : 0;
        String extra = str.substring(first);
        return extra.equals("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n)
                + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        index = index + 2 > str.length() ? 0 : index;
        index = index < 0 ? 0 : index;
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        if (str.indexOf("b") == 0 && str.indexOf("a") == 1 && str.indexOf("d") == 2 ||
                str.indexOf("b") == 1 && str.indexOf("a") == 2 && str.indexOf("d") == 3) {
            return true;
        } else
            return false;
    }

    public String atFirst(String str) {
        int add = 0;
        String addString = new String("");
        int end = str.length() >= 2 ? 2 : str.length();
        while (add + str.length() < 2) {
            addString = addString + "@";
            add++;
        }
        return str.substring(0, end) + addString;
    }

    public String lastChars(String a, String b) {
        a = a.length() != 0 ? a : a + "@";
        b = b.length() != 0 ? b : b + "@";
        return a.substring(0, 1) + b.substring(b.length() - 1, b.length());
    }

    public String conCat(String a, String b) {
        if(a.length() == 0 || b.length() == 0)
            return a + b;
              
        if(a.charAt(a.length() - 1) == b.charAt(0))
            return a + b.substring(1);

        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() <=1) {
            return str;
        }
        else
        {
            return str.substring(0, str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2, str.length()-1);
        }
    }
}
