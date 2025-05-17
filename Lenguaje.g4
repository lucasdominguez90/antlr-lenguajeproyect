grammar Lenguaje;

// ==============================
// PARSER RULES (minúscula)
// ==============================

programa: instruccion+ ;

instruccion: seleccion ;

seleccion: 'segun' expresion 'hacer' '{' caso* caso_defecto? '}' 'finsgun' ;

caso: 'caso' constante ':' sentencia ;

caso_defecto: 'defecto' ':' sentencia ;

sentencia: (salida | termina)+ ;

salida: 'imprimir' '(' cadena ')' ;

termina: 'salir' ;

expresion: constante ;

constante: cadena | numero ;

cadena: CADENA ;

numero: NUMERO ;

// ==============================
// LEXER RULES (mayúscula)
// ==============================

CADENA: '"' (~["\r\n])* '"' ;

NUMERO: [0-9]+ ;

fragment LETRA: [a-zA-ZáéíóúÁÉÍÓÚñÑ] ;
fragment DIGITO: [0-9] ;
fragment SIMBOLO: [+\-*/=<>!.,;:_¿?¡@#$%&~] ;

// Palabras clave (usadas como literales en el parser)
SEGUN: 'segun' ;
HACER: 'hacer' ;
CASO: 'caso' ;
DEFECTO: 'defecto' ;
FINSGUN: 'finsgun' ;
IMPRIMIR: 'imprimir' ;
SALIR: 'salir' ;

// Ignorar espacios y saltos de línea
WS: [ \t\r\n]+ -> skip ;
