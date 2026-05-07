package Arrays;

public class SecLargestElem {
    static int getSLE(int [] arr)
    {
        if(arr.length==0) return -1;
        if(arr.length==1) return arr[0];
        int max=0;
        int sec=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[max])
            {
                sec=max; 
                max=i;
            }else if(arr[i]!=arr[max])
            {
                if(arr[i]>arr[sec])
                {
                    sec=i;
                }
            }
        }

        return sec;
    }
    public static void main(String[] args)
    {
        int []arr={10,10,20,10};
        System.out.println("Second Largest Elem--> "+getSLE(arr));
    }
}
