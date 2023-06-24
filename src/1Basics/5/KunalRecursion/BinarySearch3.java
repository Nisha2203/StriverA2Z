public class BinarySearch3 {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,5,7};
        // for loop
        int target = 6,flag=0;
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                flag=1;
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        if(flag==0)
        System.out.println("-1");



        //recursion
        System.out.println(search(arr,target,start,end));

    }

     static int search(int[] arr, int target,int start,int end) {
        int mid = start+(end-start)/2;
        if(start>end)
        {
            return -1;
        }
        if(arr[mid]==target)
        {
           return mid;
        }
        else if(arr[mid]>target)
         {
             return search(arr,target,start,mid-1);
         }
        else
        {
            return search(arr,target,mid+1,end);
        }

    }
}
