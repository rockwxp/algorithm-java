package main.java.binary_search;
//https://programmercarl.com/0059.%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5II.html
public class SpiralMatrix {
// [1,2,3],
// [8,9,4],
// [7,6,5]
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(nums[1][2]);

    }
    public int[][] solution(int n) {
        int[][] nums = new int[n][n];
        int startX=0, startY=0;
        int i=0,j=0;
        int loop = 0;
        int offest = 1;
        int count = 1;


        while (loop++ <= n / 2) {
            for ( j = startY; j < n-offest; j++) {
                nums[startX][j] = count++;
            }
            for ( i = startX; i < n-offest; i++) {
                nums[i][j] = count++;
            }
            for (; j > startY; j--) {
                nums[i][j] = count++;
            }
            for (; i > startX; i--) {
                nums[i][j] = count++;
            }
            startY++;
            startX++;
            offest++;
        }

        if (n % 2 != 0) {
            nums[i][j]=count;
        }

        return nums;
    }
}
