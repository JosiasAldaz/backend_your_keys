INSERT INTO estado (nombre) VALUES ('Disponible'), ('Alquilado'), ('Reparación'), ('Reservado');

INSERT INTO categoria (nombre) VALUES ('Familiar'), ('Sedán'), ('Deportivo'), ('SUV'), ('Camioneta'), ('Híbrido');

INSERT INTO marca (nombre) VALUES ('CHEVROLET'), ('FORD'), ('TOYOTA'), ('HONDA'), ('VOLKSWAGEN'), ('BMW'), ('MERCEDES-BENZ'), ('AUDI'), ('NISSAN'), ('HYUNDAI');

INSERT INTO modelo (id_marca, nombre) VALUES (1,'AVEO'),(1,'MALIBU'),(1,'EQUINOX'),(2,'FOCUS'),(2,'MUSTANG'),(2,'ESCAPE'),(2,'EXPLORER'),(3,'COROLLA'),(3,'CAMRY'),(3,'RAV4'),(3,'HIGHLANDER'),(4,'CIVIC'),(4,'ACCORD'),(4,'CR-V'),(5,'JETTA'),(5,'GOLF'),(5,'TIGUAN'),(5,'ATLAS'),(6,'3 SERIES'),(6,'5 SERIES'),(6,'X3'),(6,'X5'),(7,'C-CLASS'),(7,'E-CLASS'),(7,'GLC'),(7,'GLE'),(8,'A3'),(8,'A4'),(8,'Q5'),(9,'ALTIMA'),(9,'ROGUE'),(9,'TITAN'),(10,'ELANTRA'),(10,'SONATA'),(10,'TUCSON'),(10,'SANTA FE');

INSERT INTO auto (id_categoria, id_estado, id_modelo, matricula, capacidad, potencia, color, precio_diario) VALUES (1,1,1,'BDC-4859',5,800,'blanco',75.25),(2,1,5,'XYZ-1234',7,900,'azul',95.50),(3,2,9,'QWE-5647',5,750,'negro',80.75),(4,3,15,'JKL-8950',6,820,'rojo',85.00),(5,1,20,'MNO-4566',4,850,'plateado',90.25),(2,2,6,'ABC-7829',7,920,'verde',100.00),(3,3,10,'RST-0112',4,800,'gris',78.50),(4,1,25,'UVW-3145',6,880,'amarillo',88.75),(5,2,30,'HIJ-6748',5,870,'naranja',92.50),(1,3,35,'PQR-9051',7,830,'morado',82.25);

INSERT INTO persona(cedula, nombre1, nombre2, apellido1, apellido2, telefono, direccion, correo, fecha_nac, fecha_reg) VALUES ('0107178527', 'David', 'Ismael', 'Guambaña', 'Quinde', '0988545526', 'Narancay Bajo', 'davichofan@hotmail.com', '2002/03/28', '2024-01-21'), ('1102457896', 'Ana', 'Isabel', 'García', 'Pérez', '0987123456', 'Calle 5 de Mayo #123', 'ana.garcia@gmail.com', '1995/04/22', '2023-12-15'), ('0603789541', 'Carlos', 'Alberto', 'Rodríguez', 'Vargas', '0978654321', 'Av. de los Olmos y las Rosas', 'carlos.rodriguez@gmail.com', '1980/12/03', '2023-11-10'), ('0901567823', 'María', 'Elena', 'López', 'Gómez', '0998123456', 'Calle de las Flores #456', 'maria.lopez@gmail.com', '1985/06/10', '2023-10-01'), ('1205983647', 'Juan', 'Carlos', 'Martínez', 'Pérez', '0967451238', 'Av. de los Cedros y las Palmeras', 'juan.martinez@gmail.com', '1998/02/28', '2023-09-05'), ('0407896231', 'Luisa', 'Fernanda', 'Ramírez', 'Vega', '0934123456', 'Calle del Sol #789', 'luisa.ramirez@gmail.com', '1990/10/15', '2023-08-20'), ('0802463579', 'Gabriel', 'Alejandro', 'Díaz', 'Castro', '0987654321', 'Av. de las Estrellas y los Planetas', 'gabriel.diaz@gmail.com', '1988/07/20', '2023-07-15'), ('0912345678', 'Verónica', 'Paola', 'Hernández', 'Moreno', '0956231458', 'Calle de la Luna #567', 'veronica.hernandez@gmail.com', '1993/03/05', '2023-06-10'), ('1209876543', 'Andrés', 'Felipe', 'Lara', 'Ortega', '0965123789', 'Av. de las Montañas y los Valles', 'andres.lara@gmail.com', '1996/09/18', '2023-05-01'), ('0504321769', 'Sofía', 'Valentina', 'Gutiérrez', 'Mendoza', '0945123786', 'Calle de los Ríos #234', 'sofia.gutierrez@gmail.com', '1987/12/12', '2023-04-15');

INSERT INTO empleado(id_persona,salario) VALUES (1,800),(2,750),(3,950),(4,600),(5,900),(6,700),(7,850);

INSERT INTO cliente(id_persona,licencia,tipo_licencia) VALUES (1,'0107178527','A'),(8,'12345678A','A'),(9,'87654321B','C1'),(10,'56789012C','E'),(4,'09874522B','A'),(6,'56789012D','D1'),(7,'12345678E','G');

INSERT INTO usuario (id_persona, username, password) VALUES (1, 'david777', '1234'), (2, 'juanito555', '5678'), (3, 'tuamigo', 'sada'), (4, 'programer', 'efgh'), (5, 'tester', 'ijkl'), (6, 'analista', 'mnop'), (7, 'clientefavorito', 'qrst'), (9, 'elpro', 'yz12');

INSERT INTO rol (nombre) VALUES ('Admin'), ('Empleado'), ('Cliente');

INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 1), (1, 2), (1,3), (2, 2), (3, 2), (4, 2), (5, 2), (6, 2), (7, 2), (8, 3);

INSERT INTO proteccion (nombre, precio) VALUES ('Protección Parcial', 13.20), ('Protección Total', 28.90), ('Adicional con Cobertura en Responsabilidad a Terceros', 2.68);

INSERT INTO alquiler (id_cliente, id_auto, id_proteccion, id_empleado, fecha_ini, fecha_fin, precio_auto, precio_proteccion, total, tipo_pago, reservado, pagado, fecha_res, fecha_reg) VALUES (1, 1, 1, 1, '2024-02-04', '2024-02-10', 75.25, 13.20, ROUND((75.25 + 13.20) * 1.12, 2), '', true, false, '2022-01-20', '2022-01-20'), (2, 2, 2, 2, '2022-02-01', '2022-02-05', 95.50, 28.90, ROUND((95.50 + 28.90) * 1.12, 2), 'Efectivo', true, true, '2022-01-30', '2022-02-01'), (3, 3, 3, 3, '2022-03-10', '2022-03-15', 80.75, 2.68, ROUND((80.75 + 2.68) * 1.12, 2), '', true, false, '2022-02-28', '2022-02-28'), (4, 4, 1, 4, '2022-04-05', '2022-04-10', 85.00, 13.20, ROUND((85.00 + 13.20) * 1.12, 2), 'Efectivo', false, true, '2022-03-30', '2022-04-05'), (5, 5, 2, 5, '2022-05-15', '2022-05-20', 90.25, 28.90, ROUND((90.25 + 28.90) * 1.12, 2), '', true, false, '2022-04-10', '2022-05-15'), (6, 6, 3, 6, '2022-06-01', '2022-06-05', 100.00, 2.68, ROUND((100.00 + 2.68) * 1.12, 2), 'Efectivo', false, true, '2022-05-20', '2022-06-01'), (5, 7, 1, 7, '2022-07-10', '2022-07-15', 78.50, 13.20, ROUND((78.50 + 13.20) * 1.12, 2), '', true, false, '2022-06-25', '2022-06-25'), (2, 8, 2, 4, '2022-11-10', '2022-11-15', 75.25, 28.90, ROUND((75.25 + 28.90) * 1.12, 2), 'Tarjeta', true, true, '2022-10-28', '2022-11-10'), (2, 9, 3, 5, '2022-12-05', '2022-12-10', 95.50, 2.68, ROUND((95.50 + 2.68) * 1.12, 2), 'Efectivo', false, true, '2022-11-20', '2022-12-05'), (6, 10, 1, 6, '2023-01-15', '2023-01-20', 80.75, 13.20, ROUND((80.75 + 13.20) * 1.12, 2), '', true, false, '2022-12-28', '2023-01-15'), (4, 1, 2, 7, '2024-02-06', '2024-02-09', 85.00, 28.90, ROUND((85.00 + 28.90) * 1.12, 2), 'Efectivo', false, true, '2023-01-15', '2023-02-01'), (5, 2, 1, 1, '2023-07-10', '2023-07-15', 88.25, 12.30, ROUND((88.25 + 12.30) * 1.12, 2), 'Tarjeta', true, true, '2023-06-25', '2023-07-10'), (1, 3, 2, 2, '2023-08-05', '2023-08-10', 78.50, 17.90, ROUND((78.50 + 17.90) * 1.12, 2), 'Efectivo', true, true, '2023-07-20', '2023-08-05');


INSERT INTO devolucion (fecha, id_alquiler) VALUES ('2024-02-08', 2), ('2024-07-20', 4), ('2024-09-25', 9), ('2024-11-20', 11);



