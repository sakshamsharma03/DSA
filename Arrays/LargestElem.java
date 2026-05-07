package Arrays;

public class LargestElem {
    static int getLargestElem(int [] arr)
    {
       if(arr.length==0) return -1;
       if(arr.length==1) return arr[0];
       int res=0;
       for(int i=1;i<arr.length;i++)
       {
        if(arr[i]>arr[res])
        {
            res=i;
        }
       }
       return res;
    }
    public static void main(String[] args)
    {
       int [] arr={1,1,1,1};
       System.out.println("Index of the largest elem--> " +getLargestElem(arr));
    }
}
