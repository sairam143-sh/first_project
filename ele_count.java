public class ele_count
{
    public static void main(String[] args)
    {
        int arr[]={3,4,2,1,1,2,3,4};
        int arr1[]=new int[arr.length];
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            int count=1;
            if(arr1[i]==-1)
            {
                continue;
            }
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr1[j]=-1;
                }
            }
            arr1[i]=count;
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr1[i]!=-1)
            {
                System.out.println("element: "+arr[i]+"count :"+arr1[i]);
            }
        }
    }
}
