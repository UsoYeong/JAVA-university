
class PizzaIns {
	int totalCount = 0;
	
	void addCnt(int count) {
		totalCount += count;
	}
	
	void resetCnt() {
		totalCount = 0;
	}
	
	int getTotalCnt() {
		return totalCount;
	}
}

public class PizzaInstance {
	public static void main(String[] args) {
		
		PizzaIns p1 = new PizzaIns();
		PizzaIns p2 = new PizzaIns();
		PizzaIns p3 = new PizzaIns();
		
		p1.addCnt(10);
		p1.addCnt(20);
		p1.addCnt(30);
		System.out.println("판매갯수 : " + p1.getTotalCnt());
		
		p2.addCnt(10);
		p2.addCnt(20);
		System.out.println("P2 판매갯수 : " + p2.getTotalCnt());
		
		p3.addCnt(10);
		System.out.println("P3 판매갯수 : " + p3.getTotalCnt());



	}

}
