package util;

/**
 * User: hudsonw
 * Date: 01/05/13
 * Time: 13:36
 */
public class VectorPoint {

    float x,y;

    public VectorPoint(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public VectorPoint Add(VectorPoint n) {
        return new VectorPoint(this.x + n.x,this.y + n.y);
    }
    public VectorPoint Minus(VectorPoint n) {
        return new VectorPoint(this.x - n.x,this.y - n.y);
    }
    public float DotProduct(VectorPoint n) {
        return (this.x * n.x) + (this.y * n.y);
    }

    public VectorPoint MultiplyScalar(float deltaTime) {
        return new VectorPoint(x*deltaTime,y*deltaTime);
    }
}
