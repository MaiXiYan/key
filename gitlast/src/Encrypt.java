//加密
public class Encrypt {
    public void encrypt(String encrypt){
        char password[]=new char[encrypt.length()];
        //将每个字符的ASCII码加上它在字符串中的位置(1开始)和偏移值3
        for(int i=0;i<encrypt.length();i++){
            char a=encrypt.charAt(i);
            byte byteAscii=(byte) a;
            byteAscii+=(i+1)+3;
            password[i]= (char)byteAscii;
        }
        char m;
        //将密码字符串的第一位和最后一位调换顺序
        m=password[0];
        password[0]=password[password.length-1];
        password[password.length-1]=m;
        char psw[]=new char[password.length];
        //for循环将密码字符串反转
        for(int i=0;i< password.length;i++){
            psw[i]=password[password.length-i-1];
            System.out.print(psw[i]);
        }
    }
}
