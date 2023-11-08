//解密
public class Decrypt {
    public void decrypt(String decrypt){
        char password[]=new char[decrypt.length()];
        //for循环将密码字符串反转
        for(int i=0;i<decrypt.length();i++){
            password[i]=decrypt.charAt(password.length-(i+1));
        }
        //将密码字符串的第一位和最后一位调换顺序
        char a;
        a=password[0];
        password[0]=password[password.length-1];
        password[password.length-1]=a;
        //将每个字符的ASCII码减上它在字符串中的位置(1开始)和偏移值3
        for(int i=0;i<password.length;i++){
            byte byteAscii=(byte) password[i];
            byteAscii-=((i+1)+3);
            password[i]=(char)byteAscii;
        }
        for(int i=0;i< password.length;i++){
            System.out.print(password[i]);
        }
    }
}
