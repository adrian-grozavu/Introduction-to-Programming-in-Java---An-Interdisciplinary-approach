// Convert RGB color codes to CMYK
public class RGBtoCMYK {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);   
        int g = Integer.parseInt(args[1]); 
        int b = Integer.parseInt(args[2]); 
        
        double w1 = Math.max((double) (r / 255), (double) (g / 255));
        double w = Math.max(w1, (double) (b / 255));
        double c = (double) ((w - ((double) r / 255)) / w);
        double m = (double) ((w - ((double) g / 255)) / w);
        double y = (double) ((w - ((double) b / 255)) / w);
        double k = 1 - w;
        System.out.println("CMYK values: " + c + " " + m + " " + y + " " + k);
    }
}