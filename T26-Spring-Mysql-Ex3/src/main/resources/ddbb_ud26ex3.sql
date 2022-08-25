DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS cajeros;
DROP TABLE IF EXISTS maquina_reg;
DROP TABLE IF EXISTS venta;


CREATE TABLE productos (
id int auto_increment primary key,
nombre varchar (100),
precio double
);
CREATE TABLE cajeros (
id int auto_increment primary key,
nomApels varchar(255)
);
CREATE TABLE maquina_reg (
id int auto_increment primary key,
piso int
);
CREATE TABLE venta (
id int PRIMARY KEY AUTO_INCREMENT,
id_prod int,
id_cajero int,
id_maquina int,
FOREIGN KEY (id_cajero) REFERENCES cajeros (id_cajero),
FOREIGN KEY (id_maquina) REFERENCES maquina_regs (id_maquina),
FOREIGN KEY (id_prod) REFERENCES productos (id)
);

INSERT INTO productos (nombre, precio) values ('zanahoria',11);
INSERT INTO productos (nombre, precio) values ('melon',22);
INSERT INTO productos (nombre, precio) values ('sandia',33);

INSERT INTO cajeros (nomApels) values ('CAJERO_1');
INSERT INTO cajeros (nomApels) values ('CAJERO_2');
INSERT INTO cajeros (nomApels) values ('CAJERO_3');

INSERT INTO maquinas_registradoras (piso) values (1);
INSERT INTO maquinas_registradoras (piso) values (2);
INSERT INTO maquinas_registradoras (piso) values (3);

INSERT INTO venta (id_prod, id_cajero, id_maquina) values (1, 1, 1);
INSERT INTO venta (id_prod, id_cajero, id_maquina) values (11, 11, 11);
INSERT INTO venta (id_prod, id_cajero, id_maquina) values (31, 31, 31);

