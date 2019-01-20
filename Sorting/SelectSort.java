public class SelectSort {

    public void selectSort(int[] arr)
    {
        for(int i=0; i<arr.length -1; i++)
        {
            int min = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public void swap(int[] arr, int x, int y)
    {
        if(x != y)
        {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }

    public static void main(String[] args)
    {
        SelectSort srt = new SelectSort();
        int[] arr;
        if(args.length != 0)
        {
            arr = new int[args.length];
            for(int i=0; i<args.length; i++)
            {
                arr[i] = Integer.parseInt(args[i]);
            }
        }
        else
        {
            arr = new int[] {3,5,1,6,4,2};
        }
        srt.printArr(arr);
        srt.selectSort(arr);
        srt.printArr(arr);
    }

    public void printArr(int[] arr)
    {
        for(int i=0; i<arr.length -1; i++)
        {
            System.out.print(arr[i]+ " : ");
        }
        System.out.println(arr[arr.length -1]);
    }
}


