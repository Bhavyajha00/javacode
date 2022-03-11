public class sorting1 {
    public static void printArray(int arr[]){
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[] = {6,9,5,1,8,};
    
    // time complexity = 0(n^2)    
   // bubble sort
      for(int i=0; i<array.length-1; i++){ //n-1
          for(int j=0; j<array.length-i-1; j++){
            if(array[j] > array[j+1]);

            //swap
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
           printArray(array);

          }

           
        }
    }
}
         

