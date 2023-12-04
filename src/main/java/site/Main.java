package main.java.site;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Dictionary;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        GameReader reader = new GameReader("C:\\Users\\Logan\\Documents\\AdventOfCode23\\AdventOfCode23_2\\src\\main\\java\\site\\resources\\input");
        List<Game> games = reader.readGames();
        int powerSum = 0;
        for(Game game : games){
            powerSum += game.getPower();
        }
        System.out.println(powerSum);
    }
}