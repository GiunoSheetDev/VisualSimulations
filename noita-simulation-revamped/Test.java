import java.util.Arrays;
import classes.solids.*;
import classes.solids.dynamic.*;


public class Test {
    public static void main(String[] args) {
        int screenH = 800;
        int screenW = 800;
        int tileDimension = 200;
        int rows = screenH / tileDimension;
        int columns = screenW / tileDimension;


         
        Object[][] tiles = Tiles.getEmptyTiles(screenW, screenH, tileDimension);
        

        

        DynamicSolid testSolid = new DynamicSolid(1, 3);
        DynamicSolid testSolid1 = new DynamicSolid(1, 1);
        tiles[1][3] = testSolid;
        tiles[1][1] = testSolid1;
        DynamicSolid testSolid2 = new DynamicSolid(0, 0);
        DynamicSolid testSolid3 = new DynamicSolid(2, 0);
        tiles[0][0] = testSolid2;
        tiles[2][0] = testSolid3;
        

        System.out.println(Arrays.deepToString(tiles));
        tiles = Tiles.updateTiles(rows, columns, tiles);
        System.out.println(Arrays.deepToString(tiles));
        tiles = Tiles.updateTiles(rows, columns, tiles);
        System.out.println(Arrays.deepToString(tiles));
   
        System.out.println(Arrays.deepToString(tiles));
        tiles = Tiles.updateTiles(rows, columns, tiles);
        System.out.println(Arrays.deepToString(tiles));
        tiles = Tiles.updateTiles(rows, columns, tiles);
        System.out.println(Arrays.deepToString(tiles));
             

        /* moveToEmptyCell works
         * switchWithAnotherCell works
         * canGoToCell works
         * tryMovingToCell works
         * getNeighbors works
         * DynamicSolid.update works
         * Tiles.update works
         *
         * ALL WORKS SO FAR
         */
    }
}
