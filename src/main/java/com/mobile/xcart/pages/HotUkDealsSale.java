package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HotUkDealsSale extends Utility {
    By hotukdeal = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By sale = By.xpath("//a[text()='Sale']");
    By salepage = By.xpath("//h1[@id='page-title']");
    By recommended = By.xpath("//span[contains(text(),'Recommended')]");
    By aToZ = By.linkText("Name A - Z");

    By lowToHigh = By.linkText("Price Low - High");
    By rates = By.partialLinkText("Rates");
    By productArea = By.xpath("//ul[@class='products-grid grid-list']");

    /*
     * 1 - verifySaleProductsArrangeAlphabetically()
     * 1.1 Mouse hover on the “Hot deals” link
     * 1.2 Mouse hover on the “Sale”  link and click
     * 1.3 Verify the text “Sale”
     * 1.4 Mouse hover on “Sort By” and select “Name A-Z”
     * 1.5 Verify that the product arrange alphabetically
     */
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        mouseclickToElement(hotukdeal, 5);
        mouseclickToElement(sale, 10);
        verifyMessage(salepage, 5, "Sale");
        mouseHoverToElement(recommended, 5);
        mouseclickToElement(aToZ, 10);
        Thread.sleep(500);
        verifyDecendingorder(productArea);
        Reporter.log("user is on sale page " + sale + "<br>");
    }

    /*
     * 2 - verifySaleProductsPriceArrangeLowToHigh()
     * 		2.1 Mouse hover on the “Hot deals” link
     * 		2.2 Mouse hover on the “Sale”  link and click
     * 		2.3 Verify the text “Sale”
     * 		2.4 Mouse hover on “Sort By” and select “Price Low-High”
     * 		2.5 Verify that the product’s price arrange Low to High
     */
    public void verifySaleProductsPriceArrangeLowToHigh() {
        Reporter.log("user is on sale page " + sale + "<br>");
        mouseclickToElement(hotukdeal, 5);
        mouseclickToElement(sale, 10);
        verifyMessage(salepage, 5, "Sale");
        mouseHoverToElement(recommended, 5);
        mouseclickToElement(lowToHigh, 10);
        verifyDecendingorder(productArea);

    }

    /*
     * 3 - verifySaleProductsArrangeByRates()
     * 		3.1 Mouse hover on the “Hot deals” link
     * 		3.2 Mouse hover on the “Sale”  link and click
     * 		3.3 Verify the text “Sale”
     * 		3.4 Mouse hover on “Sort By” and select “Rates”
     * 		3.5 Verify that the product’s arrange Rates
     */
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        Reporter.log("user is on sale page " + sale + "<br>");
        mouseclickToElement(hotukdeal, 5);
        mouseclickToElement(sale, 10);
        verifyMessage(salepage, 5, "Sale");
        Thread.sleep(500);
        mouseHoverToElement(recommended, 5);
        Thread.sleep(500);
        mouseclickToElement(rates, 10);
        Thread.sleep(5000);
        verifyDecendingorder(productArea);

    }

}
