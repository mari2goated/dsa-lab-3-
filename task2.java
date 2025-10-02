public class task2 {
        // int[] arr = {1,2,3,4};
        // int found = 0;
        // int target = 2;
        // for(int i = 0; i <= arr.length;i++){
        //     if(i==target){
        //         System.out.println(i);
        //     }
        //     else{
        //         System.out.println(-1);
        //     }
        // }
        public static void searchArray(int key) {

        int[] arr = {1,2,3,4};
        int i = 0;
        int found = 0;
        int location = 0;

        while (i<=3 && found==0){
            if(arr[i]==key){
                found = 1;
                location = 1;
                System.out.println("the index where the key has been found is:"+i);
            }
            else{
                i = i+1;
            }
        }
        if (found==0){
            System.out.println("search unsuccessful");
        } else {
            System.out.println("search is successful");
        }


    }
    public static void main(String[] args) {
        searchArray(2);
    }
    
}
