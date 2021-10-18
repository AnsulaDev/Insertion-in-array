

class Insertion {
    static int insertion(int arr[],int n, int cap,int pos,int x){
        if(n==cap){
            return n;
        }
        int idx=pos-1;
        for(int i=n-1;i>=idx;i--){
            arr[i+1]= arr[i];
        }
        arr[idx]=x;
        return n + 1 ;
    }
    public static void main(String args[]){
        int arr[] = new int[5], cap = 5, n = 3;

        arr[0] = 20; arr[1] = 90; arr[2] = 30;
        System.out.println("before insertion " );
        for(int i =0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        int x = 100, pos = 1;

        int a = insertion(arr, n,cap, pos,x);

        System.out.println("After Insertion");

        for(int i=0; i<a ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
