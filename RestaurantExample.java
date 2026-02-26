// ============================================
// Lecture 7 - Example 2: Constructors and Static vs Instance Methods
// ============================================
// Topic: Understanding constructors, instance methods, and static methods

// Import Scanner class to read user input from console
import java.util.Scanner;

// Main class - public class that matches the filename
public class RestaurantExample {
    
    // Main method - entry point of the program
    public static void main(String[] args) {
        
        // Create a Scanner object to read keyboard input
        Scanner scanner = new Scanner(System.in);
        
        // ============================================
        // Part 1: Using Static Methods (Before Creating Objects)
        // ============================================
        
        // Print header for the program
        System.out.println("=== Restaurant Management System ===\n");
        
        // TODO: Call the static method displayWelcomeMessage() on the Restaurant class
        // Hint: ClassName.methodName();
        // Static methods are called on the class itself, not on objects
        Restaurant._______________________();
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // TODO: Call the static method getTotalRestaurants() and print the result
        // This should show 0 restaurants before we create any
        // Static methods can be called without creating any objects
        System.out.println("Total restaurants: " + Restaurant._______________________());
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // ============================================
        // Part 2: Create Restaurant Objects Using Constructor
        // ============================================
        
        // TODO: Ask the user for the first restaurant name
        // Display prompt for user input
        System.out.print("Enter first restaurant name: ");
        // Read the entire line of user input and store in String variable
        String name1 = scanner.nextLine();
        
        // TODO: Ask the user for the cuisine type
        // Display prompt for cuisine type
        System.out.print("Enter cuisine type: ");
        // Read the cuisine type input
        String cuisine1 = scanner.nextLine();
        
        // TODO: Ask the user for the seating capacity
        // Display prompt for capacity
        System.out.print("Enter seating capacity: ");
        // Read integer value for capacity
        int capacity1 = scanner.nextInt();
        // Clear the newline character left in buffer after nextInt()
        scanner.nextLine(); // Clear buffer
        
        // TODO: Create a Restaurant object called restaurant1 using the constructor
        // Pass name1, cuisine1, and capacity1 as arguments
        // Hint: ClassName objectName = new ClassName(arg1, arg2, arg3);
        // The constructor will automatically be called when we use 'new'
        _______ restaurant1 = _______ Restaurant(_______, _______, _______);
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // TODO: Ask the user for the second restaurant name
        // Display prompt for second restaurant
        System.out.print("Enter second restaurant name: ");
        // Read the restaurant name
        String name2 = scanner.nextLine();
        
        // TODO: Ask the user for the cuisine type
        // Display prompt for cuisine type
        System.out.print("Enter cuisine type: ");
        // Read the cuisine type
        String cuisine2 = scanner.nextLine();
        
        // TODO: Ask the user for the seating capacity
        // Display prompt for capacity
        System.out.print("Enter seating capacity: ");
        // Read integer capacity
        int capacity2 = scanner.nextInt();
        // Clear the buffer
        scanner.nextLine(); // Clear buffer
        
        // TODO: Create a Restaurant object called restaurant2 using the constructor
        // Pass the parameters to initialize the second restaurant object
        _______ restaurant2 = _______ Restaurant(_______, _______, _______);
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // ============================================
        // Part 3: Using Instance Methods
        // ============================================
        
        // Print section header
        System.out.println("=== Restaurant Information ===\n");
        
        // TODO: Call the displayInfo() instance method on restaurant1
        // Instance methods are called on specific objects using dot notation
        restaurant1._______________________();
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // TODO: Call the displayInfo() instance method on restaurant2
        // This will display restaurant2's information, not restaurant1's
        restaurant2._______________________();
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // ============================================
        // Part 4: Modify Individual Restaurant Data
        // ============================================
        
        // TODO: Call the addCustomers() method on restaurant1 to add 25 customers
        // Hint: objectName.methodName(argument);
        // This method modifies only restaurant1's currentCustomers
        restaurant1._______________________(25);
        
        // TODO: Call the addCustomers() method on restaurant2 to add 15 customers
        // This modifies only restaurant2's currentCustomers
        restaurant2._______________________(15);
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // TODO: Call the isAtCapacity() method on restaurant1 and store result
        // This method returns a boolean value (true or false)
        _______ isFull1 = restaurant1._______________________();
        
        // Print whether restaurant1 is at capacity
        // Use if-else to check the boolean value
        if (isFull1) {
            // If true, restaurant has reached its capacity
            System.out.println(restaurant1.name + " is at full capacity!");
        } else {
            // If false, restaurant still has available seats
            System.out.println(restaurant1.name + " has available seats.");
        }
        
        // TODO: Check if restaurant2 is at capacity
        // Call the instance method on restaurant2
        _______ isFull2 = restaurant2._______________________();
        
        // Check if restaurant2 is full
        if (isFull2) {
            // Print full capacity message
            System.out.println(restaurant2.name + " is at full capacity!");
        } else {
            // Print available seats message
            System.out.println(restaurant2.name + " has available seats.");
        }
        
        // Print blank line for spacing
        System.out.println(); // Blank line for spacing
        
        // ============================================
        // Part 5: Using Static Methods Again
        // ============================================
        
        // TODO: Call the getTotalRestaurants() static method
        // This should now show 2 restaurants because we created 2 objects
        // The static variable was incremented in each constructor
        System.out.println("Total restaurants in system: " + Restaurant._______________________());
        
        // TODO: Call the static method calculateAverageCapacity()
        // Pass restaurant1 and restaurant2 as arguments
        // Hint: Static methods can work with multiple objects
        // Store the returned double value
        double avgCapacity = Restaurant._______________________(restaurant1, restaurant2);
        // Print the average capacity calculated by the static method
        System.out.println("Average seating capacity: " + avgCapacity);
        
        // Close the Scanner to free up system resources
        scanner.close();
    }
}

// ============================================
// Restaurant Class Definition
// ============================================

// TODO: Create a class called Restaurant
// This class will serve as a blueprint for restaurant objects
_______ Restaurant {
    
    // ============================================
    // Properties (Instance Variables)
    // ============================================
    
    // TODO: Create private instance variables:
    // - name (String)
    // - cuisineType (String)
    // - capacity (int)
    // - currentCustomers (int)
    
    // Private means only this class can access this variable directly
    // Each Restaurant object will have its own name
    _______ String name;
    
    // Each Restaurant object will have its own cuisine type
    _______ String cuisineType;
    
    // Each Restaurant object will have its own seating capacity
    _______ int capacity;
    
    // Each Restaurant object will track its own current customer count
    _______ int currentCustomers;
    
    // ============================================
    // Static Variable (Class Variable)
    // ============================================
    
    // TODO: Create a private static variable to count total restaurants
    // Initialize it to 0
    // Static means this variable belongs to the class, not individual objects
    // There is only ONE copy of this variable shared by all Restaurant objects
    _______ _______ int totalRestaurants = 0;
    
    // ============================================
    // Constructor
    // ============================================
    
    // TODO: Create a public constructor that takes name, cuisineType, and capacity
    // The constructor should:
    // 1. Set the instance variables using the this keyword
    // 2. Set currentCustomers to 0
    // 3. Increment totalRestaurants by 1
    
    // Constructor has same name as the class and no return type
    // This runs automatically when we create a new Restaurant object
    _______ Restaurant(String name, String cuisineType, int capacity) {
        // TODO: Use this keyword to set instance variables
        // 'this.name' refers to the instance variable
        // 'name' refers to the parameter
        this._______ = name;
        
        // Set the instance variable cuisineType to the parameter value
        this._______ = cuisineType;
        
        // Set the instance variable capacity to the parameter value
        this._______ = capacity;
        
        // TODO: Initialize currentCustomers to 0
        // New restaurants start with no customers
        this.currentCustomers = _______;
        
        // TODO: Increment the static variable totalRestaurants
        // This keeps track of how many Restaurant objects have been created
        _______++;
    }
    
    // ============================================
    // Instance Method 1: Display restaurant information
    // ============================================
    
    // TODO: Create a public void instance method called displayInfo
    // void means it doesn't return anything, just prints
    // Instance method (no static) means it works with a specific object's data
    _______ _______ displayInfo() {
        // Print the restaurant's name (this object's name)
        System.out.println("Restaurant: " + _______);
        
        // Print the restaurant's cuisine type (this object's cuisineType)
        System.out.println("Cuisine: " + _______);
        
        // Print the restaurant's capacity (this object's capacity)
        System.out.println("Capacity: " + _______);
        
        // Print the restaurant's current customer count (this object's currentCustomers)
        System.out.println("Current Customers: " + _______);
    }
    
    // ============================================
    // Instance Method 2: Add customers
    // ============================================
    
    // TODO: Create a public void instance method called addCustomers
    // It should take an int parameter for number of customers to add
    // This method modifies the specific object's currentCustomers value
    _______ _______ addCustomers(int numCustomers) {
        // TODO: Add numCustomers to currentCustomers
        // Use += to add to the existing value
        _______ += numCustomers;
        
        // Print confirmation message showing how many customers were added
        System.out.println("Added " + numCustomers + " customers to " + name);
    }
    
    // ============================================
    // Instance Method 3: Check if at capacity
    // ============================================
    
    // TODO: Create a public method that returns boolean called isAtCapacity
    // Returns true if the restaurant is full, false otherwise
    // boolean return type means this method must return true or false
    _______ _______ isAtCapacity() {
        // TODO: Return comparison result
        // Compare currentCustomers with capacity
        // The comparison itself returns a boolean value
        return _______ >= _______;
    }
    
    // ============================================
    // Static Method 1: Display welcome message
    // ============================================
    
    // TODO: Create a public static void method called displayWelcomeMessage
    // static means this belongs to the class, not individual objects
    // void means it doesn't return anything
    // Can be called without creating any Restaurant objects
    _______ _______ _______ displayWelcomeMessage() {
        // Print welcome message line 1
        System.out.println("Welcome to the Restaurant Management System!");
        
        // Print welcome message line 2
        System.out.println("Track your restaurants and customer data easily.");
    }
    
    // ============================================
    // Static Method 2: Get total number of restaurants
    // ============================================
    
    // TODO: Create a public static method that returns int called getTotalRestaurants
    // It should return the static variable totalRestaurants
    // static method can only access static variables directly
    // Returns an int value (the count of restaurants)
    _______ _______ _______ getTotalRestaurants() {
        // Return the static variable that tracks total restaurant count
        return _______;
    }
    
    // ============================================
    // Static Method 3: Calculate average capacity
    // ============================================
    
    // TODO: Create a public static method that returns double called calculateAverageCapacity
    // It should take two Restaurant objects as parameters
    // Calculate and return the average of their capacities
    // static method can work with objects passed as parameters
    _______ _______ _______ calculateAverageCapacity(Restaurant r1, Restaurant r2) {
        // TODO: Calculate average of r1.capacity and r2.capacity
        // Hint: Cast to double for decimal result
        // Add both capacities and divide by 2.0 for decimal result
        return (r1._______ + r2._______) / 2.0;
    }
}
