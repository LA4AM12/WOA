import org.junit.Test;

/**
 * @author : LA4AM12
 * @create : 2023-02-10 11:34:28
 * @description : Test functions for single-objective optimization
 */

public class SOOTest {
	@Test
	public void bealeTest() {
		OptFunction beale = params -> {
			double x = params[0], y = params[1];
			return Math.pow(1.5 - x + x * y, 2)
					+ Math.pow((2.25 - x + x * y * y), 2)
					+ Math.pow((2.625 - x + x * y * y * y), 2);
		};
		WOA woa = new WOA(beale, 30, -4.5, 4.5, 2, 500, true);
		woa.execute();
		System.out.println("Results of beale function optimisation:");
		woa.printOptimal();
	}

	@Test
	public void matyasTest() {
		OptFunction matyas = params -> {
			double x = params[0], y = params[1];
			return 0.26 * (x * x + y * y) - 0.48 * x * y;
		};

		WOA woa = new WOA(matyas, 30, -10, 10, 2, 500, true);
		woa.execute();
		System.out.println("Results of matyas function optimisation:");
		woa.printOptimal();
	}

	@Test
	public void himmelblauTest() {
		OptFunction himmelblau = params -> {
			double x = params[0], y = params[1];
			return Math.pow((x * x + y - 11), 2)
					+ Math.pow((x + y * y - 7), 2);
		};
		WOA woa = new WOA(himmelblau, 30, -5, 5, 2, 500, true);
		woa.execute();
		System.out.println("Results of himmelblau's function optimisation:");
		woa.printOptimal();
	}

	@Test
	public void leviTest() {
		OptFunction levi = params -> {
			double x = params[0], y = params[1];
			return Math.pow(Math.sin(3.0 * Math.PI * x), 2)
					+ Math.pow((x - 1), 2) * (1 + Math.pow(Math.sin(3.0 * Math.PI * y), 2))
					+ Math.pow((y - 1), 2) * (1 + Math.pow(Math.sin(2.0 * Math.PI * y), 2));
		};

		WOA woa = new WOA(levi, 30, -10, 10, 2, 500, true);
		woa.execute();
		System.out.println("Results of levi function optimisation:");
		woa.printOptimal();
	}
}
