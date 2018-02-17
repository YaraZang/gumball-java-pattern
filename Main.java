

public class Main {

	public static void main(String[] args) {
		// int numberGumballs, int target, int[] coin_type_allowed
		// type 1
		int[] coin_type_allowd_for_type1 = {25,};
		GumballMachine gumballMachine1 = new GumballMachine(5, 25, coin_type_allowd_for_type1);
		test(gumballMachine1);
		
		int[] coin_type_allowd_for_type2 = {25,};
		GumballMachine gumballMachine2 = new GumballMachine(5, 50, coin_type_allowd_for_type2);
		test(gumballMachine2);

		int[] coin_type_allowd_for_type3 = {5, 10, 25};
		GumballMachine gumballMachine3 = new GumballMachine(5, 50, coin_type_allowd_for_type3);
		test(gumballMachine3);
	}
	public static void test(GumballMachine gumballMachine) {
		System.out.println("********************");
		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		gumballMachine.insertCoin( 10 );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( 10 );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( 10 );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( 5 );
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

	}
}
