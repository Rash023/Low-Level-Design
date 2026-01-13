package behavioral_design_patterns.memento_design_pattern;

import java.util.Stack;

public class EditorHistory {
    private Stack<Memento> history=new Stack<>();

    public void push(Memento memento){
        history.push(memento);
    }

    public Memento pop(){
        if(!history.empty()){
            return history.pop();
        }
        return null;
    }
}
