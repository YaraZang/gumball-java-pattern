

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int coin) {
		if(gumballMachine.coin_type_allowed.contains(coin)) {
			if(coin == gumballMachine.target) {
				System.out.println("You inserted a coin");
				gumballMachine.setState(gumballMachine.getFullCoinState());
			}
			else {
				System.out.println("Please keep inserting more coins");
				gumballMachine.setState(gumballMachine.getHasCoinState());
			}
			gumballMachine.sum+=coin;
		}
		else {
			System.out.println("Coin type not supported");
		}
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coins";
	}
}
