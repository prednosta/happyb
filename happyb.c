#include <stdio.h>
#include <string.h>

void za_rok() {
	printf("Tak zase za rok!");
}

void rekni(char *jmeno, char *hlaska) {
	int stopka = 0;
	char prani[50];

	strcat(prani, strcat(jmeno, hlaska));
	
	while (1) {
		printf("%s", prani);
		stopka = stopka + 1;
		if (stopka == 30) {
			break;
		}
	}
	
	return za_rok();
}

int main(void) {
	char vseNej[] = "Vsechno nejlepsi!\n";
	char sis[] = "Sestricko, ";
	//printf(vseNej);
	
	rekni(sis, vseNej);
	
	return 0;
}