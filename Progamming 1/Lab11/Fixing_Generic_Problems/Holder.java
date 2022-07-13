public class Holder<E> {

    Object element;

    public Holder(E element) {
        this.element = element;
    }

    public <E> E getElement() {
        return (E) this.element;
    }
}
