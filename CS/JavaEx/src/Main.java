import java.util.Objects;
import java.util.Scanner;
class QueueNode {
  private final int value;
  private QueueNode queuenode;

  public QueueNode (int value) {
    this.value = value;
    this.queuenode = null; //다음노드
  }
  public int getValue () {
    return value;
  }
  public QueueNode getNextNode () {
    return queuenode;
  }
  public void setNextNode (QueueNode queueNode) {
    this.queuenode = queueNode;
  }
}

class QueueManager {
  private QueueNode front,back;
  public QueueManager () {
    front = back = null;
  }
  public boolean isQueueEmpty () {
    if(front == null && back == null) {
      return true;
    }
    else {
      return false;
    }
  }
  public void push (int value) {
    QueueNode queuenode = new QueueNode(value);
    if(isQueueEmpty()) {
      front = back = queuenode;
    }
    else {
      back.setNextNode(queuenode);
      back = queuenode;
    }
  }
  public void pop () {
    if(isQueueEmpty()) {
      System.out.println(-1);
    }
    else {
      QueueNode popnode = front;
      front = front.getNextNode();

      if (front == null) {
        back = null;
      }
      System.out.println(popnode.getValue());
    }
  }

  public void size () {
    if (isQueueEmpty()) {
      System.out.println(0);
      return;
    }
    int checkint = 1;
    QueueNode checknode = front;
    while (true) {
      if (checknode.getNextNode() != null) {
        checkint++;
        checknode = checknode.getNextNode();
      }
      else {
        break;
      }
    }
    System.out.println(checkint);
  }

  public void peek () {
    if (isQueueEmpty()) {
      System.out.println("empty");
    }
    else {
      System.out.println(back.getValue());
    }
  }

  public void empty () {
    if (isQueueEmpty()) {
      System.out.println(1);
    }
    else {
      System.out.println(0);
    }
  }

  public void printfront () {
    if (isQueueEmpty()) {
      System.out.println(-1);
    }
    else {
      System.out.println(front.getValue());
    }
  }

  public void printback () {
    if (isQueueEmpty()) {
      System.out.println(-1);
    }
    else {
      System.out.println(back.getValue());
    }
  }


}


//연습장//

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 코드를 작성하세요.

    int N = scanner.nextInt();
    QueueManager queue = new QueueManager();

    for (int i = 0; i < N; i++) {
      String input = scanner.next();
      if (Objects.equals(input, "push")) {
        int pushint = scanner.nextInt();
        queue.push(pushint);
      }
      else if (Objects.equals(input, "pop")) {
        queue.pop();
      }
      else if (Objects.equals(input, "size")) {
        queue.size();
      }
      else if (Objects.equals(input, "empty")) {
        queue.empty();
      }
      else if (Objects.equals(input, "front")) {
        queue.printfront();
      }
      else if (Objects.equals(input, "back")) {
        queue.printback();
      }
      else {
        return;
      }

    }
  }
}

