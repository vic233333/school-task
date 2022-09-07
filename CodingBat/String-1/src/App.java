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
}
