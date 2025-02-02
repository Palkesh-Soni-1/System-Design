public class LSP{
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.fly();

        Bird penguin = new Penguin();
        penguin.fly(); // Violates LSP, as it cannot fly
    }
}
interface Bird{
    public void fly();
}
class Eagle implements Bird{
    @Override
    public void fly(){
        // Flies
    }
}
class Penguin implements Bird{
    @Override
    public void fly(){
        throw new UnsupportedOperationException("Penguin Can't fly");
    }
}