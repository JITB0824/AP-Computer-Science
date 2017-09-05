package main;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Project4 {
	final static double FED_TAX_RATE = .15;
	final static double STATE_TAX_RATE = .035;
	final static double SOCIAL_TAX_RATE = .0575;
	final static double MED_TAX_RATE = .0275;
	final static double PENSION_TAX_RATE = .05;
	public static void main(String[] args) {
		JTextField nameinput = new JTextField();
		JTextField incomeinput = new JTextField();
		Object[] message = {
				"Name: ", nameinput,
				"Income: ",incomeinput,
		};
			
		
		JOptionPane.showConfirmDialog(null,  message, "Net PayCalculator", JOptionPane.PLAIN_MESSAGE);
		
		String name = nameinput.getText();
		String GrossIncomeString = incomeinput.getText();
		double GrossIncome = Double.parseDouble(GrossIncomeString);
		double FederalTax = FED_TAX_RATE * GrossIncome;
		double StateTax = STATE_TAX_RATE * GrossIncome;
		double SocialSecurityTax = SOCIAL_TAX_RATE * GrossIncome;
		double MedicalAidTax = MED_TAX_RATE * GrossIncome;
		double Pension = PENSION_TAX_RATE * GrossIncome;
		double HealthInsurance = 75.00;
		double TotalTaxDeduction = FederalTax + StateTax + SocialSecurityTax + MedicalAidTax + Pension + HealthInsurance;
		double NetPay = GrossIncome - TotalTaxDeduction;
		DecimalFormat df = new DecimalFormat("#.00");
		JOptionPane.showMessageDialog(null, name + "\nGross Amount:                 $" + df.format(GrossIncome) + "\nFederal Tax:                      $" + df.format(FederalTax) + "\nState Tax:                          $" + df.format(StateTax) + "\nSocial Security Tax:         $" + df.format(SocialSecurityTax) + "\nMedical/Medicaid Tax:     $" + df.format(MedicalAidTax) + "\nPension Plan:                    $" + df.format(Pension) + "\nHealth Insurance:              $" + df.format(HealthInsurance) + "\nNet Pay:                               $" + df.format(NetPay), "lol", JOptionPane.INFORMATION_MESSAGE);
	}
}