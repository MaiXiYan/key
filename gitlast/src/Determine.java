import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Determine {
    public void determine(String verPassword){
        //判定密码强度的判别式
        String regex1="(\\d)[^a-zA-Z]{8,}";String regex2="[a-zA-Z\\D]{8,}";
        boolean value1=verPassword.matches(regex1);boolean value2=verPassword.matches(regex2);
        String regex7 ="[A-Za-z0-9]{8,}";
        String regex8 =".*[a-z]+.*";
        String regex9 =".*[A-Z]+.*";
        String regex10 =".*[0-9]+.*";
        boolean value7=verPassword.matches(regex7);
        Matcher m = Pattern.compile(regex8).matcher(verPassword);
        System.out.println(m.matches());
        Matcher m2 =Pattern.compile(regex9).matcher(verPassword);
        Matcher m3 =Pattern.compile(regex10).matcher(verPassword);
        System.out.println(m2.matches());
        System.out.println(m3.matches());
        //根据判别式判断密码强度
        if (verPassword.length()<8||(value1==true&&value2==false)||(value2==true&&value1==false)){
            System.out.println("密码强度低");
        }else if ((value7==true&&m.matches()==true)||value7==true&&m2.matches()==true){
            System.out.println("密码强度中");
        }else if (value7==true&&m.matches()==true&&m2.matches()==true&&m3.matches()==true){
            System.out.println("密码强度高");
        }else{
            System.out.println("出错！");
        }
    }
}
