package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;
/**
 *2 - verifyUserShouldNavigateToNewPageSuccessfully()
 *	2.1 Click on the “New!” link
 *	2.2 Verify the text “New arrivals”
 */


public class NewPage extends Utility {
    By newPage = By.xpath("//a[text()='New!']");
    By actuelMessage = By.xpath("//h1[@id='page-title']");

    public void userIsOnNewArrivalPage(){
        Reporter.log("User is on new page" + newPage + "<br>");
        mouseclickToElement(newPage,10);
        verifyMessage(actuelMessage,5,"New arrivals");
    }


}
