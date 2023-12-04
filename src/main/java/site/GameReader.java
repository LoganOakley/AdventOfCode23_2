package main.java.site;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GameReader extends BufferedReader {
    public GameReader(Reader in) {
        super(in);
    }
    public GameReader(String filePath) throws FileNotFoundException {
        super(new FileReader(filePath));
    }

    public List<Game> readGames() throws IOException {
        List<Game> games = new ArrayList<Game>();
        String line = this.readLine();
        while(line != null){
            games.add(this.parseLine(line));
            line = this.readLine();
        }
        return(games);
    }

    private Game parseLine(String line){
        Game game = new Game();
        String[] splitArray = line.split(":");
        game.setId(Integer.parseInt(splitArray[0].split(" ")[1]));
        String[] pullStrings = splitArray[1].split(";");
        for(String pullString : pullStrings){
            String[] colorStrings = pullString.split(",");
            for(String colorString: colorStrings){
                String[] splitColorString = colorString.trim().split(" ");
                Pull pull = new Pull();
                pull.addCount(splitColorString[1], Integer.parseInt(splitColorString[0]));
                game.addPull(pull);
            }
        }
        return game;
    }
}
