package MultiplesOf3Or5;

public class Solution {
    public int solution(int number) {
        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                sum += i;
            else if (i % 3 == 0)
                sum += i;
            else if (i % 5 == 0)
                sum += i;
        }
        return sum;
    }

}
