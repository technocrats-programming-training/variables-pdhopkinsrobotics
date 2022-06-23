public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        String firstMessage = "Hello, I am " + firstName + " " + lastName + ", and I am " + age + "years old.";

        // AGE
        int checkEven = age % 2;
        boolean isEven = checkEven == 0;
        String secondMessage;
      
        if (isEven) {secondMessage = "My age is even.";}
        else
            {secondMessage = "My age is NOT even.";}
        
      // NAMES
        boolean isNamesSame = firstName == lastName;
        
        String thirdMessage;
      
        if (isNamesSame) {thirdMessage = "The names are the same.";}
        else
            {thirdMessage = "The names are NOT the same.";}
        
        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
        System.out.println (firstMessage);
        // Print out whether age is even
        //System.out.println (checkEven);
        System.out.println (secondMessage);
        // Print out whether firstName equals lastName
        System.out.println (thirdMessage);

        // Print out whether age is greater than 0

    }
}
