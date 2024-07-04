public class Main {
    public static void main(String[] args) {
        String s1 = "abccba";
        String s2 = "ba";

        boolean saoIguais = verificarString(s1, s2);

        if (saoIguais) {
            System.out.println("São iguais");
        } else {
            System.out.println("Não são iguais");
        }
    }

    public static boolean verificarString(String str1, String str2) {
        if (str1.length() < 2 || str2.length() < 2) {
            return false;
        }
        
        String ultimos2Str1 = str1.substring(str1.length() - 2);
        String ultimos2Str2 = str2.substring(0, 2);

        return ultimos2Str1.equals(ultimos2Str2);
    }
}