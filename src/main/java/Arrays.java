public class Arrays {
    public static void main(String[] args) {
        String[] colors = { "Green", "Bluer", "Red", "Yellow", "Black" };
        for (int i=0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        System.out.println();
        // Enhanced for example
        for(String el : colors) {
            System.out.println(el);
        }
    }
}
