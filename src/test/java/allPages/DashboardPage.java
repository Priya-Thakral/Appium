package allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage extends BaseClass  {
	
	
	
	 //@FindBy(className="kmg.android.mat:id/imgSliderMenuIcon")
	// @FindBy(id="kmg.android.mat:id/imgSliderMenuIcon")
    //@FindBy(xpath="//android.widget.RelativeLayout/android.widget.TextView[contains(@text,'MEDICATIONS')]/android.widget.ImageView")
	 
	@FindBy(id="kmg.android.mat:id/imgSliderMenuIcon")
	public WebElement MatIcon;
	
	@FindBy(className ="android.widget.RelativeLayout")
	public WebElement ReminderButton;
	
	@FindBy(id="kmg.android.mat:id/btnAddNew")
	public WebElement AddNewButton;
	
	@FindBy(id="kmg.android.mat:id/edtMedication")
	public WebElement MedicationButton;
	
	

	@FindBy(id="kmg.android.mat:id/imgCalEnd")
	public WebElement CalenderButton;
	
	
	@FindBy(className="android.view.View")
	public WebElement SelectDateButton;
	
	
	@FindBy(id="android:id/button1")
	public WebElement OkButton;
	
	@FindBy(id="kmg.android.mat:id/btnOk")
	public WebElement Ok2Button;
	
	
	@FindBy(id="android:id/button3")
	public WebElement Ok3Button;
	
	
	
	

	/*public WebElement getMatIcon() {
		return MatIcon;
	}
	
	public WebElement getReminderButton() {
		return ReminderButton;
	}

	public WebElement getAddNewButton() {
		return AddNewButton;
	}
	
	public WebElement getMedicationButton() {
		return MedicationButton;
	}
	
	public WebElement getCalenderButton() {
		return CalenderButton;
	}
	
	public WebElement getSelectDateButton() {
		return SelectDateButton;
	}
	
	public WebElement getOkButton() {
		return OkButton;
	}
	
	public WebElement getOk2Button() {
		return Ok2Button;
	}
	
	public WebElement getOk3Button() {
		return Ok3Button;
	}*/
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickMatIcon()
	{
		
		MatIcon.click();
	}
	
	
	public void ClickReminder()
	{
		
		
		
		ReminderButton.click();
		
	}
	
	
	public void clickonAddNewButton()
	{
		
		
		
		AddNewButton.click();
		
	}
	
	
	public void clickonMedicationButton()
	{
		
		
		
		MedicationButton.click();
		
	}
	
	
	public void clickonCalenderButton()
	{
		
		
		
		CalenderButton.click();
		
	}
	
	public void clickonDate()
	{
		
		
		
		SelectDateButton.click();
		
	}
	
	public void clickonOkButton()
	{
		
		
		
		OkButton.click();
		
	}
	
	
	public void clickonOk2Button()
	{
		
		
		
		Ok2Button.click();
		
	}
	
	
	public void clickonOk3Button()
	{
		
		
		
		Ok3Button.click();
		
	}
}


