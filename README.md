# DUMY_EMPLOYEES
> ### Progmod2 beadandó

## Program célja
> Alap célja munkatársak számontartása, név, email, telefonszám, felvétel dátuma, munkaleyi azonosító és fizetés oszlopokkal.

## Müködése
> Post és Get használatával lehet kiolvasni az sql adatbázisból és beleírn abba, írás közben a program generál egy álltalános azonosítót
és megnézi hogy az email helyes formátumu e (helyes formátum: "*valami@valami*")
(<sub> jelen állapotában nagyrészt ismétlődő sorokat tartalmaz </sub>)

## @Post
> bevárt formátum:
```
{
  "fristName": "string",
  "lastName": "string";
  "email": "string",
  "phoneNumber": "string",
  "hireDate": "2022-11-17T16:22:06.091Z",
  "jobId": "string",
  "salary": 0
}
```
## @Get
> Fentebb látott formátumban egymás alatt vissza adja az eddigi elemeket a táblában

## Controller
> Post és get helye,
post vizsgálattal try catchben tölt az adatbázisba, get egyszerűen csak listáz minden elemet

## Model
> Dumy Employee felépítése
id kijelölése és automatikus generálása
getterek setterek helye

## Repo
> Repositori létrehozása (extends JPA repositori)

## Service
> Post és get álltal használt fügvények ebben a részben vannak, itt teszteljük az emailt

## Validator
> Email tesztelés fügvénye itt van létrehozva ezt hívja a service
