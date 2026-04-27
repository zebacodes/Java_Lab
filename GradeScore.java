import java.util.*;

class Grader {
    int score;

    Grader(int s){
        score = s;
    }

    char letterGrade(){
        if(score>=90) return 'O';
        else if(score>=80) return 'E';
        else if(score>=70) return 'A';
        else if(score>=60) return 'B';
        else if(score>=50) return 'C';
        else return 'F';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        if(s<0 || s>100){
            System.out.println("Invalid Input");
        } else {
            Grader g = new Grader(s);
            System.out.println("Grade: " + g.letterGrade());
        }
    }
}
