class LargestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int result=LargestElement(arr);
        System.out.println(result);
    }
    public static int LargestElement(int[] arr){
                // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
}