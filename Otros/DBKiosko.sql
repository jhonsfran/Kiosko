/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

DROP TABLE IF EXISTS login;
DROP TABLE IF EXISTS paciente;
DROP TABLE IF EXISTS auxiliar;
DROP TABLE IF EXISTS antecedentes_personales;
DROP TABLE IF EXISTS antecedentes_familiares;
DROP TABLE IF EXISTS unidad_tiempo;
DROP TABLE IF EXISTS log;

CREATE TABLE login(
    login_user VARCHAR(30) PRIMARY KEY,
    login_password VARCHAR(50) NOT NULL
);

CREATE TABLE paciente(
    pac_tipo_id VARCHAR(10) NOT NULL,
    pac_id VARCHAR(30) PRIMARY KEY,
    pac_apellido1 VARCHAR(50) NOT NULL,
    pac_apellido2 VARCHAR(50) NOT NULL,
    pac_nombres VARCHAR(50) NOT NULL,
    pac_edad VARCHAR(3) NOT NULL, 
    pac_sexo CHAR(1) NOT NULL,
    pac_unidad_edad integer NOT NULL,
    pac_fecha_nacimiento DATE NOT NULL,
    pac_ocupacion VARCHAR(50),
    pac_celular VARCHAR(50),
    pac_telefono VARCHAR(50),
    pac_email VARCHAR(50),
    pac_direccion VARCHAR(50),
    pac_fecha_registro DATE NOT NULL,
    pac_estado boolean NOT NULL
);

CREATE TABLE auxiliar(
    aux_tipo_id VARCHAR(10) NOT NULL,
    aux_id VARCHAR(30) PRIMARY KEY,
    aux_apellido1 VARCHAR(50) NOT NULL,
    aux_apellido2 VARCHAR(50) NOT NULL,
    aux_nombres VARCHAR(50) NOT NULL,
    aux_fecha_registro DATE NOT NULL,
    aux_estado boolean NOT NULL
);

CREATE TABLE antecedentes_personales(
	ap_id SERIAL PRIMARY KEY,
	ap_id_paciente VARCHAR(10) NOT NULL,
    ap_infarto BOOLEAN,
    ap_hipertension BOOLEAN,
    ap_diabetes BOOLEAN,
    ap_acv BOOLEAN,
    ap_fuma_cigarrillo BOOLEAN,
    ap_frecuencia_cigarrillo integer,
    ap_unidad_frecuencia_cigarillo integer,
    ap_hace_cuanto_cigarrillo integer,
    ap_unidad_hace_cuanto_cigarillo integer,
    ap_convive_con_fumadores BOOLEAN,
    ap_consume_licor BOOLEAN,
    ap_frecuencia_licor integer,
    ap_unidad_frecuencia_licor integer,
    ap_hace_cuanto_licor integer,
    ap_unidad_hace_cuanto_licor integer,
    ap_consume_otras_sustancias BOOLEAN,
    ap_frecuencia_otras_sustancias integer,
    ap_unidad_frecuencia_otras_sustancias integer,
    ap_hace_cuanto_otras_sustancias integer,
    ap_unidad_hace_cuanto_otras_sustancias integer,
    ap_actividad_fisica BOOLEAN,
    ap_frecuencia_actividad_fisica integer,
    ap_unidad_frecuencia_actividad_fisica integer,
    ap_medicamentos VARCHAR(500)
);

CREATE TABLE antecedentes_familiares(
	af_id SERIAL PRIMARY KEY,
	af_id_paciente VARCHAR(10) NOT NULL,
    af_abuelos_infarto boolean,
    af_padres_infarto boolean,
    af_tios_infarto boolean,
    af_hermanos_infarto boolean,
    af_abuelos_diabetes boolean,
    af_padres_diabetes boolean,
    af_tios_diabetes boolean,
    af_hermanos_diabetes boolean,
    af_abuelos_hipertension boolean,
    af_padres_hipertension boolean,
    af_tios_hipertension boolean,
    af_hermanos_hipertension boolean,
    af_abuelos_acv boolean,
    af_padres_acv boolean,
    af_tios_acv boolean,
    af_hermanos_acv boolean
);

CREATE TABLE log(
    id_log SERIAL PRIMARY KEY,
    table_nombre VARCHAR(10) NOT NULL,
    operacion VARCHAR(10),
    old_value VARCHAR(100),
    new_value VARCHAR(100),
    user_name VARCHAR(30) NOT NULL,
    date_operation DATE NOT NULL
);

CREATE TABLE unidad_tiempo(
    ut_id SERIAL  PRIMARY KEY,
    ut_nombre VARCHAR(20) NOT NULL
);

ALTER TABLE paciente ADD CONSTRAINT fk_pc_us FOREIGN KEY (pac_id) REFERENCES login(login_user);
ALTER TABLE auxiliar ADD CONSTRAINT fk_ax_us FOREIGN KEY (aux_id) REFERENCES login(login_user);

ALTER TABLE antecedentes_personales ADD CONSTRAINT fk_pc_ufc FOREIGN KEY (ap_unidad_frecuencia_cigarillo) REFERENCES unidad_tiempo(ut_id);
ALTER TABLE antecedentes_personales ADD CONSTRAINT fk_pc_uhc FOREIGN KEY (ap_unidad_hace_cuanto_cigarillo) REFERENCES unidad_tiempo(ut_id);

ALTER TABLE antecedentes_personales ADD CONSTRAINT fk_ap_ufl1 FOREIGN KEY (ap_unidad_frecuencia_licor) REFERENCES unidad_tiempo(ut_id);
ALTER TABLE antecedentes_personales ADD CONSTRAINT fk_ap_uhl1 FOREIGN KEY (ap_unidad_hace_cuanto_licor) REFERENCES unidad_tiempo(ut_id);

ALTER TABLE antecedentes_personales ADD CONSTRAINT fk_ap_ufo FOREIGN KEY (ap_unidad_frecuencia_otras_sustancias) REFERENCES unidad_tiempo(ut_id);
ALTER TABLE antecedentes_personales ADD CONSTRAINT fk_ap_uho FOREIGN KEY (ap_unidad_hace_cuanto_otras_sustancias) REFERENCES unidad_tiempo(ut_id);

ALTER TABLE antecedentes_personales ADD CONSTRAINT fk_ap_ufl FOREIGN KEY (ap_unidad_frecuencia_actividad_fisica) REFERENCES unidad_tiempo(ut_id);

ALTER TABLE antecedentes_personales ADD CONSTRAINT fk_ap_us FOREIGN KEY (ap_id_paciente) REFERENCES paciente(pac_id);
ALTER TABLE antecedentes_familiares ADD CONSTRAINT fk_af_us FOREIGN KEY (af_id_paciente) REFERENCES paciente(pac_id);

INSERT INTO unidad_tiempo VALUES (1,'Años');