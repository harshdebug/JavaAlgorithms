public class InsertionSort {
    
    public static void main(String[] args)
    {
        int[] arr;
        if(args.length == 0)
        {
            arr = new int[] { 3,1,5,2,4};
        }
        else
        {
            arr = new int[args.length];
            for(int i=0; i<args.length; i++)
            {
                arr[i] = Integer.parseInt(args[i]);
            }
        }

        InsertionSort inSrt = new InsertionSort();
        inSrt.sort(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public void sort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            int k=i;
            while(k>0 && arr[k]<arr[k-1])
            {
                int temp = arr[k];
                arr[k] = arr[k-1];
                arr[k-1] = temp;
                k--;
            }
        }
    }
    
}
