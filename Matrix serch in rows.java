Given a matrix, the task is to find the maximum element of each row.

Sample Input 0

{1, 2, 3}
{1, 4, 9}
{76, 34, 21}
Sample Output 0

3
9
76








import java.io.*;
import java.util.*;

public class Solution {
    public static void MaxEle(int row,int[][] arr){
        int i= 0;
        int max=0;
        int[] result = new int[row];
        while(i<row){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            result[i] = max;
            max =0 ;
            i++;
        }
        for(int k =0;k<result.length;k++ ){
            System.out.println(result[k]);
        }
        
    }

    public static void main(String[] args) {
    int[][] arr = new int[][]{{1,2,3},
                              {1,4,9},
                              {76,34,21}};
        MaxEle(3,arr);
    }
}
