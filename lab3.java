public class lab3{
    public static void main(String[] args){
        int[] arr = new int[12];
        arr = new int[]{2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int x = 21;
        for(int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
            // System.out.println(arr[i]);
        }
        arr[0]=x;
        n++;

        System.out.println("h");
        for(int i = 0; i < n ; i++){
            System.out.println(arr[i]);
        }
       
    }
}