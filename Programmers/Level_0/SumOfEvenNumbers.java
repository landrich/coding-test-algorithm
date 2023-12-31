/*
[짝수의 합]

* 문제 설명
  - 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

* 제한사항
  - 0 < n ≤ 1000
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }
}

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(10));
    }
}

/*
# Another Answer
class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(0, n)
            .filter(e -> e % 2 == 0)
            .sum();
    }
}
 */