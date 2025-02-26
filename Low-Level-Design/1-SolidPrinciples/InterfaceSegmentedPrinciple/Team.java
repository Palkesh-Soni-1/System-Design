public class Team {
    public static void main(String[] args){
        person1 p1 = new person1();
        p1.thinkPoster();
        p1.makePoster();
        
        person2 p2 = new person2();
        p2.writeCode();
        p2.testCode();
        
        person3 p3 = new person3();
        p3.writePressRelease();
        p3.distributePressRelease();
        
    }
}

interface Employee{

}

abstract class Desiner   implements Employee {
    public abstract void thinkPoster();
    public abstract void makePoster();
    
}


abstract class Developer  implements Employee{
    abstract void writeCode();
    abstract void testCode();
    
}

abstract class PublicRelations  implements Employee{
    abstract void writePressRelease();
    abstract void distributePressRelease();
    
}

class person1 extends Desiner{
    @Override
    public void thinkPoster(){
        System.out.println("Thinking of a poster...");
    }
    public void makePoster(){
        System.out.println("Making a poster...");
    }
}

class person2 extends Developer{
    @Override
    public void writeCode(){
        System.out.println("Writing code...");
    }
    public void testCode(){
        System.out.println("Testing code...");
    }
}

class person3 extends PublicRelations{
    @Override
    public void writePressRelease(){
        System.out.println("Writing press release...");
    }
    public void distributePressRelease(){
        System.out.println("Distributing press release...");
    }
}




