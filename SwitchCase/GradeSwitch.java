package SwitchCase;

public class GradeSwitch {
	public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Very Good"); break;
            case 'C': System.out.println("Good"); break;
            case 'D': System.out.println("Pass"); break;
            default: System.out.println("Fail");
        }
    }

}
