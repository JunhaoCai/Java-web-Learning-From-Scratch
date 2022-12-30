package Homeworks.HomeworkDay02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class GradeLevel {
    public static String gradeLevelUsingFor(double grade) {
        if (90<=grade && grade <=100){
            return "A";
        }else if (80 <=grade && grade < 90){
            return "B";
        }else if (70 <= grade && grade < 80){
            return "C";
        }else if (60 <= grade && grade< 80){
            return "D";
        }else if (0 <= grade && grade < 60){
            return "E";
        }
        else {
            return "Error";
        }
    }

    public static String gradeLevelUsingSwitch(double grade) {
        int gradeForLevel = (int) grade / 10;

        switch (gradeForLevel){
            case 10  :
            case 9  :
                return "A";
            case 8 :
                return "B";
            case 7 :
                return "C";
            case 6 :
                return "D";
            case 5 :
            case 4 :
            case 3 :
            case 2 :
            case 1 :
            case 0 :
                return "E";
            default:
                return "Error";
        }
    }
    public static void main(String[] args) {
        System.out.println(gradeLevelUsingSwitch(82));
        System.out.println(gradeLevelUsingFor(90));
        System.out.println(gradeLevelUsingFor(900));
        System.out.println(gradeLevelUsingSwitch(883));
    }
}
