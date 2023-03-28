public class Sum{

    public static void main(String []args){
       
       int arr[] = {1,2,6,3,7,8};
       int sum=0;
       
       for(int i=0;i<arr.length;i++){
           sum += arr[i];
       }
       
       System.out.println("Sum of array is: "+sum);
       
    }
}