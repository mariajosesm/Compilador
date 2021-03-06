
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon May 27 12:27:35 CST 2019
//----------------------------------------------------

package Compilador;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon May 27 12:27:35 CST 2019
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\007\000\002\002\004\000\002\014" +
    "\004\000\002\014\003\000\002\003\005\000\002\011\004" +
    "\000\002\010\003\000\002\010\003\000\002\004\005\000" +
    "\002\004\003\000\002\013\007\000\002\012\004\000\002" +
    "\012\004\000\002\005\007\000\002\006\006\000\002\007" +
    "\007\000\002\007\011\000\002\015\004\000\002\015\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\004\012\004\001\002\000\006\017\007\020" +
    "\011\001\002\000\004\002\006\001\002\000\004\002\000" +
    "\001\002\000\004\030\ufffb\001\002\000\010\017\ufffe\020" +
    "\ufffe\024\ufffe\001\002\000\004\030\ufffa\001\002\000\004" +
    "\030\054\001\002\000\010\017\007\020\011\024\014\001" +
    "\002\000\004\011\045\001\002\000\004\013\043\001\002" +
    "\000\010\017\uffff\020\uffff\024\uffff\001\002\000\004\015" +
    "\020\001\002\000\004\030\022\001\002\000\004\013\ufffc" +
    "\001\002\000\004\026\023\001\002\000\004\031\025\001" +
    "\002\000\006\004\027\031\030\001\002\000\006\004\uffef" +
    "\031\uffef\001\002\000\006\013\ufff2\016\041\001\002\000" +
    "\004\030\031\001\002\000\006\004\ufff0\031\ufff0\001\002" +
    "\000\004\022\032\001\002\000\006\005\034\006\035\001" +
    "\002\000\004\023\040\001\002\000\004\007\037\001\002" +
    "\000\004\010\036\001\002\000\004\023\ufff5\001\002\000" +
    "\004\023\ufff6\001\002\000\006\013\ufff7\016\ufff7\001\002" +
    "\000\004\004\027\001\002\000\004\013\ufff1\001\002\000" +
    "\004\021\044\001\002\000\004\002\001\001\002\000\004" +
    "\014\046\001\002\000\004\021\047\001\002\000\004\025" +
    "\050\001\002\000\004\011\052\001\002\000\004\015\ufff4" +
    "\001\002\000\004\030\054\001\002\000\006\021\056\027" +
    "\055\001\002\000\006\021\ufff8\027\ufff8\001\002\000\004" +
    "\030\057\001\002\000\004\015\ufff3\001\002\000\006\021" +
    "\ufff9\027\ufff9\001\002\000\006\021\061\027\055\001\002" +
    "\000\010\017\ufffd\020\ufffd\024\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\004\002\004\001\001\000\010\003\007\010" +
    "\011\014\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\004\057\001\001\000\012\003\015\005\016\010\011" +
    "\011\014\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\020\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\015\023\001" +
    "\001\000\004\013\025\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\012\032\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\041\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\050\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\004\052\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public void syntax_error(Symbol cur_token) {
        System.out.println("Syntax error at:");
        System.out.println("Text: \"" + cur_token.value + "\"");
        System.out.println("Line: " + (cur_token.left + 1));
        System.out.println("Column: " + (cur_token.right + 1));
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // cantidad ::= DIGITO 
            {
              String RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= n ;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cantidad",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // cantidad ::= cantidad DIGITO 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= e1 + n ;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cantidad",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // condicion ::= CONDICION_SI VARIABLE MAYOR_QUE cantidad fun CONDICION_SINO fun 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e3 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= "\n if (" + String.valueOf(v) + ">" + e1 + ")" +"{" + e2 + "\n}" + "else {" + e3 + "\n}";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // condicion ::= CONDICION_SI VARIABLE MAYOR_QUE cantidad fun 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= "\n if (" + String.valueOf(v) + ">" + e1 +")" + "{" + e2 + "}" ;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // save ::= GUARDAR DOS_PUNTOS lista_variables PUNTO_COMA 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT= "\ncin>>" + e1 + ";" ;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("save",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // menu ::= MOSTRAR DOS_PUNTOS LITERAL PUNTO_COMA save 
            {
              String RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= " cout<< \" " + String.valueOf(l) + " \" <<endl; " + e1 ;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("menu",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // cuerpo_funcion ::= MEDICAMENTOLEVE MEDIDALEVE 
            {
              String RESULT =null;
		RESULT= "\n char medicamentoLeve [100]; \n char medidaLeve [100]; \n strcpy(medicamentoLeve,\" Acetaminofen \"); \n strcpy(medidaLeve,\" 100mg \"); \n cout<<\"La receta es: \" ; \n cout<<strcpy(Recetar,strcat(medicamentoLeve,medidaLeve));" ;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo_funcion",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // cuerpo_funcion ::= MEDICAMENTOFUERTE MEDIDAFUERTE 
            {
              String RESULT =null;
		RESULT= "\n char medicamentoFuerte [100]; \n char medidaFuerte [100]; \n strcpy(medicamentoFuerte, \" Aspirina \"); \n strcpy(medidaFuerte, \" 500mg \"); \n cout<< \"La receta es: \" ; \n cout<<strcpy(Recetar,strcat(medicamentoFuerte,medidaFuerte));" ;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo_funcion",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // fun ::= FUNCION VARIABLE LLAVE_A cuerpo_funcion LLAVE_C 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = "\n char Recetar [100];" + e1 ; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("fun",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // lista_variables ::= VARIABLE 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT= String.valueOf(v); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lista_variables",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // lista_variables ::= lista_variables COMA VARIABLE 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = e1 + ","  + String.valueOf(v); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lista_variables",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // tipo_variable ::= TIPO_DATO_TEXTO 
            {
              String RESULT =null;
		  RESULT = "char "; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_variable",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // tipo_variable ::= TIPO_DATO_NUMERO 
            {
              String RESULT =null;
		  RESULT = "int "; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_variable",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // cuerpo_programa ::= menu condicion 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e1 + e2 ; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo_programa",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // dec_variable ::= tipo_variable lista_variables PUNTO_COMA 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e1 + e2 + ";" + "\n"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_variable",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // dec_variables ::= dec_variable 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_variables",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // dec_variables ::= dec_variables dec_variable 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e1 + e2 ; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("dec_variables",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // inicio ::= INICIAR dec_variables cuerpo_programa TERMINAR PUNTO_COMA 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = "#include <iostream.h> \n#include <stdio.h> \n#include <conio.h> \n#include <stdlib.h> \nint main() { \n" + e1 + e2 + "\n getch(); \n}" ; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

