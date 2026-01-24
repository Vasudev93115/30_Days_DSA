package Strings;

public class defanging_IP {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String address = "1.1.1.1.1";
        System.out.println(defangIPaddr(address));
    }


}
