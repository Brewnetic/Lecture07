// ============================================
// Lecture 6 - Example 1: Creating a Simple Class
// ============================================
// Topic: Creating a Movie class with properties and instance methods

// Import Scanner class to read user input from console
import java.util.Scanner;

// Main class - this is the public class that matches the filename
public class MovieExample {
    
    // Main method - entry point where the program starts
    public static void main(String[] args) {
        
        // Create a Scanner object to read keyboard input
        Scanner scanner = new Scanner(System.in);
        
        // ============================================
        // Part 1: Create the first movie object
        // ============================================
        
        // TODO: Create a Movie object called movie1 using the new keyword
        // Hint: ClassName objectName = new ClassName();
        // This creates an instance of the Movie class stored in the variable movie1
        _______ movie1 = _______ _______();
        
        // Display prompt asking user for the movie title
        System.out.print("Enter movie title: ");
        // TODO: Set movie1's title property to the user's input
        // Use dot notation to access the object's property: objectName.propertyName
        movie1._______ = scanner.nextLine();
        
        // Display prompt asking user for the director name
        System.out.print("Enter director name: ");
        // TODO: Set movie1's director property to the user's input
        // Read entire line and assign to movie1's director property
        movie1._______ = scanner.nextLine();
        
        // Display prompt asking user for the movie rating (1-5)
        System.out.print("Enter rating (1-5): ");
        // TODO: Set movie1's rating property to the user's input
        // Read next integer and assign to movie1's rating property
        movie1._______ = scanner.nextInt();
        // Clear the newline character left in buffer after nextInt()
        scanner.nextLine(); // Clear the buffer
        
        // Print blank line for better output formatting
        System.out.println(); // Blank line for spacing
        
        // TODO: Call the displayInfo() method on movie1 to print the movie details
        // Use dot notation to call instance methods: objectName.methodName()
        movie1._____________();
        
        // Print blank line for spacing between sections
        System.out.println(); // Blank line for spacing
        
        // ============================================
        // Part 2: Create a second movie object
        // ============================================
        
        // TODO: Create a Movie object called movie2
        // This is a separate, independent object from movie1
        _______ movie2 = _______ _______();
        
        // Display prompt for the second movie's title
        System.out.print("Enter second movie title: ");
        // TODO: Set movie2's title property
        // Read line and assign to movie2's title (separate from movie1's title)
        movie2._______ = scanner.nextLine();
        
        // Display prompt for the second movie's director
        System.out.print("Enter director name: ");
        // TODO: Set movie2's director property
        // Read line and assign to movie2's director
        movie2._______ = scanner.nextLine();
        
        // Display prompt for the second movie's rating
        System.out.print("Enter rating (1-5): ");
        // TODO: Set movie2's rating property
        // Read integer and assign to movie2's rating
        movie2._______ = scanner.nextInt();
        // Clear the newline character left in buffer
        scanner.nextLine(); // Clear the buffer
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // TODO: Call the displayInfo() method on movie2
        // This shows movie2's data, not movie1's data
        movie2._____________();
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // ============================================
        // Part 3: Use instance methods
        // ============================================
        
        // TODO: Call the isHighlyRated() method on movie1 and store the result
        // Hint: boolean variableName = objectName.methodName();
        // This method returns a boolean value (true or false)
        _______ isMovie1Good = movie1._____________();
        
        // TODO: Print whether movie1 is highly rated (rating >= 4)
        // Use if statement to check the boolean value
        if (isMovie1Good) {
            // If true, movie1 has rating of 4 or 5
            System.out.println(movie1.title + " is highly rated!");
        } else {
            // If false, movie1 has rating below 4
            System.out.println(movie1.title + " needs improvement.");
        }
        
        // TODO: Call the isHighlyRated() method on movie2
        // Store the result in a boolean variable
        _______ isMovie2Good = movie2._____________();
        
        // TODO: Print whether movie2 is highly rated
        // Check if isMovie2Good is true or false
        if (_______) {
            // If condition is true, print highly rated message
            System.out.println(movie2.title + " is highly rated!");
        } else {
            // If condition is false, print needs improvement message
            System.out.println(movie2.title + " needs improvement.");
        }
        
        // Close the Scanner to free up system resources
        scanner.close();
    }
}

// ============================================
// Movie Class Definition
// ============================================

// TODO: Create a class called Movie
// This is the blueprint for creating movie objects
_______ Movie {
    
    // TODO: Create three public properties:
    // - title (String)
    // - director (String)
    // - rating (int)
    
    // Public means these can be accessed from outside the class
    // String type holds text data like movie titles
    _______ String title;
    
    // String type holds text data like director names
    _______ String director;
    
    // int type holds whole numbers like ratings (1-5)
    _______ int rating;
    
    // ============================================
    // Instance Method 1: Display movie information
    // ============================================
    
    // TODO: Create a public void method called displayInfo
    // public = accessible from outside the class
    // void = returns nothing (just prints)
    // This method should print the movie's title, director, and rating
    _______ _______ displayInfo() {
        // Print the movie's title using the instance variable
        System.out.println("Title: " + _______);
        
        // Print the movie's director using the instance variable
        System.out.println("Director: " + _______);
        
        // Print the movie's rating with formatting
        System.out.println("Rating: " + _______ + "/5");
    }
    
    // ============================================
    // Instance Method 2: Check if movie is highly rated
    // ============================================
    
    // TODO: Create a public method that returns a boolean called isHighlyRated
    // boolean return type means this method returns true or false
    // This method should return true if rating is 4 or higher, false otherwise
    _______ _______ isHighlyRated() {
        // TODO: Return true if rating >= 4, otherwise return false
        // Hint: Use an if-else statement or a simple comparison
        // Check if the movie's rating is 4 or higher
        if (_______ >= 4) {
            // If rating is 4 or 5, return true
            return _______;
        } else {
            // If rating is 3 or below, return false
            return _______;
        }
    }
}
