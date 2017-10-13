import org.junit.Assert;

import static org.junit.Assert.*;

public class Assignment4Test {
    @org.junit.Test
    public void getArea() throws Exception {

        double s = 5.5;
        double answer = 78.59;


        Assert.assertEquals(answer, Assignment4.getArea(s), 0.2);

    }

}