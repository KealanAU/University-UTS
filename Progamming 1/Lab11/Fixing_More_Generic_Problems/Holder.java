public class Holder<E> {
    private final E element;

    public Holder(E element) {
        this.element = element;
    }

    public String getElement() {
        return ""+this.element+"";
    }
}
