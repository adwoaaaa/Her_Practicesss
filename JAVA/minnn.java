public class minnn {
    public static double min(double x, double y, double z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else {
            return z;
        }
    }

    public static int min(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else {
            return z;
        }
    }
}