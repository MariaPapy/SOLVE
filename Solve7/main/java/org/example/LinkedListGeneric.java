package org.example;

public class LinkedListGeneric<T> {
    private tNode root;

    public void add(T item){
        tNode<T> newNode = new tNode(item);
        tNode lastNode = findLast();
        if (lastNode == null){
            root = newNode;
        }else {
            lastNode.setNext(newNode);
        }
    }
    private tNode findLast(){
        tNode last = null;
        if (root != null) {
            last = root;
            while (last.getNext() != null) {
                last = last.getNext();
            }
        }

        return last;
    }

    public T get(int index){
        tNode res = root;
        int i = 0;
        while (i < index){
            res = res.getNext();
            i++;
        }
        return (T) res.getNode();
    }

    public int size(){
        int size = 0;
        tNode Go;

        Go = root;
        if (Go == null){
            return 0;
        }
        while (Go != null){
            Go = Go.getNext();
            size++;
        }
        return size;
    }
}

class tNode<K>{
    private K value;
    private  tNode next;
    public tNode(K value) {
        this.value = value;
        this.next = null;
    }

    public tNode(K value, tNode next){
        this.value = value;
        this.next = next;
    }

    public K getNode(){
        return value;
    }

    public void setValue(K value){
        this.value = value;
    }

    public  tNode getNext(){
        return next;
    }

    public void setNext(tNode next){
        this.next = next;
    }


}
