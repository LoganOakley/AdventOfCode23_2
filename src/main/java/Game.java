import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Game {
    int id;
    List<Pull> pulls;

    public  Game(int id, List<Pull> pulls){
        this.id = id;
        this.pulls = pulls;
    }
    public  Game(int id){
        this.id = id;
        this.pulls = new ArrayList<Pull>();
    }

    public void addPull(int redCount, int greenCount, int blueCount){
        this.pulls.add(new Pull(redCount, greenCount, blueCount));
    }

    public Dictionary<String, Integer> getMaxValues(){
        Dictionary<String, Integer> maxCounts = new Hashtable<String, Integer>();
        maxCounts.put("red", 0);
        maxCounts.put("green", 0);
        maxCounts.put("blue", 0);
        for(Pull pull : pulls){
           if(pull.redCount > maxCounts.get("red")){
              maxCounts.put("red", pull.redCount);
           }
            if(pull.greenCount > maxCounts.get("green")){
                maxCounts.put("green", pull.greenCount);
            }
            if(pull.blueCount > maxCounts.get("blue")){
                maxCounts.put("blue", pull.blueCount);
            }
        }

        return  maxCounts;
    }
}
