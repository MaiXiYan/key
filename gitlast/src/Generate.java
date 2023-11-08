import java.security.SecureRandom;
import java.util.Scanner;

public class Generate {
    public void generate(){
        System.out.println("请设置密码长度：");
        Scanner sc =new Scanner(System.in);
        byte length=sc.nextByte();

        SecureRandom random = new SecureRandom();
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String characterSet = uppercaseLetters + lowercaseLetters + numbers;
        StringBuilder passwordBuilder=new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterSet.length());
            char randomChar = characterSet.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }
        String password = passwordBuilder.toString();
        System.out.println("生成的密码为：" + password);
    }
}
