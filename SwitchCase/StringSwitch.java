package SwitchCase;

public class StringSwitch {
	 public static void main(String[] args) {
	        String city = "Pune";

	        switch (city) {
	            case "Mumbai":
	                System.out.println("Maharashtra");
	                break;
	            case "Pune":
	                System.out.println("IT City");
	                break;
	            case "Delhi":
	                System.out.println("Capital of India");
	                break;
	            default:
	                System.out.println("Unknown city");
	        }
	    }

}
