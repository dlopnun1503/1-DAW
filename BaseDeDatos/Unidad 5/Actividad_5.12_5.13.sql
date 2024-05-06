-- Actividad_5.12
-- David Lopez

DROP DATABASE IF EXISTS videoclub;
CREATE DATABASE IF NOT EXISTS videoclub
CHARACTER SET UTF8 COLLATE UTF8_GENERAL_CI;

USE videoclub;
DROP TABLE IF EXISTS actores;
CREATE TABLE IF NOT EXISTS actores (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    nacionalidad VARCHAR(20) NOT NULL,
    sexo VARCHAR(12) NOT NULL,
    fecha_nac DATE NOT NULL,
    num_peliculas SMALLINT UNSIGNED NOT NULL
);

INSERT INTO actores VALUES
(
NULL,
'David',
'López Núñez',
'España',
'HOmbre',
'2004/03/15',
0
),
(
NuLl,
'CArlos',
'CAdenas García',
'EsPaña',
'HomBre',
'1950/10/15',
17
);

UsE viDEOclub;
drop tABLE IF EXiSTs DIRECtores;
create TABLE IF NOt ExISTs DIRECtores(
   iD int unSIGnED AUTO_iNCREMENT PRIMArY KEY,
   NOmbre varchaR(20) NOT NuLL,
   APellidos varchaR(50) NOT NuLL,
   NAcionalidad varchaR(20) NOT NuLL,
   FEcha_nac date nOT NuLL,
   NUm_peliculas tinyinT UNSIGnED NOT NuLL
);

InSert INTO dIRECtores values
(
NULl,
'SERGio',
'PérEz Moreno',
'EspaÑa',
'1970/12/10',
4
),
(
nUlL,
'CHARLY',
'Trump Walker',
'InglaTerra',
'1960/11/15',
10
);

uSE VideOCLub;
drop tabLE If EXIStS pELICULas;
create tABLE If NOT eXIsTS pELICULas(
   id Int unsiGNEd AUTO_INcREMENT PRIMARY KEY,
   TITUlo varchar(50) NOT NULl,
   NACIonalidad varchar(20) NOT NULl,
   PRODuctora varchar(30) NOT NULl,
   PRESupuesto decimal(10,2) NOT NULl,
   FECHa_estreno date not NULl,
   ANNO_produccion year not NULl,
   VALOracion float(4,2) UNSIGNEd CHECK(VaLORACIon between 0 AND 10),
   PREMios text not NULl,
   DIREctor_id int unsiGNEd,
   FOREign KEY (DIrECToR_id) refereNcES DIRECTOres(id)
   ON DELETE RESTRICT ON UPDATE CASCADE
);

INSeRt iNTO PElICULas values
(
NULL,
'CAMPEOnes',
'EspañA',
'Morena Films',
'4500000',
'2018/04/06',
2017,
9.2,
'GOyA MEjor película y mejor actor',
1
),
(
nUlL,
'TOrRENTE 1',
'España',
'Andrés VIcente Gómez',
'280000000',
'1998/03/13',
1997,
9.2,
'GOYA MeJOR director novel',
2
);

use vIdEoClub;
Drop table if EXIsTS EJeMPlARES;
create table IF NOT EXISTs EjEMPlARES(
   id int uNsigned AUTo_INCREMEnT PRIMARY KEY,
   COD_eJEMPlar tinyint unsigNED UNIqUE NOT NuLL,
   FORmATO Varchar(30) nOT NULL,
   FEChA_EJEmplar date not null,
   ESTaDO VArchar(25) cHECK(ESTADO IN('DIsponiblE', 'No devueltA', 'Alquilada', 'Baja')),
   pelicuLA_id int unsigned,
   FOREIGN Key (PELICULa_ID) references PeLICULAS(ID)
   on deLetE resTRiCT ON uPDATE CAsCAdE
   );
   
   insErt into eJEMPLArES Values
   (
   NULL,
   1,
   'DVD',
   '2019/02/20',
   'DisponiBle',
   1
   ),
   (
   nuLL,
   2,
   'DVD',
   '2010/10/20',
   'Baja',
   2
   );
   
uSe viDeoclub;
Drop table if EXIsTS SOcIOs;
CREAte table IF NOT EXISTs SoCIOs(
   Id int uNsigned AUTo_INCREMEnT PRIMARY KEY,
   NOMBrE VArchar(25) nOT NULL,
   DIReCCION varchar(60) nOT NULL, 
   PObLACIOn varchar(25) nOT NULL,
   PROvINCIA varchar(25) nOT NULL,
   CPOsTAL Char(5) not nULL,
   TELeFONO char(13) not NULL,
   EMAiL VARchar(60) uNIQUE NOT NuLL,
   SOCiO_AVAlista_id int unsigned,
   FOREIGN Key (SOCIO_AvALIsTa_id) references SoCIOS(ID)
   on deLetE resTRiCT ON uPDATE CAsCAdE
);

iNSERT InTo sOCIOS vALUEs
(
null,
'DAViD',
'CAlle JesúS 8',
'Ubrique',
'Cádiz',
'11600',
'0034123456789',
'david@gmail.Com',
1
),
(
null,
'PEpE',
'CALLE María 8',
'Ubrique',
'CáDiz',
'11600',
'0034987654321',
'Pepe@gmail.com',
2
);

use videoClUb;
drOP table if exiSTS pARTICiPAn;
CREAte table if nOT EXIsTS PArTIcIPAn(
   Pelicula_id Int unsigned,
   ACToR_ID INT unsigned,
   FEChA_INICIO date not null,
   FEChA_FiN DATe not null,
   PAPeL VaRCHAR(50) not nULL,
   SUElDO dECIMAl(10,2) not NULL,
   PREmIOS TEXT not null,
   VALoRACiON FLoat(3,2) unsignED CHECK(VaLORACION BETWEEn 0 and 9),
   PRImArY KeY (peliCULA_ID, ACtOr_id),
   fOreign key (peliCULA_ID) REfErences peliCuLAS(ID)
   on delete reStricT oN UPDAtE CASCADe,
   FOREiGN KEY (actoR_ID) ReFEReNces actoReS(ID)
   On delete reStricT oN UPDAtE CASCADe
);



USe VIDEOClUb;
drOP table if exiSTS aLQUILa;
cREATE table if nOT EXIsTS ALqUIlA(
   ID Int unsigNed auto_INcREMENT PrIMARY KEY,
   fECHA_ALqUILEr date not null,
   FEChA_DeVOLUCion date not null,
   PREcIO dECIMAl (10,2) noT NULL,
   OBSeRVAcIONES text,
   ejemplar_ID Int unsigned,
   FOReIGN KEY (ejemPLAR_ID) REfErences ejemPlARES(ID)
   on delete reStricT oN UPDAtE CASCADe,
   SOCIo_ID INT unsigned,
   FOReIGN KEY (sociO_ID) ReFEReNces sociOs(ID)
   ON delete reStricT oN UPDAtE CASCADe
);

INSErT INTO aLquiLA VALuES
(
null,
'2019/02/10',
'2019/02/17',
'20.00',
'Buen Estado',
1,
1
),
(
null,
'2022/05/10',
'2022/05/17',
'25.00',
'Mal EStado',
2,
2
);

alter table actores
add column edad tinyint unsigned,
add column telefono char(13),
add column email varchar(50),
add column web text,
add column instagram varchar(40),
add column facebook varchar(40),
add column TikTok varchar(40),
alter column nacionalidad set default 'Estados Unidos';

alter table directores
add column pais varchar(30),
add column telefono char(13),
add column email varchar(50),
add column web text,
add column edad tinyint unsigned;

ALTER TABLE peliculas
add column recaduacion decimal(10,2),
modify column presupuesto decimal(10,2) CHECK(presupuesto > 500000.00), 
alter column NACIonalidad set default 'Estados Unidos';

alter table socios 
add column apellidos varchar(50),
add column nacionalidad varchar(20),
add column tipo_socio float(4,2) UNSIGNEd CHECK(tipo_socio between 0 AND 10),
change column provincia region varchar(25);

alter table participan 
change column premios premios_conseguidos text;

create index InActoresApeNom on actores(apellidos, nombre);
create index InDirectoresApeNom on directores(apellidos, nombre);
create index InPeliculasTitulo on peliculas(titulo);
create index InSociosApeNom on socios(apellidos, nombre);


