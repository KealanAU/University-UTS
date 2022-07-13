import java.util.LinkedList;

public class SmallestSwapRedux {
	
	//Your method goes here.
	public static void smallestSwap(LinkedList<Integer> list, int i)
	{
		
		int location = i; 

		for(int num=i; num<list.size(); num++)
		{

			if(list.get(num) < list.get(location))
			{
				// 
				location = num;
				System.out.println(list.get(num));
			}
			
		}
		int temp = list.get(location);
		list.set(location, list.get(i));
		list.set(i, temp);
	
	}

	public static void main(String[] args) {
		//yoo, testing code - you may need to remove this if you're submitting
		LinkedList<Integer> ll = new LinkedList<Integer>();
        // Adding elements to the linked list
        ll.add(1);
        ll.add(2);
        ll.addLast(4);
        ll.addFirst(6);
        ll.add(2, 53);
		ll.add(2, 55);
		ll.add(2, 9);

		int n = 3;

		SmallestSwapRedux.smallestSwap(ll, n);
	}
}