package DAO;

public class PayRollDaoImpl implements PayRollDao {
//	private double basicPay;
//	private double hra;
//	private double ta;
//	private double gratuity;
//	private double healthInsurance;
//	private double variablePay;
//	private double pf;
//	
//	private double gp;
//	private double dd;
//	private double ts;
	@Override
	public double grossPay(double basicPay,double hra,double ta,double variablePay) {
		// TODO Auto-generated method stub
		return basicPay + hra + ta + variablePay;
		
		
	}

	@Override
	public double deductions(double healthInsurance,double gratuity,double pf) {
		// TODO Auto-generated method stub
		return gratuity + healthInsurance + pf;
	}

	@Override
	public double totalsal(double basicPay,double hra,double ta,double variablePay,double healthInsurance,double gratuity,double pf) {
		// TODO Auto-generated method stub
		return grossPay(basicPay,hra,ta,variablePay)-deductions(healthInsurance,gratuity,pf);
		
	}

}
