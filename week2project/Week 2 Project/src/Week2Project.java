
public class Week2Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHotOutside = true;
		
		boolean isWeekday = false;
		
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 18.36;
		
		double moneyInWallet = 44.85;
				
		int thirstLevel = 6;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		
		boolean willGoSwimming = isHotOutside && isWeekday;
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday;
		
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 2) && (moneyInWallet >= 2*costOfMilk);
		
		
		
	}

}
