grammar gramatica;
BOOLEAN: 'true'|'false';
ELSE: 'else';
IF: 'if';
ENTERO: [0-9]+;
TIPO: ('int'|'double'|'bool');

P_ABRE: '(';
P_CIERRA: ')';
LL_ABRE: '{';
LL_CIERRA: '}';

MAYOR: '>';
MENOR: '<';
MAYOR_IGUAL: '>=';
MENOR_IGUAL: '<=';

FR: [0-9]+'.'[0-9]+;
ID: [a-zA-Z][a-zA-Z0-9]*;
COMA: ',';
PYC: ';' ;
IGUAL: '=';
O: '||';
Y: '&&';
DIF:'!=';
NEGACION:'!';
PUNTO: '.';

WS: [ \t\r\n]+ -> skip ;

prule: declaraciones+ condicionales* EOF;

declaraciones: TIPO ID segunda              # declaracion
        ;

segunda: COMA ID segunda                    # multidecla
        | PYC                               # punto_coma
        | IGUAL valor  PYC                  # asignarvalor
        ;

valor: ENTERO                               # entero
        | fracciona                         # fraccionario
        | BOOLEAN                           # booleano
        ;
fracciona: FR                               #decimal
        ;

condicionales: IF P_ABRE condicion P_CIERRA LL_ABRE LL_CIERRA (ELSE LL_ABRE LL_CIERRA)?
        ;

condicion: condi comparacion condi;

condi : ID|ENTERO|FR|BOOLEAN;

comparacion: (MAYOR|MAYOR_IGUAL|MENOR|MENOR_IGUAL)    # numcomp
            |(IGUAL IGUAL | DIF)                     # mixtocomp
            |(O|Y|NEGACION)                          # booleancomp
            ;