import Employees.*;

public class Main {
    public static void main(String[] args) {
//        CommissionEmployee cande = new CommissionEmployee("Cande", "Ortega", "6180",
//                15000, 0.2);
//
//        System.out.println("El vendedor cande vendió $15 000 y cobra comisión de 20%");
//        System.out.println("Se le debe pagar a cande $" + cande.calculateEarnings());
//
//        cande.setCommissionRate(0.10);
//        cande.setGrossSales(100_000);
//
//        System.out.println("El vendedor cande vendió $100 000 y cobra comisión de 10%");
//        System.out.println("Se le debe pagar a cande $" + cande.calculateEarnings());

        BasePlusCommissionEmployee celes = new BasePlusCommissionEmployee("Celes", "Arredondo", "6182",
                4600, 0.15, 900);

        System.out.println("El empleado celes vendió $4600 y cobra comisión del 15% y tiene un salario de $900 por día");
        System.out.println("Las ganancias de celes el día de hoy son: $" + celes.calculateEarnings());
    }
}