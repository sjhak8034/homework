package week2_new;


import java.util.*;
public class new_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("저장할 자료구조명을 입력해 주세요");
        String typeOfList = sc.nextLine();
        switch (typeOfList) {
            case "List":
                List<String> list = new ArrayList<String>();
                while (true){
                    String sentence = sc.nextLine();
                    if (sentence.equals("끝")){
                        break;
                    }
                    list.add(sentence);

                }
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));

                }
                break;
            case "Set":
                Set<String> Set = new HashSet<String>();


                while (true){
                    String sentence = sc.nextLine();
                    System.out.println(sentence);
                    if(sentence.equals("끝")){
                        break;
                    }
                    Set.add(sentence);

                }
                break;
            case "Map":
                Map<Integer,String> Map = new HashMap<>();
                int n = 0;
                while (true){
                    String sentence = sc.nextLine();
                    if(sentence.equals("끝")){
                        break;
                    }
                    Map.put(n,sentence);
                    n++;
                }
                for (int i = 0; i < Map.size(); i++) {
                    System.out.println(Map.get(i));
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
        while (true){
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
