package Homeworks.HomeworkDay02;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class DescriptionOfSeason {
    /**
     3~5月为春季，6～8月为夏季，9～11月为秋季，12～2月为冬季
     */
    public static String descriptionOfSeasons(int month){
        if (3 <=month && month <= 5){
            return "春天：春暖花开 春风得意 踏青 迎春";
        }else if (6 <= month && month <= 8){
            return "夏天：夏日炎炎 夏虫蠹木 游泳 烧烤";
        }else if (9 <= month && month <= 11){
            return "秋天：秋高气爽 秋叶落寞 赏枫 秋游";
        }else if (month == 12 || month == 1 || month == 2){
            return "冬天：冬寒腰酸 冬眠不起 滑冰 打雪仗";
        }else {
            return "Error";
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("请输入月份：");
            Scanner sc = new Scanner(System.in);
            int season = sc.nextInt();
            System.out.println(descriptionOfSeasons(season));
        }
    }
}
