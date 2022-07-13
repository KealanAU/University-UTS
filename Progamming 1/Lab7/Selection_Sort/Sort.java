import java.util.ArrayList;
import java.util.List;

public class Sort {
	
	//Add your method here.
	public static void selectionSort(List<Integer> list)
	{
		int n = list.size();
		
		for (int i_idx = 0; i_idx < n-1; i_idx++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i_idx;
            for (int j_idx = i_idx + 1; j_idx < n; j_idx++)
                if (list.get(j_idx) < list.get(min_idx))
				{	
                    min_idx = j_idx;
				}
            // Swap the found minimum element with the first
            // element
            // int temp = arr[min_idx];
            // arr[min_idx] = arr[i];
            // arr[i] = temp;
			int temp = list.get(min_idx);
			list.set(min_idx, list.get(i_idx));
			list.set(i_idx, temp);
        }
	}
	
	public static void main(String[] args) {
		//Sort it out.
		List<Integer> list = new ArrayList<Integer>();

        list.add(1);
		list.add(5);
		list.add(10);
		list.add(44);
        list.add(3);
		list.add(3);

		Sort.selectionSort(list);

	}
	
}
