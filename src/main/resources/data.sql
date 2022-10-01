create table USER_DETAILS(
id integer not null,
username varchar(255) not null,
password varchar(255) not null,
primary key(id)
);

create table PRODUCT_DETAILS(
id integer not null,
name varchar(255) not null,
ptype varchar(150) not null,
description varchar(255) not null,
primary key(id)
);

insert into USER_DETAILS(id,username,password) values(1,'srinath','srinath');
insert into PRODUCT_DETAILS(id,name,ptype,description) values (1,'Rihanna song','music','umbrella');
insert into PRODUCT_DETAILS(id,name,ptype,description) values (2,'Java','book','Java for beginners');
insert into PRODUCT_DETAILS(id,name,ptype,description) values (3,'GTA','game','Vice City');
insert into PRODUCT_DETAILS(id,name,ptype,description) values (4,'Jenifer lopez','music','On the floor');
insert into PRODUCT_DETAILS(id,name,ptype,description) values (5,'React js framework','book','React for beginners');
insert into PRODUCT_DETAILS(id,name,ptype,description) values (6,'Road rash','game','Road rash 5');
