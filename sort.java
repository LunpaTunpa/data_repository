
/**
 *
 * @author Leonardo Rodrigues
 */
public class sort {
    // bubble sort metody \/
    public static int[] bubblesort (int number[]){
        final int n = number.length;
        int aux;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (number[j]>number[j+1]){
                    aux = number[j];
                    number[j] = number[j+1];
                    number[j+1] = aux;
                }
            }
        }
        return number;
    }

    // quick sort metody \/
    // data manipulation
    public static void quicksort (int p, int q, int anchor[]){
        int x;
        if (p<q){
            x = part(p, q, anchor);
            quicksort(p, x-1, anchor);
            quicksort(x+1, q, anchor);
        }
    }
    // data reordering
    public static int part(int p, int q, int anchor[]){
        int j = p-1;
        int temp, aux = anchor[q];
        for (int i=p; i<=q; i++){
            if (anchor[i]<=aux){
                j++;
                temp = anchor[i];
                anchor[i] = anchor[j];
                anchor[j] = temp;
            }
        }
        return j;
    }

    // merge sort metody \/
    // data manipulation
    public static void mergesort(int[] a, int start, int end){
        if (start==end){
            return;
        }
        int mid = (start+end)/2;
        mergesort(a, start, mid);
        mergesort(a, mid+1, end);
        merge(a, start, mid, end);
    }
    // data reordering union
    public static void merge(int[] a, int start, int mid, int end){
        int n = end-start+1;
        int [] b = new int[n];
        int i1 = start, i2 = mid+1, j = 0;
        while (i1<=mid && i2<=end){
            if (a[i1]<a[i2]){
                b[j] = a[i1];
                i1++;
            }
            else{
                b[j] = a[i2];
                i2++;
            }
            j++;
        }
        while (i1<=mid){
            b[j] = a[i1];
            i1++;
            j++;
        }
        while (i2<=end){
            b[j] = a[i2];
            i2++;
            j++;
        }
        for (j=0; j<n; j++){
            a[start+j] = b[j];
        }
    }

    // execution \/
    public static void main (String enter[]){
        // enter in bubble 
        int i, vetone[] = {54, 3, 90, 378, 47, 10, 4, 312, 23, 102};
        vetone = bubblesort(vetone);
        for (i=0; i<10; i++){
            System.out.print(vetone[i]+"");
        }
        System.out.print("\n");
        // enter in quick
        int j, vettwo[] = {54, 3, 90, 378, 47, 10, 4, 312, 23, 102};
        quicksort(0, 9, vettwo);
        for (j=0; j<10; j++){
            System.out.print(vettwo[j]+"");
        }
        System.out.print("\n");
        // enter in merge
        int q, vetthree[] = {54, 3, 90, 378, 47, 10, 4, 312, 23, 102};
        mergesort(vetthree, 0, 9);
        for (q=0; q<10; q++){
            System.out.print(vetthree[q]+"");
        }

        System.exit(0);
    }
}