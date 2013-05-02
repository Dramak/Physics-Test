package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.VectorPoint;

/**
 * User: hudsonw
 * Date: 02/05/13
 * Time: 10:26
 */
@RunWith(JUnit4.class)
public class VectorPointTest {
    @Test
    public void testAdd() throws Exception {
        VectorPoint vectorPoint = new VectorPoint(0,0);

        VectorPoint result = vectorPoint.Add(new VectorPoint(1,1));

        Assert.assertEquals(1f,result.getX(),0);
        Assert.assertEquals(1f,result.getY(),0);
    }
    @Test
    public void testMinus() throws Exception {
        VectorPoint vectorPoint = new VectorPoint(0,0);

        VectorPoint result = vectorPoint.Minus(new VectorPoint(1,1));

        Assert.assertEquals(-1f,result.getX(),0);
        Assert.assertEquals(-1f,result.getY(),0);
    }
    @Test
    public void testDotProduct() throws Exception {
        VectorPoint vectorPoint = new VectorPoint(1,1);

        float result = vectorPoint.DotProduct(new VectorPoint(2,2));

        Assert.assertEquals(4f,result,0);
    }
    @Test
    public void testMultiplyScalar() throws Exception {
        VectorPoint vectorPoint = new VectorPoint(1,1);

        VectorPoint result = vectorPoint.MultiplyScalar(5);

        Assert.assertEquals(5f,result.getX(),0);
        Assert.assertEquals(5f,result.getY(),0);
    }
}
