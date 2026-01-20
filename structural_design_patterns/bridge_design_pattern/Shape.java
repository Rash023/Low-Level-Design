package structural_design_patterns.bridge_design_pattern;

public abstract class Shape {
    protected Renderer renderer;
    // Constructor to accept a renderer
    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }
    public abstract void draw();
}