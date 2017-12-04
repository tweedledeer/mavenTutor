package app;


import org.junit.Assert;
import org.junit.runner.RunWith;

/**
 * Author gkarabut
 * since 11/23/17.
 */
@RunWith(MyRunner.class)
public class Test {

  @org.junit.Test
  public void myTest(){
    Assert.fail("Fail message");
  }

  @org.junit.Test
  public void myTestPass(){
    Assert.assertTrue("Checks nothing", true);
  }
}
