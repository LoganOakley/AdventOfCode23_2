package main.java.site;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class GameReader extends BufferedReader {
    public GameReader(Reader in) {
        super(in);
    }

    public List<Game> readGames() {
        List<Game> games = new ArrayList<Game>();
        return(games);
    }
}
