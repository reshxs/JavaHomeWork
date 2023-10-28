public class Trigonometry {
    public static double sin(double degrees) {
        return Math.sin(degrees * Math.PI / 180.0);
    }

    public static double cos(double degrees) {
        return Math.cos(degrees * Math.PI / 180.0);
    }

    public static double tan(double degrees) {
        return Math.tan(degrees * Math.PI / 180.0);
    }

    public static double ctan(double degrees) {
        return 1.0 / tan(degrees);
    }

    public static double toRad(double degrees) {
        return degrees * Math.PI / 180.0;
    }
}
