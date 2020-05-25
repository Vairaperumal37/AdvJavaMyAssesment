import com.vaira.collections.*;

public class Program {

	public static void main(String[] args) {
		/*
		 * Node n=new Node(); n.value=100;
		 */
		LinkedListTest list =new LinkedListTest();
		for(int i=1;i<=5;i++)
		{
			list.add(i);
		}
		list.add(100);
		list.display();
		list.size();
		list.get(5);
		list.remove(5);
		list.display();

	}

}
