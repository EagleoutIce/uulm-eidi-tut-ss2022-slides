import java.util.NoSuchElementException;

public class RingBuffer {
    private Element head;
    private Element tail;
    private boolean isEmpty;

    // aufgabe 2b
    public RingBuffer(int capacity) {

        if(capacity == 0) {
            this.isEmpty = false;
            return;
        }

        if(capacity < 0){
            throw new NegativeArraySizeException();
        }

        /* lege das erste element an und
        head und tail zeigen darauf */
        Element current = new Element();
        this.head = current;
        this.tail = current;
        this.isEmpty = true;

        /* fuelle den ring bufer */
        for(int i = 1; i < capacity; i++) {

            Element next = new Element();
            current.setNextElement(next);
            next.setPreviousElement(current);

            if(i == capacity - 1)
                next.setNextElement(head);

            current = next;
        }
        /* jetzt fehlt noch die verbindung vom ersten
        zum letzten element. head zeigt noch auf das erste element
        und current ist das letzte eingefügt element */
        this.head.setPreviousElement(current);
        current.setNextElement(head);
    }

    // augabe 2c
    public int peek(){
        if(this.isEmpty){
             throw new NoSuchElementException();
        }
        return head.getValue();
    }

    // aufgabe 2d
    /* lege ein element an das ende des
    ring buffers und verschiebe tail entsprechend */
    public void put(int value) {
        /* wird eingefuegt wenn head und tail auf das gleiche
        element zeigen und der buffer nicht leer ist, soll auch head
        auf den nachfolger verschoben werden (FIFO) */
        if(this.tail.equals(this.head) && !this.isEmpty){
            System.out.println("Es kommt zum Überlauf!");
            System.out.printf("Überschreibe Element %d mit %d \n", this.head.getValue(), value);
            this.head = this.head.getNextElement();
        }
        this.tail.setValue(value);
        this.tail = this.tail.getNextElement();
        // nach put ist der buffer auf jeden fall nicht leer
        this.isEmpty = false;
    }


    // aufgabe 2e
    /* entferne das element auf das head zeigt und verschiebe
    head auf den vorgaenger */
    public int remove() {
        if(this.isEmpty){
            throw new NoSuchElementException();
        }

        int value = this.head.getValue();
        this.head = this.head.getNextElement();

        /* buffer wird nur leer, wenn head tail
        ''von hinten'' eingeholt hat. dies kann nur
        nach einer remove operation passieren */
        this.isEmpty = this.head.equals(tail);

        return value;
    }

    public static void main(String[] args) {
        System.out.println("Erstelle Ring Buffer");
        try{
            RingBuffer buffer = new RingBuffer(-2);
        } catch (NegativeArraySizeException e){
            System.out.println(e);
        }

        RingBuffer buffer = new RingBuffer(2);

        try{
            buffer.remove();
        } catch (NoSuchElementException e){
            System.out.println(e);
        }

        System.out.println("Füge Elemente [5 4] hinzu");
        buffer.put(5);
        buffer.put(4);

        System.out.println("Das erste Element hat folgenden Wert:");
        System.out.println(buffer.peek());

        System.out.println("Entferne Elemente");
        System.out.println(buffer.remove());
        System.out.println(buffer.remove());
        try{
            buffer.remove();
        } catch (NoSuchElementException e){
            System.out.println(e);
        }

        System.out.println("Füge Elemente [3 2 1] hinzu");
        buffer.put(3);
        buffer.put(2);
        buffer.put(1);

        System.out.println("Das erste Elemente hat folgenden Wert:");
        System.out.println(buffer.peek());

        System.out.println("Entferne Elemente");
        System.out.println(buffer.remove());
        System.out.println(buffer.remove());
        try{
            buffer.remove();
        } catch (NoSuchElementException e){
            System.out.println(e);
        }

    }
}
