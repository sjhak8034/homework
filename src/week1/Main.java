package week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        // 제목 받아오고 붙이기
        String title = sc.nextLine();
        ans += "\n" + "[ " + title + " ]" + "\n";
        //평점 받고 붙이기
        double rate = sc.nextDouble();
        int intRate = (int) rate;
        double percentRate = (double) intRate / 5 * 100;
        ans += "별점 : " + intRate + " (" + percentRate + "%)\n";

        //double을 불러온 다음 개행문자를 스킵한다
        sc.skip("[\\r\\n]+");

        //문장 받아오고 붙이기
        for (int i = 0; i < 10; i++) {
            String str = sc.nextLine();
            ans += (i + 1) + "." + str + "\n";
        }
        System.out.println(ans);
    }
}