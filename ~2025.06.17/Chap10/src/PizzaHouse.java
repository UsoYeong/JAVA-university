
	
	class Pizza {
		static int totalCount = 0;
		
		static void addCnt(int count) {
			totalCount += count;
		}
		
		static void resetCnt() {
			totalCount = 0;
		}
		
		static int getTotalCnt() {
			return totalCount;
		}
	}
	public class PizzaHouse {
	public static void main(String[] args) {
		
		Pizza.addCnt(10);
		Pizza.addCnt(20);
		Pizza.addCnt(30);
		System.out.println("판매갯수 : " + Pizza.getTotalCnt());
		
		Pizza.resetCnt();
		System.out.println("판매갯수 : " + Pizza.getTotalCnt());
	}

}
