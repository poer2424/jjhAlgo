import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/*
    BAEKJOON 25206번 너의 평점은
    https://www.acmicpc.net/problem/25206
*/

public class Main {

  public static ArrayList<Float> pyeongjomlistFloat = new ArrayList<>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    ArrayList<Float> hakjomlist = new ArrayList<>();
    ArrayList<String> pyeongjomlist = new ArrayList<>();

    for(int i = 0; i < 20; i++){
      String name = scanner.next();
      float hakjom = scanner.nextFloat();
      String pyeongjom = scanner.next();
      if(Objects.equals(pyeongjom, "P")){
        continue;
      }
      hakjomlist.add(hakjom);
      pyeongjomlist.add(pyeongjom);
    }

    pyeongjomChanger(pyeongjomlist);

    float sum = 0;
    float sumhak = 0;
    for(int i = 0; i < pyeongjomlistFloat.size(); i++){
      float temp = hakjomlist.get(i) * pyeongjomlistFloat.get(i);
      sum += temp;
    }
    for(int i = 0; i < hakjomlist.size(); i++){
      sumhak += hakjomlist.get(i);
    }

    System.out.println(sum/ sumhak);


  }

  public static void pyeongjomChanger(ArrayList<String> list) {
    for(int i = 0; i < list.size(); i++){
      if(Objects.equals(list.get(i), "A+")){
        pyeongjomlistFloat.add(4.5F);
      }
      if(Objects.equals(list.get(i), "A0")){
        pyeongjomlistFloat.add(4.0F);
      }
      if(Objects.equals(list.get(i), "B+")){
        pyeongjomlistFloat.add(3.5F);
      }
      if(Objects.equals(list.get(i), "B0")){
        pyeongjomlistFloat.add(3.0F);
      }
      if(Objects.equals(list.get(i), "C+")){
        pyeongjomlistFloat.add(2.5F);
      }
      if(Objects.equals(list.get(i), "C0")){
        pyeongjomlistFloat.add(2.0F);
      }
      if(Objects.equals(list.get(i), "D+")){
        pyeongjomlistFloat.add(1.5F);
      }
      if(Objects.equals(list.get(i), "D0")){
        pyeongjomlistFloat.add(1.0F);
      }
      if(Objects.equals(list.get(i), "F")){
        pyeongjomlistFloat.add(0.0F);
      }
    }
  }
}
