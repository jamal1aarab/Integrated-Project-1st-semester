
--Fisrt we should creat a new user : TheFourMusketeers qui'a le mdp : AllForOneOneForAll

alter session set "_ORACLE_SCRIPT"=true;
DROP USER TheFourMusketeers CASCADE;
create user TheFourMusketeers identified by ayoub123 ;

--Now we give it all the privilleges (to connect, infinite tables count, select, update ....)

grant create session to TheFourMusketeers ;
GRANT ALL PRIVILEGES TO TheFourMusketeers;

connect TheFourMusketeers/ayoub123
DROP TABLE users2 CASCADE CONSTRAINTS;
DROP TABLE ticket CASCADE CONSTRAINTS;
DROP TABLE recoveraccount CASCADE CONSTRAINTS;

create table users2 (
mle number(7) primary key,
mdp varchar(8),
promo number(1),
solde number(6,2)
);

create table ticket (
codeticket VARCHAR(4),
date_ticket date ,
repas varchar (14),
quantite number (1),
mle number(7) not null,
foreign key(mle) references users2(mle)
);

create table recoveraccount (
mle number(7) primary key,
PWD varchar (10),
promo number(1),
word varchar (10),
NAME varchar (20),
FAMILYNAME varchar (20),
foreign key(mle) references users2(mle)
);

insert into users2 values (0,'admin123',NULL,NULL);
insert into users2 values (1,'solde123',NULL,NULL);
insert into users2 values (2,'resto123',NULL,N