import java.util.*;

class tringle {
    int m;
    Integer[][] dp;

    public int minimumTotal(List<List<Integer>> tran) {
        m = tran.size();
        dp = new Integer[m][m];

        return helper(tran,0,0);
    }

    int helper(List<List<Integer>> tran,int row, int col){
        if(row==m){
            return 0;

        }
        if(dp[row][col]!=null){
            return dp[row][col];
        }
        int left = helper(tran,row+1,col);
        int right = helper(tran,row+1,col+1);
        return dp[row][col]=tran.get(row).get(col) + Math.min(left,right);
    }
}
