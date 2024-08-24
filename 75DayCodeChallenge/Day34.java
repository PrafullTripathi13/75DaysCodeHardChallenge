
public class Day34 { // Instance variables to store different attributes of a day
    private int dayNum;
    private String month;
    private int year;

    public Day34() {// Default constructor
        this.dayNum = 1;
        this.month = "January";
        this.year = 2024;
    }

    public Day34(int dayNum) {// Constructor with day number argument:
        this.dayNum = dayNum;
        this.month = "January";
        this.year = 2024;
    }

    public Day34(int dayNum, String month) {// Constructor with day number and month arguments: Initializes day and
                                            // month
        this.dayNum = dayNum;
        this.month = month;
        this.year = 2024;
    }

    public Day34(int dayNum, String month, int year) {// Constructor with day number, month, and year arguments
        this.dayNum = dayNum;
        this.month = month;
        this.year = year;
    }

    public int getDayNum() { // Getter methods to access the instance variables
        return dayNum;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String displayDate() { // Method to display the date in a formatted string
        return dayNum + "-" + month + "-" + year;
    }

    public static void main(String[] args) { // Create instances using different overloaded constructors
        Day34 date1 = new Day34(); // Default constructor
        Day34 date2 = new Day34(15); // Constructor with day number
        Day34 date3 = new Day34(27, "February"); // Constructor with day number and month
        Day34 date4 = new Day34(10, "March", 2025); // Constructor with all attributes
        // Display the dates in formatted strings
        System.out.println("Date 1: " + date1.displayDate());
        System.out.println("Date 2: " + date2.displayDate());
        System.out.println("Date 3: " + date3.displayDate());
        System.out.println("Date 4: " + date4.displayDate());
    }
}
