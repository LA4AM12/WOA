import org.junit.Test;

/**
 * @author : LA4AM12
 * @create : 2023-02-12 11:22:18
 * @description : Test functions for constrained optimization
 */
public class COTest {
	@Test
	public void rosenbrockConstrainedToDiskTest() {
		OptFunction rosenbrock = params -> {
			double x = params[0], y = params[1];
			return Math.pow(1 - x, 2) + Math.pow(y - x*x, 2)*100;
		};

		// constrain : x^2 + y^2 <= 2
		// optimize use penalty method
		OptFunction penaltyFunc = params -> {
			double x = params[0], y = params[1];
			double penaltyForce = 2.0;
			return penaltyForce * Math.max(x*x+y*y-2, 0);
		};

		OptFunction constrainedFunc = params -> {
			double x = params[0], y = params[1];
			return rosenbrock.calc(params) + penaltyFunc.calc(params);
		};

		WOA woa = new WOA(constrainedFunc, 30, -1.5, 1.5, 2, 500, true);
		woa.execute();
		System.out.println("Optimize Rosenbrock function constrained to a disk, result:");
		woa.printOptimal();
	}
}
