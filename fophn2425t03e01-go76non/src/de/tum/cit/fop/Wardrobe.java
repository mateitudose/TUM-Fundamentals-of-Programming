package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private List<String> stack;

    public Wardrobe() {
        this.stack = new ArrayList<>();
    }

    public List<String> getStack() {
        return stack;
    }

    public void setStack(List<String> stack) {
        this.stack = stack;
    }

    public void addItemToStack(String item) {
        stack.add(item);
    }

    public void takeItemFromStack() {
        if (stack.isEmpty()) {
            return;
        }
        System.out.println(stack.get(stack.size() - 1) + " is hanging");
        stack.remove(stack.size() - 1);
    }
}
