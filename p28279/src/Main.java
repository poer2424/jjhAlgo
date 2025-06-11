import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Objects;

/*
 BAEKJOON 28279번 덱 2
 https://www.acmicpc.net/problem/28279
*/

public class Main {

    public static class DequeNode {
        private int value;
        private DequeNode prev;
        private DequeNode next;

        public DequeNode(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public int getValue() {
            return this.value;
        }

        public DequeNode getPrev() {
            return this.prev;
        }

        public DequeNode getNext() {
            return this.next;
        }

        public void setPrev(DequeNode prev) {
            this.prev = prev;
        }

        public void setNext(DequeNode next) {
            this.next = next;
        }
    }

    public static class DequeManager {
        private DequeNode front, back;
        private int size;

        public DequeManager() {
            front = back = null;
            size = 0;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public void addBack(int value) {
            DequeNode node = new DequeNode(value);
            if (isEmpty()) {
                front = back = node;
            } else {
                back.setNext(node);
                node.setPrev(back);
                back = node;
            }
            size++;
        }

        public void addFront(int value) {
            DequeNode node = new DequeNode(value);
            if (isEmpty()) {
                front = back = node;
            } else {
                node.setNext(front);
                front.setPrev(node);
                front = node;
            }
            size++;
        }

        public int removeFront() {
            if (isEmpty()) {
                return -1;
            } else {
                DequeNode removeNode = front;
                front = front.getNext();
                if (front != null) {
                    front.setPrev(null);
                } else {
                    back = null;
                }
                size--;
                return removeNode.getValue();
            }
        }

        public int removeBack() {
            if (isEmpty()) {
                return -1;
            } else {
                DequeNode removeNode = back;
                back = back.getPrev();
                if (back != null) {
                    back.setNext(null);
                } else {
                    front = null;
                }
                size--;
                return removeNode.getValue();
            }
        }

        public int size() {
            return size;
        }

        public int getFront() {
            if (isEmpty()) {
                return -1;
            } else {
                return front.getValue();
            }
        }

        public int getBack() {
            if (isEmpty()) {
                return -1;
            } else {
                return back.getValue();
            }
        }
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        DequeManager deque = new DequeManager();

        StringBuilder sb = new StringBuilder();  // StringBuilder로 출력 결합

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            String[] parts = input.split(" ");

            if (Objects.equals(parts[0], "1")) {
                deque.addFront(Integer.parseInt(parts[1]));
            } else if (Objects.equals(parts[0], "2")) {
                deque.addBack(Integer.parseInt(parts[1]));
            } else if (Objects.equals(parts[0], "3")) {
                sb.append(deque.removeFront()).append("\n");
            } else if (Objects.equals(parts[0], "4")) {
                sb.append(deque.removeBack()).append("\n");
            } else if (Objects.equals(parts[0], "5")) {
                sb.append(deque.size()).append("\n");
            } else if (Objects.equals(parts[0], "6")) {
                if (deque.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (Objects.equals(parts[0], "7")) {
                sb.append(deque.getFront()).append("\n");
            } else if (Objects.equals(parts[0], "8")) {
                sb.append(deque.getBack()).append("\n");
            }
        }

        bw.write(sb.toString());  // 한번에 모든 출력
        bw.flush();  // 한 번만 flush
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
