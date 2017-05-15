package Plan;

public class Mechaniker extends Teammietglieder{
String spezialGebiet;
int mechanikergehalt =25000; // 25000€/Rennen
int mechanikerbonus =20000;	//Bonus bei reperatur
boolean reperatur;
int saisonRennen;


Mechaniker (String spezialGebiet){
	this.spezialGebiet = spezialGebiet;
}
	public static int saisonGehaktMechaniker( int mechanikergehalt, int mechanikerbonus, boolean reperatur, int saisonRennen){
	do {
		saisonRennen = 1;
		saisonRennen++;
		if (reperatur = false){
			return mechanikergehalt*saisonRennen;
		}
		else{
			return (mechanikergehalt*saisonRennen)+mechanikerbonus;
		}
		}while (saisonRennen<10);
}

System.out.println("Das Saisongehalt des Mchanikers beträgt"saisonGehaltmechaniker);
}
