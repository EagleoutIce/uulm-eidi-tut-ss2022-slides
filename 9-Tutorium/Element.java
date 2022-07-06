class Element {
    private final int value;
    private Element next;

    public Element(int value) {
        this.value = value;
        this.next = null;
    }

    public void setNextElement(Element nextElement) {
        this.next = nextElement;
    }

    public Element getNextElement() {
        return this.next;
    }

    public int getValue() {
        return this.value;
    }
}
