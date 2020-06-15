package com.report.listener;

import java.io.File;

import org.openqa.selenium.Platform;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport {

   private static ExtentReports extent;
   public static ExtentTest extentlogger;
	public static ExtentHtmlReporter htmlReporter;
	private static Platform platform;
	private static String reportFileName="Automation_Report.html";
	private static String testPath=System.getProperty("user.dir")+"\\TestReport";
	private static String ReportLoc=testPath+"\\"+reportFileName;

	public static ExtentReports create()
	{
		platform=getCurrentPlatform();
		String filename=getReportFilelocation(platform);
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(filename);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(filename);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(filename);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
			
		return extent;
		
	}
	
	private static Platform getCurrentPlatform() {
		if(platform==null)
		{
			String os=System.getProperty("os.name");
			System.out.println("operating system is="+os);
			if(os.startsWith("win"))
			{
				platform=Platform.WINDOWS;
			}
		}
		return platform;
	}

	private static String getReportFilelocation(Platform platform)
	{
		String ReportFileLocation;
		
		ReportFileLocation=ReportLoc;
		createReportPath(testPath);
		System.out.println("Extent Report Path is="+testPath+"/n");
		return ReportFileLocation;
		
	}

	private static void createReportPath(String testPath2) {
		File testDir=new File(testPath2);
		if(!testDir.exists())
		{
			if(testDir.mkdir())
			{
				System.out.println("Directory:"+testPath2+"is created");
				
			}
			else
			{
				System.out.println("not exists"+testPath2);
			}
		
			
		}
		
	}
	
	
	
}
