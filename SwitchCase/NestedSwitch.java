package SwitchCase;

public class NestedSwitch {
	public static void main(String[] args) {
        int college = 1;
        int branch = 2;

        switch (college) {
            case 1:
                switch (branch) {
                    case 1: System.out.println("Computer"); break;
                    case 2: System.out.println("Mechanical"); break;
                }
                break;
            default:
                System.out.println("Invalid college");
        }
    }

}
