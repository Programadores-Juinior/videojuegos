create table videojuego
(
    id          int primary key auto_increment,
    nombre      varchar(200) not null,
    descripcion varchar(3000),
    imagen_url  varchar(500)
);

INSERT INTO videojuego
(nombre,                descripcion,                                                    imagen_url)VALUES
('Borderlands 3',              'En stock',                                                  'https://store-images.s-microsoft.com/image/apps.29324.71029176982638972.07f274c3-060d-4786-b7b2-69156454002c.8b96fcc3-c9bd-4c79-a956-a9bd3ef02895'),
('Call of Duty MW',            'En stock',                                                  'https://store-images.s-microsoft.com/image/apps.50528.68332208580498659.9222b095-8101-4531-b386-33547ee9944f.948f2c50-2f29-43df-9557-4670f69840d1'),
('AssassinS Creed ODYSSEY',    'En stock',                                                  'https://1.bp.blogspot.com/-amzy02Z6PkE/XlN6BylPFkI/AAAAAAAAGhg/I34VBr0KTB4nu36ZFtEgthj92KDb2or2gCLcBGAsYHQ/s1600/512706-assassin-s-creed-odyssey-gold-edition-xbox-one-front-cover.jpg'),
('Star Wars BATTLEFRONTT II',  'En stock',                                                  'https://store-images.s-microsoft.com/image/apps.31281.64256825846959382.44b5bc43-437a-4414-83ca-b41ba9e7764a.86abb8aa-f419-4a90-b6aa-cf79b4228f06');