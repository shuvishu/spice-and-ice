run these two commands
in mysql

password and user must be root else you need to configure it in DBConnection.java class

create database spiceice


create table Booking_Status( id int not null AUTO_INCREMENT, name varchar(50) not null, email varchar(50) not null, bookingNumber int not null ,booking_status varchar(20) not null, comments varchar(200) DEFAULT '', PRIMARY KEY (id))