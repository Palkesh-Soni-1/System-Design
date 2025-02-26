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
        
        person4 p4 = new person4();
        p4.thinkPoster();
        p4.makePoster();
        p4.writePressRelease();
        p4.distributePressRelease();
    }
}


interface Desiner{
    void thinkPoster();
    void makePoster();
    
}


interface Developer{
    void writeCode();
    void testCode();
    
}

interface PublicRelations{
    void writePressRelease();
    void distributePressRelease();
    
}

class person1 implements Desiner{
    @Override
    public void thinkPoster(){
        System.out.println("Thinking of a poster...");
    }
    public void makePoster(){
        System.out.println("Making a poster...");
    }
}

class person2 implements Developer{
    @Override
    public void writeCode(){
        System.out.println("Writing code...");
    }
    public void testCode(){
        System.out.println("Testing code...");
    }
}

class person3 implements PublicRelations{
    @Override
    public void writePressRelease(){
        System.out.println("Writing press release...");
    }
    public void distributePressRelease(){
        System.out.println("Distributing press release...");
    }
}

class person4 implements Desiner, PublicRelations{
    @Override
    public void thinkPoster(){
        System.out.println("Thinking of a poster...");
    }
    public void makePoster(){
        System.out.println("Making a poster...");
    }

    @Override
    public void writePressRelease(){
        System.out.println("Writing press release...");
    }
    public void distributePressRelease(){
        System.out.println("Distributing press release...");
    }
}


