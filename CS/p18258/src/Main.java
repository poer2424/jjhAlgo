import java.io.*;
import java.util.*;

class QueueNode {
  private final int value;
  private QueueNode nextNode;

  public QueueNode(int value) {
    this.value = value;
    this.nextNode = null;
  }

  public int getValue() {
    return value;
  }

  public QueueNode getNextNode() {
    return nextNode;
  }

  public void setNextNode(QueueNode nextNode) {
    this.nextNode = nextNode;
  }
}

class QueueManager {
  private QueueNode front, back;
  private int size;

  public QueueManager() {
    front = back = null;
    size = 0;
  }

  public void push(int value) {
    QueueNode newNode = new QueueNode(value);
    if (isQueueEmpty()) {
      front = back = newNode;
    } else {
      back.setNextNode(newNode);
      back = newNode;
    }
    size++;
  }

  public String pop() {
    if (isQueueEmpty()) {
      return "-1";
    } else {
      int value = front.getValue();
      front = front.getNextNode();
      if (front == null) {
        back = null;
      }
      size--;
      return String.valueOf(value);
    }
  }

  public String size() {
    return String.valueOf(size);
  }

  public String empty() {
    return isQueueEmpty() ? "1" : "0";
  }

  public String front() {
    return isQueueEmpty() ? "-1" : String.valueOf(front.getValue());
  }

  public String back() {
    return isQueueEmpty() ? "-1" : String.valueOf(back.getValue());
  }

  private boolean isQueueEmpty() {
    return size == 0;
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(reader.readLine());
    QueueManager queue = new QueueManager();
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < N; i++) {
      String input = reader.readLine();
      if (input.startsWith("push")) {
        int value = Integer.parseInt(input.split(" ")[1]);
        queue.push(value);
      } else if ("pop".equals(input)) {
        output.append(queue.pop()).append("\n");
      } else if ("size".equals(input)) {
        output.append(queue.size()).append("\n");
      } else if ("empty".equals(input)) {
        output.append(queue.empty()).append("\n");
      } else if ("front".equals(input)) {
        output.append(queue.front()).append("\n");
      } else if ("back".equals(input)) {
        output.append(queue.back()).append("\n");
      }
    }

    writer.write(output.toString());
    writer.flush();
  }
}
