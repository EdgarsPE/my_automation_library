package typeOfTests;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.testelement.TestPlan;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import org.junit.jupiter.api.Test;


public class StressTest {
        @Test
                public void runJMeterTest() {
                StandardJMeterEngine jmeter = new StandardJMeterEngine();
                HashTree testPlanTree = loadTestPlan("C:/Users/edgar/OneDrive/Desktop/Thread Group.jmx");
                jmeter.configure(testPlanTree);
                jmeter.run();
        }

        private HashTree loadTestPlan(String testPlanFilePath) {
                HashTree testPlanTree = null;
                try {
                        // Uzstādam JMeter mājas direktoriju (ja nepieciešams)
                        // JMeterUtils.setJMeterHome("C:/path/to/your/apache-jmeter-5.4.1");

                        // Ielādējam JMeter konfigurāciju
                        JMeterUtils.loadJMeterProperties("C:/Users/edgar/OneDrive/Desktop/apache-jmeter-5.6.2/bin/jmeter.properties");

                        // Uzstādam JMeter locale
                        JMeterUtils.initLocale();

                        // Ielādējam testa plānu no faila
                       // testPlanTree = SaveService.loadTree(testPlanFilePath);
                } catch (Exception e) {
                        e.printStackTrace();
                }

                return testPlanTree;
        }



}
