public class BannerApp {

    public static void main(String[] args) {

        String[] banner = createBanner();
        displayBanner(banner);
    }

    // Responsible for building banner structure
    private static String[] createBanner() {

        String line1 = String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*");
        String line2 = String.join("", "*", " ", "W", "E", "L", "C", "O", "M", "E", " ", "*");
        String line3 = String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*");

        return new String[]{ line1, line2, line3 };
    }

    
    private static void displayBanner(String[] banner) {

        for (String line : banner) {
            System.out.println(line);
        }
    }
}