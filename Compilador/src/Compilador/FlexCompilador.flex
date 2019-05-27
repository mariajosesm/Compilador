package Compilador;
import java_cup.runtime.Symbol;

%%

%public
%class Scanerrrrr
%cupsym sym
%cup
%standalone
%line
%column

lineTerminator          =   \r|\n|\r\n
whitespace		=   {lineTerminator} | [ \t]
illegalCharacter	=   [^]
dig                  =   [0-9] | dig [0-9]
LETRA                   =   [A-Z]|[a-z]
C                       =   [']
LITERAL                    =   ({whitespace}* {C}({LETRA}*{dig}*{whitespace}*)*{C}) | ({whitespace}* {C}({dig}*{LETRA}*{whitespace}*)*{C})
VAR                     =   {LETRA}*|({LETRA}*{dig}*)


%%
{dig}          {
                    
                        System.out.println("Lexema: " + yytext());
                        return new Symbol(sym.DIGITO, yyline, yycolumn, yytext());
                 }

"INICIAR"          {
                  
                        System.out.println("Lexema: " + yytext());
                        return new Symbol(sym.INICIAR, yyline, yycolumn, yytext());
                 }

"TERMINAR"            {
                        System.out.println("Lexema: " + yytext());
                        return new Symbol(sym.TERMINAR, yyline, yycolumn, yytext());
                 }

"FUNCION"            {
                       
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.FUNCION, yyline, yycolumn, yytext());
                 }

"SI"             {
                        
                        System.out.println("Lexema: " + yytext());
                        return new Symbol(sym.CONDICION_SI, yyline, yycolumn, yytext());
                 }

"SINO"           {
                       
                        System.out.println("Lexema: " + yytext());
                        return new Symbol(sym.CONDICION_SINO, yyline, yycolumn, yytext());
                 }

"NUMERO"         {
                      
                      System.out.println("Lexema: " + yytext());
                      return new Symbol(sym.TIPO_DATO_NUMERO, yyline, yycolumn, yytext());
                 }

"TEXTO"          {
                     
                      System.out.println("Lexema: " + yytext());
                      return new Symbol(sym.TIPO_DATO_TEXTO, yyline, yycolumn, yytext());
                 }

";"              {
                       
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.PUNTO_COMA, yyline, yycolumn, yytext());
                 }

"{"              {
                      
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.LLAVE_A, yyline, yycolumn, yytext());
                 }

"}"              {
                      
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.LLAVE_C, yyline, yycolumn, yytext());
                 }

"MOSTRAR"        {
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.MOSTRAR, yyline, yycolumn, yytext());
                 }

":"              {
                       
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext());
                 }

"GUARDAR"        {
                       
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.GUARDAR, yyline, yycolumn, yytext());
                 }

">"              {
                       
                        System.out.println("Lexema: " + yytext());
                        return new Symbol(sym.MAYOR_QUE, yyline, yycolumn, yytext());
                 }

","              {
                        System.out.println("Lexema: " + yytext());
                        return new Symbol(sym.COMA, yyline, yycolumn, yytext());
                 }

"MEDICAMENTOFUERTE"   {
                       
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.MEDICAMENTOF, yyline, yycolumn, yytext());
                 }

"MEDICAMENTOLEVE"   {
                       
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.MEDICAMENTOL, yyline, yycolumn, yytext());
                 }

"MEDIDAFUERTE"            {
                       
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.MEDIDAF, yyline, yycolumn, yytext());
                 }

"MEDIDALEVE"            {
                       
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.MEDIDAL, yyline, yycolumn, yytext());
                 }

{VAR}
                 {
                   
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.VARIABLE, yyline, yycolumn, yytext());
                 }

{LITERAL}
                 {
                      
                       System.out.println("Lexema: " + yytext());
                       return new Symbol(sym.LITERAL, yyline, yycolumn, yytext());
                 }

{whitespace}            {
                           
			}

{illegalCharacter}	{
                          
                            System.out.println("Lexical error (" + yytext() + ") at " + yyline + "," + yycolumn);
			}
