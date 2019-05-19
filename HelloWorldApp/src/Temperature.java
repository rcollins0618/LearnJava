public class Temperature {
    private float degrees;
    private char scale;

    Temperature() {
        degrees = 0;
        scale = 'C';
    }

    Temperature(float d) {
        this();
        degrees = d;
    }

    Temperature(char s) {
        this();
        scale = s;
    }

    Temperature(float d, char s) {
        degrees = d;
        scale = s;
    }

    //degreesC = 5(degreesF - 32)/9;
    //degreesF = 9(degreesC/5) + 32;

    public void setScale(char s) {
        scale = s;
    }
    public char getScale() {
        return scale;
    }
    public void setDegrees(float d) {
        degrees = d;
    }
    public float getDegrees() {
        return degrees;
    }

    public float getTempF() {
        switch (scale) {
            case 'C':
                return 9 * (degrees / 5) + 32;
            case 'F':
                return getDegrees();
            default:
                return 0.0f;
        }
    }

    public float getTempC() {
        switch (scale) {
            case 'C':
                return getDegrees();
            case 'F':
                return 5*(degrees - 32)/9;
            default:
                return 0.0f;
        }
    }

    public static int compare(Temperature A, Temperature B) {
        if (A.getScale() == 'C' && B.getScale() == 'C') {
            System.out.println("They are both C.");
            if (A.getDegrees() == B.getDegrees()) {
                System.out.println("0 - The two temps are equal.");
                return 0;
            } else if (A.getDegrees() > B.getDegrees()) {
                return 1;
            } else {
                return -1;
            }
        } else if (A.getScale() == 'C' && B.getScale() == 'F') {
            if (A.getTempF() == B.getDegrees()) {
                return 0;
            } else if (A.getTempF() > B.getDegrees()) {
                return 1;
            } else {
                return -1;
            }
        } else if (A.getScale() == 'F' && B.getScale() == 'C') {
            if (A.getDegrees() == B.getTempF()) {
                return 0;
            } else if (A.getDegrees() > B.getTempF()) {
                return 1;
            } else {
                return -1;
            }
        } else if (A.getScale() == 'F' && B.getScale() == 'F') {
            if (A.getDegrees() == B.getDegrees()) {
                return 0;
            } else if (A.getDegrees() > B.getDegrees()) {
                return 1;
            } else {
                return -1;
            }
        }
        return 2; // error code
    }
}
