package behavioral_design_patterns.memento_design_pattern;

class Memento {
    private final String text;

    public Memento(String text){
        this.text=text;
    }

    public String getText(){
        return text;
    }
}
