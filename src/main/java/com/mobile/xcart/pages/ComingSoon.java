package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;
/**
 *3 - verifyUserShouldNavigateToComingsoonPageSuccessfully()
 *	3.1 Click on the “Coming soon” link
 *	3.2 Verify the text “Coming soon”
 */

public class ComingSoon extends Utility {
    By comingSoon = By.xpath("//a[text()='Coming soon']");
    By actuelMessage = By.xpath("//h1[@id='page-title']");
    public void comingSoon(){
        Reporter.log("User is on Coming Soon Page " + comingSoon + "<br>");
        mouseclickToElement(comingSoon,10);
        verifyMessage(actuelMessage,5,"Coming soon");
    }


}
