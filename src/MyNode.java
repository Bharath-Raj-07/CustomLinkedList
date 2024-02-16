public class MyNode{
    private Integer value;
    private MyNode next;

    public MyNode(Integer value) {
        this.value = value;
        this.next = null;
    }
    public MyNode getNext() {
        return next;
    }
    public void setNext(MyNode next) {
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
