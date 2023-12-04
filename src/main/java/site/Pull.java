package main.java.site;

import java.util.Dictionary;
import java.util.Hashtable;

public class Pull {
   Dictionary<String, Integer> colorcounts;

    public Pull(int redCount, int greenCount, int blueCount){
        colorcounts = new Hashtable<>();
        colorcounts.put("red", redCount);
        colorcounts.put("green", greenCount);
        colorcounts.put("blue", blueCount);
    }

    public Pull(){
        colorcounts = new Hashtable<>();
        colorcounts.put("red", 0);
        colorcounts.put("green", 0);
        colorcounts.put("blue", 0);

    }

    public void addCount(String colorWord, int count){
        colorcounts.put(colorWord, count);
    }

    public int getCount(String colorWord){
        return colorcounts.get(colorWord);
    }

}
