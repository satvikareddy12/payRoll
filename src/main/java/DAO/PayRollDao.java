package DAO;

public interface PayRollDao {
	
	//to calculate total
	
	
	double deductions(double healthInsurance, double gratuity, double pf);
	double totalsal(double basicPay, double hra, double ta, double variablePay, double healthInsurance, double gratuity,
			double pf);
	double grossPay(double basicPay, double hra, double ta, double variablePay);
	
	

}
