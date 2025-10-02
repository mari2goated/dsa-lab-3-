public class task1 {
    public static void main(String[] args) {
        int[][] twod={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int rows = twod.length;
        int cols = twod[0].length;
        int[] oned=new int[rows*cols];
        int index = 0;
        for(int i=0;i<rows;i++){
            for(int j = 0; j<cols;j++){
                oned[index]=twod[i][j];
                index++;
            }
        }
        System.out.println("1d array:");
        for(int i = 0;i<oned.length;i++){
            System.out.print(oned[i]+" ");
        }
    }
    
}
