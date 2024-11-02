/*
 * Guilherme dos Santos
 * Lab 9
 * Library project
 * 11/02/2024
 */

public class Lab9 {

    public static class LibraryBook {

        // Instance variables
        private String title;
        private String author;
        private int numPages;

        // number of books in the library
        private static int totalBooks = 0;

        // Static constant to represent the category of books
        public static String CATEGORY;

        // Constructor
        public LibraryBook(String title, String author, int numPages) {
            this.title = title;
            this.author = author;
            this.numPages = numPages;
            totalBooks++; // Increment
        }

        // Method chaining for setting the title
        public LibraryBook setTitle(String title) {
            this.title = title;
            return this; // Return the current instance for chaining
        }

        // Method chaining for setting the author
        public LibraryBook setAuthor(String author) {
            this.author = author;
            return this; // Return the current instance for chaining
        }

        // Method chaining for setting the number of pages
        public LibraryBook setNumPages(int numPages) {
            this.numPages = numPages;
            return this; // Return the current instance for chaining
        }

        public LibraryBook setCATEGORY(String category) {
            this.CATEGORY = category;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getNumPages() {
            return numPages;
        }

        public String getCATEGORY() {
            return CATEGORY;
        }

        // Method to display information about the book
        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Number of Pages: " + numPages);
            System.out.println("Category: " + CATEGORY);
        }

        // Static method to get the total number of books
        public static int getTotalBooks() {
            return totalBooks;
        }

        // Main method to demonstrate the class functionality
        public static void main(String[] args) {
            // Create an instance of LibraryBook and demonstrate method chaining
            LibraryBook book1 = new LibraryBook("Harry Potter", "J.K. Rowling", 309)
                    .setTitle("1984")
                    .setAuthor("George Orwell")
                    .setNumPages(328);

            // Display the information of the book
            book1.displayInfo();

            // Display the total number of books in the library
            System.out.println("Total number of books: " + LibraryBook.getTotalBooks());

            LibraryBook book2 = new LibraryBook("Harry Potter 2", "J.K Rowling", 309)
                    .setTitle("1984")
                    .setAuthor("George Orwell")
                    .setNumPages(328);
            book2.displayInfo();

            // Display the updated total number of books
            System.out.println("Total number of books: " + LibraryBook.getTotalBooks());

            book1.setCATEGORY("Non-fiction");
            book1.displayInfo();
        }
    }
    /*
     * Output:
     * Title: 1984
     * Author: George Orwell
     * Number of Pages: 328
     * Category: null
     * Total number of books: 1
     * Title: 1984
     * Author: George Orwell
     * Number of Pages: 328
     * Category: null
     * Total number of books: 2
     * Title: 1984
     * Author: George Orwell
     * Number of Pages: 328
     * Category: Non-fiction
     * 
     */

}
