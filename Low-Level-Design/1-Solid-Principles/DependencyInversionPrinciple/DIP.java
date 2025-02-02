public class DIP{
    public static void main(String[] args) {
        Keyboard keyboard=new WirelessKeyboard();
        Mouse mouse=new WiredMouse();
        Computer computer=new Computer(keyboard,mouse);
        computer.function();
    }
}

interface Keyboard{
    public void function();
}
interface Mouse{
    public void function();
}

class WiredKeyboard implements Keyboard
{
    public void function(){
        System.out.println("WiredKeyboard");
    }
}
class WirelessKeyboard implements Keyboard
{
    public void function(){
        System.out.println("WirelessKeyboard");
    }
}

class WiredMouse implements Mouse
{
    public void function(){
        System.out.println("WiredMouse");
    }
}
class WirelessMouse implements Mouse
{
    public void function(){
        System.out.println("WirelessMouse");
    }
}

class Computer{
    private Keyboard keyboard;
    private Mouse mouse;
    public Computer(Keyboard keyboard, Mouse mouse){
        this.keyboard=keyboard;
        this.mouse=mouse;
    }
    public void function(){
        keyboard.function();
        mouse.function();
    }
}