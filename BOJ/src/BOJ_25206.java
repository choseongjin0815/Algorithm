import java.util.Scanner;

public class BOJ_25206 {

    static Double scoreConvert(String grade) {
//        System.out.println(grade);
        if(grade.equals("A+")) {
            return 4.5;
        }else if(grade.equals("A0")) {
            return 4.0;
        }else if(grade.equals("B+")) {
            return 3.5;
        }else if(grade.equals("B0")) {
            return 3.0;
        }else if(grade.equals("C+")) {
            return 2.5;
        }else if(grade.equals("C0")) {
            return 2.0;
        }else if(grade.equals("D+")) {
            return 1.5;
        }else if(grade.equals("D0")) {
            return 1.0;
        }else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        String[][] scoreList = new String[20][3];
        Double totalScore = 0.0; //평점 합 A+에 3학점 4.5 * 3.0
        Double totalPoint = 0.0; // 학점 합 3학점 3.0
        Double result = 0.0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 20; i++) {
            for(int j = 0; j < 3; j++) {
                scoreList[i][j] = sc.next();
            }
            if(!scoreList[i][2].equals("P")) {
                totalScore += scoreConvert(scoreList[i][2]) * Double.parseDouble(scoreList[i][1]);
                totalPoint += Double.parseDouble(scoreList[i][1]);
            }
//            System.out.println(scoreList[i][0] + " " + scoreList[i][1] + " " + scoreList[i][2]);
        }

        result = totalScore / totalPoint;
        System.out.printf("%.6f", result);


    }
}
