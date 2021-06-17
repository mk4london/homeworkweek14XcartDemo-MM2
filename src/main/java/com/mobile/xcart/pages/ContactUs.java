package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * 4 - verifyUserShouldNavigateToContactUsPageSuccessfully()
 * 		4.1 Click on the “Contact us” link
 * 		4.2 Verify the text “Contact us”
 */

public class ContactUs extends Utility {
    By contactUs = By.xpath("//a[text()='Contact us']");
    By actuelMessage = By.xpath("//h1[@id='page-title']");

    public void userIscontactUsPage() {
        Reporter.log("User is on Contact Us page" + contactUs + "<br>");
        mouseclickToElement(contactUs, 10);
        verifyMessage(actuelMessage, 5, "Contact us");


    }
}
