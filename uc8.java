public class uc8{
    
    import java.util.HashMap;



    // Create HashMap for character patterns
    public static HashMap<Character, String[]> createCharMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        charMap.put('P', new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        });

        charMap.put('S', new String[]{
                " *****",
                "*     ",
                " *****",
                "      *",
                " *****"
        });

        return charMap;
    }

    // Method to display banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                if (charMap.containsKey(ch)) {
                    System.out.print(charMap.get(ch)[line] + "  ");
                }
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}

