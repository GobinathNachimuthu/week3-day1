package week3.day1;

import org.openqa.selenium.BuildInfo;

public class AxisBank extends BuildInfo {
	public void deposit()
	{
		System.out.println("deposit");
	}
	public static void main(String[]args)
	{
		BankInfo bankinfo = new BankInfo();
		AxisBank axisbank = new AxisBank();
		bankinfo.saving();
		bankinfo.fixed();
		bankinfo.deposit();
		axisbank.deposit();
	}
	
	}


