package behavioral_design_patterns.memento_design_pattern;

public class main {
    public static void main(String[] args) {
        TextEditor editor=new TextEditor();
        EditorHistory history=new EditorHistory();
        editor.setText("Hello");
        System.out.println("Current text is :-"+editor.getText());
        history.push(editor.save());
        editor.setText("Hello World!");
        System.out.println("Current text is :-"+editor.getText());
        history.push(editor.save());
        editor.setText("Hello, World! Welcome to Memento Pattern.");
        System.out.println("Current text: " + editor.getText());

        Memento previousState=history.pop();
        editor.restore(previousState);
        System.out.println("After undo, text: "+editor.getText());
        previousState = history.pop();
        editor.restore(previousState);
        System.out.println("After second undo, text: " + editor.getText());

    }
}
