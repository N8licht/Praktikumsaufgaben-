package Plan;

public class Fahrer extends Teammietglieder {
int pilotenNr;
int pilotenSiege;
boolean zugeordnet;
int gehalt;
int bonus;
int saisonRennen;
int gewonnenerennen;
int saisongehaltfahrer;

Fahrer(){
}
Fahrer(int pilotenNr, int pilotensiege, boolean zugeordnet){
	this.pilotenNr=pilotenNr;
	this.pilotenSiege=pilotensiege;
	this.zugeordnet=zugeordnet;
}

public static int saisongehaltfahrer( int gehalt, int bonus, int gewonnenerennen, int saisonRennen){
 {
	int  saisongehaltfahrer = gehalt*saisonRennen+(bonus*gewonnenerennen);


System.out.println("Das Saisongehalt des Fahrers beträgt" saisongehaltfahrer);
}
}
}
