package week2;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("저장할 자료구조명을 입력해 주세요");
        String typeOfList = sc.nextLine();
        switch (typeOfList) {
            case "List":
                List<String> list = new ArrayList<String>();
                listAdd(list);
                System.out.println("[ List 으로 저장된 백종원 돼지고기 김치찌개 만들기 ]");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println( (i+1)+". " + list.get(i));
                }
                break;
            case "Set":
                Set<String> Set = new LinkedHashSet<String>();
                setAdd(Set);
                int count = 0;
                System.out.println("[ Set 으로 저장된 백종원 돼지고기 김치찌개 만들기 ]");
                for (String s : Set) {

                    System.out.println((count+1)+". " +s);
                    count++;
                }
                break;
            case "Map":
                Map<Integer,String> Map = new HashMap<>();
                mapAdd(Map);
                System.out.println("[ Map 으로 저장된 백종원 돼지고기 김치찌개 만들기 ]");
                for (int i = 0; i < Map.size(); i++) {
                    System.out.println((i+1)+". " +Map.get(i));
                }
                break;
        }
    }
    public static void listAdd(List<String> list) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String sentence = sc.nextLine();
            if (sentence.equals("끝")){
                break;
            }
            list.add(sentence);

        }

    }
    public static void setAdd(Set<String> set) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true){
            i++;
            String sentence = sc.nextLine();

            if(sentence.equals("끝")){
                break;
            }

            set.add(sentence);

        }
    }
    public static void mapAdd(Map<Integer, String> map) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true){
            String sentence = sc.nextLine();
            if(sentence.equals("끝")){
                break;
            }
            map.put(i,sentence);
            i++;
        }



    }
}

