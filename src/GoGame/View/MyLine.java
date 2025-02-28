package GoGame.View;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MyLine extends Line{
    public MyLine ( int x, int y,int x2,int y2) {
        setStartX(x * Go.TILE_SIZE + Go.TILE_SIZE/2);
        setStartY(y * Go.TILE_SIZE + Go.TILE_SIZE/2);
        setEndX(x2 * Go.TILE_SIZE + Go.TILE_SIZE/2);
        setEndY(y2 * Go.TILE_SIZE + Go.TILE_SIZE/2);
        setStroke(Color.BLACK);
    }
}
