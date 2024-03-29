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
        int end;
        if (str.length() < 2) {
            end = str.length();
        } else {
            end = 2;
        }
        return str.substring(0, end);
    }

    public String firstHalf(String str) {
        int end = str.length() / 2;
        return str.substring(0, end);
    }

    public String withoutEnd(String str) {
        int end = 0;
        int first = 0;
        if (str.length() >= 2) {
            end = str.length() - 1;
            first = 1;
        } else {
            end = str.length();
            first = 0;
        }
        return str.substring(first, end);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {// switch two String
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
        String last = "";
        if (str.length() > 2) {
            last = str.substring(2);
        }
        return last + first;
    }

    public String right2(String str) {
        String first = str.substring(0, str.length() - 2);
        String last = str.substring(str.length() - 2);
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
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }


    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        int first = 0;
        if (str.length() >= 2) {
            first = str.length() - 2;
        }
        String ret = str.substring(first);
        return ret.equals("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n)
                + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index + 2 > str.length()) {
            index = 0;
        }
        if (index < 0) {
            index = 0;
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        return str.indexOf("b") == 0 && str.indexOf("a") == 1 && str.indexOf("d") == 2 ||
                str.indexOf("b") == 1 && str.indexOf("a") == 2 && str.indexOf("d") == 3;
    }

    public String atFirst(String str) {
        int add = 0;
        String addString = "";
        int end = Math.min(str.length(), 2);
        while (add + str.length() < 2) {
            addString = addString + "@";
            add++;
        }
        return str.substring(0, end) + addString;
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0) {
            a += "@";
        }
        if (b.length() == 0) {
            b += "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            return a + b;
        if (a.substring(a.length() - 1).equals(b.substring(0, 1)))
            return a + b.substring(1);
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.substring(0, str.length() - 2) + str.substring(str.length() - 1)
                    + str.substring(str.length() - 2, str.length() - 1);
        }
    }

    public String seeColor(String str) {
        if (str.indexOf("red") == 0) {
            return "red";
        } else if (str.indexOf("blue") == 0) {
            return "blue";
        } else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        } else if (str.length() == 2) {
            return true;
        } else {
            String strFirst = str.substring(0, 1);
            String strTwoThree = str.substring(1, 2);
            String strLastThreeTwo = str.substring(str.length() - 2, str.length() - 1);
            String strLast = str.substring(str.length() - 1);
            return strFirst.equals(strLastThreeTwo) && strTwoThree.equals(strLast)
                    || strTwoThree.equals(strLastThreeTwo) && strFirst.equals(strLast);
        }
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        } else if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        } else {
            return a.substring(a.length() - b.length()) + b;
        }
    }

    public String extraFront(String str) {
        int strEnd = Math.min(str.length(), 2);
        return str.substring(0, strEnd) + str.substring(0, strEnd) + str.substring(0, strEnd);
    }

    public String without2(String str) {
        if (str.length() == 2) {
            return "";
        } else if (str.length() < 2) {
            return str;
        } else {
            String start = str.substring(0, 2);
            String end = str.substring(str.length() - 2);
            if (start.equals(end)) {
                return str.substring(2);
            } else {
                return str;
            }
        }
    }

    public String deFront(String str) {
        String sum = str.substring(2);
        if (str.substring(1, 2).equals("b")) {
            sum = "b" + sum;
        }
        if (str.substring(0, 1).equals("a")) {
            sum = "a" + sum;
        }
        return sum;
    }

    /**
     * startWord method 1:
     * <p>
     * Normal way
     */
    public String startWord(String str, String word) {
        if (str.length() == 0) {
            return "";
        }
        if (word.length() == 1) {
            return str.substring(0, 1);
        }
        String pairWord = word.substring(1);
        if (str.indexOf(pairWord) == -1) {
            return "";
        }
        return str.substring(str.indexOf(pairWord) - 1, str.indexOf(pairWord) + word.length() - 1);
    }

    /**
     * startWord method 2:
     * <p>
     * More compact way
     */
    public String startWord2(String str, String word) {
        if (str.length() > 0 && (str.substring(1).indexOf(word.substring(1)) == 0)) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }

    public String withoutX(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            int begin = 0;
            int end = str.length();
            if (str.substring(begin, begin + 1).equals("x")) {
                if (begin + 1 > end - 1) {
                    begin = end;
                } else {
                    begin += 1;
                }
            }
            if (str.substring(end - 1).equals("x")) {
                if (end - 1 < begin + 1) {
                    end = begin;
                } else {
                    end -= 1;
                }
            }
            return str.substring(begin, end);
        }
    }

    /**
     * withOutX2 method 1:
     * <p>
     * Use charAt() method
     * <p>
     * NOT RECOMMEND: charAt() DO NOT occur in AP CSA
     */
    public String withoutX2(String str) {
        if (str.length() == 0 || str.length() < 2 && str.charAt(0) == 'x')
            return "";
        else if (str.charAt(0) == 'x' && str.charAt(1) == 'x')
            return str.substring(2);
        else if (str.charAt(0) == 'x')
            return str.substring(1);
        else if (str.charAt(1) == 'x')
            return str.substring(0, 1) + str.substring(2);
        else
            return str;
    }

    /**
     * withOutX2 method 2:
     * <p>
     * Normal way
     */
    public String withoutX22(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals("xx")) {
            return str.substring(2);
        }
        if (str.length() >= 2 && str.substring(1, 2).equals("x")) {
            return str.substring(0, 1) + str.substring(2);
        }
        if (str.length() >= 1 && str.substring(0, 1).equals("x")) {
            return str.substring(1);
        } else {
            return str.substring(0, str.length());
        }
    }

    /**
     * withOutX2 method 3:
     * <p>
     * More compact way
     */
    public String withoutX23(String str) {
        if (str.indexOf("x", 1) == 1) {
            str = str.substring(0, 1) + str.substring(2);
        }
        if (str.indexOf("x") == 0) {
            str = str.substring(1);
        }
        return str;
    }
}