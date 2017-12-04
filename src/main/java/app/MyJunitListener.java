package app;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/**
 * Author gkarabut
 * since 11/23/17.
 */
public class MyJunitListener extends RunListener {
  public void testRunStarted(Description description) throws Exception {
    System.out.println("Number of tests to execute: " + description.testCount());
  }
  public void testFailure(Failure failure) throws Exception{
    System.out.println("Number of failed tests:  " + failure.getDescription().getMethodName());
  }

}
