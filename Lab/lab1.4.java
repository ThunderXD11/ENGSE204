package lab1;

import java.util.Scanner;

public class lab14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ป้อนคะแนนสอบ (0-100): ");
        
        if (scanner.hasNextInt()) {
            int score = scanner.nextInt();
            
            if (score < 0 || score > 100) {
                System.out.println("คะแนนไม่ถูกต้อง กรุณาป้อนคะแนนระหว่าง 0 ถึง 100");
            } else {
                String grade = calculateGrade(score);
                System.out.println("เกรดที่ได้คือ: " + grade);
            }
        } else {
            System.out.println("อินพุตไม่ถูกต้อง กรุณาป้อนจำนวนเต็มเท่านั้น");
        }
        
        scanner.close();
    }

    public static String calculateGrade(int score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
