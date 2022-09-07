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
}
