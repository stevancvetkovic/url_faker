package pckg;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Functions
{
    public String Ip2Decimal(String ip1, String ip2, String ip3, String ip4)
    {
        Functions f = new Functions();

        int IP1 = Integer.parseInt(ip1);
        int IP2 = Integer.parseInt(ip2);
        int IP3 = Integer.parseInt(ip3);
        int IP4 = Integer.parseInt(ip4);

        // decimal to hex conversion
        String sIP1 = f.decimal2hex(IP1);
        String sIP2 = f.decimal2hex(IP2);
        String sIP3 = f.decimal2hex(IP3);
        String sIP4 = f.decimal2hex(IP4);

        // adding 0 if hex value has only one digit
        // (fixes problem with zeros in IP address)
        if(sIP1.length() == 1)
            sIP1 = "0" + sIP1;
        if(sIP2.length() == 1)
            sIP2 = "0" + sIP2;
        if(sIP3.length() == 1)
            sIP3 = "0" + sIP3;
        if(sIP4.length() == 1)
            sIP4 = "0" + sIP4;

        // hex to decimal conversion
        BigInteger bi = new BigInteger(sIP1 + sIP2 + sIP3 + sIP4, 16);

        String res = "http://www.LegSite.com:%5C@" + bi;

        return res;
    }


    public static String array2String(String[] a)
    {
        String res = "";

        if (a.length > 0)
        {
            res = a[0];

            for (int i=1; i<a.length; i++)
                res += a[i];
        }

        return res;
    }

    public String getIPAddress(String URL)
    {
        InetAddress address = null;

        try
        {
            address = InetAddress.getByName(URL);
        }
        catch (UnknownHostException e)
        {
            return null;
        }

        return address.getHostAddress();
    }

     public String decimal2hex(int d)
     {
        String nums = "0123456789ABCDEF";

        if (d == 0)
            return "0";

        String hex = "";

        while (d > 0)
        {
            int num = d % 16;
            hex = nums.charAt(num) + hex;
            d = d / 16;
        }

        return hex;
    }
}