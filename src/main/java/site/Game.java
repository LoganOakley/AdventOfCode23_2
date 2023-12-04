package main.java.site;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Game {
    private int id;
    private List<Pull> pulls;

    public  Game(int id, List<Pull> pulls){
        this.id = id;
        this.pulls = pulls;
    }
    public  Game(int id){
        this.id = id;
        this.pulls = new ArrayList<Pull>();
    }

    public  Game(){
        this.id = 0;
        this.pulls = new ArrayList<Pull>();
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void addPull(int redCount, int greenCount, int blueCount){
        this.pulls.add(new Pull(redCount, greenCount, blueCount));
    }
    public void addPull(Pull pull){
        this.pulls.add(pull);
    }

    public Dictionary<String, Integer> getMaxValues(){
        Dictionary<String, Integer> maxCounts = new Hashtable<String, Integer>();
        maxCounts.put("red", 0);
        maxCounts.put("green", 0);
        maxCounts.put("blue", 0);
        for(Pull pull : pulls){
           if(pull.getCount("red") > maxCounts.get("red")){
              maxCounts.put("red", pull.getCount("red"));
           }
            if(pull.getCount("green") > maxCounts.get("green")){
                maxCounts.put("green", pull.getCount("green"));
            }
            if(pull.getCount("blue") > maxCounts.get("blue")){
                maxCounts.put("blue", pull.getCount("blue"));
            }
        }

        return  maxCounts;
    }

    public int getPower(){
        Dictionary<String, Integer> maxCounts = this.getMaxValues();

        return (maxCounts.get("red") * maxCounts.get("green") * maxCounts.get("blue"));

    }
    public boolean isPossible(int redCount, int greenCount, int blueCount){
        Dictionary<String, Integer> maxCounts = this.getMaxValues();
        return redCount >= maxCounts.get("red") && greenCount >= maxCounts.get("green") && blueCount >= maxCounts.get("blue");
    }
}
