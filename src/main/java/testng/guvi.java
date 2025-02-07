
	package testng;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import java.time.Duration;

	public class guvi {
	    WebDriver dr;
	    String url = "https://www.guvi.in/";

	    @BeforeTest
	    public void setUp(){
	        dr = new ChromeDriver();
	        dr.get(url);
	        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	        dr.manage().window().maximize();
	    }
	    @AfterTest
	    public void tearDown(){
	        //Dr.close();
	    }
	    @Test
	    public void test1() throws InterruptedException {

	        //Login
	        //Css Selector locator
	        dr.findElement(By.cssSelector("a[class='nav-link  text-primary text-center px-4']")).click();
	        // ID Locator
	        dr.findElement(By.id("email")).sendKeys("lokeshdharan1996@gmail.com");
	        //xpath Locator
	        dr.findElement(By.xpath("//input[@type='password']")).sendKeys("Lokki@0412");
	        Thread.sleep(2000);
	        //ClassName Locator
	        dr.findElement(By.className("mr-2")).click();
	        Thread.sleep(2000);
	        // ID Locator
	        dr.findElement(By.id("login-btn")).click();
	        Thread.sleep(2000);
	        //tagName Locator
	        String str = dr.findElement(By.tagName("h4")).getText();
	        Assert.assertEquals(str, "Ready to Level Up?");
	        System.out.println(str);



	}
	}

