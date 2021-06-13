import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogic {

	@Test(retryAnalyzer= Analyzer.RetryAnalyzer.class)
	public void enterpassword(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void entervalue(){
		Assert.assertEquals(false, true);
	}

	}


