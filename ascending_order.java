import java.util.Scanner;
public class ascending_order {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
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
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
