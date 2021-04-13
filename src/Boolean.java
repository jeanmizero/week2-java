public class Boolean {

	public static void main(String[] args) {
        // 2. Boolean variables

		boolean isHotOutside = true ;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		// 3.  Create variable
		
		double costOfMilk = 2.5;
		double moneyInWallet = 12;
		int thirstLevel = 9;
		
		 // 4.  Use boolean operator
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldBuyIcecream);
		
		boolean willGoSwimming = isHotOutside && hasMoneyInPocket;
		System.out.println(willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket &&! isWeekday;
		System.out.println(isAGoodDay);
		
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= costOfMilk * 2) ;
		System.out.println(willBuyMilk);
	}

}
