Create database Medicamento;

use Medicamento;


create table tb_Medicamento(
	idMedicamento		int 		primary key,
	nombre				varchar		(255),
    descripcion			text,
    categoria			varchar		(50),
    precio				decimal		(10, 2),
    stock				int,
    fechaVencimiento	date,
    proveedor			varchar		(100)
);

insert into tb_Medicamento values (1, "Paracetamol", "Analgesico comun", "Analgesico", 5, "100", "2024-12-31", "Generico Pharma");
    
insert into tb_Medicamento values(2, "Amoxicilina", "Antibiotico", "Antibiotico", 10.5, "50", "2023-11-15", "Farmacia A");
    
insert into tb_Medicamento values(3, "Vitamina C", "Suplemento Vitaminico", "Vitaminas", 8.75, "75", "2024-08-01", "Proveedor B");
    
insert into tb_Medicamento values(4, "Ibuprofeno", "Antiflamatorio", "Analgesico", 6.25, "60", "2023-10-20", "Generico Pharma");
    
insert into tb_Medicamento values(5, "Omeprazol", "Medicamento GI", "GI", 12.3, "40", "2023-12-10", "Farmacia A");
