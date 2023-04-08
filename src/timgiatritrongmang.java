import java.util.Scanner;
public class timgiatritrongmang {
    public static void main(String[] args) {
        String[] characters = {"Kiana", "Mei", "Bronya", "Elysia", "Kakarot", "Vegeta", "Gohan", "Trunks", "Gogeta", "Vegito"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's character: ");
        String input_name=sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i].equals(input_name)){
                System.out.println("Position of the characters in the list " + input_name + "is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found " + input_name + " in the list");
    }
}