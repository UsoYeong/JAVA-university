class PizzaCount {
	static int totalCountFran = 0;
    int totalCount = 0;
	
	void addCnt(int count) {
		totalCount += count;
		totalCountFran += count;
	}
	
	void resetCnt() {
		totalCount = 0;
		totalCountFran = 0;

	}
	
	int getTotalCnt() {
		return totalCount;
	}
	
	static int getTotalCntFran() {
		return totalCountFran;
	}
	
}
public class PizzaFrenchize {
	public static void main(String[] args) {
		PizzaCount p1 = new PizzaCount();
		PizzaCount p2 = new PizzaCount();
		
		p1.addCnt(10);
		p1.addCnt(20);
		p1.addCnt(30);
		p2.addCnt(15);
		p2.addCnt(17);
		
		System.out.println("p1 피자집 : " + p1.getTotalCnt());
		System.out.println("p2 피자집 : " + p2.getTotalCnt());
		System.out.println("프랜차이즈 : " + PizzaCount.getTotalCntFran());
		
		p1.resetCnt();
		System.out.println("p1 피자집 : " + p1.getTotalCnt());
		System.out.println("p2 피자집 : " + p2.getTotalCnt());
		System.out.println("프랜차이즈 : " + PizzaCount.getTotalCntFran());

	}

}
