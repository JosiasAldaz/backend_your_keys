INSERT INTO rol (nombre) VALUES ('rol 1');
INSERT INTO rol (nombre) VALUES ('rol 2');
INSERT INTO rol (nombre) VALUES ('rol 3');
INSERT INTO rol (nombre) VALUES ('rol 4');
INSERT INTO rol (nombre) VALUES ('rol 5');

INSERT INTO proteccion (fecha, id_proteccion) VALUES ('2024-01-20', 1);
INSERT INTO proteccion (fecha, id_proteccion) VALUES ('2024-01-22', 2);
INSERT INTO proteccion (fecha, id_proteccion) VALUES ('2024-01-25', 3);
INSERT INTO proteccion (fecha, id_proteccion) VALUES ('2024-01-28', 4);
INSERT INTO proteccion (fecha, id_proteccion) VALUES ('2024-01-30', 5);

INSERT INTO estado(nombre) VALUES('DISPONIBLE');
INSERT INTO estado(nombre) VALUES('ALQUILADO');
INSERT INTO estado(nombre) VALUES('REPARACIÓN');
INSERT INTO categoria(nombre)VALUES('Familiar');
INSERT INTO categoria(nombre) VALUES('Deportivo');
INSERT INTO categoria(nombre) VALUES('Lujo');
INSERT INTO marca(nombre) VALUES('CHEVROLET');
INSERT INTO marca(nombre) VALUES('HUNDAY');
INSERT INTO marca(nombre) VALUES('MERCEDES VENZ');
INSERT INTO marca(nombre) VALUES('CAMARO');
INSERT INTO modelo(id_marca,nombre) VALUES(1,'AVEO');
INSERT INTO modelo(id_marca,nombre) VALUES(1,'CAUTIVA');
INSERT INTO modelo(id_marca,nombre) VALUES(1,'TAHOE');
INSERT INTO modelo(id_marca,nombre) VALUES(2,'TUCSON H3');
INSERT INTO modelo(id_marca,nombre) VALUES(3,'COUPÉ');
INSERT INTO modelo(id_marca,nombre) VALUES(4,'OPTIMUS PRIME');
INSERT INTO modelo(id_marca,nombre) VALUES(3,'CAMPER');
INSERT INTO modelo(id_marca,nombre) VALUES(1,'TRACKER TURBO');
INSERT INTO modelo(id_marca,nombre) VALUES(1,'COLORADO');
INSERT INTO modelo(id_marca,nombre) VALUES(1,'MONTANA');
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(1,1,1,'BDC-4859',5,800,'blanco',75.25);
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(2,1,7,'BDO-4259',2,1500,'plata',150.50);
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(1,1,2,'BDJ-0259',8,1100,'gris claro',100.50);
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(2,1,8,'FDJ-1259',5,1700,'verde oscuro',95.50);
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(1,1,10,'FMJ-2259',8,900,'rojo',75.80);
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(2,1,9,'FKJ-9359',6,1400,'blanco',99.80);
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(1,1,6,'LKJ-0259',6,500,'azul',60.80);
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(3,1,5,'IKJ-0553',2,1500,'azul platino',160.80);
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(1,1,4,'OKJ-4753',6,1100,'blanco',100.80);
INSERT INTO auto(id_categoria,id_estado,id_modelo,matricula,capacidad,potencia,color,precio_diario) VALUES(1,1,3,'KÑJ-1253',8,1300,'negra',120.80);

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0704658624','Roberto','Samuel','Aguilar','Zamora','0987452633','Av. los andes y la primavera','robertosamule@gmail.com','2001/08/15','2024/01/16');

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0704658698','Victor','Javier','Aldaz','Arcalles','0987458853','La occidental','victorjavier@gmail.com','2005/05/01','2024/01/16');

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0704658112','Carlos','David','Oleas','Chimbo','0987847633','Las brisas','Carlosoleas@gmail.com','2004/07/12','2024/01/16');

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0154658112','Frank','Carlos','Barrera','Elmen','0984747633','Puerto bolivar','Frankbarrera@gmail.com','2002/10/12','2024/01/16');

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0125634778','Edison','Ariel','Chicaiza','Chuchuca','0984747078','Las brisas','Edisonchicaiza@gmail.com','2002/07/30','2024/01/16');

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0128794778','Dayana','Patricia','Jima','Arcalles','0984747078','Las brisas','Dayanajima@gmail.com','2002/07/30','2024/01/16');

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0127784778','Fabian','Alberto','Venegas','Valarezo','0984023078','El aguador','Fabianvenegas@gmail.com','2002/07/30','2024/01/16');

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0125026878','Ninfa','Barbie','Carchi','Ambato','0984747777','Deleg','Ninfacarchi@gmail.com','2003/05/30','2024/01/16');


INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0705634778','Manuel','Alberto','Rodriguez','Pintacha','0984747888','El camal','Manuelrodriguez@gmail.com','2003/06/30','2024/03/16');

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0705054778','Chito','Marlon','Vera','Cruz','0984747748','Voluntad de dios','Chitomarlon@gmail.com','1998/04/15','2024/03/16');

INSERT INTO persona(cedula,nombre1,nombre2,apellido1,apellido2,telefono,direccion,correo,fecha_nac,fecha_reg) VALUES('0705685678','Moises','David','Guaman','Coello','0114747888','Pasaje','Moisesguaman@gmail.com','2004/08/30','2024/03/16');

INSERT INTO empleado(id_persona,salario)VALUES(2,1200);
INSERT INTO empleado(id_persona,salario)VALUES(1,1000);
INSERT INTO empleado(id_persona,salario)VALUES(3,1000);
INSERT INTO empleado(id_persona,salario)VALUES(4,1000);

INSERT INTO cliente(id_persona,licencia,tipo_licencia)VALUES(5,'09874522B','TIPO C');
INSERT INTO cliente(id_persona,licencia,tipo_licencia)VALUES(6,'09874742B','TIPO D');
INSERT INTO cliente(id_persona,licencia,tipo_licencia)VALUES(7,'09574522C','TIPO B');
INSERT INTO cliente(id_persona,licencia,tipo_licencia)VALUES(8,'09004522M','TIPO C');

INSERT INTO usuario(id_persona,password,username) VALUES(1,'11111','elpensionesalimenticias');
INSERT INTO usuario(id_persona,password,username) VALUES(2,'22222','hola');
INSERT INTO usuario(id_persona,password,username) VALUES(3,'11111','el');
INSERT INTO usuario(id_persona,password,username) VALUES(4,'11111','trakaaaa');

INSERT INTO alquiler (pagado, precio_auto, precio_protección, reservado, total, fecha_fin, fecha_ini, fecha_reg, id_alquiler, id_auto, id_cliente, id_empleado, id_proteccion, tipo_pago) VALUES (true, 100.50, 20.00, true, 120.50, '2024-01-18 12:00:00', '2024/01/16', '2024/01/16', 1, 1, 1, 1, 1, 'Tarjeta de crédito');
INSERT INTO alquiler (pagado, precio_auto, precio_protección, reservado, total, fecha_fin, fecha_ini, fecha_reg, id_alquiler, id_auto, id_cliente, id_empleado, id_proteccion, tipo_pago) VALUES (true, 120.00, 15.00, true, 135.00, '2024-01-20 14:30:00', '2024/01/18', '2024/01/17', 2, 2, 2, 2, 2, 'Efectivo');
INSERT INTO alquiler (pagado, precio_auto, precio_protección, reservado, total, fecha_fin, fecha_ini, fecha_reg, id_alquiler, id_auto, id_cliente, id_empleado, id_proteccion, tipo_pago) VALUES (false, 80.25, 10.00, false, 90.25, '2024-01-22 10:15:00', '2024/01/20', '2024/01/19', 3, 3, 3, 3, 3, 'Transferencia bancaria');
INSERT INTO alquiler (pagado, precio_auto, precio_protección, reservado, total, fecha_fin, fecha_ini, fecha_reg, id_alquiler, id_auto, id_cliente, id_empleado, id_proteccion, tipo_pago) VALUES (true, 150.75, 25.50, true, 176.25, '2024-01-25 18:45:00', '2024/01/23', '2024/01/22', 4, 4, 4, 4, 4, 'Cheque');

INSERT INTO usuario_rol (id_rol,id_usaurio,id_usuario,id_usuario_rol) VALUES (1,1,1,1);
INSERT INTO usuario_rol (id_rol,id_usaurio,id_usuario,id_usuario_rol) VALUES (2,2,2,2);
INSERT INTO usuario_rol (id_rol,id_usaurio,id_usuario,id_usuario_rol) VALUES (3,3,3,3);

INSERT INTO devolucion (id_alquiler) VALUES (1);
INSERT INTO devolucion (id_alquiler) VALUES (2);
INSERT INTO devolucion (id_alquiler) VALUES (3);
INSERT INTO devolucion (id_alquiler) VALUES (4);


