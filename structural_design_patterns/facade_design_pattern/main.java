package structural_design_patterns.facade_design_pattern;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MediaFacade mediaFacade = new MediaFacade();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multimedia App!");
        System.out.println("Choose an action: playMusic, playVideo, viewImage");
        String action = scanner.nextLine();
        mediaFacade.performAction(action);
        scanner.close();
    }
}
