import java.util.ArrayList;//引入ArrayList库
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

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
        int sum = 0;
        //go through the list
        for (int i = 0; i < votesList.size(); i++) {
            sum = sum + votesList.get(i);
        }
        //judge who wins
        if (sum < 0) {
            return false;
        } else {
            return true;
        }
    }

    public List<String> listScaredyCat(List<String> petsList) {
        //go through the list
        //因为狗在前的时候后面猫会吓跑，所以检索狗的位置。后面需要留一个猫的位置，所以减1
        for (int i = 0; i < petsList.size() - 1; i++) {
            //如果第i个是狗，后面一个是猫
            if (petsList.get(i).equals("dog") && petsList.get(i + 1).equals("cat")) {
                //猫跑走
                petsList.remove(i + 1);
                //此处结束了一个判断，但是查看第三个样例：
                //listScaredyCat(["cat", "dog", "cat", "cat", "snake"]) → ["cat", "dog", "snake"]
                //猫会继续和狗反应，直到全部吓跑。如果此时正常结束，则不会判断下一只猫有没有被吓跑，所以需要-1，让程序再检查一遍
                i = i - 1;
            }
        }
        return petsList;
    }

    public boolean levelField(List<Integer> numsList) {
        //思路：求得最高值和最低值，相减来检查是否小于8
        if (numsList.size() <= 3) {
            return false;
        }
        //初始值时，最小值要尽可能大，最大值要尽可能小
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < numsList.size(); i++) {
            //find max and min
            if (numsList.get(i) < min) {
                min = numsList.get(i);
            }
            if (numsList.get(i) > max) {
                max = numsList.get(i);
            }
        }
        if (max - min > 8) {
            return false;
        }
        return true;
    }

    public int wiseGuys(List<Integer> agesList) {
        int max = 0;
        //go through the list with interval of 2
        for (int i = 0; i < agesList.size(); i = i + 2) {
            if (agesList.get(i) + agesList.get(i + 1) > max) {
                max = agesList.get(i) + agesList.get(i + 1);
            }
        }
        return max;
    }

    public String golfingBrothers(List<Integer> adamList, List<Integer> bobList, List<Integer> craigList) {
        //get sum one by one and prevent empty list
        double numAdam = 0;
        for (int i = 0; i < adamList.size(); i++) {
            numAdam = numAdam + adamList.get(i);
        }
        if (adamList.size() < 2) {
            numAdam = Double.MAX_VALUE;
        }
        double numBob = 0;
        for (int i = 0; i < bobList.size(); i++) {
            numBob = numBob + bobList.get(i);
        }
        if (bobList.size() < 2) {
            numBob = Double.MAX_VALUE;
        }
        double numCrag = 0;
        for (int i = 0; i < craigList.size(); i++) {
            numCrag = numCrag + craigList.get(i);
        }
        if (craigList.size() < 2) {
            numCrag = Double.MAX_VALUE;
        }
        //get average
        numAdam = numAdam / adamList.size();
        numBob = numBob / bobList.size();
        numCrag = numCrag / craigList.size();
        //compare
        if (numAdam < numBob && numAdam < numCrag) {
            return "adam";
        }
        if (numBob < numAdam && numBob < numCrag) {
            return "bob";
        }
        return "craig";
    }

    public boolean listFreeSoup(List<Integer> aList, List<Integer> bList) {
        //if >20
        if (aList.get(1) + bList.get(1) >= 20) {
            //if each>5
            if (aList.get(0) + aList.get(2) >= 5 && bList.get(0) + bList.get(2) >= 5) {
                return true;
            }
            return false;
        }
        return false;
    }

    public List<String> listWackyWords(List<String> wordsList) {
        List<String> ret = new ArrayList<String>();
        //empty protect
        if (wordsList.size() == 0) {
            return ret;
        }
        //get prefix and suffix
        String prefix = wordsList.get(0).substring(0, 1);
        String suffix = wordsList.get(wordsList.size() - 1).substring(wordsList.get(wordsList.size() - 1).length() - 1);
        //combine
        for (int i = 0; i < wordsList.size(); i++) {
            ret.add(prefix + wordsList.get(i) + suffix);
        }
        return ret;
    }

    public boolean listGuessAverage(List<Integer> numsList, int guess) {
        double num = 0;
        //get sum
        for (int i = 0; i < numsList.size(); i++) {
            num = num + numsList.get(i);
        }
        //convert to average
        num = num / numsList.size() * 1.0;
        //judge
        if (num * 0.95 <= guess && guess <= num * 1.05) {
            return true;
        }
        return false;
    }

    /**
     * 写到这里我真的想骂人，这里排序一点没教，教了也写不了
     * <p>
     * 以下解法不符合AP考试范围，而且这题AP也不会考
     * <p>
     * 如果硬要写的话ArrayList写不了排序，只能转换回Array再写排序
     * <p>
     * 写出来会一堆，谁爱写谁写去吧，这里各位看个思路就行了
     * <p>
     * Fuck U APCS
     */
    public List<Integer> listClassRanks(List<Integer> rankings) {
        int topTenCount=0;
        //count the top 10
        for(int i=0;i<rankings.size();i++){
            if(rankings.get(i)<=10){
                topTenCount++;
            }
        }
        //if >=2
        if (topTenCount >= 2) {
            //正序排序
            rankings.sort(Comparator.naturalOrder());
            return rankings;
        }
        //else
        //反向排序
        rankings.sort(Comparator.reverseOrder());
        return rankings;
    }

    public List<String> listBackwardChars(String str) {
        List<String> ret = new ArrayList<String>();
        //倒序遍历，str的最后一位是长度-1，第一位是0
        for(int i=str.length()-1;i>=0;i--){
            ret.add(str.substring(i,i+1));
        }
        return ret;
    }
    
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();
        numList = Arrays.asList(7, 4, 2, 3, 6, 7, 7, 8, 5);
        System.out.println(listYucky7);
    }
}
