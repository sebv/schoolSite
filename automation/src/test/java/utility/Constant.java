package utility;

public class Constant {
    //General Path Test Data
    public static final String PathTestData = System.getProperty("user.dir") + "/TestData/";
    public static final String SAPSheet = "general";
    //public static final String SAPSheet = "GeneTech";

    //Timeout Values
    public static final int WaitingSeconds = 70;

    //Contracts Date
    public static final String EffectiveDate = WebdriverUtils.getDate(-10);
    public static final String TermDate = WebdriverUtils.getDate(+20);
    //Site Locations Date
    public static final String BeforeDate = WebdriverUtils.getDate(-3);
    public static final String AfterDate = WebdriverUtils.getDate(+3);

    //Browsers Firefox, Chrome, IE10, Safari
    public static final String vIEBrowserPath = System.getProperty("user.dir") + "/drivers/IEDriver_2.46/IEDriverServer.exe";
    public static final String vChromeBrowserPath = System.getProperty("user.dir") + "/drivers/ChromeDriver/chromedriver.exe";

    public static class Columns {
        //Test Data Sheet Columns
        public static final String UserName = "UserName";
        public static final String Password = "Password";
        public static final String Organization = "Organization";
        public static final String SubOrganization = "Sub-Organization";
        public static final String StudyAcronym = "Study Acronymn";
    }


}
