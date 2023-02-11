# WOA
Java implementation of the [Whale Optimization Algorithm](https://www.sciencedirect.com/science/article/pii/S0965997816300163)

## Description
Additional information about WOA can be found at the [algorithm's webpage](http://www.alimirjalili.com/WOA.html).

## Usage
There are three test classes in "/src/test/java", containing several demos about how to use this algorithm to optimize specify functions.

Test classes:
- SOOTest : Test functions for single-objective optimization
- MOOTest : Test functions for multi-objective optimization
- COTest : Test functions for constrained optimization

All the test functions can be found in [Test functions for optimization](https://en.wikipedia.org/wiki/Test_functions_for_optimization)

## Examples
To test this project easily, make sure you have set up the maven environment.

Test [Himmelblau's function](https://en.wikipedia.org/wiki/Himmelblau%27s_function) for example:
```bash
cd ${project_path}
mvn test -Dtest=SOOTest#himmelblau*

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running SOOTest
optimize himmelblau's function result:
┌─────────┬─────────┬────────┐
│optimal  │dim0     │dim1    │
├─────────┼─────────┼────────┤
│0.00000  │-2.80515 │3.13133 │
└─────────┴─────────┴────────┘
```