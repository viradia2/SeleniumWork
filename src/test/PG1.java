package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvviradia\\workspace\\SeleniumWork\\lib\\chromedriver.exe");
    	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\vvviradia\\workspace\\SeleniumWork\\lib\\geckodriver_16.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "file:///C:/Users/vvviradia/Desktop/Selenium/first.html";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        // get the actual value of the title
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        
        //Adding Text Values to the text fields
        driver.findElement(By.id("1")).sendKeys("Vivek");
        driver.findElement(By.id("4")).sendKeys("1833 Landing Drive");
        driver.findElement(By.id("7")).sendKeys("Saab");
        
//        List dropDown = driver.findElements(By.name("gender"));
//        int dSize = dropDown.size();
//        
//        for(int i=0; i<dSize; i++){
//        	
//        	 // Store the radioButton name to the string variable, using 'Value' attribute
//        	 String sValue = ((WebElement) dropDown.get(i)).getAttribute("cars");
//        	 System.out.println(sValue);
//        	 // Select the radioButton it the value of the radioButton is same what you are looking for
//        	 if (sValue.equalsIgnoreCase("fiat")){
//         
//        		 ((WebElement) dropDown.get(i)).click();
//         
//        		 // This will take the execution out of for loop
//        		 break;
//         
//        		 }
//        }
        
        List radioButton = driver.findElements(By.name("gender"));
        int size = radioButton.size();
        for(int i=0; i<size; i++){
        	
        	 // Store the radioButton name to the string variable, using 'Value' attribute
        	 String sValue = ((WebElement) radioButton.get(i)).getAttribute("value");
        	 // Select the radioButton it the value of the radioButton is same what you are looking for
        	 if (sValue.equalsIgnoreCase("male")){
         
        		 ((WebElement) radioButton.get(i)).click();
        		 System.out.println(sValue);
        		 // This will take the execution out of for loop
        		 break;
         
        		 }
        }
        
        List checkBox = driver.findElements(By.name("course"));
        int cSize = checkBox.size();
        
        for(int i=0; i<cSize; i++){
        	
        	 // Store the radioButton name to the string variable, using 'Value' attribute
        	 String sValue = ((WebElement) checkBox.get(i)).getAttribute("value");
        	 
        	 // Select the radioButton it the value of the radioButton is same what you are looking for
        	 if (sValue.equalsIgnoreCase("AE")){
         
        		 ((WebElement) checkBox.get(i)).click();
        		 System.out.println(sValue);
        		 // This will take the execution out of for loop
        		 break;
         
        		 }
        }
        
        driver.findElement(By.id("20")).click();
        
        //For Second Page
        
        driver.findElement(By.id("1")).sendKeys("Vivek Viradia");
        driver.findElement(By.id("4")).sendKeys("1833 Landing Drive");
        driver.findElement(By.id("7")).sendKeys("Audi");
        
        
        List radioButton2 = driver.findElements(By.name("gender"));
        int size2 = radioButton2.size();
        for(int i=0; i<size2; i++){
        	
        	 // Store the radioButton name to the string variable, using 'Value' attribute
        	 String sValue = ((WebElement) radioButton2.get(i)).getAttribute("value");
        	 // Select the radioButton it the value of the radioButton is same what you are looking for
        	 if (sValue.equalsIgnoreCase("male")){
         
        		 ((WebElement) radioButton2.get(i)).click();
        		 System.out.println(sValue);
        		 // This will take the execution out of for loop
        		 break;
         
        		 }
        }
        
        List checkBox2 = driver.findElements(By.name("course"));
        int cSize2 = checkBox2.size();
        
        for(int i=0; i<cSize2; i++){
        	
        	 // Store the radioButton name to the string variable, using 'Value' attribute
        	 String sValue = ((WebElement) checkBox2.get(i)).getAttribute("value");
        	 
        	 // Select the radioButton it the value of the radioButton is same what you are looking for
        	 if (sValue.equalsIgnoreCase("AE")){
         
        		 ((WebElement) checkBox2.get(i)).click();
        		 System.out.println(sValue);
        		 // This will take the execution out of for loop
        		 break;
         
        		 }
        }
        
        driver.findElement(By.id("20")).click();
        
        //For Third Page
        
        driver.findElement(By.id("1")).sendKeys("Vivek Viradia");
        driver.findElement(By.id("4")).sendKeys("1833 Landing Drive");
        driver.findElement(By.id("7")).sendKeys("Audi");
        
        
        List radioButton3 = driver.findElements(By.name("gender"));
        int size3 = radioButton3.size();
        for(int i=0; i<size3; i++){
        	
        	 // Store the radioButton name to the string variable, using 'Value' attribute
        	 String sValue = ((WebElement) radioButton3.get(i)).getAttribute("value");
        	 // Select the radioButton it the value of the radioButton is same what you are looking for
        	 if (sValue.equalsIgnoreCase("male")){
         
        		 ((WebElement) radioButton3.get(i)).click();
        		 System.out.println(sValue);
        		 // This will take the execution out of for loop
        		 break;
         
        		 }
        }
        
        List checkBox3 = driver.findElements(By.name("course"));
        int cSize3 = checkBox3.size();
        
        for(int i=0; i<cSize3; i++){
        	
        	 // Store the radioButton name to the string variable, using 'Value' attribute
        	 String sValue = ((WebElement) checkBox3.get(i)).getAttribute("value");
        	 
        	 // Select the radioButton it the value of the radioButton is same what you are looking for
        	 if (sValue.equalsIgnoreCase("AE")){
         
        		 ((WebElement) checkBox3.get(i)).click();
        		 System.out.println(sValue);
        		 // This will take the execution out of for loop
        		 break;
         
        		 }
        }
        
        driver.findElement(By.id("20")).click();
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
    }

}