import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Bins {
    private Integer lowToss;
    private Integer highToss;
    private Dice dice;

    private int startingSumOfDice;
    private int endingSumOfDice;
    private Map<Integer, Integer> vAndT = new TreeMap<Integer, Integer>();

    public Bins(int startingSumOfDice, int endingSumOfDice){


        for (int i = startingSumOfDice; i <= endingSumOfDice;i++){
             vAndT.put(i++,0);
        }
    }

    public void incrementBin(Integer key){
        if(vAndT.containsKey(key)){
            vAndT.put(key,getBins(key)+1);
        } else {
            vAndT.put(key,1);
        }
    }



    public Integer getBins(Integer key){
        return vAndT.get(key);
    }



}





