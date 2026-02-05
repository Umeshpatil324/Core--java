package Break_Continue_Loop;

public class BreakWhile {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}

