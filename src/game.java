import processing.core.PApplet;

public class game extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int dia = 10;
    public static final int dist_div = 5;
    int w=0;
    int x=0;
    int y=0;
    int z=0;

    public static void main(String[] args) {
        PApplet.main("game",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

    }

    @Override
    public void draw() {
        draw_circle();
    }

    private void draw_circle() {
        ellipse(w, HEIGHT/ dist_div, dia,dia);
        w++;
        ellipse(x, HEIGHT/dist_div*2, dia,dia);
        x+=2;
        ellipse(y, HEIGHT/dist_div*3, dia,dia);
        y+=3;
        ellipse(z, HEIGHT/dist_div*4, dia,dia);
        z+=4;
    }
}
