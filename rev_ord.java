import java.util.Scanner;
public class rev_ord{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<arr.length;i++)
        {
            int element=scan.nextInt();
            arr[i]=element;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
