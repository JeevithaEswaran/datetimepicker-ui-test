package org.datetimepicker.ui.tests;

import static org.junit.Assert.assertTrue;

import org.datetimepicker.examples.TimePickerExamplesPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.ui.common.ScreenShotMaker;
import org.ui.common.Utility;

public class TimePickerExamplesPageTitleTest extends BaseTest {
  
  Utility util = new Utility();
  ScreenShotMaker screenShotMaker = ScreenShotMaker.getInstance();
  
  private String actual;
  private String expected = "Adding a Timepicker to jQuery UI Datepicker";
  
  @Before
  public void setUp() throws Exception {
    super.setUp();
  }
  
  @After
  public void tearDown() throws Exception {
    super.tearDown();
  }
  
  @Test
  public void test() throws Exception {
    TimePickerExamplesPage timePickerExamplesPage = PageFactory.initElements(
        driver, TimePickerExamplesPage.class);
    
    // save fully qualified class name to used in test reports
    String className = this.getClass().getCanonicalName();
    actual = timePickerExamplesPage.getPageTitle();
    
    try {
      screenShotMaker.takeScreenShot(driver, className);
      assertTrue(expected.equals(actual));
    } catch (Error e) {
      screenShotMaker.takeScreenShot(driver, className);
    }
  }
}