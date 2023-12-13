package sec05.chap02.ex02;

public class IntArrayInfo {
    int count;
    int max;
    int min;
    int sum; // 기본은 0으로 초기화되어있음
    double  average;

    IntArrayInfo(int[] nums) {
        count = nums.length;
        max = nums[0];
        min = nums[0];

        for (int num : nums) {
            max = max > num ? max : num;
            min = min < num ? min : num;
            sum += num;
        }
        //소수부를 잃지 않도록 먼저 1.0을 곱하고 double로 만듬
        average = 1.0 * sum / nums.length;
    }
}
