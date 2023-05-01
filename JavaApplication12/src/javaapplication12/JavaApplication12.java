import java.util.Scanner;
public class JavaApplication12 {
    private final int tickAllowed;
    private int currentTimeTick;
    private final int [][][] boardsOverTime;
    public JavaApplication12 (int maxTick,int [][]board){
        tickAllowed=maxTick;
        currentTimeTick=0;
        boardsOverTime= new int[tickAllowed+1][board.length][board.length];
        int[][] clonedBoard;
        clonedBoard=cloneOneBoard(board);
        boardsOverTime[currentTimeTick]= clonedBoard;
    }
    public static int[][] cloneOneBoard(int [][] board){
        int [][]clonedBoard= new int[board.length][board.length];
        for(int i=0;i<board.length;i++){
            System.arraycopy(board[i], 0, clonedBoard[i], 0, board.length);
        }
        return clonedBoard;
    }

    public int getCurrentTick(){
        return currentTimeTick;
    }

    public int getMaxTick(){
        return tickAllowed;
    }

    public int newState(int cellCurrentState,int numLiveNeighbours){
        if(cellCurrentState==1){
            if(numLiveNeighbours==2 || numLiveNeighbours==3)
            {
                return 1;
            }else{
                return 0;
            }

        }else{
            if(numLiveNeighbours==3)
            {
                return 1;
            }else{
                return 0;
            }
        }
}
    public int getNeighbourStateInfo(int[][] currentBoard,int i,int j){
        int alive = 0,len=currentBoard.length;
        if(i-1 >= 0 && j-1>=0){
            alive+= currentBoard[i-1][j-1];
        }
        if(i-1 >=0 )
        {
            alive+= currentBoard[i-1][j];
        }

        if(i-1>=0 && j+1<len){
            alive+= currentBoard[i-1][j+1];
        }

        if(j-1 >=0){
            alive+= currentBoard[i][j-1];
        }

        if( j+1<len){
            alive+= currentBoard[i][j+1];
        }

        if(i+1 < len && j-1>=0){
            alive+= currentBoard[i+1][j-1];
        }

        if(i+1 < len )
        {
            alive+= currentBoard[i+1][j];
        }

        if(i+1 <len && j+1 <len ){
            alive+= currentBoard[i+1][j+1];
        }
        return alive;
    }
    public void evolveCorners(int[][] currentBoard,int[][] newBoard){
        int len=currentBoard.length,i,j;
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                if((i==0 && j==0) || (i==len-1 && j==0) || (i==0 && j==len-1) || (i==len-1 && j==len-1) ){
                    newBoard[i][j]= newState(currentBoard[i][j],getNeighbourStateInfo(currentBoard,i,j));
                }else{
                    newBoard[i][j]=0;
                }

            }
        }
}
    public void evolveEdges(int[][] currentBoard,int[][] newBoard){
        int len=currentBoard.length,i,j;
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                if(i==0 || j==0 || i==len-1 || j==len-1){
                    newBoard[i][j]= Math.max(newBoard[i][j],newState(currentBoard[i][j],getNeighbourStateInfo(currentBoard,i,j)));
                }

            }
        }

    }
    public void evolveMiddle(int[][] currentBoard,int[][] newBoard){
        int len=currentBoard.length,i,j;
        for(i=1;i<len-1;i++){
            for(j=1;j<len-1;j++){
                newBoard[i][j]= Math.max(newBoard[i][j],newState(currentBoard[i][j],getNeighbourStateInfo(currentBoard,i,j)));
            }
        }

    }
    public void evolveOnce(){
        if(currentTimeTick<tickAllowed){
            int[][] currentBoard=boardsOverTime[currentTimeTick];
            int[][] newBoard=new int[currentBoard.length][currentBoard.length];
            for(int i=0;i<currentBoard.length;i++){
                for (int j=0;j<currentBoard.length;j++)
                {
                    newBoard[i][j]=0;
                }
            }
            evolveCorners(currentBoard,newBoard);
            evolveEdges(currentBoard,newBoard);
            evolveMiddle(currentBoard,newBoard);
            currentTimeTick++;
            boardsOverTime[currentTimeTick]= newBoard;
        }
    }
    public String toString(){
        String str = null;
        int[][] currentBoard=boardsOverTime[currentTimeTick];
        int len=currentBoard.length,i,j;
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                if(j==0)
                {
                    if(str==null)
                        str = "   "+ currentBoard[i][j];
                    else
                        str= str + "   " + currentBoard[i][j];
                }else{
                    str = str+" " + currentBoard[i][j];
                }
            }
            str= str + "\n";
        }
        return str;

    }
    public Boolean equals(int[][] parameterBoard){
        int[][] currentBoard=boardsOverTime[currentTimeTick];
        int len=currentBoard.length,i,j;
        if(len!=parameterBoard.length){
            return false;
        }
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                if(currentBoard[i][j]!=parameterBoard[i][j]){
                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("Enter the Maximum Ticks allowed");
        Scanner sc = new Scanner(System.in);
        int cellSize,tickAllowed,i,j;
        tickAllowed = sc.nextInt();
        System.out.println("Enter the cell size");
        cellSize= sc.nextInt();
        int [][] startingBoard = new int[cellSize][cellSize];
        for(i=0;i<cellSize;i++){
            for(j=0;j<cellSize;j++){
                System.out.println("Enter the cell value with coordinates(" + i + "," + j+")");
                startingBoard[i][j]=sc.nextInt();
            }
        }
        JavaApplication12 gameOfLife= new JavaApplication12(tickAllowed,startingBoard);

        for(i=0;i<=tickAllowed;i++){
            System.out.println("At Time Tick "+ i+":");
            System.out.println("Current Time Tick = "+ gameOfLife.getCurrentTick());
            System.out.println(gameOfLife.toString());
            gameOfLife.evolveOnce();
        }
    }
}