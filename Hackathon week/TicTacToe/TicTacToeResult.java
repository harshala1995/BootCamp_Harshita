package TicTacToe;

/**
 * Created by marwahh on 7/17/2017.
 */
public class TicTacToeResult {
    public static void main(String[] args) {
        int[][] gameOutput= new int[][]{{1,0,1},{0,1,0},{1,1,0}};

        System.out.println(findResult(gameOutput));
    }

     static int findResult(int[][] gameOutput) {
        int i=-1,count =0;
        for(int k=0;k<3;k++) {
            for(int l=0;l<3;l++) {
                if(gameOutput[k][l]!=-1)
                    count++;
            }
        }
        if(count<5) {
            return -1;
        }
        i = findInRows(gameOutput);
        if(i==-1)
            i = findInColumns(gameOutput);
        if(i==-1)
            i = findInDiagonals(gameOutput);
        return i;
    }

    private static int findInRows(int[][] gameOutput) {
        for(int i=0;i< 3;i++) {
            int prev=gameOutput[i][0];
            int j;
            for(j=0;j<3;j++) {
                if(prev!=gameOutput[i][j]) {
                    break;
                }
            }
            if(j==3) {
                return prev;
            }
        }
        return -1;
    }
    private static int findInColumns(int[][] gameOutput) {
        for(int i=0;i< 3;i++) {
            int prev=gameOutput[0][i];
            int j;
            for(j=0;j<3;j++) {
                if(prev!=gameOutput[j][i]) {
                    break;
                }
            }
            if(j==3) {
                return prev;
            }
        }
        return -1;
    }
    private static int findInDiagonals(int[][] gameOutput) {
        int prev=gameOutput[0][0];
        int i;
        for(i=0;i< 3;i++) {
            if(prev!=gameOutput[i][i]) {
                break;
            }
        }
        if(i==3) {
            return prev;
        }
        int j=2;
        for(j=2,i=0;i<3&&j>=0;i++,j--) {
            prev = gameOutput[0][2];
            if (prev != gameOutput[i][j]) {
                break;
            }
        }
        if(i==3) {
            return prev;
        }
        return -1;
    }
}