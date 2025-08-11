import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//input
        //try-catch block
        try {
            System.out.println("Enter scores (comma-separated): ");
            String input = sc.nextLine();//accept value from input ,nextLine() will read all

            if(input.trim().isEmpty()){
                throw new IllegalArgumentException("The array cannot be empty!");
            }
            String[] collectScores = input.split(",");
            int[] scores = new int[collectScores.length];
                for (int i = 0; i < collectScores.length; i++) {
                    scores[i] = Integer.parseInt(collectScores[i].trim());//trim is delete space when user typing and press space bar
                }

            StudentGrades student = new StudentGrades();
            student.scores = scores;
            student.calculateAverage(scores);
        }catch (NumberFormatException e){
            System.out.println("Invalid input: Please enter a valid number for scores."+e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }catch (FailedSignificantlyException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Grade calculation process concluded");
        }
    }
}
