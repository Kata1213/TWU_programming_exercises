public class TriangleExercise {
    public void eaiestExercise() {
        System.out.println("*");
    }

    public void horizontalLine(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append("*");
        }
        System.out.println(result);
    }

    public void verticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void rightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                line.append("*");
            }
            System.out.println(line);
        }
    }
}