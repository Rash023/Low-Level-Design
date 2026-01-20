package structural_design_patterns.bridge_design_pattern;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Renderer renderer, double width, double height) {
        super(renderer);
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        renderer.renderRectangle(width, height);
    }
}