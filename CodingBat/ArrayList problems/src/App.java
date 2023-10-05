import java.util.ArrayList;//引入ArrayList库
import java.util.Arrays;
import java.util.List;

import org.w3c.dom.stylesheets.LinkStyle;

public class App {
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

    public int listFairlyOddNums(List<Integer> numsList) {
        int sum = 0;
        for (int i = 0; i < numsList.size(); i++) {
            if (i % 2 == 0 && numsList.get(i) % 2 == 1
                    || i % 2 == 1 && numsList.get(i) % 2 == 0) {
                sum += numsList.get(i);
            }
        }
        return sum;
    }

    public int listYucky7(List<Integer> numsList) {
        int sum = 0;
        for (int i = 0; i < numsList.size(); i++) {
            if (numsList.get(i) == 7
                    || i - 1 >= 0 && numsList.get(i - 1) == 7) {
                i++;
                continue;
            }
            sum += numsList.get(i);
            System.out.println(numsList.get(i) + " ");
        }
        return sum;
    }

    public List<String> listCatty(List<String> animalsList) {
        List<String> ret = new ArrayList<String>();
        //go through the list
        for (int i = 0; i < animalsList.size(); i++) {
            //go through the string
            //因为我们遍历的是第一个字母，也就是C，所以只要减去两位，也就是at就可以了
            for (int j = 0; j < animalsList.get(i).length() - 2; j++) {
                //如果列表中的第i位字符串的第j~j+3位等于"cat"
                if (animalsList.get(i).substring(j, j + 3 + 1).equals("cat")) {
                    ret.add(animalsList.get(i));
                }
                //same as above
                else if (animalsList.get(i).substring(j, j + 3 + 1).equals("Cat")) {
                    ret.add(animalsList.get(i));
                }
            }
        }
        return ret;
    }

    public boolean listWinRace(List<Integer> votesList) {
        int sum=0;
        //go through the list
        for (int i = 0; i < votesList.size(); i++) {
            sum=sum+votesList.get(i);
        }
        //judge who wins
        if(sum<0){
            return false;
        }
        else{
            return true;
        }
    }

    public List<String> listScaredyCat(List<String> petsList) {
        //go through the list
        //因为狗在前的时候后面猫会吓跑，所以检索狗的位置。后面需要留一个猫的位置，所以减1
        for (int i = 0; i < petsList.size()-1; i++) {
            //如果第i个是狗，后面一个是猫
            if(petsList.get(i).equals("dog")&&petsList.get(i+1).equals("cat")){
                //猫跑走
                petsList.remove(i+1);
                //此处结束了一个判断，但是查看第三个样例：
                //listScaredyCat(["cat", "dog", "cat", "cat", "snake"]) → ["cat", "dog", "snake"]
                //猫会继续和狗反应，直到全部吓跑。如果此时正常结束，则不会判断下一只猫有没有被吓跑，所以需要-1，让程序再检查一遍
                i=i-1;
            }
        }
        return petsList;
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();
        numList = Arrays.asList(7, 4, 2, 3, 6, 7, 7, 8, 5);
        System.out.println(listYucky7);
    }
}
