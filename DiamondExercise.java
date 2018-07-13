public class DiamondExercise {
    public void isoscelesTriangle(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                line.append("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            System.out.println(line);
        }
    }

    public void diamond(int n) {
        for (int i = 0; i < n; i++){
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                line.append("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            System.out.println(line);
        }
        for (int i = n - 2; i >= 0; i--) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                line.append("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            System.out.println(line);
        }
    }

    public void diamonWithName(int n, String name) {
        for (int i = 0; i < n - 1; i++){
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                line.append("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            System.out.println(line);
        }
        System.out.println(name);
        for (int i = n - 2; i >= 0; i--) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                line.append("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            System.out.println(line);
        }
    }
}