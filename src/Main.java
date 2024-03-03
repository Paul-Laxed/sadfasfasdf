// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        Operationen operationen = new Operationen();
        System.out.println(operationen.repCodeEncode("0101", 2));
        System.out.println(operationen.repCodeDecode("111000", 3));
    }
}