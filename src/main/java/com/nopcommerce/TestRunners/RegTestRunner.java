package com.nopcommerce.TestRunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
            features ="src/test/resources/Features/F1_Register_New.feature",
            glue ={"com/nopcommerce/StepDefinitions"},
            tags = "@positive",
            monochrome = false,
            plugin ={"pretty", "html:target/HTMLReports/report.html",
                     "json:target/JSONReports/report.json"
            }
)
public class RegTestRunner extends AbstractTestNGCucumberTests {
    private TestNGCucumberRunner testNGCucumberRunner;

//    @BeforeClass(alwaysRun = true)
//    public void setUpClass() throws Exception {

//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() {
//        testNGCucumberRunner.finish();
//    }
}