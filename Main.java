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
        String firstMessage = "Hello, I am " + firstName + " " + lastName + ", and I am " + age + " years old.";

        // AGE
        int checkEven = age % 2;
        boolean isEven = checkEven == 0;
        //String secondMessage;
      
        //if (isEven) {secondMessage = "My age is even.";}
        //else
        //    {secondMessage = "My age is NOT even.";}
        
      // NAMES
      boolean isNamesSame = firstName.equals(lastName);
        //System.out.println (isNamesSame);  
        //String thirdMessage;
      
        //if (isNamesSame) {thirdMessage = "The names are the same.";}
        //else
        //    {thirdMessage = "The names are NOT the same.";}

      // Greater than 0
      boolean isAgeGreat = age > 0;
        //System.out.println (isNamesSame);  
        //String fourthMessage;
      
        //if (isAgeGreat) {fourthMessage = "The age is greater than 0.";}
        //else
        //    {fourthMessage = "The age is NOT greater than 0.";}

        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
        System.out.println (firstMessage);
        // Print out whether age is even
        //System.out.println (checkEven);
        System.out.println (isEven);
        // Print out whether firstName equals lastName
        System.out.println (isNamesSame);
        
        // Print out whether age is greater than 0
        System.out.println (isAgeGreat);
        
    }
}
