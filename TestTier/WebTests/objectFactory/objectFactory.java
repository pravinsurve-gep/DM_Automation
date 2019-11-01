package objectFactory;

import Pages.HomePage;
import Pages.Login;
import Pages.ShouldCostPage;
import sql.ShouldCostSql;
import utils.Keys;
import utils.ScenarioContext;

public class objectFactory {

	protected Login login;
	protected HomePage homePage;
	protected ShouldCostPage scPage;
	protected ShouldCostSql scSql;

	public objectFactory() {
		login = Login.getInstance(ScenarioContext.getContext(Keys.WebDriver));
		homePage = HomePage.getInstance(ScenarioContext.getContext(Keys.WebDriver));
		scPage = ShouldCostPage.getInstance(ScenarioContext.getContext(Keys.WebDriver));
		scSql = ShouldCostSql.getInstance();
	}

}
