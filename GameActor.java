import javax.swing.text.Utilities;

public class GameActor {
    protected static processing.core.PApplet processing; //PApplet to use to draw GameActors to
    // the screen
    private float[] coordinates; //the x,y-coordinates of the center stored as [x,y]
    protected processing.core.PImage image; //the image associated with this GameActor
    private Hitbox hitbox; //the hitbox associated with this GameActor

    public GameActor(){

    }
    public GameActor(float x, float y, String imgPath){
        this.coordinates = new float[]{x,y};

    }
    public static void setProcessing(processing.core.PApplet processing){

    }
    public float getX(){
        return coordinates[0];
    }
    public float getY(){
        return coordinates[1];
    }
    public void setX(float newX){
        this.coordinates[0] = newX;
    }
    public void setY(float newY){
        this.coordinates[1] = newY;
    }
    public Hitbox getHitbox(){
        return hitbox;
    }
    public void moveHitbox(float x, float y){
        hitbox.setPosition(x,y);
    }
    public void draw(){
        hitbox.visualizeHitbox();
    }
}
