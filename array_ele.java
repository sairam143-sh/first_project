public class array_ele {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int value:arr)
        {
            System.out.print(value+" ");
        }
    }
}
