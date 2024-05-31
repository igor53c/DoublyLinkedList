final class LinkedListJava<T> {
    private Element<T> head;

    void push(T value) {
        Element<T> newNode = new Element<>(value, null, null);
        if (head == null) {
            head = newNode;
            head.setNext(head);
            head.setPrev(head);
        } else {
            Element<T> tail = head.getPrev();
            tail.setNext(newNode);
            newNode.setPrev(tail);
            newNode.setNext(head);
            head.setPrev(newNode);
        }
    }

    T pop() {
        if (head == null) {
            return null;
        }
        Element<T> tail = head.getPrev();
        if (head == tail) {
            T value = head.getValue();
            head = null;
            return value;
        } else {
            head = tail;
            return shift();
        }
    }

    T shift() {
        if (head == null) {
            return null;
        }
        T value = head.getValue();
        if (head.getNext() == head) {
            head = null;
        } else {
            Element<T> newHead = head.getNext();
            Element<T> newTail = head.getPrev();
            newHead.setPrev(newTail);
            newTail.setNext(newHead);
            head = newHead;
        }
        return value;
    }

    void unshift(T value) {
        push(value);
        head = head.getPrev();
    }
}