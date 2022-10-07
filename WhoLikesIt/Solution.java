package WhoLikesIt;

public class Solution {
    public static String whoLikesIt(String... names) {
        String solution = "";
        int count = names.length;
        if (count == 0)
            solution = "no one likes this";
        else if (count == 1)
            solution = names[0] + " likes this";
        else if (count == 2)
            solution = names[0] + " and " + names[1] + " like this";
        else if (count == 3)
            solution = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        else
            solution = names[0] + ", " + names[1] + " and " + (count - 2) + " others like this";

        return solution;
    }
}
