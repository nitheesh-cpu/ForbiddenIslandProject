package game.panel;
import game.simulation.board.GameTile;

import javax.swing.*;

public class GameBoard extends JFrame {
    private GameTile[][] allTiles;
    public GameBoard(){
        allTiles = new GameTile[6][6];
    }

    public GameTile[][] getAllTiles() {
        return allTiles;
    }
}
