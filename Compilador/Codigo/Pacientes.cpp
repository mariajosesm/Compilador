#include <iostream.h> 
#include <stdio.h> 
#include <conio.h> 
#include <stdlib.h> 
int main() { 
char Nombre,Apellido,NombreSintoma;
int Edad,CantidadDiasSintoma;
 cout<< "  'Ingrese ordenadamente los sigueintes datos Nombre Apellido Edad NombreSintoma CantidadDiasConSintoma' " <<endl; 
cin>>Nombre,Apellido,Edad,NombreSintoma,CantidadDiasSintoma;
 if (CantidadDiasSintoma>8){
 char Recetar [100];
 char medicamentoFuerte [100]; 
 char medidaFuerte [100]; 
 strcpy(medicamentoFuerte, " Aspirina "); 
 strcpy(medidaFuerte, " 500mg "); 
 cout<< "La receta es: " ; 
 cout<<strcpy(Recetar,strcat(medicamentoFuerte,medidaFuerte));
}else {
 char Recetar [100];
 char medicamentoLeve [100]; 
 char medidaLeve [100]; 
 strcpy(medicamentoLeve," Acetaminofen "); 
 strcpy(medidaLeve," 100mg "); 
 cout<<"La receta es: " ; 
 cout<<strcpy(Recetar,strcat(medicamentoLeve,medidaLeve));
}
 getch(); 
}