package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;
/**
 *1 - verifyUserShouldNavigateToShippingPageSuccessfully()
 *	1.1 Click on the “Shipping” link
 *	1.2 Verify the text “Shipping”
 */

public class Shipping extends Utility {
    By shipping = By.xpath("//a[text()='Shipping']");
    By actuelMessage = By.id("page-title");

    public void userIsOnShippingPage(){
        Reporter.log("User is on shipping page" + shipping + "<br>");
        mouseclickToElement(shipping,10);
        verifyMessage(actuelMessage,5,"Shipping");
    }

}
