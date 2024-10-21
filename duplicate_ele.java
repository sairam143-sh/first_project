import java.util.Scanner;
public class duplicate_ele{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int i,j;
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
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
