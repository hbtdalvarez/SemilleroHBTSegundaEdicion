CREATE TABLE "DB_SEMILLERO"."COMIC" 
   (	"NOMBRE" VARCHAR2(50 BYTE) NOT NULL  ENABLE, 
	"ID_MARCA" NUMBER(3,0) NOT NULL ENABLE, 
	 CONSTRAINT "MARCA_PK" PRIMARY KEY ("ID_MARCA"));
   
"SCID" NUMBER(3,0) NOT NULL ENABLE,
"SCNOMBRE VARCHAR2(50 BYTE) NOT NULL  ENABLE, 
"SCEDITORIAL VARCHAR2(50 BYTE) NOT NULL  ENABLE, 
"SCTEMATICA VARCHAR2(50 BYTE), 
"SCCOLECCION VARCHAR2(50 BYTE) NOT NULL  ENABLE, 
"SCNUMEROPAGINAS NUMBER(5,0) NOT NULL  ENABLE,
"SCPRECIO NUMBER(50,0) NOT NULL  ENABLE,
"SCAUTORES VARCHAR2(500 BYTE),
"SCCOLOR BOOLEAN NOT NULL  ENABLE, 
"SCFECHA_VENTA DATE,
"SCESTADO BOOLEAN NOT NULL  ENABLE, 
"SCCANTIDAD NUMBER(3,0) NOT NULL  ENABLE,
CONSTRAINT "COMIC_PK" PRIMARY KEY ("SCID")


comment on column COMIC.NOMBRE is 'Nombre o titulo del comic o revista grafica';
comment on column COMIC.EDITORIAL is 'Empresa editorial quien publico el comic';
comment on column COMIC.TEMATICA is 'Permite identificar si el comic es de tipo AVENTURAS, BELICO, HUMORISTICO, DEPORTIVO, FANTASTICO, CIENCIA_FICCION, HISTORICO, HORROR';
comment on column COMIC.COLECCION is 'Conjunto de publicaciones de la que el comic es parte';
comment on column COMIC.NUMEROPAGINAS is 'Cantidad de las paginas que contiene el comic';
comment on column COMIC.PRECIO is 'Valor en pesos del comic';
comment on column COMIC.AUTORES is 'Autor u autores del comic';
comment on column COMIC.COLOR is 'Define si el comic es a color o no, campo de tipo booleano solo acepta 1 o 0';
comment on column COMIC.FECHA_VENTA is 'Valor en pesos del comic';
comment on column COMIC.ESTADO is 'Define si el comic tiene existencia para la venta o no ;
comment on column COMIC.CANTIDAD is 'Cantidad de comics en inventario disponibles para la venta';


--Notas a tener en cuenta
--SC indica el prefijo de la tabla S=semillero, C=comic
--Borrar la estructura de la tabla: drop table "DB_SEMILLERO"."COMIC";
--Ver estructura de la tabla: desc DB_SEMILLERO"."COMIC;
--Consultar los datos de una tabla completa: select * from COMIC

--Como insertar datos:
insert into COMIC (SCID,SCNOMBRE, SCEDITORIAL, SCTEMATICA, SCCOLECCION,SCNUMEROPAGINAS,SCPRECIO,SCAUTORES,SCCOLOR,SCFECHA_VENTA,SCESTADO,SCCANTIDAD)
values (1,'Dragon Ball Yamcha','Planeta Cómic','AVENTURAS','Manga Shonen',144,2100,'Dragon Garow Lee',0,sysdate,'ACTIVO',20);
insert into COMIC (SCID,SCNOMBRE, SCEDITORIAL, SCTEMATICA, SCCOLECCION,SCNUMEROPAGINAS,SCPRECIO,SCAUTORES,SCCOLOR,SCFECHA_VENTA,SCESTADO,SCCANTIDAD)
values (2,'Captain America Corps 1-5 USA','Panini Comics ','FANTASTICO','BIBLIOTECA MARVEL ',128,5000,'Phillippe Briones, Roger Stern ',0,sysdate,'ACTIVO',5);
insert into COMIC (SCID,SCNOMBRE, SCEDITORIAL, SCTEMATICA, SCCOLECCION,SCNUMEROPAGINAS,SCPRECIO,SCAUTORES,SCCOLOR,SCFECHA_VENTA,SCESTADO,SCCANTIDAD)
values (3,'The Spectacular Spider-Man v2 USA','Panini Comics ','FANTASTICO','MARVEL COMICS',208,6225,'Straczynski,Deodato Jr.,Barnes,Eaton',1,sysdate,'INACTIVO',0);
