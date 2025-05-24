package Leetcode;

public class SudukoSolver {
    public static void main(String[] args) {
        int[][] board=new int[][]{
                {0, 0, 0, 9, 0, 0, 2, 0, 0},
                {9, 0, 5, 2, 4, 1, 0, 0, 0},
                {6, 0, 0, 0, 0, 0, 0, 5, 0},
                {7, 9, 0, 0, 3, 0, 0, 8, 4},
                {0, 8, 6, 0, 7, 0, 0, 0, 0},
                {3, 0, 0, 1, 5, 0, 0, 7, 0},
                {0, 0, 0, 0, 9, 0, 1, 0, 0},
                {1, 7, 0, 8, 0, 0, 6, 3, 0},
                {4, 0, 3, 0, 1, 7, 0, 9, 0}
        };
        if(solve(board)){
            display(board);
        }
        else{
            System.out.println("Can't solve it");
        }
    }
    public static boolean solve(int[][] board){
        int n=board.length,row=-1,col=-1;
        boolean empty=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    empty=true;
                    break;
                }
            }
            if(empty){
                break;
            }
        }
        if(!empty){
            return true;
        }

        for(int num=1;num<=9;num++){
            if(isSafe(board,row,col,num)){
                board[row][col]=num;
                if(solve(board)){
                    //Got the answer
                    return true;
                }
                else{
                    //Revert of backtrack the changes made in previous calls
                    board[row][col]=0;
                }
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] board, int row, int col, int num){
        //Checks row
        for(int i=0;i< board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        //Checks row
        for(int j = 0; j < board[0].length; j++){
            if(board[j][col]==num){
                return false;
            }
        }
        //check 3x3 box
        int sqrt=(int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for(int r=rowStart;r<rowStart+sqrt;r++){
            for(int c=colStart;c<colStart+sqrt;c++){
                if(board[r][c]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int[][] board){
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
