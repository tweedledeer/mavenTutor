package app;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * Author gkarabut
 * since 11/23/17.
 */
public class MyRunner extends BlockJUnit4ClassRunner {

  public MyRunner(Class<?> klass) throws InitializationError {
    super(klass);
  }

  public void run(RunNotifier notifier){
    notifier.addListener(new MyJunitListener());
    notifier.fireTestRunStarted(getDescription());
    super.run(notifier);

  }
}
