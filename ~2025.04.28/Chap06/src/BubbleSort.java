
public class BubbleSort {

	public static void main(String[] args) {
		// 버블 정렬 알고리즘
		int[] nums = {3, 1, 4, 5, 2};
		
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if(nums[j] > nums[j + 1]) { // 이거 바꾸면 내림차순
					// 두 값을 교환 (swap)
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		// 정렬결과 출력
		for(int num : nums) {
			System.out.print(num + "");
		}

	}

}
