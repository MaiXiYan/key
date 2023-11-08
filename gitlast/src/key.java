import java.util.Scanner;
//实现简单密码管理系统
public class key {
    public static void main(String[] args) {

        boolean valuetop = true;
        while (valuetop){
            System.out.println("===============================");
            System.out.println("欢迎使用密码管理系统");
            System.out.println("===============================");
            System.out.println("请选择操作");
            System.out.println("1.加密");
            System.out.println("2.解密");
            System.out.println("3.判断密码强度");
            System.out.println("4.密码生成");
            System.out.println("5.退出");
            System.out.println();
            System.out.print("请输入选项序号：");
            System.out.println("");
            short num = 0;
            Scanner sc = new Scanner(System.in);
            num = sc.nextByte();
            switch (num){
                case 1:
                    boolean value=true;
                    while (value){
                        System.out.println("===============================");
                        System.out.println("欢迎使用密码管理系统");
                        System.out.println("===============================");
                        System.out.print("请输入要加密的数字密码：");
                        Encrypt enc = new Encrypt();
                        String encrypt=sc.next();
                        if (encrypt.length()>16&&encrypt.length()<=0){
                            System.out.println("输入字符串超出长度限制！");
                            System.out.println("请重新输入密码：");
                            value=true;
                        }else {
                            enc.encrypt(encrypt);
                            System.out.println("");
                            value=false;
                        }
                    }
                    break;

                case 2:
                    value=true;
                    while (value){
                        System.out.println("===============================");
                        System.out.println("欢迎使用密码管理系统");
                        System.out.println("===============================");
                        System.out.print("请输入要解密的数字密码：");
                        Decrypt dec = new Decrypt();
                        String decrypt=sc.next();
                        if (decrypt.length()>16&&decrypt.length()<=0){
                            System.out.println("输入字符串超出长度限制！");
                            System.out.println("请重新输入密码：");
                            value=true;
                        }else {
                            dec.decrypt(decrypt);
                            System.out.println("");
                            value=false;
                        }
                    }
                    break;

                case 3:
                    Determine det = new Determine();
                    System.out.println("===============================");
                    System.out.println("欢迎使用密码管理系统");
                    System.out.println("===============================");
                    System.out.println("请输入您的密码");
                    String verPassword = sc.next();
                    System.out.print("您的密码强度是：");
                    det.determine(verPassword);
                    System.out.println();
                    break;

                case 4:
                    Generate gen = new Generate();
                    System.out.println("===============================");
                    System.out.println("欢迎使用密码管理系统");
                    System.out.println("===============================");
                    System.out.print("为您生成的密码是：");
                    gen.generate();
                    break;

                case 5:
                    System.out.println("===============================");
                    System.out.println("为您退出密码管理系统");
                    System.out.println("===============================");
                    valuetop=false;
                    break;

                default:
            }

        }
    }
}
