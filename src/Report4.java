public class Report4 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println(e.getMessage());
        }

    }
}