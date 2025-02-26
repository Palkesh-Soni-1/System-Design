//open close Principle
//open for extension but close for modification

//PS
public class GradeClass {
    public static void main(String[] args) {
        Grade g1 = new Grade(495, 5);
        g1.getScore();
        g1.getNumSubjects();
        TenGrade t1 = new TenGrade();
        System.out.println("Ten Grade: "+t1.calculateGrade(g1));
        Percentage r1 = new Percentage(); 
        System.out.println("Percentage: "+r1.calculateGrade(g1));
    }
}

//grade class
class Grade{
    float score;
    int numSubjects;
    public Grade(float score, int numSubjects)
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
    public float calculateGrade(Grade g);
}

//class for calculating grade in ten grade
class TenGrade implements InnergradeClass{
    public float calculateGrade(Grade g)
    {
        float score =  g.getScore();
        int numSubjects= g.getNumSubjects();
        float ans = (score/numSubjects)/10;
        return ans;
    }
}


//class for calculating grade in percentage
class Percentage implements InnergradeClass{
    public float calculateGrade(Grade g)
    {
        float score =  g.getScore();
        int numSubjects= g.getNumSubjects();
        float ans = (score/numSubjects);
        return ans;
    }
}


