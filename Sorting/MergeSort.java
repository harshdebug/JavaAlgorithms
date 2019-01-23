public class MergeSort {

    public void mergeSort(int[] arr, int left, int right)
    {
        if(left>=right)
        {
            return;
        }

        int mid = (left + right)/2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right)
    {
        int p1 = left;
        int p2 = mid + 1;
        int p = left;

        int[] temp = new int[right-left+1];
        int tp = 0;
        for(int i= left; i<=right; i++)
        {
            temp[tp++] = arr[i];
        }

        while(p1 <= mid && p2 <= right)
        {
            if(temp[p1-left] <= temp[p2-left])
            {
                arr[p++] = temp[p1-left];
                p1++;
            }
            else
            {
                arr[p++] = temp[p2-left];
                p2++;
            }
        }

        while(p1 <= mid)
        {
            arr[p++] = temp[p1-left];
            p1++;
        }
    }

    public static void main(String[] args) {

        int[] arr;

        if (args.length == 0)
        {
            arr = new int[]{4, 2, 6, 1, 3, 5};
        }
        else
        {
            arr = new int[args.length];
            for(int i=0; i<args.length; i++)
            {
                arr[i] = Integer.parseInt(args[i]);
            }
        }

        MergeSort ms = new MergeSort();
        ms.mergeSort(arr, 0, arr.length -1);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

}
