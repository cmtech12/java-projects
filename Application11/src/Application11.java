
public class Application11 {

	public static void main(String[] args) {
	
		String[]lists = new String [7];
	
		lists [0] = "Hotdogs";
		lists [1] = "bread";
		lists [2] = "milk";
		lists [3] = "butter";
		lists [4] = "cheese";
		lists [5] = "juice";
		lists [6] = "rice";

		System.out.println(lists[2]);
		System.out.println(lists[3]);
		System.out.println(lists[5]);
		System.out.println(lists[0]);
		System.out.println(lists[1]);
		
		String[ ] agenda = {"milk", "butter", "juice", "Hotdogs", "bread"};
		
			for (String agendas: agenda) {
			System.out.println(agendas);
		
			}
			
	}
	
}

