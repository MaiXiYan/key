//解密
public class Decrypt {
    public void decrypt(String decrypt){
        char password[]=new char[decrypt.length()];
        for(int i=0;i<decrypt.length();i++){
            password[i]=decrypt.charAt(password.length-(i+1));
        }
        char a;
        a=password[0];
        password[0]=password[password.length-1];
        password[password.length-1]=a;

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
