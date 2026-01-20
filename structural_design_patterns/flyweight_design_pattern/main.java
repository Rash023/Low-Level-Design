package structural_design_patterns.flyweight_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ParticleTypeFactory factory = new ParticleTypeFactory();
        List<Particle> particles = new ArrayList<>();
        // Create thousands of particles using shared flyweights
        ParticleType explosionType = factory.getParticleType("red", "explosion.png");

        for (int i = 0; i < 1000; i++) {
            particles.add(new Particle(explosionType,
                    (float) Math.random() * 100,
                    (float) Math.random() * 100,
                    1.0f));
        }
        // Update all particles
        for (Particle particle : particles) {
            particle.update();
        }
    }
}
