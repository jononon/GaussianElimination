public class GaussianArrayTester {
    public static void main () {
        double[][] array = {{4,-3,2,40},{5,9,-7,47},{9,8,-3,97}};
        GaussianArray test = new GaussianArray(array);
        test.simplify();
        System.out.println(test);
        
        double[][] array2 = {{1,-2,-2,2,-10},{3,4,-1,-3,11},{-4,-3,-3,8,-21}};
        GaussianArray test2 = new GaussianArray(array2);
        test2.simplify();
        System.out.println(test2);
    }
}