// ENGLISH VERSION
// Author: Stevan Cvetkovic
// E-mail: cvetkovic.stevan@gmail.com
// Date (Serbian version): 31.3.2010.
// Date (English version): 11.9.2010.

package pckg;

public class Main
{
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                IP2Decimal p = new IP2Decimal();
                p.setLocationRelativeTo(null);
                p.setVisible(true);
            }
        });
    }
}