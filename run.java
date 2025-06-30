
import java.util.*;

class SinglyLinkedListNode {

    String data;
    SinglyLinkedListNode next;
}

class run {

    public static SinglyLinkedListNode finalCart(SinglyLinkedListNode head, List<List<String>> queries) {
        for (List<String> query : queries) {
            String operation = query.get(0);
            String value = query.size() > 1 ? query.get(1) : "";

            switch (operation) {
                case "POP_HEAD":
                    if (head != null) {
                        head = head.next;
                    }
                    break;

                case "PUSH_HEAD":
                    SinglyLinkedListNode newHead = new SinglyLinkedListNode();
                    newHead.data = value;
                    newHead.next = head;
                    head = newHead;
                    break;

                case "PUSH_TAIL":
                    SinglyLinkedListNode newNode = new SinglyLinkedListNode();
                    newNode.data = value;
                    if (head == null) {
                        head = newNode;
                    } else {
                        SinglyLinkedListNode current = head;
                        while (current.next != null) {
                            current = current.next;
                        }
                        current.next = newNode;
                    }
                    break;
            }
        }
        return head;
    }
}
