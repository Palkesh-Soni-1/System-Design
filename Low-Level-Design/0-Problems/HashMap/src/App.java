import HashMap.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        map.put(3,31);
        map.put(7,10);
        map.put(10,7);
        map.put(30,1);
        map.put(13,391);
        map.put(13,351);
        map.put(37,27);
        for(int i=0;i<40;i++){
            Integer val=map.get(i);
            if(val!=null){
                System.out.println("Get "+i+": "+map.get(i));
            }
            else{
                System.out.println("Get "+i+": Not Found");
            }
        }
    }
}
