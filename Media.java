// File: library/Media.java
package library;

public class Media {
    private String title;
    private String publisher;
    private int year;
    private boolean isAvailable;

    public Media(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Item is already borrowed.");
        }
    }

    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
        } else {
            System.out.println("Item is already available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed"));
    }
}

// File: library/Borrowable.java
package library;

public interface Borrowable {
    void borrowItem();
    void returnItem();
}

// File: library/Book.java
package library;

public class Book extends Media implements Borrowable {
    private String author;

    public Book(String title, String publisher, int year, String author) {
        super(title, publisher, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

// File: library/Magazine.java
package library;

public class Magazine extends Media implements Borrowable {
    private int issueNumber;

    public Magazine(String title, String publisher, int year, int issueNumber) {
        super(title, publisher, year);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

// File: library/DVD.java
package library;

public class DVD extends Media implements Borrowable {
    private int duration; // in minutes

    public DVD(String title, String publisher, int year, int duration) {
        super(title, publisher, year);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " minutes");
    }
}

// File: library/LibraryApp.java
package library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    private static ArrayList<Media> mediaList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addMedia();
                    break;
                case 2:
                    borrowMedia();
                    break;
                case 3:
                    returnMedia();
                    break;
                case 4:
                    viewMediaDetails();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Add Media");
        System.out.println("2. Borrow Media");
        System.out.println("3. Return Media");
        System.out.println("4. View Media Details");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addMedia() {
        System.out.println("Select media type to add: ");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. DVD");
        int type = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (type) {
            case 1:
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                mediaList.add(new Book(title, publisher, year, author));
                break;
            case 2:
                System.out.print("Enter issue number: ");
                int issueNumber = scanner.nextInt();
                mediaList.add(new Magazine(title, publisher, year, issueNumber));
                break;
            case 3:
                System.out.print("Enter duration (minutes): ");
                int duration = scanner.nextInt();
                mediaList.add(new DVD(title, publisher, year, duration));
                break;
            default:
                System.out.println("Invalid media type.");
        }
    }

    private static void borrowMedia() {
        System.out.print("Enter the title of the media to borrow: ");
        String title = scanner.nextLine();
        Media media = findMediaByTitle(title);
        if (media != null) {
            if (media instanceof Borrowable) {
                media.borrowItem();
            } else {
                System.out.println("This media cannot be borrowed.");
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    private static void returnMedia() {
        System.out.print("Enter the title of the media to return: ");
        String title = scanner.nextLine();
        Media media = findMediaByTitle(title);
        if (media != null) {
            if (media instanceof Borrowable) {
                media.returnItem();
            } else {
                System.out.println("This media cannot be returned.");
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    private static void viewMediaDetails() {
        System.out.print("Enter the title of the media to view: ");
        String title = scanner.nextLine();
        Media media = findMediaByTitle(title);
        if (media != null) {
            media.displayDetails();
        } else {
            System.out.println("Media not found.");
        }
    }

    private static Media findMediaByTitle(String title) {
        for (Media media : mediaList) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
}
