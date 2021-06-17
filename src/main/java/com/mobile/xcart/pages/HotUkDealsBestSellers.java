package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HotUkDealsBestSellers extends Utility {


    By bestseller = By.linkText("Bestsellers");
    By hotukdeal = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By bestsellerpage = By.xpath("//h1[@id='page-title']");
    By shortbysale = By.xpath("//span[contains(text(),'Sales')]");
    By zToA = By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[5]");
    By highToLow = By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]");
    By productArea = By.xpath("//ul[@class='products-grid grid-list']");

    /*
     * 4 - verifyBestSellersProductsArrangeByZToA()
     * 		1.1 Mouse hover on the “Hot deals” link
     * 		1.2 Mouse hover on the “Bestsellers”  link and click
     * 		1.3 Verify the text “Bestsellers”
     * 		1.4 Mouse hover on “Sort By” and select “Name Z-A”
     * 		1.5 Verify that the product arrange by Z to A
     */

    public void ProductsArrangeByZToA() throws InterruptedException {
        mouseclickToElement(hotukdeal, 10);
        Thread.sleep(500);
        clickOnElement(bestseller, 10);
        verifyMessage(bestsellerpage, 5, "Bestsellers");
        mouseHoverToElement(shortbysale, 10);
        mouseclickToElement(zToA, 10);
        verifyDecendingorder(productArea);
        Reporter.log("user is on bestseller page " + bestseller + "<br>");
    }
    /*
     * verifyBestSellersProductsPriceArrangeHighToLow()
     * 		2.1 Mouse hover on the “Hot deals” link
     * 		2.2 Mouse hover on the “Bestsellers” link and click
     * 		2.3 Verify the text “Bestsellers”
     * 		2.4 Mouse hover on “Sort By” and select “Price High-Low”
     * 		2.5 Verify that the product’s price arrange High to Low
     */

    public void ProductsPriceArrangeHighToLow(){
        mouseclickToElement(hotukdeal, 5);
        mouseclickToElement(bestseller, 10);
        verifyMessage(bestsellerpage, 5, "Bestsellers");
        mouseHoverToElement(shortbysale, 5);
        mouseclickToElement(highToLow, 10);
        verifyDecendingorder(productArea);
        Reporter.log("user is on bestseller page " + bestseller + "<br>");

    }



}
