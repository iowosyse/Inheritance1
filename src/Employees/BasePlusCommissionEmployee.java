package Employees;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateEarnings() {
        return super.calculateEarnings() + baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %s ", "Empleado: ", getFirstName(), getLastName(),
                "Salario base: ", getBaseSalary(),"Ventas del dia: ", getGrossSales());
    }
}
