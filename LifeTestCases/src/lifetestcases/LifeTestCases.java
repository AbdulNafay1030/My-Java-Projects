public class LifeTestCases {
  
  //A class that stores a set of test configurations for the Game of Life
  //as a simple 2D array of Strings. X's are living cells, any other
  // character is a dead cell.
  
  private static String[][] testBoards = {
    //1. A test case that should die out after exactly 8 generations
    { "       ",
      "  XXX  ",
      " XXXXX ",
      "  XXXX ",
      "       "},
    
    //2. A glider gun
    {"........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      ".............XX.........................",
      "............X...X.......................",
      "...........X.....X.......X..............",
      ".XX........X...X.XX....X.X..............",
      ".XX........X.....X...XX.................",
      "............X...X....XX............XX...",
      ".............XX......XX............XX...",
      ".......................X.X..............",
      ".........................X..............",
      "........................................"},
    
    //3. Eight gliders that collide to form a glider gun
    {"...........................X....................................................",
      "...........................X.X................X.................................",
      "...........................XX.................X.X...............................",
      "...X.X..........X.............................XX................................",
      "....XX...........XX.............................................................",
      "....X...........XX..............................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      ".............XX............................XX...................................",
      "..............XX...........................X.X.........XXX......................",
      ".............X.............................X...........X........................",
      "..............................X.........................X.......................",
      "..............................XX................................................",
      ".............................X.X................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................",
      "................................................................................"},
    
     //4. A "harvester"
     {"........................................",
      "......................................XX",
      ".....................................X.X",
      "....................................X...",
      "...................................X....",
      "..................................X.....",
      ".................................X......",
      "................................X.......",
      "...............................X........",
      "..............................X.........",
      ".............................X..........",
      "............................X...........",
      "...........................X............",
      "..........................X.............",
      ".........................X..............",
      "........................X...............",
      ".......................X................",
      "......................X.................",
      ".....................X..................",
      "....................X...................",
      "...................X....................",
      "..................X.....................",
      ".................X......................",
      "................X.......................",
      "...............X........................",
      "..............X.........................",
      ".............X..........................",
      "............X...........................",
      "...........X............................",
      "..........X.............................",
      ".........X..............................",
      "........X...............................",
      ".......X................................",
      "......X.................................",
      ".XXXXX..................................",
      ".XXXX...................................",
      ".X.XX...................................",
      "........................................",
      "........................................",
      "........................................"},
    
     //5. An "r-pentomino". It is unstable for 1103 generations if the board is infinite.
     {"........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "..................XX....................",
      ".................XX.....................",
      "..................X.....................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................",
      "........................................"}
        
  };
  
  //This will convert the selected test case from an array of Strings into
  //the 2D array of booleans used in Assignment 2.
  public static boolean[][] getTest(int index){
    String[] board = testBoards[index];
    boolean[][] result = new boolean[board.length][board[0].length()];
    for(int r=0; r<board.length; r++)
      for(int c=0; c<board[0].length(); c++)
      result[r][c] = board[r].charAt(c)=='X';
    return result;
  }
  
  //The user interface also needs to know how many tests are available.
  public static int numTests(){
    return testBoards.length;
  }
  
}
