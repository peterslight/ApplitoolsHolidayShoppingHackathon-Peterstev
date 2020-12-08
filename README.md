# ApplitoolsHolidayShoppingHackathon-Peterstev
My imaginary retail company, Applifashion is preparing for a busy holiday season – in fact they are predicting that they will have record traffic for both Black Friday &amp; Cyber Monday – with this year’s biggest sellers predicted to be the new “cozy quarantine slippers”.  The Applifashion team has been hard at work implementing some updates and you have been tasked with ensuring that the responsive web application looks and functions as designed across all screens.

# Applifashion : Holiday Shopping Hackathon Participant Instructions

Automated UI Testing powered by Applitools UltraFastGrid and Selenium Webdriver

https://applitools.com/hackathon-v20-3-instructions/

## Instructions

## Part 1
Imagine you are an engineer assigned to test a retail application, AppliFashion, before the busy holiday season. Your job is to automate the tests below against the V1 production version of this application. 

For each test, use Applitools Eyes as your verification tool along with one of the following browser automation frameworks and programming languages:

## Eligible Testing Frameworks

 * Selenium WebDriver 
 * Cypress 
 * TestCafe 
 * WebdriverIO

## Eligible programming languages

Java
JavaScript
Python
C#
Set Eyes to run each of the three tests on Chrome (1200 x 800) using Applitools Ultrafast Grid.

Tests
Include the following tests within an Applitools batch called “Holiday Shopping”.

### Main Page

Check the main page of the app by using Applitools Eyes to take a screenshot of the entire page.
 * Please use the following information for your visual check:
 * App Name: “AppliFashion”
 * Test name: “Test 1”
 * Step name: “main page” 


### Filtered Product Grid
On the left side of the main page, 
 * check Black under the colors filter and click the Filter button.
 * Use Applitools Eyes’ Check Region feature to only capture a screenshot of the shoes grid (id=product_grid) and verify that only two black shoes appear.

Please use the following information for your visual check:
 * App Name: “AppliFashion”
 * Test name: “Test 2”
 * Step name: “filter by color” 


### Product Details
 * Without filtering, click on the Appli Air x Night shoe
 * Use Applitools to take a screenshot of the entire page to verify all of the details about the product.

### Please use the following information for your visual check:
 * Use: App Name: “AppliFashion”
 * Test name: “Test 3”
 * Step name: “product details” 

Important: Make a note of the URL for your batch test results from the Applitools Dashboard. This is what you will submit upon completion of Part 1.

## Part 2
 * Run the same tests against the dev-branch version, which contains bugs.
 * For bugs found, use the Applitools Dashboard to:
 * Mark the tests as failed
 * Add Bug Region annotations for bugs found. Don’t forget to save your results in the dashboard after failing the tests.
 * In Test 3, find the cause of the bug by using the Root Cause Analysis (RCA) feature and provide comments in the bug region annotations explaining the exact cause of the failures, as indicated by RCA.
 * Important: Make a note of the URL for the Root Cause Analysis (RCA) view of the Applitools Dashboard for failed Test 3. To get this URL, open the RCA pane and click the share icon. This is what you will submit upon completion for Part 2.


## Part 3
Part 3
 * All of the bugs have been fixed! Run your tests again in the final production version of the app but first update your configurations to set Eyes to run each of the three tests across the following configurations using Applitools Ultrafast Grid:
 *  Chrome (1200 x 800)
 *  Firefox (1200 x 800)
 *  Edge Chromium (1200 x 800)  
 *  Safari (1200 x 800)
 *  iPhone X

Yay, your tests have passed. To see what would have happened if you used a pixel-to-pixel visual validation tool as opposed to Applitools AI-based approach, choose the passed Chrome Desktop run for Test 1 and preview it in Exact mode.

Notice the tests would have failed for a simple pixel shift, which is sometimes common in browser updates. Good thing you now know better than to trust a pixel-based visual testing tool! 😎
Important: Make a note of the URL for your batch test results from the Applitools Dashboard. This is what you will submit upon completion for Part 3.

https://applitools.com/hackathon-v20-3-instructions/
