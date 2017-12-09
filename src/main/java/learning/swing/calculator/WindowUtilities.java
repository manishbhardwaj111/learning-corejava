package learning.swing.calculator;

import javax.swing.UIManager;

public class WindowUtilities
{
    public static void setNativeLookAndFeel()
	        {
			  try
			     {
				    String s=UIManager.getSystemLookAndFeelClassName();
					UIManager.setLookAndFeel(s);
				 }
			    catch(Exception e)
				  {
				     System.out.println("Error Setting Native LAF :"+e);
				  }
			}
    
	public static void setJavaLookAndFeel()
	        {
			  try
			     {
				    String s=UIManager.getCrossPlatformLookAndFeelClassName();
					UIManager.setLookAndFeel(s);
				 }
			    catch(Exception e)
				  {
				     System.out.println("Error Setting Java LAF :"+e);
				  }
			}
	public static void setMotifLookAndFeel()
	        {
			  try
			     {
				    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				 }
			    catch(Exception e)
				  {
				     System.out.println("Error Setting Motif LAF :"+e);
				  }
			}
	public static void setNimbusLookAndFeel()
	        {
			  try
			     {
				    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
				 }
			    catch(Exception e)
				  {
				     System.out.println("Error Setting Motif LAF :"+e);
				  }
			}		
}