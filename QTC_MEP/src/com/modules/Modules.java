
package com.modules;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.keywords.Keywords;

/**
 * @author Hazarathaiah C
 * Application Name: DML
 * Application under test: Super Admin
  */
public class Modules extends Keywords
{
	/*WebDriverWait wait = new WebDriverWait(dr,60);
	JavascriptExecutor js = (JavascriptExecutor) dr;*/
    
	//private static final By inputWebDriver = null;
	//private static Object JavascriptExecutor;

	
	/**
     * Start the test case
     * Test Case Name:superAdminLoginTc
     * Test Case Details:Super Admin Login page
    */
	
	public static void headerSection(){

		try {
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1500)", "");
			Thread.sleep(2000);
			//WebDriverWait wait = new WebDriverWait(dr,60);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='txtPhone']")));
			typeIn(getPath("txt_phone"),retrievexlval("Phone_Number1"));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pt-clk']")));
			Thread.sleep(1000);
			clickOn(getPath("btn_ExamInformation"));
			Thread.sleep(2000);
			clickOn(getPath("btn_ExamInformation"));
			Thread.sleep(1000);
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	public static void navigateToFormTabs(){
		
		try {
			Thread.sleep(1000);
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='owl-prev']")));
			clickOn(getPath("btn_left_navigate"));
			Thread.sleep(2000);
			clickOn(getPath("btn_left_navigate"));
			Thread.sleep(2000);
			clickOn(getPath("btn_left_navigate"));
			Thread.sleep(2000);
			clickOn(getPath("btn_right_navigate"));
			Thread.sleep(2000);
			clickOn(getPath("btn_right_navigate"));
			Thread.sleep(2000);
			clickOn(getPath("btn_right_navigate"));
			Thread.sleep(2000);
			clickOn(getPath("btn_hamburg"));
			Thread.sleep(2000);
			clickOn(getPath("item3"));
			Thread.sleep(1000);
			//Section Expand/Collapse
			clickOn(getPath("Hide_Section_Panel"));
			Thread.sleep(1000);
			clickOn(getPath("View_Section_Panel"));
			Thread.sleep(1000);
			clickOn(getPath("View_AllSection_Panel"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 500)", "");
			Thread.sleep(1000);
			clickOn(getPath("Navigate_Bottom"));
			Thread.sleep(1000);
			clickOn(getPath("Navigate_Top"));
			Thread.sleep(1000);
			clickOn(getPath("View_OneSection_Panel"));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}

	public static void saveExamData(){

		try {
	
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncheckout']")));
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			Thread.sleep(2000);
			clickOn(getPath("btn_checkout"));
			Reporter.log("status changed successfully");
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnsave']")));
			//js.executeScript("window.scrollBy(0,-500)");
			clickOn(getPath("btn_SignSubmit"));
			Thread.sleep(2000);
			clickOn(getPath("link_valid1"));
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -5000)", "");
			Thread.sleep(3000);
			clickOn(getPath("link_valid2"));
			Thread.sleep(1000);
			clickOn(getPath("sec_ace"));
			Thread.sleep(1000);
			//SECTION-Acceptable Clinical Evidence 
			clickOn(getPath("cb_ACE1"));
			clickOn(getPath("cb_ACE2"));
			clickOn(getPath("cb_ACE3"));
			clickOn(getPath("btn_SEC1_Next"));
			
			//SECTION-Evidence Reviewed 
			Thread.sleep(2000);
			clickOn(getPath("cb_ER"));
			typeIn(getPath("tb_EC"),retrievexlval("Evidence_Comment1"));
			clickOn(getPath("btn_SEC2_Next"));
			
			//SECTION-Diagnosis 
			
			//ClaimedQuestion_1
			Thread.sleep(2000);
			clickOn(getPath("rdn_claimed_condition1"));
			clickOn(getPath("rdn_claimed_condition1_other"));
			typeIn(getPath("tb_OtherComments1"),retrievexlval("Other_Comment1_CQ1"));
	
			
			//ClaimedQuestion_2
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='02f53ea8-70af-496b-b666-a87dde7ad0f5_83de1415-3858-48d0-8e7a-61fd1c358dfa_2']")));
			clickOn(getPath("rdn_claimed_condition2"));
			clickOn(getPath("rdn_claimed_condition2_other"));
			typeIn(getPath("tb_OtherComments2"),retrievexlval("Other_Comment2_CQ1"));
			
			//ReferredQuestion_1
			clickOn(getPath("rdn_referred_condition1"));
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 250)", "");
			clickOn(getPath("rdn_referred_condition1_other"));
			typeIn(getPath("tb_OtherComments1_referred"),retrievexlval("Other_Comment1_RQ1"));
			
			//ReferredQuestion_2
			clickOn(getPath("rdn_referred_condition2"));
			clickOn(getPath("rdn_referred_condition2_other"));
			typeIn(getPath("tb_OtherComments2_referred"),retrievexlval("Other_Comment2_RQ1"));
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			
			//EstablishedQuestion_1
			clickOn(getPath("rdn_established_condition1"));
			clickOn(getPath("rdn_established_condition1_other"));
			typeIn(getPath("tb_OtherComments1_established"),retrievexlval("Other_Comment1_EQ1"));
			
			//EstablishedQuestion_2
			clickOn(getPath("rdn_established_condition2"));
			clickOn(getPath("rdn_established_condition2_other"));
			typeIn(getPath("tb_OtherComments2_established"),retrievexlval("Other_Comment2_EQ1"));
			
			//DOES THE VETERAN NOW HAVE OR HAS HE OR SHE EVER BEEN DIAGNOSED WITH A CONDITION OF THE BLADDER OR URETHRA OF THE URINARY TRACT?
			clickOn(getPath("rdn_yes"));
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 250)", "");
			typeIn(getPath("tb_diagnosis1"),retrievexlval("Diagnosis11"));
			typeIn(getPath("tb_diagnosis2"),retrievexlval("Diagnosis21"));
			typeIn(getPath("tb_ICD_code1"),retrievexlval("ICD_Code11"));
			typeIn(getPath("tb_Date_of_Diagnosis1"),retrievexlval("Date_of_Diagnosis11"));
			typeIn(getPath("tb_ICD_code2"),retrievexlval("ICD_Code21"));
			typeIn(getPath("tb_diagnosis3"),retrievexlval("Diagnosis31"));
			typeIn(getPath("tb_Date_of_Diagnosis2"),retrievexlval("Date_of_Diagnosis21"));
			typeIn(getPath("tb_ICD_code3"),retrievexlval("ICD_Code31"));
			typeIn(getPath("tb_Date_of_Diagnosis3"),retrievexlval("Date_of_Diagnosis31"));
			
			typeIn(getPath("tb_Additional_Diagnosis"),retrievexlval("Additional_Diagnosis1"));
			clickOn(getPath("btn_SEC3_Next"));
			
			
			//SECTION-MEDICAL HISTORY
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='d155db51-ae02-4cac-b0d5-a22f7f6c9c46']")));
			typeIn(getPath("tb_Medical_History"),retrievexlval("Medical_History1"));
			Thread.sleep(1000);
			clickOn(getPath("btn_SEC4_Next"));
			
			//SECTION-Voiding Dysfunction
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='7f5de9ed-3480-45d2-b738-33e2d95001be']")));
			Thread.sleep(2000);
			clickOn(getPath("5SEC_rdbtn_yes1"));
			typeIn(getPath("tb_Dysfunction"),retrievexlval("Etiology_Description1"));
			clickOn(getPath("5SEC_rdn_yes2"));
			clickOn(getPath("5SEC_rdn_Other"));
			typeIn(getPath("tb_OtherDesc"),retrievexlval("Other_Description11"));
			clickOn(getPath("5SEC_rdn_yes3"));
			typeIn(getPath("tb_YesDesc"),retrievexlval("Yes_Description1"));
			clickOn(getPath("5SEC_rdn_yes4"));
			clickOn(getPath("cb_yes1"));
			clickOn(getPath("cb_yes2"));
			clickOn(getPath("cb_yes3"));
			clickOn(getPath("cb_yes4"));
			clickOn(getPath("cb_yes5"));
			clickOn(getPath("cb_yes6"));
			clickOn(getPath("5SEC_rdn_yes5"));
			clickOn(getPath("5SEC_cb_yes1"));
			clickOn(getPath("5SEC_cb_yes2"));
			clickOn(getPath("5SEC_cb_yes3"));
			clickOn(getPath("5SEC_cb_yes4"));
			clickOn(getPath("5SECT_rdn_yes1"));
			clickOn(getPath("5SECT_rdn_yes2"));
			clickOn(getPath("5SECT_rdn_yes3"));
			clickOn(getPath("5SECT_rdn_yes4"));
			clickOn(getPath("5SEC_cb_StructureDisease"));
			clickOn(getPath("5SEC_rdn_Requires_dilatation"));
			clickOn(getPath("5SEC_rdn_OtherSpecify"));
			typeIn(getPath("tb_OtherSpecify"),retrievexlval("Other_Specification1"));
			clickOn(getPath("cb_Recurrent_urinary"));
			clickOn(getPath("cb_Uroflowmetry"));
			clickOn(getPath("cb_Post_void"));
			clickOn(getPath("cb_obstructive"));
			clickOn(getPath("cb_intermittent"));
			clickOn(getPath("cb_continuous"));
			clickOn(getPath("cb_Otherdescp"));
			typeIn(getPath("tb_Otherdesc"),retrievexlval("Other_Description21"));
			clickOn(getPath("btn_SEC5_Next"));
			
			//Section IV-Urolithiasis
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='d1c20e62-dce0-4456-b543-b013977b57ef']")));
			Thread.sleep(2000);
			clickOn(getPath("6SECT_rdn_yes1"));
			clickOn(getPath("6SEC_cb_Urethra"));
			clickOn(getPath("6SEC_cb_Bladder"));
			clickOn(getPath("6SECT_rdn_yes2"));
			clickOn(getPath("6SEC_cb_Diet_therapy"));
			typeIn(getPath("tb_Diet"),retrievexlval("Diet_therapy1"));
			typeIn(getPath("tb_dates"),retrievexlval("Diet_therapy_date1"));
			clickOn(getPath("6SEC_cb_Drug_therapy"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='3d9711d4-3118-452d-a734-b82a4184441f']")));
			typeIn(getPath("tb_medication"),retrievexlval("Drug_therapy1"));
			typeIn(getPath("tb_dates_use"),retrievexlval("Drug_therapy_date1"));
			clickOn(getPath("6SEC_cb_Invasive"));
			clickOn(getPath("6SECT_rdn_year"));
			typeIn(getPath("tb_Name_Facility"),retrievexlval("Procedure1"));
			clickOn(getPath("6SECT_rdn_yes3"));
			clickOn(getPath("cb_Bladder_pain"));
			clickOn(getPath("cb_Dysuria"));
			clickOn(getPath("cb_Hematuria"));
			clickOn(getPath("cb_Voiding_dysfunction"));
			clickOn(getPath("cb_Catheter_drainage"));
			clickOn(getPath("6SECT_rdn_Drainage"));
			clickOn(getPath("cb_Infections"));
			clickOn(getPath("6SECT_rdn_infection"));
			clickOn(getPath("cb_Sudden_painful"));
			clickOn(getPath("cb_OtherDescp"));
			typeIn(getPath("6SEC_tb_Otherdesc"),retrievexlval("SEC4_OtherDescription1"));
			clickOn(getPath("btn_SEC6_Next"));
			
			//SECTION-Bladder Or Urethral Infection
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='cc0a8a44-0535-4844-9a2a-fdc3d5a7f902']")));
			Thread.sleep(2000);
			clickOn(getPath("7SECT_rdn_yes"));
			typeIn(getPath("7SEC_tb_Provide_Etiology"),retrievexlval("Provide_Etiology1"));
			clickOn(getPath("cb_Long_term"));
			typeIn(getPath("7SEC_tb_medications"),retrievexlval("Long_Term_Drug_Therapy1"));
			clickOn(getPath("cb_Hospitalization"));
			clickOn(getPath("7SECT_rdn_year"));
			clickOn(getPath("7SECT_cb_drain"));
			typeIn(getPath("7SEC_tb_drain_past"),retrievexlval("Drainage1"));
			clickOn(getPath("7SECT_cb_Continuous"));
			typeIn(getPath("7SEC_tb_Continuous"),retrievexlval("Continuous_intensive_management1"));
			clickOn(getPath("7SECT_cb_Intermittent"));
			typeIn(getPath("7SEC_tb_Intermittent"),retrievexlval("Intermittent_intensive_management1"));
			clickOn(getPath("7SECT_OtherDescrpt"));
			typeIn(getPath("7SEC_tb_OtherDescrpt"),retrievexlval("SEC5_OtherDescription1"));
			clickOn(getPath("btn_SEC7_Next"));
			
			//Section VI-Other Bladder/Urethral Conditions
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='8a7e7bcb-f655-433c-85fd-1ef2d37ee14a']")));
			Thread.sleep(3000);
			clickOn(getPath("8SECT_rdn_yes1"));
			clickOn(getPath("8SECT_rdn_yes2"));
			clickOn(getPath("8SECT_rdn_yes3"));
			clickOn(getPath("8SECT_rdn_yes4"));
			clickOn(getPath("8SECT_rdn_yes5"));
			typeIn(getPath("8SEC_tb_yes1"),retrievexlval("SEC6_Description11"));
			clickOn(getPath("8SECT_rdn_yes6"));
			typeIn(getPath("8SEC_tb_yes2"),retrievexlval("SEC6_Description21"));
			clickOn(getPath("8SECT_rdn_yes7"));
			typeIn(getPath("8SEC_tb_yes3"),retrievexlval("SEC6_Description31"));
			clickOn(getPath("8SECT_rdn_no"));
			clickOn(getPath("btn_SEC8_Next"));
			
			//Section VII-Tumors and Neoplasms
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='781f0674-5a1c-4b8f-9094-e3a47843d90c']")));
			Thread.sleep(2000);
			clickOn(getPath("9SECT_rdn_yes1"));
			clickOn(getPath("9SECT_rdn_MALIGNANT"));
			clickOn(getPath("9SECT_rdn_remission"));
			clickOn(getPath("9SECT_rdn_yes2"));
			clickOn(getPath("9SEC_cb_Treatment"));
			clickOn(getPath("9SEC_cb_Surgery"));
			typeIn(getPath("9SEC_tb_Surgery_Desc"),retrievexlval("Surgery_Description1"));
			typeIn(getPath("9SEC_tb_Surgery_date"),retrievexlval("Surgery_Date1"));
			clickOn(getPath("9SEC_cb_Radiation"));
			typeIn(getPath("9SEC_tb_Radiation_Desc"),retrievexlval("Radiation_Description1"));
			typeIn(getPath("9SEC_tb_Radiation_date"),retrievexlval("Radiation_Date1"));
			clickOn(getPath("9SEC_cb_Antineoplastic"));
			typeIn(getPath("9SEC_tb_Antineoplastic_Desc"),retrievexlval("Antineoplastic_Description1"));
			typeIn(getPath("9SEC_tb_Antineoplastic_date"),retrievexlval("Antineoplastic_Date1"));
			clickOn(getPath("9SEC_cb_procedure"));
			typeIn(getPath("9SEC_tb_procedure_Desc"),retrievexlval("Procedure_Description1"));
			typeIn(getPath("9SEC_tb_procedure_date"),retrievexlval("Procedure_Date1"));
			clickOn(getPath("9SEC_cb_treatment"));
			typeIn(getPath("9SEC_tb_treatment_Desc"),retrievexlval("Treatment_Description1"));
			typeIn(getPath("9SEC_tb_treatment_date"),retrievexlval("Treatment_Date1"));
			clickOn(getPath("9SECT_rdn_yes3"));
			typeIn(getPath("9SEC_tb_VETERAN_Con"),retrievexlval("Veteran_Condition1"));
			typeIn(getPath("9SEC_tb_VETERAN_Desc"),retrievexlval("Veteran_Description1"));
			clickOn(getPath("btn_SEC9_Next"));
			
			//Section VIII-Other Pertinent Physical Findings, Complications, Conditions, Signs, Symptoms And Scars
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='36e9b678-9660-4d9a-a83d-370d4d7704cd']")));
			Thread.sleep(2000);
			clickOn(getPath("XSECT_rdn_yes1"));
			typeIn(getPath("XSEC_tb_desc"),retrievexlval("SEC8_Description1"));
			clickOn(getPath("XSECT_rdn_yes2"));
			typeIn(getPath("XSEC_tb_comments"),retrievexlval("SEC8_Comments1"));
			/*clickOn(getPath("XSECT_rdn_yes3"));
			Thread.sleep(8000);
			clickOn(getPath("XSECT_Ok"));
			Thread.sleep(5000);*/
			clickOn(getPath("btn_SECX_Next"));
		
			//Section IX-Diagnostic Testing
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='55939729-b46f-4389-9acd-4dda78e60b14']")));
			Thread.sleep(2000);
			clickOn(getPath("XISECT_rdn_yes1"));
			typeIn(getPath("XISEC_tb_desc"),retrievexlval("SEC9_Description1"));
			clickOn(getPath("btn_SECXI_Next"));
			
			//Section X-Functional Impact
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='6af83ec4-fa3d-4d63-89f8-8b4b619c7e39']")));
			Thread.sleep(2000);
			clickOn(getPath("XIISECT_rdn_yes1"));
			typeIn(getPath("XIISEC_tb_desc"),retrievexlval("SEC10_Description1"));
			clickOn(getPath("btn_SECXII_Next"));
			
			//Section XI-Remarks
			
			
			////////wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='12d5d045-011b-4544-9944-55888b9c7f2d_fcdb3740-4f14-4669-a9b5-308947504e91_1']")));
			Thread.sleep(1000);
			typeIn(getPath("XIIISEC_tb_remarksdesc1"),retrievexlval("Remarks_Description11"));
			typeIn(getPath("XIIISEC_tb_remarksdesc2"),retrievexlval("Remarks_Description21"));
			typeIn(getPath("XIIISEC_tb_remarksdesc3"),retrievexlval("Remarks_Description31"));
			clickOn(getPath("XIIISECT_rdn_yes1"));
			typeIn(getPath("XIIISEC_tb_identified"),retrievexlval("Identified_textfield1"));
			clickOn(getPath("XIIISECT_rdn_yes2"));
			clickOn(getPath("XIIISECT_rdn_yes3"));
			typeIn(getPath("XIIISEC_tb_remarksdesc4"),retrievexlval("Remarks_Description41"));
			
			
			
			
			clickOn(getPath("XIIISECT_rdn_yes3"));
			clickOn(getPath("btn_SignSubmit"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='validation']/div/div/table/tbody/tr[1]/td[3]/a")));
			clickOn(getPath("CB_ValidLink"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='baf7cc03-d25c-43eb-9c53-c91f50acdbd5']")));
			clickOn(getPath("XSECT_rdn_yes3"));
			Thread.sleep(5000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnok']")));
			clickOn(getPath("XSECT_Ok"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -700)", "");
			Thread.sleep(2000);
			///Trigger Validation
			List<WebElement> a=dr.findElements(By.xpath(".//*[@id='tabb22efd0a-80cf-4359-8472-8712f22da683']"));
			a.get(1).click();
			//clickOn(getPath("TDBQ_Tab"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 800)", "");
			Thread.sleep(1000);
			clickOn(getPath("btn_SignSubmit"));
			Thread.sleep(2000);
			clickOn(getPath("Tlink_valid1"));
			Thread.sleep(2000);
			clickOn(getPath("Tlink_valid2"));
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -5000)", "");
			Thread.sleep(2000);
			clickOn(getPath("Tsec_cpe"));
			//Call Trigger DBQ Function code
			//C&P Examination
			 Thread.sleep(3000);
			 typeIn(getPath("TCPE_Comments"),retrievexlval("Scar_Comments1"));
			 Thread.sleep(1000);
			 clickOn(getPath("TCPE_Next"));
			 //Acceptable Clinical Evidence
			 Thread.sleep(2000);
			 clickOn(getPath("TACE_Next"));
			 //Evidence Review
			 Thread.sleep(2000);
			 clickOn(getPath("TER_Next"));
			 //Section I-Diagnosis
			 Thread.sleep(1000);
			 clickOn(getPath("TSECI_QONE_yes"));
			 typeIn(getPath("TSECI_QONE_diag1"),retrievexlval("Scar_Diagnosis11"));
			 typeIn(getPath("TSECI_QONE_ICD1"),retrievexlval("Scar_ICD11"));
			 typeIn(getPath("TSECI_QONE_diag2"),retrievexlval("Scar_Diagnosis21"));
			 typeIn(getPath("TSECI_QONE_diagDate1"),retrievexlval("Scar_DOD11"));
			 typeIn(getPath("TSECI_QONE_ICD2"),retrievexlval("Scar_ICD21"));
			 typeIn(getPath("TSECI_QONE_diag3"),retrievexlval("Scar_Diagnosis31"));
			 typeIn(getPath("TSECI_QONE_diagDate2"),retrievexlval("Scar_DOD21"));
			 typeIn(getPath("TSECI_QONE_ICD3"),retrievexlval("Scar_ICD31"));
			 typeIn(getPath("TSECI_QONE_diagDate3"),retrievexlval("Scar_DOD31"));
			 typeIn(getPath("TSECI_QONE_Adddiag"),retrievexlval("Scar_Additional_Diag1"));
			 clickOn(getPath("TSECI_Next"));
			 //Section I-Scars Of the Trunk and Extermities
			 Thread.sleep(1000);
			 typeIn(getPath("TSECIS_QONE_historyDesc"),retrievexlval("History_Description1"));
			 Thread.sleep(2000);
			 clickOn(getPath("TSECIS_QONE_pscar"));
			 clickOn(getPath("TSECIS_QONE_snum"));
			 typeIn(getPath("TSECIS_QONE_Descpain"),retrievexlval("Pain_Description1"));
			 Thread.sleep(1000);
			 clickOn(getPath("TSECIS_QONE_ScarUnstable"));
			 clickOn(getPath("TSECIS_QONE_NumUnstable"));
			 typeIn(getPath("TSECIS_QONE_DescLossSkin"),retrievexlval("Scar_Loss_Skin1"));
			 Thread.sleep(1000);
			 clickOn(getPath("TSECIS_QONE_ScarDueToBurns"));
			 Thread.sleep(1000);
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 250)", "");
			 Thread.sleep(1000);
			 typeIn(getPath("TSECIS_QONE_BurnScar2"),retrievexlval("Scar_Burn_DOD21"));
			 Thread.sleep(1000);
			 clickOn(getPath("TSECIS_QONE_DPT"));
			 typeIn(getPath("TSECIS_QONE_BurnScar1"),retrievexlval("Scar_Burn_DOD11"));
			 Thread.sleep(1000);
			 clickOn(getPath("TSECIS_QONE_FT"));
			 Thread.sleep(1000);
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 250)", "");
			 clickOn(getPath("TSECIS_QTWO_Affected"));
			 typeIn(getPath("TSECIS_QTWO_ScarLocation"),retrievexlval("Scar_Location1"));
			 Thread.sleep(1000);
			 clickOn(getPath("TSECIS_QTWO_LinearOne"));
			 typeIn(getPath("TSECIS_SCARCMS"),"25");
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
			 clickOn(getPath("TSECIS_QTWO_SNONLinearOne"));
			 clickOn(getPath("TSECIS_QTWO_DeepOne"));
			 clickOn(getPath("TSECIS_QTWO_DeepNonLinearOne"));
			 
			/* js.executeScript("window.scrollBy(0,1000)");
			 clickOn(getPath("TSECIS_QTWO_LinearTwo"));
			 clickOn(getPath("TSECIS_QTWO_SNONLinearTwo"));
			 clickOn(getPath("TSECIS_QTWO_DeepTwo"));*/
		
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			 clickOn(getPath("TSECIS_QTWO_Linear1"));
			 clickOn(getPath("TSECIS_QTWO_SNONLinear1"));
			 clickOn(getPath("TSECIS_QTWO_Deep1"));
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			
			 clickOn(getPath("TSECIS_QTWO_Linear2"));
			 clickOn(getPath("TSECIS_QTWO_SNONLinear2"));
			 clickOn(getPath("TSECIS_QTWO_Deep2"));
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			
			 clickOn(getPath("TSECIS_QTWO_Linear3"));
			 clickOn(getPath("TSECIS_QTWO_SNONLinear3"));
			 clickOn(getPath("TSECIS_QTWO_Deep3"));
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
		
			 clickOn(getPath("TSECIS_QTWO_Linear4"));
			 clickOn(getPath("TSECIS_QTWO_SNONLinear4"));
			 clickOn(getPath("TSECIS_QTWO_Deep4"));
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			
			 clickOn(getPath("TSECIS_SNLS"));
			 clickOn(getPath("TSECIS_DNLS"));
			 clickOn(getPath("TSECIS_Next"));
			 
			 /*//Section II-Scars or Other Disfigurement of the Head,Face or Neck
			 //A and B
*/			 
			 Thread.sleep(1000);
			 typeIn(getPath("TSECIIS_history"),retrievexlval("Scar_Disfig_History1"));
			 clickOn(getPath("TSECIIS_pscar"));
			 clickOn(getPath("TSECIIS_NPscar"));
			 typeIn(getPath("TSECIIS_DescPainful"),retrievexlval("Scar_Describe_Pain1"));
			 
			 //C
			 clickOn(getPath("TSECIIS_SHEAD"));
			 clickOn(getPath("TSECIIS_NUMUSTABLE"));
			 typeIn(getPath("TSECIIS_DESCLOSS"),retrievexlval("Scar_Describe_Loss_Skin1"));
			 
			 //D
			 clickOn(getPath("TSECIIS_SHEADBURNS"));
			 typeIn(getPath("TSECIIS_BURNSCAR1"),retrievexlval("Scar_Burn11"));
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -500)", "");
			 clickOn(getPath("TSECIIS_DEEPTHICK"));
			 //typeIn(getPath("TSECIIS_BURNSCAR2"),retrievexlval("Remarks_Description11"));
			 
			 //A
		
			 clickOn(getPath("TSECIIS_SCAR1"));
			 typeIn(getPath("TSECIIS_LOCSCARDIS1"),retrievexlval("Disfigurement_Location11"));
			 typeIn(getPath("TSECIIS_LENSCARDIS1"),retrievexlval("Disfigurement_Length11"));
			 typeIn(getPath("TSECIIS_WIDSCARDIS1"),retrievexlval("Disfigurement_width11"));
			 
			 clickOn(getPath("TSECIIS_SCAR2"));
			 typeIn(getPath("TSECIIS_LOCSCARDIS2"),retrievexlval("Disfigurement_Location21"));
			 typeIn(getPath("TSECIIS_LENSCARDIS2"),retrievexlval("Disfigurement_Length21"));
			 typeIn(getPath("TSECIIS_WIDSCARDIS2"),retrievexlval("Disfigurement_width21"));
			 
			 clickOn(getPath("TSECIIS_SCAR3"));
			 typeIn(getPath("TSECIIS_LOCSCARDIS3"),retrievexlval("Disfigurement_Location31"));
			 typeIn(getPath("TSECIIS_LENSCARDIS3"),retrievexlval("Disfigurement_Length31"));
			 typeIn(getPath("TSECIIS_WIDSCARDIS3"),retrievexlval("Disfigurement_width31"));
			 
			 clickOn(getPath("TSECIIS_SCAR4"));
			 typeIn(getPath("TSECIIS_LOCSCARDIS4"),retrievexlval("Disfigurement_Location41"));
			 typeIn(getPath("TSECIIS_LENSCARDIS4"),retrievexlval("Disfigurement_Length41"));
			 typeIn(getPath("TSECIIS_WIDSCARDIS4"),retrievexlval("Disfigurement_width41"));
			 
			 clickOn(getPath("TSECIIS_SCAR5"));
			 typeIn(getPath("TSECIIS_LOCSCARDIS5"),retrievexlval("Disfigurement_Location51"));
			 typeIn(getPath("TSECIIS_LENSCARDIS5"),retrievexlval("Disfigurement_Length51"));
			 typeIn(getPath("TSECIIS_WIDSCARDIS5"),retrievexlval("Disfigurement_width51"));
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 500)", "");
			 clickOn(getPath("TSECIIS_elevation"));
			 clickOn(getPath("TSECIIS_pigmentation"));
			 clickOn(getPath("TSECIIS_distortion"));
			 clickOn(getPath("TSECIIS_Next"));
			 Thread.sleep(1000);
			 clickOn(getPath("TSECIIS_SCARDISFIGUREMENT"));
			 typeIn(getPath("TSECIIS_SPECIFIC_LIMITATION"),retrievexlval("Scar_Specific_Limitation1"));
			 
			 clickOn(getPath("TSECIIS_SCARPERTINENT"));
			 typeIn(getPath("TSECIIS_DESC"),retrievexlval("Disfigurement_description1"));
			 
			 clickOn(getPath("TSECIIS_Photograph"));
			 clickOn(getPath("TSECIIS_DISFIGUREMENT_CB"));
			 typeIn(getPath("TSECIIS_DISFIGUREMENT_TXT"),retrievexlval("Scar_Impact1"));
			 clickOn(getPath("btn_SignSubmit"));
			 
			//Remove Trigger DBQ Code
			Thread.sleep(2000);
			clickOn(getPath("btn_remove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncancel']")));
			clickOn(getPath("btn_cancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_remove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btndelete']")));
			clickOn(getPath("btn_Ok"));
			Thread.sleep(2000);
			clickOn(getPath("btn_SignSubmit"));
			
	
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public static void ImoFormSave(){

		try {
           //IMO FORM
			//clickOn(getPath("IMO_ER_ValidLink"));
			//clickOn(getPath("IMO_ER_Prev"));
			Thread.sleep(2000);
			clickOn(getPath("IMO_Tab"));
			Thread.sleep(2000);
			clickOn(getPath("btn_SignSubmit"));
			Thread.sleep(1000);
			clickOn(getPath("IMO_ER_ValidLink"));
			Thread.sleep(1000);
			clickOn(getPath("IMO_ACE_SEC"));
			Thread.sleep(2000);
			clickOn(getPath("IMO_ACE_cb1"));
			clickOn(getPath("IMO_ACE_cb2"));
			clickOn(getPath("IMO_ACE_cb3"));
			Thread.sleep(1000);
			clickOn(getPath("IMO_ACE_Next"));
			////////wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='2139e0dc-9249-4aa0-bc2d-f06dcf5c5e47_1']")));
			Thread.sleep(2000);
			clickOn(getPath("IMO_ER_cb1"));
			typeIn(getPath("IMO_ER_txt1"),retrievexlval("Other_Description1"));
			Thread.sleep(1000);
			typeIn(getPath("IMO_ER_txt2"),retrievexlval("Evidence_Comments1"));
			clickOn(getPath("IMO_ER_Next"));
			/*clickOn(getPath("IMO_ER_cb2"));
			clickOn(getPath("IMO_ER_Next"));
			//////wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='9c52e7e3-cd86-4735-8fda-182319a4d17f_1']")));
			clickOn(getPath("IMO_OR_rb1"));
			typeIn(getPath("IMO_OR_txt1"),retrievexlval("Rationale_Description11"));
			js.executeScript("window.scrollBy(0,-200)");
			//////wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='1e72ae5d-2c6a-4135-b5a2-d62853b1ab9c_1']")));
			clickOn(getPath("IMO_OR_rb2"));
			typeIn(getPath("IMO_OR_txt2"),retrievexlval("Rationale_Description21"));
			clickOn(getPath("IMO_OR_rb3"));
			typeIn(getPath("IMO_OR_txt3"),retrievexlval("Rationale_Description31"));
			js.executeScript("window.scrollBy(0,200)");
			clickOn(getPath("IMO_OR_rb4"));
			typeIn(getPath("IMO_OR_txt4"),retrievexlval("Provide_Rationale_Description11"));
			clickOn(getPath("IMO_OR_rb5"));
			typeIn(getPath("IMO_OR_txt5"),retrievexlval("Provide_Rationale_Description21"));
			typeIn(getPath("IMO_OR_txt6"),retrievexlval("Medical_Evidence_Description1"));*/
			
		    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	public static void manualAddDbq(){

		try {
			
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -3000)", "");
			for(int i=0;i<2;i++) {
            Thread.sleep(2000);
			clickOn(getPath("btn_add_DBQ"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='select-dbq']")));
			selectList(getPath("drplist_add_DBQ"),retrievexlval("Add_Dbq1"));
			if(i==0) {
			clickOn(getPath("btn_cancel_add"));
			Thread.sleep(2000);
			}
			
			if(i==1) {
				clickOn(getPath("btn_confirm"));
				Thread.sleep(2000);
			}
			}
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnok']")));
			clickOn(getPath("btn_DBQ_Ok"));
			Thread.sleep(2000);
			//Fill data in manual DBQ
			/*List<WebElement> a=dr.findElements(By.xpath(".//*[@id='tab549aa4c7-7831-4c6e-a28a-93a451475e6d']"));
			a.get(1).click();*/
			clickOn(getPath("MESOPHAGUS_TAB"));
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 500)", "");
			Thread.sleep(2000);
			clickOn(getPath("btn_SignSubmit"));
			Thread.sleep(2000);
			clickOn(getPath("MValidlink"));
			Thread.sleep(1000);
			clickOn(getPath("MSEC_CPE"));
			Thread.sleep(2000);
			//C&P Examination
			typeIn(getPath("MSEC_Comments_CPE_Txt"),retrievexlval("Esophagus_CPE_Comments1"));
			clickOn(getPath("MSEC_Next_CPE"));
			//Acceptable Clinical Evidence
			Thread.sleep(1000);
			clickOn(getPath("MSEC_AR_CPE"));
			clickOn(getPath("MSEC_ARC_CPE"));
			clickOn(getPath("MSEC_EAVT_CPE"));
			Thread.sleep(1000);
			clickOn(getPath("MSEC_Next_ACE"));
			//Evidence Review
			Thread.sleep(1000);
			//clickOn(getPath("MSEC_ER_CPRS"));
			Thread.sleep(1000);
			typeIn(getPath("MSEC_Comments_ER"),retrievexlval("Esophagus_ER_Comments1"));
			Thread.sleep(1000);
			clickOn(getPath("MSEC_Next_ER"));
			
			//Section I-Diagnosis
			Thread.sleep(1000);
			clickOn(getPath("MSEC_Diag_Yes"));
			clickOn(getPath("MSEC_Diag_GERD"));
			clickOn(getPath("MSEC_Diag_HH"));
			clickOn(getPath("MSEC_Diag_ESO"));
			clickOn(getPath("MSEC_Diag_ESPO"));
			clickOn(getPath("MSEC_Diag_EDO"));
			clickOn(getPath("MSEC_Diag_OEC"));
			
			typeIn(getPath("MSEC_Diag_IC1"),retrievexlval("Esophagus_ICD_Code11"));
			typeIn(getPath("MSEC_Diag_IC2"),retrievexlval("Esophagus_ICD_Code21"));
			typeIn(getPath("MSEC_Diag_IC3"),retrievexlval("Esophagus_ICD_Code31"));
			typeIn(getPath("MSEC_Diag_IC4"),retrievexlval("Esophagus_ICD_Code41"));
			typeIn(getPath("MSEC_Diag_IC5"),retrievexlval("Esophagus_ICD_Code51"));
			
			typeIn(getPath("MSEC_Diag_DOD1"),retrievexlval("Esophagus_Date_of_Diagnosis11"));
			typeIn(getPath("MSEC_Diag_DOD2"),retrievexlval("Esophagus_Date_of_Diagnosis21"));
			typeIn(getPath("MSEC_Diag_DOD3"),retrievexlval("Esophagus_Date_of_Diagnosis31"));
			typeIn(getPath("MSEC_Diag_DOD4"),retrievexlval("Esophagus_Date_of_Diagnosis41"));
			
			
			typeIn(getPath("MSEC_Diag_OD1"),retrievexlval("Esophagus_Other_Diagnosis11"));
			typeIn(getPath("MSEC_Diag_DOD5"),retrievexlval("Esophagus_Date_of_Diagnosis51"));
			typeIn(getPath("MSEC_Diag_OD2"),retrievexlval("Esophagus_Other_Diagnosis21"));
			
			typeIn(getPath("MSEC_Diag_OIC1"),retrievexlval("Esophagus_ICD_Code61"));
			typeIn(getPath("MSEC_Diag_OIC2"),retrievexlval("Esophagus_ICD_Code71"));
			
			typeIn(getPath("MSEC_Diag_ODOD1"),retrievexlval("Esophagus_Date_of_Diagnosis61"));
			typeIn(getPath("MSEC_Diag_ODOD2"),retrievexlval("Esophagus_Date_of_Diagnosis71"));
			
			typeIn(getPath("MSEC_Diag_ADDIAG"),retrievexlval("Esophagus_Additional_Diagnosis1"));
			clickOn(getPath("MSEC_Diag_Next"));
			
			//Section II-Medical History
			Thread.sleep(1000);
			typeIn(getPath("MSEC_MH_HIS_TXT"),retrievexlval("Esophagus_Described_History1"));
			Thread.sleep(1000);
			clickOn(getPath("MSEC_MH_TRT_RB"));
			typeIn(getPath("MSEC_MH_DC_TXT"),retrievexlval("Esophagus_Diagnosed_Condition1"));
			clickOn(getPath("MSEC_MH_NEXT"));
			
			//Section III-Signs and Symptoms
			Thread.sleep(1000);
			clickOn(getPath("MSEC_SAS_NO_RB"));
			clickOn(getPath("MSEC_SAS_NEXT"));
			
			//Section IV-Esophageal Stricture, Spasm and Diverticulum
			Thread.sleep(1000);
			clickOn(getPath("MSEC_ESSD_YES_RB"));
			clickOn(getPath("MSEC_ESSD_MILD_RB"));
			typeIn(getPath("MSEC_ESSD_MILD_TXT"),retrievexlval("Esophagus_Mild_Description1"));
			clickOn(getPath("MSEC_ESSD_NEXT"));
			
			//Section V-Other Pertinent Physical Findings, Complications, Conditions, Signs, Symptoms and Scars
			Thread.sleep(1000);
			clickOn(getPath("MSEC_OPPF_YES_RB"));
			typeIn(getPath("MSEC_OPPF_DES_TXT"),retrievexlval("Esophagus_Other_Pertinent_Description1"));
			clickOn(getPath("MSEC_OPPF_VET_RB"));
			clickOn(getPath("MSEC_OPPF_VAF_RB"));
			typeIn(getPath("MSEC_OPPF_LOC_TXT"),retrievexlval("Esophagus_Location1"));
			typeIn(getPath("MSEC_OPPF_LEN_TXT"),retrievexlval("Esophagus_Length1"));
			typeIn(getPath("MSEC_OPPF_WID_TXT"),retrievexlval("Esophagus_width1"));
			typeIn(getPath("MSEC_OPPF_CMTS_TXT"),retrievexlval("Esophagus_Comments1"));
			clickOn(getPath("MSEC_OPPF_NEXT"));
			
			//Section VI-Diagnostic Testing
			Thread.sleep(1000);
			clickOn(getPath("MSEC_DT_ODP_RB"));
			clickOn(getPath("MSEC_DT_UE_CB"));
			typeIn(getPath("MSEC_DT_DATE_TXT1"),retrievexlval("Esophagus_UpperEndoscopy_Date1"));
			typeIn(getPath("MSEC_DT_RES_TXT1"),retrievexlval("Esophagus_UpperEndoscopy_Results1"));
			
			clickOn(getPath("MSEC_DT_UGRS_CB"));
			typeIn(getPath("MSEC_DT_DATE_TXT2"),retrievexlval("Esophagus_Radiographic_Date1"));
			typeIn(getPath("MSEC_DT_RES_TXT2"),retrievexlval("Esophagus_Radiographic_Results1"));
			
			clickOn(getPath("MSEC_DT_ESO_CB"));
			typeIn(getPath("MSEC_DT_DATE_TXT3"),retrievexlval("Esophagus_Esophagram_Date1"));
			typeIn(getPath("MSEC_DT_RES_TXT3"),retrievexlval("Esophagus_Esophagram_Results1"));
			
			clickOn(getPath("MSEC_DT_MRI_CB"));
			typeIn(getPath("MSEC_DT_DATE_TXT4"),retrievexlval("Esophagus_MRI_Date1"));
			typeIn(getPath("MSEC_DT_RES_TXT4"),retrievexlval("Esophagus_MRI_Results1"));
			
			clickOn(getPath("MSEC_DT_CT_CB"));
			typeIn(getPath("MSEC_DT_DATE_TXT5"),retrievexlval("Esophagus_CT_Date1"));
			typeIn(getPath("MSEC_DT_RES_TXT5"),retrievexlval("Esophagus_CT_Results1"));
			
			clickOn(getPath("MSEC_DT_BIO_CB"));
			typeIn(getPath("MSEC_DT_SPS_TXT"),retrievexlval("Esophagus_specify_Site1"));
			typeIn(getPath("MSEC_DT_DATE_TXT6"),retrievexlval("Esophagus_Biopsy_Date1"));
			typeIn(getPath("MSEC_DT_RES_TXT6"),retrievexlval("Esophagus_Biopsy_Results1"));
			
			clickOn(getPath("MSEC_DT_OTHER_CB"));
			typeIn(getPath("MSEC_DT_SPE_TXT"),retrievexlval("Esophagus_Other_Specify1"));
			typeIn(getPath("MSEC_DT_DATE_TXT7"),retrievexlval("Esophagus_Other_Date1"));
			typeIn(getPath("MSEC_DT_RES_TXT7"),retrievexlval("Esophagus_Other_Results1"));
			
			clickOn(getPath("MSEC_DT_HLT_RB"));
			
			clickOn(getPath("MSEC_DT_CBC_CB"));
			typeIn(getPath("MSEC_DT_DOT_TXT1"),retrievexlval("Esophagus_Date_Of_Test11"));
			
			typeIn(getPath("MSEC_DT_HEMO_TXT"),retrievexlval("Esophagus_Hemoglobin1"));
			typeIn(getPath("MSEC_DT_HEMA_TXT"),retrievexlval("Esophagus_Hematocrit1"));
			typeIn(getPath("MSEC_DT_WBCC_TXT"),retrievexlval("Esophagus_WBC_Count1"));
			typeIn(getPath("MSEC_DT_PLA_TXT"),retrievexlval("Esophagus_Platelets1"));
			
			clickOn(getPath("MSEC_DT_HELI_CB"));
			typeIn(getPath("MSEC_DT_DOT_TXT2"),retrievexlval("Esophagus_Date_Of_Test21"));
			typeIn(getPath("MSEC_DT_RESUL_TXT"),retrievexlval("Esophagus_Helicobacter_Results1"));
			
			clickOn(getPath("MSEC_DT_OTH_CB"));
			typeIn(getPath("MSEC_DT_OSP_TXT"),retrievexlval("Esophagus_Other_Specify1"));
			typeIn(getPath("MSEC_DT_DOT_TXT3"),retrievexlval("Esophagus_Date_Of_Test31"));
			typeIn(getPath("MSEC_DT_RESULTS_TXT"),retrievexlval("Esophagus_OtherSpecify_Results1"));
			
			clickOn(getPath("MSEC_DT_AOSD_RB"));
			typeIn(getPath("MSEC_DT_PROC_TXT"),retrievexlval("Esophagus_Type_Of_Test1"));
			clickOn(getPath("MSEC_DT_NEXT"));
			
			//Section VII-Functional Impact
			Thread.sleep(1000);
			clickOn(getPath("MSEC_FI_VECI_RB"));
			typeIn(getPath("MSEC_FI_VECI_TXT"),retrievexlval("Esophagus_Esophageal_Condition1"));
			clickOn(getPath("MSEC_FI_NEXT"));
			
			//Section VIII-Remarks
			Thread.sleep(1000);
			clickOn(getPath("MSEC_RMKS_ED_RB"));
			typeIn(getPath("MSEC_RMKS_FID_TXT"),retrievexlval("Esophagus_Claimed_Condition1"));
			clickOn(getPath("MSEC_CMN_RB"));
			clickOn(getPath("MSEC_TRI_RB"));
			typeIn(getPath("MSEC_RMKS_TXT"),retrievexlval("Esophagus_Any_Remarks1"));
			Thread.sleep(2000);
			
			//Remove Manual DBQ
			clickOn(getPath("btn_mremove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncancel']")));
			clickOn(getPath("btn_mcancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_mremove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btndelete']")));
			clickOn(getPath("btn_Ok"));
			Thread.sleep(2000);
			//Add Trigger DBQ
			clickOn(getPath("Provider_Tab"));
			Thread.sleep(1000);
			clickOn(getPath("PSEC_OPPF"));
			Thread.sleep(1000);
			clickOn(getPath("PSEC_OPPF_NO"));
			clickOn(getPath("PSEC_OPPF_YES"));
			Thread.sleep(2000);
			clickOn(getPath("XSECT_Ok"));
			//Add Manual DBQ
			Thread.sleep(2000);
			clickOn(getPath("btn_add_DBQ"));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='select-dbq']")));
			Thread.sleep(2000);
			selectList(getPath("drplist_add_DBQ"),retrievexlval("Add_Dbq1"));
		    clickOn(getPath("btn_confirm"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnok']")));
			clickOn(getPath("btn_DBQ_Ok"));
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	
	public static void examNote(){

		try {
			//Exam Notes	
			Thread.sleep(2000);
			clickOn(getPath("btn_Add_Note"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment11"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			
			Thread.sleep(2000);
			clickOn(getPath("btn_Add_Note"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment11"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
			clickOn(getPath("btn_save_close"));
			
			Thread.sleep(2000);
			clickOn(getPath("exp_examnote"));;
			clickOn(getPath("btn_addnotes"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment21"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_addnotes"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment21"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
			clickOn(getPath("btn_save_close"));
			
			Thread.sleep(2000);
			clickOn(getPath("link_notes1"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			
			Thread.sleep(2000);
			clickOn(getPath("link_notes2"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_uncheck1"));
			Thread.sleep(2000);
			clickOn(getPath("btn_uncheck2"));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public static void esignature(){

		try {
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 600)", "");
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnsignnsub']")));
			Thread.sleep(1000);
            clickOn(getPath("btn_SignSubmit"));
            Thread.sleep(2000);
			//E-Signature Popup
           //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='SignRes']/canvas")));
			WebElement menu = dr.findElement(By.xpath(".//*[@id='SignRes']/canvas"));
			Actions action =    new Actions(dr);
		    action.moveToElement(menu).click().perform();
		    clickOn(getPath("Esig_btn_clear"));
		    Thread.sleep(2000);
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnCancel']")));
		    clickOn(getPath("Esig_btn_cancel"));
		    Thread.sleep(2000);
		    clickOn(getPath("btn_SignSubmit"));
		    
		    Thread.sleep(2000);
		    action.moveToElement(menu).click().perform();
		    Thread.sleep(2000);
		    clickOn(getPath("Esig_cb_confirm"));
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnESignatureSubmit']")));
		    clickOn(getPath("Esig_btn_confirm"));
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncheckout']")));
		    Thread.sleep(2000);
		    clickOn(getPath("btn_checkout"));
		    Thread.sleep(2000);
		    clickOn(getPath("btn_SignSubmit"));
		    Thread.sleep(2000);
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='SignRes']/canvas")));
		    clickOn(getPath("Esig_rdn_text"));
		    Thread.sleep(2000);
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='signfontSelector']")));
		    selectList(getPath("drplist_signature_type"),retrievexlval("Signature_Type1"));
		    Thread.sleep(2000);
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='signatureText']")));
		    typeIn(getPath("Esig_tb_signatureName"),retrievexlval("Signature_Name1"));
		    Thread.sleep(2000);
		   //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnSignaturePreview']")));
		    clickOn(getPath("Esig_btn_preview"));
		    Thread.sleep(2000);
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='signatureText']")));
		    clickOn(getPath("Esig_cb_confirm"));
		    Thread.sleep(1000);
		    clickOn(getPath("Esig_btn_confirm"));
		    Thread.sleep(2000);
		   /* //Exam Notes
		    clickOn(getPath("btn_Add_Note"));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));*/
			
		     } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	public static void examButtons(){

		try {
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			 Thread.sleep(1000);
			 clickOn(getPath("btn_checkout"));
			 Reporter.log("status changed successfully");
			 Reporter.log("status:Provider In Progress");
			 Thread.sleep(1000);
			 clickOn(getPath("btn_Save"));
			 Reporter.log("Form Saved successfully");
			 Thread.sleep(1000);
			 clickOn(getPath("btn_diagPend"));
			 Thread.sleep(1000);
			 Reporter.log("status changed successfully");
			 Reporter.log("status:Provider In Progress - Diag Pending");
			 clickOn(getPath("btn_sendtoscribe"));
			 Reporter.log("status changed successfully");
			 Reporter.log("status:Pending Scribe");
			 Thread.sleep(2000);
			 printdbq("provider");
			/* clickOn(getPath("btn_checkout"));
			 Reporter.log("status changed successfully");
			 Reporter.log("status:Provider In Progress");
			 Thread.sleep(2000);
			 clickOn(getPath("btn_sendtoQA"));
			 Thread.sleep(2000);
			 typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment11"));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			 clickOn(getPath("Note_cancel"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_Add_Note"));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			 typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment21"));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
			 clickOn(getPath("btn_save_close"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_examform"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_DBQform"));	
			 Thread.sleep(2000);
			 clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_examAllform"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_DBQAllform"));	
			 Thread.sleep(2000);*/
			 //clickOn(getPath("btn_SignSubmit"));
			 //Thread.sleep(2000);
			 
		    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
    //Scribe Role
	public static void addTriggerDBQWithValidationScribe(){
		
		try {
			   Thread.sleep(3000);
			   //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='en-btn']/i")));
			   ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 800)", "");
			   Thread.sleep(2000);
			   clickOn(getPath("btn_checkout"));
			   Reporter.log("status changed successfully");
			   Reporter.log("status:Provider In Progress");
			   ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -7000)", "");
			    Thread.sleep(2000);
			    //Remove Manual DBQ
				clickOn(getPath("btn_mremove_dbq"));
				Thread.sleep(2000);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncancel']")));
				clickOn(getPath("btn_mcancel"));
				Thread.sleep(2000);
				clickOn(getPath("btn_mremove_dbq"));
				Thread.sleep(2000);
			    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btndelete']")));
				clickOn(getPath("btn_Ok"));
				Thread.sleep(2000);
			   
			   //Remove Trigger DBQ Code
			    Thread.sleep(2000);
				clickOn(getPath("btn_remove_dbq"));
				Thread.sleep(2000);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncancel']")));
				clickOn(getPath("btn_cancel"));
				Thread.sleep(2000);
				clickOn(getPath("btn_remove_dbq"));
				Thread.sleep(2000);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btndelete']")));
				clickOn(getPath("btn_Ok"));
				Thread.sleep(2000);
				
				//Add Trigger DBQ
				clickOn(getPath("Provider_Tab"));
				Thread.sleep(1000);
				clickOn(getPath("PSEC_OPPF"));
				Thread.sleep(1000);
				clickOn(getPath("PSEC_OPPF_NO"));
				clickOn(getPath("PSEC_OPPF_YES"));
				Thread.sleep(2000);
				clickOn(getPath("XSECT_Ok"));
				
				//Add Manual DBQ
				Thread.sleep(2000);
				clickOn(getPath("btn_add_DBQ"));
				Thread.sleep(2000);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='select-dbq']")));
				selectList(getPath("drplist_add_DBQ"),retrievexlval("Add_Dbq1"));
			    clickOn(getPath("btn_confirm"));
				Thread.sleep(2000);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnok']")));
				clickOn(getPath("btn_DBQ_Ok"));
				Thread.sleep(2000);
				
				clearOn(getPath("XSEC_tb_desc"));
				Thread.sleep(1000);
				clickOn(getPath("IMO_Tab"));
				Thread.sleep(2000);
				clickOn(getPath("IMO_ACE_Next"));
				Thread.sleep(1000);
				clearOn(getPath("IMO_ER_txt1"));
				Thread.sleep(1000);
				clickOn(getPath("Imo_ER_Previous"));
				Thread.sleep(2000);
				List<WebElement> a=dr.findElements(By.xpath(".//*[@id='tabb22efd0a-80cf-4359-8472-8712f22da683']"));
				a.get(1).click();
				Thread.sleep(1000);
				clickOn(getPath("scar_sec_Miscellaneous"));
				Thread.sleep(1000);
				clearOn(getPath("TSECIIS_SPECIFIC_LIMITATION"));
				Thread.sleep(1000);
				List<WebElement> b=dr.findElements(By.xpath(".//*[@id='tab549aa4c7-7831-4c6e-a28a-93a451475e6d']"));
				b.get(1).click();
				Thread.sleep(1000);
				clickOn(getPath("Esophagus_Remarks"));
				Thread.sleep(1000);
				clearOn(getPath("MSEC_RMKS_FID_TXT"));
				Thread.sleep(1000);
				clickOn(getPath("btn_Manualsign"));
				Thread.sleep(1000);
				((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
				Thread.sleep(2000);
				clickOn(getPath("URI_valid_link"));
				Thread.sleep(1000);
				typeIn(getPath("XSEC_tb_desc"),retrievexlval("SEC8_Description1"));
				Thread.sleep(1000);
				clickOn(getPath("btn_Manualsign"));
				Thread.sleep(1000);
				((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
				Thread.sleep(1000);
				clickOn(getPath("IMO_valid_link"));
				Thread.sleep(1000);
				typeIn(getPath("IMO_ER_txt1"),retrievexlval("Other_Description1"));
				Thread.sleep(1000);
				clickOn(getPath("btn_Manualsign"));
				Thread.sleep(2000);
				clickOn(getPath("SCAR_valid_link"));
				Thread.sleep(1000);
				typeIn(getPath("TSECIIS_SPECIFIC_LIMITATION"),retrievexlval("Scar_Specific_Limitation1"));
				Thread.sleep(1000);
				clickOn(getPath("btn_Manualsign"));
				Thread.sleep(2000);
				clickOn(getPath("ESO_valid_link"));
				Thread.sleep(1000);
				typeIn(getPath("MSEC_RMKS_FID_TXT"),retrievexlval("Esophagus_Claimed_Condition1"));
				Thread.sleep(1000);
				clickOn(getPath("btn_Manualsign"));
		    }
			catch (Exception e) 
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
		    }
		}
	
	public static void scribeExamNote(){

		try {
			Thread.sleep(2000);
			clickOn(getPath("btn_checkout"));
			Reporter.log("status changed successfully");
			Reporter.log("status:Provider In Progress");
			//Exam Notes	
			Thread.sleep(2000);
			clickOn(getPath("btn_Add_Note"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment11"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			
			Thread.sleep(2000);
			clickOn(getPath("btn_Add_Note"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment11"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
			clickOn(getPath("btn_save_close"));
			
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
			Thread.sleep(1000);
			clickOn(getPath("exp_examnote"));
			Thread.sleep(1000);
			clickOn(getPath("btn_addnotes"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment21"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_addnotes"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment21"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
			clickOn(getPath("btn_save_close"));
			
			Thread.sleep(2000);
			clickOn(getPath("link_notes1"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			
			Thread.sleep(2000);
			clickOn(getPath("link_notes2"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_uncheck1"));
			Thread.sleep(2000);
			clickOn(getPath("btn_uncheck2"));
			
		    }
		catch (Exception e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
		}
	public static void scribeCollabView(){

	try {
		dr.navigate().refresh();
		Thread.sleep(5000);
		clickOn(getPath("Collaboration_View"));
		Thread.sleep(1000);
		clickOn(getPath("Track_Latest_Changes_EQ"));
		Thread.sleep(1000);
		clickOn(getPath("Track_Latest_Changes_EQ"));
		Thread.sleep(1000);
		clickOn(getPath("Track_Latest_Changes_NQ"));
		Thread.sleep(2000);
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -4000)", "");
		Thread.sleep(2000);
		clickOn(getPath("Track_All_Changes"));
		Thread.sleep(1000);
		clickOn(getPath("Track_All_Changes_EQ"));
		Thread.sleep(1000);
		clickOn(getPath("Track_All_Changes_EQ"));
		Thread.sleep(1000);
		clickOn(getPath("Track_All_Changes_NQ"));
		}
		catch (Exception e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
		}
	public static void scribeNavigateFormAndSection(){

	try {
		//Navigation tabs
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='owl-prev']")));
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1500)", "");
		Thread.sleep(1000);
		clickOn(getPath("btn_left_navigate"));
		Thread.sleep(1000);
		clickOn(getPath("btn_left_navigate"));
		Thread.sleep(2000);
		clickOn(getPath("btn_left_navigate"));
		Thread.sleep(2000);
		clickOn(getPath("btn_right_navigate"));
		Thread.sleep(2000);
		clickOn(getPath("btn_right_navigate"));
		Thread.sleep(2000);
		clickOn(getPath("btn_hamburg"));
		Thread.sleep(2000);
		clickOn(getPath("item3"));
		Thread.sleep(1000);
		clickOn(getPath("Hide_Section_Panel"));
		Thread.sleep(1000);
		clickOn(getPath("View_Section_Panel"));
		Thread.sleep(1000);
		clickOn(getPath("View_AllSection_Panel"));
		Thread.sleep(1000);
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 500)", "");
		Thread.sleep(1000);
		clickOn(getPath("Navigate_Bottom"));
		Thread.sleep(1000);
		clickOn(getPath("Navigate_Top"));
		Thread.sleep(1000);
		clickOn(getPath("View_OneSection_Panel"));
	    }
	catch (Exception e) 
       {
		// TODO Auto-generated catch block
		e.printStackTrace();
       }
	  }
	public static void scribeHeaderSection(){

		try {
			//Exam Scribe Header
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1500)", "");
			//WebDriverWait wait = new WebDriverWait(dr,60);
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='txtPhone']")));
			typeIn(getPath("txt_phone"),retrievexlval("Phone_Number1"));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pt-clk']")));
			Thread.sleep(1000);
			clickOn(getPath("btn_ExamInformation"));
			Thread.sleep(2000);
			clickOn(getPath("btn_ExamInformation"));
			Thread.sleep(1000);
			clickOn(getPath("Save_Icon"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 800)", "");
		   }
			catch (Exception e) 
		       {
				// TODO Auto-generated catch block
				e.printStackTrace();
		       }
		    }
	
	
	public static void scribeRoleButtons(){

		try {
			
			 Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 3000)", "");
			//Scribe Role Buttons
			 Thread.sleep(2000);
			 clickOn(getPath("btn_Save"));
			 Reporter.log("Form Saved successfully");
			 clickOn(getPath("btn_SendtoProvider"));
			 Reporter.log("status changed successfully");
			 Reporter.log("status: Pending Provider Response");
			 Thread.sleep(2000);
			 clickOn(getPath("btn_checkout"));
			 Reporter.log("status changed successfully");
			 Reporter.log("status:Scribe In Progress");
			 Thread.sleep(1000);
			 clickOn(getPath("btn_Manualsign"));
			 Reporter.log("status changed successfully");
			 Reporter.log("status:Pending Manual Signature");
			 Thread.sleep(2000);
			 clickOn(getPath("btn_checkout"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_PendingScribe"));
			 Reporter.log("status changed successfully");
			 Reporter.log("status: Pending Scribe");
			 Thread.sleep(2000);
			 printdbq("scribe");
		     //Print
			/* clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_examform"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_DBQform"));	
			 Thread.sleep(2000);
			 clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_examAllform"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_DBQAllform"));	
			 Thread.sleep(2000);*/
			 
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	public static void addTriggerwithValidationQA(){
		
		try {	
	
		   
		   //Add Trigger with validation and Clarifying Questions
		    
		    Thread.sleep(10000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='txtPhone']")));
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 800)", "");
		    Thread.sleep(2000);
			clickOn(getPath("btn_checkout"));
			Reporter.log("status changed successfully");
			Reporter.log("status:Provider In Progress");
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -7000)", "");
			Thread.sleep(2000);
		    //Remove Manual DBQ
			clickOn(getPath("btn_mremove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncancel']")));
			clickOn(getPath("btn_mcancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_mremove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btndelete']")));
			clickOn(getPath("btn_Ok"));
			Thread.sleep(2000);
			
		    //Remove Trigger DBQ Code
			Thread.sleep(2000);
		    clickOn(getPath("btn_remove_dbq"));
		    Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncancel']")));
		    clickOn(getPath("btn_cancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_remove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btndelete']")));
			clickOn(getPath("btn_Ok"));
			Thread.sleep(2000);
					
			//Add Trigger DBQ
			clickOn(getPath("Provider_Tab"));
			Thread.sleep(1000);
			clickOn(getPath("PSEC_OPPF"));
			Thread.sleep(1000);
			clickOn(getPath("PSEC_OPPF_NO"));
			clickOn(getPath("PSEC_OPPF_YES"));
			Thread.sleep(2000);
			clickOn(getPath("XSECT_Ok"));
				
			//Add Manual DBQ
			Thread.sleep(2000);
			clickOn(getPath("btn_add_DBQ"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='select-dbq']")));
			selectList(getPath("drplist_add_DBQ"),retrievexlval("Add_Dbq1"));
			clickOn(getPath("btn_confirm"));
		    Thread.sleep(2000);
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnok']")));
			clickOn(getPath("btn_DBQ_Ok"));
			Thread.sleep(2000);
				
			clearOn(getPath("XSEC_tb_desc"));
			Thread.sleep(1000);
			clickOn(getPath("IMO_Tab"));
			Thread.sleep(2000);
			clickOn(getPath("IMO_ACE_Next"));
			Thread.sleep(1000);
			clearOn(getPath("IMO_ER_txt1"));
			Thread.sleep(1000);
			clickOn(getPath("Imo_ER_Previous"));
			Thread.sleep(2000);
			List<WebElement> a=dr.findElements(By.xpath(".//*[@id='tabb22efd0a-80cf-4359-8472-8712f22da683']"));
			a.get(1).click();
			Thread.sleep(1000);
			clickOn(getPath("scar_sec_Miscellaneous"));
			Thread.sleep(1000);
			clearOn(getPath("TSECIIS_SPECIFIC_LIMITATION"));
			Thread.sleep(1000);
			List<WebElement> b=dr.findElements(By.xpath(".//*[@id='tab549aa4c7-7831-4c6e-a28a-93a451475e6d']"));
			b.get(1).click();
			Thread.sleep(1000);
			clickOn(getPath("Esophagus_Remarks"));
			Thread.sleep(1000);
			clearOn(getPath("MSEC_RMKS_FID_TXT"));
			Thread.sleep(1000);
			clickOn(getPath("btn_Manualsign"));
			Thread.sleep(2000);
			clickOn(getPath("URI_valid_link"));
			Thread.sleep(2000);
			typeIn(getPath("XSEC_tb_desc"),retrievexlval("SEC8_Description1"));
			Thread.sleep(1000);
				
			//ClarifyQuestion1
				for(int i=1;i<3;i++)
				{
					clickOn(getPath("CQ_icon_Pro"));
					Thread.sleep(1000);
					clickOn(getPath("ChangeHistory_CQ"));
					Thread.sleep(1000);
					clickOn(getPath("ClarifyingQuestions_CQ"));
					Thread.sleep(1000);
					typeIn(getPath("CQ_TextBox"),retrievexlval("SEC8_Description1"));
					if(i==1) {
					clickOn(getPath("btn_Close_CQ"));
					Thread.sleep(2000);
					}
					if(i==2) {
						Thread.sleep(1000);
						clickOn(getPath("btn_Save_CQ"));
						Reporter.log("Comments Saved Successfully");
						Thread.sleep(1000);
						clickOn(getPath("btn_Close_CQ"));
					}
				}		
				((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
				Thread.sleep(1000);
				clickOn(getPath("btn_Manualsign"));
				Thread.sleep(2000);
				clickOn(getPath("IMO_valid_link"));
				Thread.sleep(2000);
				typeIn(getPath("IMO_ER_txt1"),retrievexlval("Other_Description1"));
				Thread.sleep(1000);
				
				//ClarifyQuestion2
				for(int i=1;i<3;i++)
				{
					clickOn(getPath("CQ_icon_Imo"));
					Thread.sleep(1000);
					clickOn(getPath("ChangeHistory_CQ"));
					Thread.sleep(1000);
					clickOn(getPath("ClarifyingQuestions_CQ"));
					Thread.sleep(1000);
					typeIn(getPath("CQ_TextBox"),retrievexlval("SEC8_Description1"));
					if(i==1) {
					clickOn(getPath("btn_Close_CQ"));
					Thread.sleep(2000);
					}
					if(i==2) {
						Thread.sleep(1000);
						clickOn(getPath("btn_Save_CQ"));
						Reporter.log("Comments Saved Successfully");
						Thread.sleep(1000);
						clickOn(getPath("btn_Close_CQ"));
					}
				}	
				
				((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
				Thread.sleep(1000);
				clickOn(getPath("btn_Manualsign"));
				Thread.sleep(2000);
				clickOn(getPath("SCAR_valid_link"));
				Thread.sleep(1000);
				typeIn(getPath("TSECIIS_SPECIFIC_LIMITATION"),retrievexlval("Scar_Specific_Limitation1"));
				Thread.sleep(1000);
				
				//ClarifyQuestion3
				for(int i=1;i<3;i++)
				{
					clickOn(getPath("CQ_icon_Trig"));
					Thread.sleep(1000);
					clickOn(getPath("ChangeHistory_CQ"));
					Thread.sleep(1000);
					clickOn(getPath("ClarifyingQuestions_CQ"));
					Thread.sleep(1000);
					typeIn(getPath("CQ_TextBox"),retrievexlval("SEC8_Description1"));
					if(i==1) {
						
					clickOn(getPath("btn_Close_CQ"));
					Thread.sleep(2000);
					}
					if(i==2) {
						Thread.sleep(1000);
						clickOn(getPath("btn_Save_CQ"));
						Reporter.log("Comments Saved Successfully");
						Thread.sleep(1000);
						clickOn(getPath("btn_Close_CQ"));
					}
				}	
				
				((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
				Thread.sleep(1000);
				clickOn(getPath("btn_Manualsign"));
				Thread.sleep(2000);
				clickOn(getPath("ESO_valid_link"));
				Thread.sleep(2000);
				typeIn(getPath("MSEC_RMKS_FID_TXT"),retrievexlval("Esophagus_Claimed_Condition1"));
				Thread.sleep(1000);
				
				//ClarifyQuestion4
				for(int i=1;i<3;i++)
				{
					clickOn(getPath("CQ_icon_Manl"));
					Thread.sleep(1000);
					clickOn(getPath("ChangeHistory_CQ"));
					Thread.sleep(1000);
					clickOn(getPath("ClarifyingQuestions_CQ"));
					Thread.sleep(1000);
					typeIn(getPath("CQ_TextBox"),retrievexlval("SEC8_Description1"));
					if(i==1) {
					clickOn(getPath("btn_Close_CQ"));
					Thread.sleep(2000);
					}
					if(i==2) {
						Thread.sleep(1000);
						clickOn(getPath("btn_Save_CQ"));
						Reporter.log("Comments Saved Successfully");
						Thread.sleep(1000);
						clickOn(getPath("btn_Close_CQ"));
					}
				}	
				Thread.sleep(2000);
				clickOn(getPath("btn_Manualsign"));
		    
		    Thread.sleep(2000);
			clickOn(getPath("btn_checkout"));
			Reporter.log("status changed successfully");
			Reporter.log("status:QA In Progress");
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
			Thread.sleep(2000);
			clickOn(getPath("CQ_Navigate_URI"));
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
			Thread.sleep(2000);
			clickOn(getPath("CQ_Navigate_IMO"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
			Thread.sleep(2000);
			clickOn(getPath("CQ_Navigate_SCAR"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
			
	      	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	      }
	public static void qaExamNotes(){
		
		try {	
			
			//Exam Notes	
			Thread.sleep(2000);
			clickOn(getPath("btn_Add_Note"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment11"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			
			Thread.sleep(2000);
			clickOn(getPath("btn_Add_Note"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment11"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
			clickOn(getPath("btn_save_close"));
			
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
			Thread.sleep(1000);
			clickOn(getPath("exp_examnote"));
			Thread.sleep(1000);
			clickOn(getPath("btn_addnotes"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment21"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_addnotes"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment21"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
			clickOn(getPath("btn_save_close"));
			
			Thread.sleep(2000);
			clickOn(getPath("link_notes1"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			
			Thread.sleep(2000);
			clickOn(getPath("link_notes2"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_uncheck1"));
			Thread.sleep(2000);
			clickOn(getPath("btn_uncheck2"));
			Thread.sleep(2000);
	      	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	      }
	
public static void qaCollabView(){
		
		try {
			
			Thread.sleep(2000);
			clickOn(getPath("Collaboration_View"));
			Thread.sleep(2000);
			clickOn(getPath("Track_Latest_Changes"));
			Thread.sleep(2000);
			clickOn(getPath("Track_Latest_Changes_EQ"));
			Thread.sleep(1000);
			clickOn(getPath("Track_Latest_Changes_EQ"));
			Thread.sleep(1000);
			clickOn(getPath("Track_Latest_Changes_NQ"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1500)", "");
			Thread.sleep(1000);
			clickOn(getPath("Track_All_Changes"));
			Thread.sleep(1000);
			clickOn(getPath("Track_All_Changes_EQ"));
			Thread.sleep(1000);
			clickOn(getPath("Track_All_Changes_EQ"));
			Thread.sleep(1000);
			clickOn(getPath("Track_All_Changes_NQ"));
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
public static void qaNavigateFormAndSection(){
	
	try {
		
		//Navigation tabs
		Thread.sleep(3000);
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1500)", "");
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='owl-prev']")));
		clickOn(getPath("btn_left_navigate"));
		Thread.sleep(2000);
		clickOn(getPath("btn_left_navigate"));
		Thread.sleep(2000);
		clickOn(getPath("btn_left_navigate"));
		Thread.sleep(2000);
		clickOn(getPath("btn_right_navigate"));
		Thread.sleep(2000);
		clickOn(getPath("btn_right_navigate"));
		Thread.sleep(2000);
		clickOn(getPath("btn_hamburg"));
		Thread.sleep(2000);
		clickOn(getPath("item3"));
		Thread.sleep(1000);
		clickOn(getPath("Hide_Section_Panel"));
		Thread.sleep(1000);
		clickOn(getPath("View_Section_Panel"));
		Thread.sleep(1000);
		clickOn(getPath("View_AllSection_Panel"));
		Thread.sleep(1000);
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 500)", "");
		Thread.sleep(1000);
		clickOn(getPath("Navigate_Bottom"));
		Thread.sleep(1000);
		clickOn(getPath("Navigate_Top"));
		Thread.sleep(1000);
		clickOn(getPath("View_OneSection_Panel"));
	    
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
public static void qaHeaderSection(){
	
	try {
		
		//Exam QA Header section
		Thread.sleep(2000);
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1500)", "");
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(dr,60);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='txtPhone']")));
		typeIn(getPath("txt_phone"),retrievexlval("Phone_Number1"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pt-clk']")));
		Thread.sleep(2000);
		clickOn(getPath("btn_ExamInformation"));
		Thread.sleep(2000);
		clickOn(getPath("btn_ExamInformation"));
		Thread.sleep(1000);
		
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

public static void addTriggerDBQWithValidationAndClarifyQA(){
	
	try {
		   Thread.sleep(3000);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='en-btn']/i")));
		   ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 800)", "");
		   clickOn(getPath("btn_checkout"));
		   Reporter.log("status changed successfully");
		   Reporter.log("status:Provider In Progress");
		   ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -7000)", "");
		   
		   //Remove Manual DBQ
			clickOn(getPath("btn_mremove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncancel']")));
			clickOn(getPath("btn_mcancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_mremove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btndelete']")));
			clickOn(getPath("btn_Ok"));
			Thread.sleep(2000);
			
		   //Remove Trigger DBQ Code
		    Thread.sleep(2000);
			clickOn(getPath("btn_remove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncancel']")));
			clickOn(getPath("btn_cancel"));
			Thread.sleep(2000);
			clickOn(getPath("btn_remove_dbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btndelete']")));
			clickOn(getPath("btn_Ok"));
			Thread.sleep(2000);
			
			//Add Trigger DBQ
			clickOn(getPath("Provider_Tab"));
			Thread.sleep(1000);
			clickOn(getPath("PSEC_OPPF"));
			Thread.sleep(1000);
			clickOn(getPath("PSEC_OPPF_NO"));
			clickOn(getPath("PSEC_OPPF_YES"));
			Thread.sleep(2000);
			clickOn(getPath("XSECT_Ok"));
			
			//Add Manual DBQ
			Thread.sleep(2000);
			clickOn(getPath("btn_add_DBQ"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='select-dbq']")));
			selectList(getPath("drplist_add_DBQ"),retrievexlval("Add_Dbq1"));
		    clickOn(getPath("btn_confirm"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnok']")));
			clickOn(getPath("btn_DBQ_Ok"));
			Thread.sleep(2000);
			
			clearOn(getPath("XSEC_tb_desc"));
			Thread.sleep(1000);
			clickOn(getPath("IMO_Tab"));
			Thread.sleep(1000);
			clickOn(getPath("IMO_ACE_Next"));
			Thread.sleep(1000);
			clearOn(getPath("IMO_ER_txt1"));
			Thread.sleep(1000);
			clickOn(getPath("Imo_ER_Previous"));
			Thread.sleep(2000);
			List<WebElement> a=dr.findElements(By.xpath(".//*[@id='tabb22efd0a-80cf-4359-8472-8712f22da683']"));
			a.get(1).click();
			Thread.sleep(1000);
			clickOn(getPath("scar_sec_Miscellaneous"));
			Thread.sleep(1000);
			clearOn(getPath("TSECIIS_SPECIFIC_LIMITATION"));
			Thread.sleep(1000);
			List<WebElement> b=dr.findElements(By.xpath(".//*[@id='tab549aa4c7-7831-4c6e-a28a-93a451475e6d']"));
			b.get(1).click();
			Thread.sleep(1000);
			clickOn(getPath("Esophagus_Remarks"));
			Thread.sleep(1000);
			clearOn(getPath("MSEC_RMKS_FID_TXT"));
			Thread.sleep(1000);
			clickOn(getPath("btn_Manualsign"));
			Thread.sleep(1000);
			clickOn(getPath("URI_valid_link"));
			Thread.sleep(1000);
			typeIn(getPath("XSEC_tb_desc"),retrievexlval("SEC8_Description1"));
			Thread.sleep(1000);
			clickOn(getPath("btn_Manualsign"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
			Thread.sleep(1000);
			clickOn(getPath("IMO_valid_link"));
			Thread.sleep(1000);
			typeIn(getPath("IMO_ER_txt1"),retrievexlval("Other_Description1"));
			Thread.sleep(1000);
			clickOn(getPath("btn_Manualsign"));
			Thread.sleep(1000);
			clickOn(getPath("SCAR_valid_link"));
			Thread.sleep(1000);
			typeIn(getPath("TSECIIS_SPECIFIC_LIMITATION"),retrievexlval("Scar_Specific_Limitation1"));
			Thread.sleep(1000);
			clickOn(getPath("btn_Manualsign"));
			Thread.sleep(1000);
			clickOn(getPath("ESO_valid_link"));
			Thread.sleep(1000);
			typeIn(getPath("MSEC_RMKS_FID_TXT"),retrievexlval("Esophagus_Claimed_Condition1"));
			Thread.sleep(1000);
			clickOn(getPath("btn_Manualsign"));
	    }
		catch (Exception e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	}

public static void qaRoleButtons(){
	
	try {
		    Thread.sleep(2000);
		    clickOn(getPath("Save_Icon"));
		    Reporter.log("Form Saved successfully");
		
		    ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -800)", "");
		    List<WebElement> b=dr.findElements(By.xpath(".//*[@id='tab549aa4c7-7831-4c6e-a28a-93a451475e6d']"));
		    b.get(1).click();
		    Thread.sleep(1000);
		    clickOn(getPath("Esophagus_Remarks"));
		    Thread.sleep(1000);
		    clearOn(getPath("MSEC_RMKS_FID_TXT"));
			
			//Exam Buttons
		    ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 800)", "");
			clickOn(getPath("btn_Save"));
			Reporter.log("Form Saved successfully");
			Thread.sleep(2000);
			clickOn(getPath("btn_qa_diag"));
			Reporter.log("Status Changed successfully");
			Reporter.log("Status: QA In Progress - Diag Pending");
			Thread.sleep(2000);
			clickOn(getPath("btn_qa_consult"));
			Reporter.log("Status Changed successfully");
			Reporter.log("Status: QA In Progress - Consult Pending");
			Thread.sleep(2000);
			for(int i=1;i<3;i++) {
			clickOn(getPath("btn_SendtoProvider"));
			Thread.sleep(1000);
			clickOn(getPath("btn_valid_yes"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
		    Thread.sleep(1000);
			clickOn(getPath("btn_SendtoProvider"));
			Thread.sleep(1000);
		    clickOn(getPath("btn_valid_no"));
		    Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("SendToProvider_Notes1"));
			
			if(i==1) {
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			}
			if(i==2) {
				Thread.sleep(2000);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
				clickOn(getPath("btn_save_close"));
				Reporter.log("Status Changed successfully");
				Reporter.log("Status: Pending Provider Response");
				Reporter.log("Notes Saved successfully");
				}
			}
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			Thread.sleep(1000);
			clickOn(getPath("btn_checkout"));
			Reporter.log("status changed successfully");
			Reporter.log("status: QA In Progress");
			Thread.sleep(2000);
			for(int i=1;i<3;i++) {
			clickOn(getPath("btn_qa_SFA"));
			Thread.sleep(2000);
			clickOn(getPath("btn_valid_yes"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
		    Thread.sleep(1000);
			clickOn(getPath("btn_qa_SFA"));
			Thread.sleep(2000);
		    clickOn(getPath("btn_valid_no"));
		    Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
			typeIn(getPath("txt_Add_Note"),retrievexlval("SendToApproval_Notes1"));
			
			if(i==1) {
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
			clickOn(getPath("Note_cancel"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			}
			if(i==2) {
				Thread.sleep(2000);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
				clickOn(getPath("btn_save_close"));
				Reporter.log("Status Changed successfully");
				Reporter.log("Status: Pending Provider Response");
				Reporter.log("Notes Saved successfully");
				}
			}
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			Thread.sleep(2000);
			clickOn(getPath("btn_checkout"));
			Reporter.log("status changed successfully");
			Reporter.log("status: QA In Progress");
			Thread.sleep(1000);
			clickOn(getPath("btn_Manualsign"));
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1500)", "");
			Thread.sleep(2000);
			clickOn(getPath("ESO_valid_link"));
			Thread.sleep(2000);
			typeIn(getPath("MSEC_RMKS_FID_TXT"),retrievexlval("Esophagus_Update_Question1"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			clickOn(getPath("btn_qa_submit"));
			Thread.sleep(2000);
			clickOn(getPath("btn_qa_sign_alert"));
			Thread.sleep(1000);
			clickOn(getPath("btn_Manualsign"));
			Thread.sleep(1000);
			Reporter.log("status changed successfully");
			Reporter.log("status: Pending Manual Signature");
			Thread.sleep(1000);
			/*clickOn(getPath("btn_checkout"));
			Reporter.log("status changed successfully");
			Reporter.log("status: QA In Progress");
			Thread.sleep(1000);
		    clickOn(getPath("btn_qa_submit"));*/
			Thread.sleep(1000);
			//Clarifying Questions print
			dr.navigate().refresh();
			Thread.sleep(5000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
			Thread.sleep(2000);
			clickOn(getPath("Clarify_Question_QA"));
			Thread.sleep(2000);
			clickOn(getPath("btn_clafyQ_print"));
			Thread.sleep(2000);
			printdbq("QA");
		    //Print
			/*js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			clickOn(getPath("btn_print"));
			Thread.sleep(2000);
			clickOn(getPath("btn_examform"));
			Thread.sleep(2000);
			clickOn(getPath("btn_print"));
			Thread.sleep(2000);
			clickOn(getPath("btn_DBQform"));	
			Thread.sleep(2000);
			clickOn(getPath("btn_print"));
			Thread.sleep(2000);
			clickOn(getPath("btn_examAllform"));
			Thread.sleep(2000);
			clickOn(getPath("btn_print"));
			Thread.sleep(2000);
			clickOn(getPath("btn_DBQAllform"));	
			Thread.sleep(2000);*/
		
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
}
public static void ProviderClarifyningQuestion(){
	
	try {
		  clickOn(getPath("btn_checkout"));
		  
		
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}


public static void examineeSaveForm(){
	
	try {
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='slide-1']/a")));
		//js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		clickOn(getPath("btn_checkout"));
		Thread.sleep(2000);
		clickOn(getPath("SECI_rb_yes_ben"));
		Thread.sleep(1000);
		clickOn(getPath("SECI_rb_yes_cla"));
		Thread.sleep(1000);
		clickOn(getPath("SECI_cb_treat_comp"));
		Thread.sleep(1000);
		clickOn(getPath("SECI_cb_Surgery"));
		Thread.sleep(1000);
		typeIn(getPath("SECI_txt_Surgery"),retrievexlval("Surgery_Description1"));
		typeIn(getPath("SECI_date_Surgery"),retrievexlval("Date_Of_Surgery1"));
		Thread.sleep(1000);
		clickOn(getPath("SECI_cb_rad_ther"));
		Thread.sleep(1000);
		typeIn(getPath("SECI_recentdate_rad_ther"),retrievexlval("Radiation_therapy_RecentDate1"));
		typeIn(getPath("SECI_completedate_rad_ther"),retrievexlval("Radiation_therapy_CompleteDate1"));
		Thread.sleep(1000);
		clickOn(getPath("SECI_cb_anti_chem"));
		Thread.sleep(1000);
		typeIn(getPath("SECI_recentdate_anti_chem"),retrievexlval("Antineoplastic_RecentDate1"));
		typeIn(getPath("SECI_completedate_anti_chem"),retrievexlval("Antineoplastic_CompleteDate1"));
		Thread.sleep(1000);
		clickOn(getPath("SECI_cb_oth_ther"));
		Thread.sleep(1000);
		typeIn(getPath("SECI_txt_oth_proc"),retrievexlval("Other_therapeutic_Description1"));
		typeIn(getPath("SECI_date_oth_proc"),retrievexlval("Other_therapeutic_RecentDate1"));
		Thread.sleep(1000);
		clickOn(getPath("SECI_cb_oth_threat"));
		Thread.sleep(1000);
		typeIn(getPath("SECI_txt_oth_treat"),retrievexlval("Other_therapeutictreat_Description1"));
		typeIn(getPath("SECI_date_oth_treat"),retrievexlval("Other_therapeutictreat_CompleteDate1"));
		Thread.sleep(1000);
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -250)", "");
		Thread.sleep(1000);
		typeIn(getPath("SECI_txt_cond_begin"),retrievexlval("Condition_begin1"));
		typeIn(getPath("SECI_txt_cond_desc"),retrievexlval("Condition_begin_Description1"));
		typeIn(getPath("SECI_txt_cond_symp"),retrievexlval("Condition_begin_Symptoms1"));
		typeIn(getPath("SECI_txt_past_medi"),retrievexlval("Past_medication1"));
		typeIn(getPath("SECI_txt_curr_symp"),retrievexlval("current_symptoms1"));
		typeIn(getPath("SECI_txt_curr_treat"),retrievexlval("current_treatment1"));
		typeIn(getPath("SECI_txt_imp_con"),retrievexlval("Impact_Condition1"));
		
		typeIn(getPath("SECI_txt_cond_beginn"),retrievexlval("Condition_begin_COD1"));
		typeIn(getPath("SECI_txt_cond_descr"),retrievexlval("Condition_begin_Description_COD1"));
		typeIn(getPath("SECI_txt_cond_sympt"),retrievexlval("Condition_begin_Symptoms_COD1"));
		typeIn(getPath("SECI_txt_past_medic"),retrievexlval("Past_medication_COD1"));
		typeIn(getPath("SECI_txt_curr_sympt"),retrievexlval("current_symptoms_COD1"));
		typeIn(getPath("SECI_txt_curr_treatment"),retrievexlval("current_treatment_COD1"));
		typeIn(getPath("SECI_txt_imp_cond"),retrievexlval("Impact_Condition_COD1"));
		Thread.sleep(2000);
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -1000)", "");
		Thread.sleep(2000);
		//clickOn(getPath("USECI_NEXT"));
		//Thread.sleep(1000);
		
		//DataImportAndMappingQ
		clickOn(getPath("USECI_DataImportAndMappingQ_tab"));
		Thread.sleep(2000);
		typeIn(getPath("txt1_dataimport"),retrievexlval("DataImport_Textbox11"));
		typeIn(getPath("txt2_dataimport"),retrievexlval("DataImport_Textbox21"));
		typeIn(getPath("txt3_dataimport"),retrievexlval("DataImport_Textbox31"));
		typeIn(getPath("txta1_dataimport"),retrievexlval("DataImport_TextboxArea11"));
		typeIn(getPath("txta2_dataimport"),retrievexlval("DataImport_TextboxArea21"));
		typeIn(getPath("txta3_dataimport"),retrievexlval("DataImport_TextboxArea31"));
		clickOn(getPath("cb_dataimport_yes"));
		typeIn(getPath("cal_dataimport"),retrievexlval("DataImport_DateControlValue1"));
		clickOn(getPath("rb_dataimport_No"));
		Thread.sleep(1000);
		clickOn(getPath("cb_addDbq"));
		Thread.sleep(4000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnok']")));
		clickOn(getPath("btn_DBQ_Ok"));
		Thread.sleep(3000);
		clickOn(getPath("gallbladder_tab"));
		Thread.sleep(2000);
		clickOn(getPath("gall_rb_yes"));
		Thread.sleep(1000);
		typeIn(getPath("gall_rb_txt"),retrievexlval("DataImport_Textbox11"));
		Thread.sleep(1000);
		
		
		
		
		
		/*//Scar DBQ
		clickOn(getPath("Scar_DBQ_tab"));
		Thread.sleep(1000);
		clickOn(getPath("Scar_SECI_Yes_cs"));
		clickOn(getPath("Scar_SECI_Yes_sp"));
		clickOn(getPath("Scar_SECI_Yes_np"));
		typeIn(getPath("Scar_SECI_desc_pain"),retrievexlval("Pain_Description11"));
		
		clickOn(getPath("Scar_SECI_Yes_sun"));
		clickOn(getPath("Scar_SECI_Yes_nun"));
		typeIn(getPath("Scar_SECI_desc_loss"),retrievexlval("Loss_CoverSkin_Description11"));
		
		clickOn(getPath("Scar_SECI_Yes_burn1"));
		typeIn(getPath("Scar_SECI_burn1"),retrievexlval("Burn_Scar11"));
		clickOn(getPath("Scar_SECI_burn_DPT"));
		typeIn(getPath("Scar_SECI_burn2"),retrievexlval("Burn_Scar21"));
		clickOn(getPath("Scar_SECI_Yes_burn2"));
		
		clickOn(getPath("Scar_SECI_burn_FT1"));
		typeIn(getPath("Scar_SECI_Addburn1"),retrievexlval("Additional_Burn_Scar11"));
		clickOn(getPath("Scar_SECI_DuetoBurn1"));
		
		//2nd
		clickOn(getPath("Scar_SECI_Yes_cse"));
		clickOn(getPath("Scar_SECI_Yes_spe"));
		clickOn(getPath("Scar_SECI_Yes_npe"));
		typeIn(getPath("Scar_SECI_desc_paine"),retrievexlval("Pain_Description21"));
		
		clickOn(getPath("Scar_SECI_Yes_sune"));
		clickOn(getPath("Scar_SECI_Yes_nune"));
		typeIn(getPath("Scar_SECI_desc_losse"),retrievexlval("Loss_CoverSkin_Description21"));
		
		clickOn(getPath("Scar_SECI_Yes_burne1"));
		typeIn(getPath("Scar_SECI_burne1"),retrievexlval("Burn_Scar31"));
		clickOn(getPath("Scar_SECI_burn_FTS"));
		typeIn(getPath("Scar_SECI_burne2"),retrievexlval("Burn_Scar41"));
		clickOn(getPath("Scar_SECI_Yes_burne2"));
		
		clickOn(getPath("Scar_SECI_burn_FT2"));
		typeIn(getPath("Scar_SECI_Addburn2"),retrievexlval("Additional_Burn_Scar21"));
		clickOn(getPath("Scar_SECI_DuetoBurn2"));
		
		clickOn(getPath("Scar_NEXT"));
		
		//SECTION-2
		typeIn(getPath("Scar_SECII_txt"),retrievexlval("TextboxValue1"));
		typeIn(getPath("Scar_SECII_txtArea"),retrievexlval("TextAreaValue1"));
		clickOn(getPath("Scar_SECII_cb"));
		clickOn(getPath("Scar_SECII_rb"));
		typeIn(getPath("Scar_SECII_txtcal"),retrievexlval("CalendarDateValue1"));
		
		//ESOPHAGUS
		clickOn(getPath("ESO_DBQ_tab"));
		Thread.sleep(2000);
		//SECTION-1
		clickOn(getPath("ESO_SECI_rb"));
		Thread.sleep(1000);
		typeIn(getPath("ESO_SECI_txt_CONMEDI"),retrievexlval("Medication_Description1"));
		Thread.sleep(1000);
		clickOn(getPath("ESO_NEXT"));
		Thread.sleep(1000);
		//SECTION-2
		typeIn(getPath("ESO_SECII_txt"),retrievexlval("ESO_TextboxValue1"));
		typeIn(getPath("ESO_SECII_txtArea"),retrievexlval("ESO_TextAreaValue1"));
		clickOn(getPath("ESO_SECII_cb"));
		clickOn(getPath("ESO_SECII_rb"));
		typeIn(getPath("ESO_SECII_txtcal"),retrievexlval("ESO_CalendarDateValue1"));*/
		

        } catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
}
	public static void navigateToExamineeFormTabs(){

		try {
			
			Thread.sleep(2000);
			clickOn(getPath("btn_left_navigate"));
			Thread.sleep(2000);
			clickOn(getPath("btn_left_navigate"));
			Thread.sleep(1000);
			clickOn(getPath("btn_right_navigate"));
			Thread.sleep(1000);
			clickOn(getPath("btn_right_navigate"));
			Thread.sleep(1000);
			clickOn(getPath("btn_hamburg"));
			Thread.sleep(1000);
			Thread.sleep(2000);
			List<WebElement> a=dr.findElements(By.xpath(".//*[@id='tab2d353f0e-4b1c-4688-951e-b66aaee5273d']"));
			a.get(1).click();
			//clickOn(getPath("HBI_DBQ_ITEM"));
			Thread.sleep(2000);
			
			//URINARY FORM PART(SECTIONS)
			//clickOn(getPath("URINARY_tab"));
			//Thread.sleep(1000);
			clickOn(getPath("USECI_DataImportAndMappingQ_tab"));
			Thread.sleep(2000);
			clickOn(getPath("cb_removeDbq"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btndelete']")));
			clickOn(getPath("btn_Ok"));
			Thread.sleep(1000);
			clickOn(getPath("USECII_NEXT"));
			
			//HxConditionQuestion
			Thread.sleep(2000);
			clickOn(getPath("cb_hx_yes"));
			clickOn(getPath("rb_hx_No"));
			typeIn(getPath("cal_hx"),retrievexlval("HxCondition_DateControlValue11"));
			
			clickOn(getPath("cb_hxc_yes"));
			clickOn(getPath("rb_hxc_No"));
			typeIn(getPath("cal_hxc"),retrievexlval("HxCondition_DateControlValue21"));
			
			
			//Section Expand/Collapse
			clickOn(getPath("Hide_Section_Panel"));
			Thread.sleep(2000);
			clickOn(getPath("View_Section_Panel"));
			Thread.sleep(2000);
			clickOn(getPath("View_AllSection"));
			Thread.sleep(1000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 250)", "");
			Thread.sleep(1000);
			clickOn(getPath("Navigate_Bottom"));
			Thread.sleep(1000);
			clickOn(getPath("Navigate_Top"));
			Thread.sleep(1000);
			clickOn(getPath("View_AllSection"));
			Thread.sleep(1000);
			/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='SideDrop']/a/span[1]/i")));
			clickOn(getPath("btn_hamburg"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='owl-next']/span/i")));
			clickOn(getPath("btn_right_navigate"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bf8ef162-6031-434a-8498-6552311af534']/div[1]/div[1]/p/a")));
			clickOn(getPath("btn_Special_Instructions_form"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bf8ef162-6031-434a-8498-6552311af534_special-inst']")));
			clickOn(getPath("btn_Special_Instructions_form"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btncheckout']")));
			js.executeScript("window.scrollBy(0,1000)");*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	public static void ExamineeHeaderSection(){

		try {

			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -250)", "");
			//WebDriverWait wait = new WebDriverWait(dr,60);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='txtPhone']")));
			typeIn(getPath("txt_phone"),retrievexlval("Phone_Number1"));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pt-clk']")));
			Thread.sleep(1000);
			clickOn(getPath("btn_ExamInformation"));
			Thread.sleep(2000);
			clickOn(getPath("btn_ExamInformation"));
			Thread.sleep(1000);
		    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
		
	public static void ExamineeButtons(){

		try {
			
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 250)", "");
			 Thread.sleep(1000);
			// clickOn(getPath("btn_checkout"));
			 Reporter.log("status changed successfully");
			 Reporter.log("status:Examinee In Progress");
			 Thread.sleep(1000);
			 clickOn(getPath("btn_Save"));
			 Reporter.log("Form Saved successfully");
			 Thread.sleep(2000);
			 clickOn(getPath("btn_qa_submit"));
			 Reporter.log("Form Saved successfully");
			 Reporter.log("status:Examinee Complete");
             printdbq("examinee");
			/* Thread.sleep(2000);
			 clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_examform"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_print"));
			 Thread.sleep(2000);
			 clickOn(getPath("btn_examAllform"));
			 Thread.sleep(2000);*/
		    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	
 //DEC
      public static void addTriggerDBQDec(){

		try {
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 1000)", "");
			Thread.sleep(2000);
			clickOn(getPath("btn_checkout"));
			Thread.sleep(2000);
			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -3000)", "");
			Thread.sleep(2000);
			clickOn(getPath("USECI_DataImportAndMappingQ_tab"));
			Thread.sleep(2000);
			clickOn(getPath("cb_addDbq"));
			Thread.sleep(2000);
			clickOn(getPath("cb_addDbq"));
			Thread.sleep(2000);
			clickOn(getPath("XSECT_Ok"));
			Thread.sleep(2000);
			for(int i=0;i<2;i++) {
	        Thread.sleep(2000);
			clickOn(getPath("btn_add_DBQ"));
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='select-dbq']")));
			selectList(getPath("drplist_add_DBQ"),retrievexlval("Add_Dbq1"));
			if(i==0) {
			Thread.sleep(2000);
			clickOn(getPath("btn_cancel_add"));
			Thread.sleep(2000);
			}
			if(i==1) {
			Thread.sleep(2000);
			clickOn(getPath("btn_confirm"));
			Thread.sleep(3000);
			clickOn(getPath("XSECT_Ok"));
			}
			}
			
			
		/*	clickOn(getPath("cb_removeDbq"));
			clickOn(getPath("cb_removeDbq"));
			clickOn(getPath("btn_Ok"));*/
			
		    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
      
      public static void decExamNote(){

  		try {
  			//Exam Notes	
  			Thread.sleep(2000);
  			clickOn(getPath("btn_Add_Note"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
  			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment11"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
  			clickOn(getPath("Note_cancel"));
  			
  			Thread.sleep(2000);
  			clickOn(getPath("btn_Add_Note"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
  			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment11"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
  			clickOn(getPath("btn_save_close"));
  			
  			Thread.sleep(2000);
  			clickOn(getPath("exp_examnote"));;
  			clickOn(getPath("btn_addnotes"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
  			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment21"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
  			clickOn(getPath("Note_cancel"));
  			Thread.sleep(2000);
  			clickOn(getPath("btn_addnotes"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteText']")));
  			typeIn(getPath("txt_Add_Note"),retrievexlval("Add_Note_Comment21"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteSave']")));
  			clickOn(getPath("btn_save_close"));
  			
  			Thread.sleep(2000);
  			clickOn(getPath("link_notes1"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
  			clickOn(getPath("Note_cancel"));
  			
  			Thread.sleep(2000);
  			clickOn(getPath("link_notes2"));
  			Thread.sleep(2000);
  			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='examNoteClose']")));
  			clickOn(getPath("Note_cancel"));
  			Thread.sleep(2000);
  			clickOn(getPath("btn_uncheck1"));
  			Thread.sleep(2000);
  			clickOn(getPath("btn_uncheck2"));
  			
  			
  		} catch (Exception e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  			}
  	}
	
      public static void decNavigateFormAndSection(){

    		try {
    			
    			//Navigation tabs
    			Thread.sleep(1000);
    			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='owl-prev']")));
    			clickOn(getPath("btn_left_navigate"));
    			Thread.sleep(1000);
    			clickOn(getPath("btn_left_navigate"));
    			Thread.sleep(2000);
    			clickOn(getPath("btn_right_navigate"));
    			Thread.sleep(2000);
    			clickOn(getPath("btn_right_navigate"));
    			Thread.sleep(2000);
    			clickOn(getPath("btn_hamburg"));
    			Thread.sleep(2000);
    			List<WebElement> a=dr.findElements(By.xpath(".//*[@id='tab7aa60f6b-8669-4179-803e-1320e1da993a']"));
    			a.get(1).click();
    			Thread.sleep(1000);
    			clickOn(getPath("Hide_Section_Panel"));
    			Thread.sleep(1000);
    			clickOn(getPath("Show_Section_Panel"));
    			Thread.sleep(1000);
    			clickOn(getPath("ESO_View_AllSection_Panel"));
    			Thread.sleep(2000);
    			clickOn(getPath("Navigate_Bottom"));
    			Thread.sleep(2000);
    			clickOn(getPath("Navigate_Top"));
    			Thread.sleep(1000);
    			clickOn(getPath("ESO_View_AllSection_Panel"));
    			Thread.sleep(2000);
    		    }
    		catch (Exception e) 
    	       {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    	       }
    		  }
      public static void decSaveAddForm(){

  		try {
  			
  			clickOn(getPath("ESO_CON_MEDI"));
			Thread.sleep(1000);
			typeIn(getPath("ESO_CON_MED_TXT"),retrievexlval("Continuous_Medication1"));
			Thread.sleep(1000);
			clickOn(getPath("ESO_DBQ_NEXT"));
			Thread.sleep(2000);
			typeIn(getPath("ESO_SECII_TXT"),retrievexlval("Textbox1"));
			typeIn(getPath("ESO_SECII_TXTA"),retrievexlval("TextArea1"));
			typeIn(getPath("ESO_SECII_CAL"),retrievexlval("Calander1"));
			clickOn(getPath("ESO_SECII_CB"));
			clickOn(getPath("ESO_SECII_RB"));
  		
            }
		catch (Exception e) 
	       {
			// TODO Auto-generated catch block
			e.printStackTrace();
	       }
		  }
      public static void decDeleteAddForms(){

    		try {
    			
    			//Remove Manual DBQ
    			clickOn(getPath("btn_mremove_dbq"));
    			Thread.sleep(2000);
    			clickOn(getPath("btn_mcancel"));
    			Thread.sleep(2000);
    			clickOn(getPath("btn_mremove_dbq"));
    			Thread.sleep(2000);
    			clickOn(getPath("btn_Ok"));
    			Thread.sleep(2000);
    			clickOn(getPath("URINARY_tab"));
    			Thread.sleep(1000);
    			clickOn(getPath("USECI_DataImportAndMappingQ_tab"));
    			Thread.sleep(2000);
    			clickOn(getPath("cb_removeDbq"));
    			Thread.sleep(2000);
    			clickOn(getPath("cb_removeDbq"));
    			Thread.sleep(2000);
    			clickOn(getPath("btn_Ok"));
    			Thread.sleep(1000);
    			
                }
		catch (Exception e) 
	       {
			// TODO Auto-generated catch block
			e.printStackTrace();
	       }
		  }
      
      public static void multipleTabsHandle(){
    	  
    	  try {
    		  Thread.sleep(10000);
   		      ArrayList<String> windowTab = new ArrayList<String>(dr.getWindowHandles());
   		      dr.switchTo().window(windowTab.get(1));
   		      dr.close();
   		      dr.switchTo().window(windowTab.get(0));
    	      } catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			}

          }
      
      public static void printdbq(String exe){
    	  try {
    		  
    	   Thread.sleep(2000);
		   clickOn(getPath("btn_print"));
		   Thread.sleep(2000);
		   clickOn(getPath("btn_examform"));
		   multipleTabsHandle();
		   Thread.sleep(2000);
		   clickOn(getPath("btn_print"));
		   Thread.sleep(2000);
		   clickOn(getPath("btn_examAllform"));
		   multipleTabsHandle();
		   Thread.sleep(2000);
		   if (exe != "examinee")  {
		   if(exe != "DEC") {
		   clickOn(getPath("btn_print"));
		   Thread.sleep(2000);
		   clickOn(getPath("btn_allHistoryform"));
		   multipleTabsHandle();
		   Thread.sleep(2000);
		   }
		   clickOn(getPath("btn_print"));
		   Thread.sleep(2000);
		   clickOn(getPath("btn_DBQform"));	
		   multipleTabsHandle();
		   Thread.sleep(2000);
		   clickOn(getPath("btn_print"));
		   Thread.sleep(2000);
		   clickOn(getPath("btn_DBQAllform"));	
		   Thread.sleep(2000);
		   multipleTabsHandle();
		   }
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

      }
      
      public static void decRoleButtons(){
    		
    	  try {
    		  
    		  ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 250)", "");
   			   Thread.sleep(1000);
   			   clickOn(getPath("btn_Save"));
   			   Reporter.log("Form Saved successfully");
   			   Thread.sleep(2000);
   			   clickOn(getPath("btn_qa_submit"));
   			   Thread.sleep(2000);
   			   Reporter.log("Form Saved successfully");
   			   Reporter.log("status:DEC Submit");
   			   clickOn(getPath("btn_checkout"));
			   Reporter.log("status changed successfully");
			   Reporter.log("status:DEC InProgress");
			   Thread.sleep(1000);
			   clickOn(getPath("btn_submitLock"));
			   Reporter.log("status changed successfully");
			   Reporter.log("status:DEC Complete");
			   Thread.sleep(1000);
			 
    		   printdbq("DEC");
			   
    		    } catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			}
      }
      
      public static void decHeaderSection(){
  		
    		try {
    			
    			//Exam DEC Header section
    			Thread.sleep(2000);
    			((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -250)", "");
    			Thread.sleep(2000);
    			//WebDriverWait wait = new WebDriverWait(dr,60);
    			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='txtPhone']")));
    			typeIn(getPath("txt_phone"),retrievexlval("Phone_Number1"));
    			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pt-clk']")));
    			Thread.sleep(1000);
    			clickOn(getPath("btn_ExamInformation"));
    			Thread.sleep(2000);
    			clickOn(getPath("btn_ExamInformation"));
    			Thread.sleep(1000);
    			
    		    } catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			}
    		}
      
	public static void dataImportScribe(){

		try {
			
			   Thread.sleep(3000);
			  // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='txtPhone']")));
			   ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 250)", "");
			   Thread.sleep(2000);
			   clickOn(getPath("btn_checkout"));
			   Reporter.log("status changed successfully");
			   Reporter.log("status: Scribe In Progress");
			   clickOn(getPath("URI_DataImport_Section"));
			   js.executeScript("window.scrollBy(0,500)");
			   Thread.sleep(2000);
			   clickOn(getPath("btn_Import_History"));
			   Thread.sleep(2000);
			   clickOn(getPath("DataImport_Alert_No"));
			   Thread.sleep(2000);
			   clickOn(getPath("btn_Import_History"));
			   Thread.sleep(2000);
			   clickOn(getPath("DataImport_Alert_Yes"));
			   Thread.sleep(2000);
			   clickOn(getPath("btn_SendtoProvider"));
			   Reporter.log("status changed successfully");
			   Reporter.log("status: Pending Provider Response");
			   Thread.sleep(1000);

		    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		}
	
	public static void ProviderClarifyQuestion(){

		try {
			 Thread.sleep(5000);
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 2500)", "");
			 Thread.sleep(2000);
			 clickOn(getPath("btn_checkout"));
			 Thread.sleep(2000);
			 ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -5000)", "");
			 Thread.sleep(2000);
			 clickOn(getPath("CQ_Navigate_URI"));
			 Thread.sleep(2000);
			 
			//ClarifyQuestion1
			for(int i=1;i<3;i++)
			{
					clickOn(getPath("CQ_icon_Pro"));
					Thread.sleep(1000);
					clickOn(getPath("ChangeHistory_CQ"));
					Thread.sleep(1000);
					clickOn(getPath("ClarifyingQuestions_CQ"));
					Thread.sleep(2000);
					typeIn(getPath("CQ_TextBox"),retrievexlval("SEC8_Description1"));
					if(i==1) {
					clickOn(getPath("btn_Close_CQ"));
					Thread.sleep(2000);
					}
					if(i==2) {
						Thread.sleep(2000);
						clickOn(getPath("btn_Save_CQ"));
						Reporter.log("Comments Saved Successfully");
						Thread.sleep(1000);
						clickOn(getPath("btn_Close_CQ"));
					}
				}
			   Thread.sleep(2000);
		       clickOn(getPath("URI_DataImport_Section"));
		       Thread.sleep(2000);
		       ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 250)", "");
			   Thread.sleep(2000);
			   clickOn(getPath("btn_Import_History"));
			   Thread.sleep(2000);
			   clickOn(getPath("DataImport_Alert_No"));
			   Thread.sleep(2000);
			   clickOn(getPath("btn_Import_History"));
			   Thread.sleep(2000);
			   clickOn(getPath("DataImport_Alert_Yes"));
			   Thread.sleep(2000);
			 	
			   ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, -250)", "");
			   Thread.sleep(2000);
			   clickOn(getPath("CQ_Comment_Close"));
			   Thread.sleep(2000);
			   clickOn(getPath("CQ_Navigate_IMO"));
			   Thread.sleep(2000);
			 
			//ClarifyQuestion2
			for(int i=1;i<3;i++)
			{
				clickOn(getPath("CQ_icon_Imo"));
				Thread.sleep(1000);
				clickOn(getPath("ChangeHistory_CQ"));
				Thread.sleep(1000);
				clickOn(getPath("ClarifyingQuestions_CQ"));
				Thread.sleep(2000);
				typeIn(getPath("CQ_TextBox"),retrievexlval("SEC8_Description1"));
				if(i==1) {
				clickOn(getPath("btn_Close_CQ"));
				Thread.sleep(2000);
				}
				if(i==2) {
					Thread.sleep(2000);
					clickOn(getPath("btn_Save_CQ"));
					Reporter.log("Comments Saved Successfully");
					Thread.sleep(1000);
					clickOn(getPath("btn_Close_CQ"));
				}
			}	
			/* js.executeScript("window.scrollBy(0,-1500)");
			 clickOn(getPath("CQ_Navigate_SCAR"));
			 Thread.sleep(2000);
			*/
			 Thread.sleep(2000);
			 clickOn(getPath("btn_right_navigate"));
			 Thread.sleep(2000);
			 clickOn(getPath("scar_sec_Miscellaneous"));
			 Thread.sleep(2000);
			//ClarifyQuestion3
			for(int i=1;i<3;i++)
			{
				clickOn(getPath("CQ_icon_Trig"));
				Thread.sleep(1000);
				clickOn(getPath("ChangeHistory_CQ"));
				Thread.sleep(1000);
				clickOn(getPath("ClarifyingQuestions_CQ"));
				Thread.sleep(2000);
				typeIn(getPath("CQ_TextBox"),retrievexlval("SEC8_Description1"));
				if(i==1) {
					
				clickOn(getPath("btn_Close_CQ"));
				Thread.sleep(2000);
				}
				if(i==2) {
					Thread.sleep(2000);
					clickOn(getPath("btn_Save_CQ"));
					Reporter.log("Comments Saved Successfully");
					Thread.sleep(1000);
					clickOn(getPath("btn_Close_CQ"));
				}
			}	
			 Thread.sleep(2000);
			 clickOn(getPath("btn_right_navigate"));
			 Thread.sleep(2000);
			 clickOn(getPath("Esophagus_Remarks"));
			 Thread.sleep(2000);
			//ClarifyQuestion4
			for(int i=1;i<3;i++)
			{
				clickOn(getPath("CQ_icon_Manl"));
				Thread.sleep(1000);
				clickOn(getPath("ChangeHistory_CQ"));
				Thread.sleep(1000);
				clickOn(getPath("ClarifyingQuestions_CQ"));
				Thread.sleep(2000);
				typeIn(getPath("CQ_TextBox"),retrievexlval("SEC8_Description1"));
				if(i==1) {
				clickOn(getPath("btn_Close_CQ"));
				Thread.sleep(2000);
				}
				if(i==2) {
					Thread.sleep(2000);
					clickOn(getPath("btn_Save_CQ"));
					Reporter.log("Comments Saved Successfully");
					Thread.sleep(1000);
					clickOn(getPath("btn_Close_CQ"));
				}
			}	
			 Thread.sleep(2000);
			 clickOn(getPath("btn_sendtoQA"));
			 Thread.sleep(2000);
			 typeIn(getPath("txt_Add_Note"),"Testing Message");
			 Thread.sleep(2000);
	         clickOn(getPath("btn_save_close"));
			 
		    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		}
	
	}

	