package mindmap3.string1.simplestring;

public class Q2DefangingIpAddress {


    // LC 1108. Defanging an IP Address
    public static void main(String[] args) {

        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}
