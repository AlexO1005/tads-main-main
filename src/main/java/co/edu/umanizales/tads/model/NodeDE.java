package co.edu.umanizales.tads.model;

import lombok.Data;

@Data
public class NodeDE {
    private Pet data;
    private NodeDE nextDE;
    private NodeDE previousDE;
    private NodeDE next;

    public NodeDE(Pet data) {
        this.data = data;
    }

    public NodeDE getNext() {

    }

    public void setNext(NodeDE next) {
        this.next = next;
    }

    public void setPrev(NodeDE prev) {
        this.previousDE = prev;
    }

    public NodeDE getPrev() {
        return null;
    }

    public void SetpreviousDE(NodeDE head) {
    }
}