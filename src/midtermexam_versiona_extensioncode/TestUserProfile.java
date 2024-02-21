/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;


/**
 *
 * @author krima
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display available genres
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i+1) + ". " + genres[i]);
        }

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Prompt the user to choose their favorite genre
        System.out.print("Choose your favorite genre (enter the number): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (choice < 1 || choice > genres.length) {
            System.out.println("Invalid choice!");
            return;
        }
        String userGenre = genres[choice - 1];

        // Create a UserProfile object with the provided information
        UserProfile userProfile = new UserProfile(userName, userGenre);

        // Display a message indicating that the user profile was created
        System.out.println("User profile created successfully for " + userName + " with favorite genre: " + userGenre);

        scanner.close();
    }
}

