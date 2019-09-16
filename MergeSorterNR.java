



import java.util.Arrays;
import java.util.Objects;



public class MergeSorterNR<Item extends Comparable<Item>> implements Sorter<Item> {
    
    Item[] a;
    Item[] aux;
    
    private void copy(Item[] src, Item[] src2, int src3, int src4, int src5) {
    	
    	while(src3 != src4 && src5 < a.length)

    			
    	{
    		src2[src5] = src[src3];
    		src3++;
    		src5++;
    	}
    }
    
    private boolean less_or_equal(Item v, Item w) {
    	
    	if( ! (Objects.isNull(v) || Objects.isNull(w)) )

		{

    		return (v.compareTo(w) <= 0);

		}

   		return true;
    }
    
    public void sort(Item[] a) {

        this.a = a;

        mergeSort(a.length);
    }
    
    private void mergeSort(int n) {

        this.aux = (Item[]) (new Comparable[a.length + 1]); 
        
        
        for(int k = 1; k < n; k *= 2)

        {
        	mergePass(a, aux, n, k);

        	k *= 2;

        	mergePass(aux, a, n, k);
        }
    }
    
    private void mergePass(Item[] let, Item[] result, int num, int size) {

    	int i;
    	
    	for(i = 0; i < num-2*size+1; i += 2*size)

    	{

    		merge(let, result, i, i + size - 1, i + 2*size-1);

    	}
    	
    	if((i+size-1)<num)
    	{
    		merge(let, result, i, i+size-1, num);
    	}

    	else

    	{
    		copy(let, result, i, num + 1, i);
    	}
    }
    
    private void merge(Item[] let, Item[] merged, int lo, int mid, int hi) {
    	int i1;
    	int i2;
    	int i3;
    	
    	for(i1 = lo, i3 = lo, i2 = mid + 1;
    		i1 <= mid && i2 <= hi;
    		i3++)
    	{
    		if (less_or_equal(let[i1], let[i2]))
    		{
    			merged[i3] = let[i1];
    			i1++;
    		}
    		else
    		{
    			merged[i3] = let[i2];
    			i2++;
    		}
    	}
    	
    	copy(let, merged, i1, mid + 1, i3);
    	copy(let, merged, i2, hi + 1, i3);
    }
    
    public static void main(String[] args) {
        Character[] a = {'K','R','A','T','E','L','E','P','U','I','M','Q','C','X','O','S'};
        MergeSorter<Character> mergeSorter = new MergeSorter<Character>();
        mergeSorter.sort(a);
        System.out.println(Arrays.toString(a)); 
    }
}
