//open close Principle
//open for extension but close for modification

//PS
public class gradeClass {
    public static void main(String[] args) {
        grade g1 = new grade(495, 5);
        g1.getScore();
        g1.getNumSubjects();
        TenGrade t1 = new TenGrade();
        System.out.println("Ten Grade: "+t1.calculateGrade(g1));
        Percentage r1 = new Percentage(); 
        System.out.println("Percentage: "+r1.calculateGrade(g1));
    }
}

//grade class
class grade{
    float score;
    int numSubjects;
    public grade(float score, int numSubjects)
    {
        this.score=score;
        this.numSubjects = numSubjects;
    }
    public float getScore()
    {
        return score;
    }
    public int getNumSubjects()
    {
        return numSubjects;
    }
}

//interface for grade calculation
interface InnergradeClass {
    public float calculateGrade(grade g);
}

//class for calculating grade in ten grade
class TenGrade implements InnergradeClass{
    public float calculateGrade(grade g)
    {
        float score =  g.getScore();
        int numSubjects= g.getNumSubjects();
        float ans = (score/numSubjects)/10;
        return ans;
    }
}


//class for calculating grade in percentage
class Percentage implements InnergradeClass{
    public float calculateGrade(grade g)
    {
        float score =  g.getScore();
        int numSubjects= g.getNumSubjects();
        float ans = (score/numSubjects);
        return ans;
    }
}


