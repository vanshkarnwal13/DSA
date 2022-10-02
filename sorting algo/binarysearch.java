class binarysearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        while(low<=high){
            if(arr[mid]==key){
                System.out.println("Found at index "+mid);
                break;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            mid = (low+high)/2;
        }
        if(low>high){
            System.out.println("Not found");
        }
    }
}