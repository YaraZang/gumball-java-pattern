

import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
		if(gumballMachine.coin_type_allowed.contains(coin)) {
			if(coin + gumballMachine.sum < gumballMachine.target ) {	
				System.out.println("Please keep inserting more coins");
			}
			else if(coin + gumballMachine.sum == gumballMachine.target ) {
				gumballMachine.setState(gumballMachine.getFullCoinState());
			}
			gumballMachine.sum += coin;
		}
		else {
			System.out.println("Coin type not supported");
		}
		
		
		
		
	}
 
	public void ejectCoin() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
		gumballMachine.sum = 0;
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no enough coin");
	}

    public void dispense() {
    		System.out.println("You need to pay enough first");
    }
 
	public String toString() {
		return "waiting for more coins";
	}
}
