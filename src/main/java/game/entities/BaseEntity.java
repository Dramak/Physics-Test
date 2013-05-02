package game.entities;

import graphics.IDrawable;
import graphics.IUpdateable;
import util.VectorPoint;

/**
 * User: hudsonw
 * Date: 02/05/13
 * Time: 10:59
 */
public abstract class BaseEntity implements IDrawable, IUpdateable {

    private VectorPoint position,vector;

    public BaseEntity(VectorPoint position) {
        this.position = position;
        // Create a blank vector so entity is not moving from base
        this.vector = new VectorPoint(0,0);
    }

    public void update(long delta) {
        //Base movement for entity
        position.Add(vector.MultiplyScalar(delta));
    }
}
