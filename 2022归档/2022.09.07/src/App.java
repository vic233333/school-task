public class App {
    public static void main(String[] args) throws Exception {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        int len1 = s1.length();
        boolean equal = s1.equals(s2);
        s2 = s2.substring(2);
        System.out.println(s2);
        int p = s1.indexOf("L", 3);
    }
}
