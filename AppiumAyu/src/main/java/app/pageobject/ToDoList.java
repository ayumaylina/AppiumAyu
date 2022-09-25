package app.pageobject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ToDoList {
	public AndroidDriver<MobileElement> driver;
	
	public ToDoList(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//LocatorAddList
	@AndroidFindBy(id = "com.splendapps.splendo:id/fabAddTask")
	private MobileElement btnAddList;
	@AndroidFindBy(id = "com.splendapps.splendo:id/edtTaskName")
	private MobileElement listName;
	@AndroidFindBy(id = "com.splendapps.splendo:id/btnSetD")
	private MobileElement btnDate;
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement setDate;
	@AndroidFindBy(id = "com.splendapps.splendo:id/fabSaveTask")
	private MobileElement btnSaveList;
	@AndroidFindBy(id = "com.splendapps.splendo:id/header_title")
	private MobileElement msgAddList;
	
	//LocatorSearchList
	@AndroidFindBy(id = "com.splendapps.splendo:id/action_search")
	private MobileElement btnSearch;
	@AndroidFindBy(id = "com.splendapps.splendo:id/search_src_text")
	private MobileElement search;
	@AndroidFindBy(id = "com.splendapps.splendo:id/task_name")
	private MobileElement msgSearchFound;
	
	//editList
	@AndroidFindBy(id = "com.splendapps.splendo:id/task_name")
	private MobileElement taskName;
	@AndroidFindBy(id = "com.splendapps.splendo:id/edtTaskName")
	private MobileElement editTaskName;
	@AndroidFindBy(id = "com.splendapps.splendo:id/btnSetT")
	private MobileElement setTime;
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement btnTime;
	@AndroidFindBy(id = "com.splendapps.splendo:id/fabSaveTask")
	private MobileElement btnSaveEdit;
	@AndroidFindBy(id = "com.splendapps.splendo:id/task_name")
	private MobileElement msgEdit;
	
	
	//LocatorFilterList
//	@AndroidFindBy(id = "com.splendapps.splendo:id/btnAddList")
//	private MobileElement btnCategoryList;
//	@AndroidFindBy(id = "com.splendapps.splendo:id/spinnerLists")
//	private MobileElement optionList;
//	@AndroidFindBy(id = "00000000-0000-0048-7fff-ffff00000052")
//	private MobileElement option;
	
	public void addList(String listName) throws InterruptedException {
		btnAddList.click();
		Thread.sleep(2000);
		this.listName.sendKeys(listName);
		Thread.sleep(2000);
		btnDate.click();
		Thread.sleep(2000);
		setDate.click();
		Thread.sleep(2000);
		btnSaveList.click();
	}
	
	public String getMsgAddList() {
		return msgAddList.getText();
	}
	
	public void search(String search) throws InterruptedException {
		btnSearch.click();
		Thread.sleep(2000);
		this.search.sendKeys(search);
	}
	
	public String getMsgSearch() {
		return msgSearchFound.getText();
	}
	
	public void edit(String search, String edit) throws InterruptedException {
		btnSearch.click();
		Thread.sleep(2000);
		this.search.sendKeys(search);
		Thread.sleep(2000);
		taskName.click();
		Thread.sleep(2000);
		this.editTaskName.sendKeys(edit);
		Thread.sleep(2000);
		setTime.click();
		Thread.sleep(2000);
		btnTime.click();
		Thread.sleep(2000);
		btnSaveEdit.click();
	}
	
	public String getMsgEdit() {
		return msgEdit.getText();
	}
}

