public class Switch {
    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        //Challenge
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Found A");  
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
            default:
                System.out.println("Not found");
                break;
        }

        String month = "JANUARY";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            case "august":
                System.out.println("Aug");
                break;
            default:
                System.out.println("Did not found");
                break;
        }
    }
}
