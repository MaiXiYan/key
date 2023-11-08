//加密
public class Encrypt {
    public void encrypt(String encrypt){
        char password[]=new char[encrypt.length()];
        for(int i=0;i<encrypt.length();i++){
            char a=encrypt.charAt(i);
            byte byteAscii=(byte) a;
            byteAscii+=(i+1)+3;
            password[i]= (char)byteAscii;
        }
        char m;
        m=password[0];
        password[0]=password[password.length-1];
        password[password.length-1]=m;
        char psw[]=new char[password.length];
        for(int i=0;i< password.length;i++){
            psw[i]=password[password.length-i-1];
            System.out.print(psw[i]);
        }
    }
}
