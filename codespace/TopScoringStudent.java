import java.util.Scanner;

public class TopScoringStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student 1 name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Student 1 score: ");
        int score1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student 2 name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Student 2 score: ");
        int score2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student 3 name: ");
        String name3 = sc.nextLine();
        System.out.print("Enter Student 3 score: ");
        int score3 = sc.nextInt();

        if (score1 >= score2 && score1 >= score3) {
            System.out.println("Top-scoring student: " + name1);
            System.out.println("Score: " + score1);
        } else if (score2 >= score1 && score2 >= score3) {
            System.out.println("Top-scoring student: " + name2);
            System.out.println("Score: " + score2);
        } else {
            System.out.println("Top-scoring student: " + name3);
            System.out.println("Score: " + score3);
        }

        sc.close();
    }
}