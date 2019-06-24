package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {//extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initialize() {
        System.out.println("\nInitialized");
        base.StepInfo = "friends";
    }

    @After
    public void tearDown() {
        System.out.println("\nTore down");
    }
}
