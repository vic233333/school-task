
public class UnderGra extends Student
{public UnderGra(String n,String g,int[] s){
        //super(n,g,s);
        super();
        setName(n);
        setGrade(g);
        setScore(s);

    }
    //overriding
    public void computeGra(){
        super.computeGra();
        if(getAve()>=90){
            setGrade("good");
        }
    }

}
