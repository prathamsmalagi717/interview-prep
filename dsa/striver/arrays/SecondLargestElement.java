class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int result=SecondLargest(arr);
        System.out.println(result);
    }
    public static int SecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int secondmax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        return secondmax==Integer.MIN_VALUE?-1:secondmax;
    }
}

