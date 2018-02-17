
public class FullCoinState implements State {
	GumballMachine gumballMachine;
	
	public FullCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertCoin(int coin) {
		System.out.println("You can't insert another coin");
	}
 
	public void ejectCoin() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
		gumballMachine.sum = 0;
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
		gumballMachine.sum = 0;
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}



