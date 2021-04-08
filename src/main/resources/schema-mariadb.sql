drop table if exists videojuego;
drop table if exists distribuidor;

create table videojuego
(
    id          int primary key auto_increment,
    nombre      varchar(200) not null,
    descripcion varchar(3000),
    imagen_url  varchar(500)
);

INSERT INTO videojuego
(id, nombre,                descripcion,                                                    imagen_url)value
( 1 , 'Borderlands 3',             'En stock',                                                  'https://store-images.s-microsoft.com/image/apps.29324.71029176982638972.07f274c3-060d-4786-b7b2-69156454002c.8b96fcc3-c9bd-4c79-a956-a9bd3ef02895'),
( 2 ,'Call of Duty MW',            'En stock',                                                  'https://store-images.s-microsoft.com/image/apps.50528.68332208580498659.9222b095-8101-4531-b386-33547ee9944f.948f2c50-2f29-43df-9557-4670f69840d1'),
( 3 ,'AssassinS Creed ODYSSEY',    'En stock',                                                  'https://1.bp.blogspot.com/-amzy02Z6PkE/XlN6BylPFkI/AAAAAAAAGhg/I34VBr0KTB4nu36ZFtEgthj92KDb2or2gCLcBGAsYHQ/s1600/512706-assassin-s-creed-odyssey-gold-edition-xbox-one-front-cover.jpg'),
( 4 ,'Star Wars BATTLEFRONTT II',  'En stock',                                                  'https://store-images.s-microsoft.com/image/apps.31281.64256825846959382.44b5bc43-437a-4414-83ca-b41ba9e7764a.86abb8aa-f419-4a90-b6aa-cf79b4228f06'),
( 5 ,'Men of war assault squad 2', 'En stock',                                                  'https://www.gamestorrents.nu/wp-content/uploads/2018/11/MEN-.jpg'),
( 6 ,'Cyberpunk 2077',             'En stock',                                                  'https://www.xtrafondos.com/descargar.php?id=3186&resolucion=5120x2880'),
( 7 ,'Call of duty cold war',      'En stock',                                                  'https://bnetcmsus-a.akamaihd.net/cms/blog_header/ft/FTVK4BD7ZFLX1601490185538.jpg'),
( 8 ,'Civilization 6',             'En stock',                                                  'http://cdn.2kgames.com/civilization.com/750x1334.jpg');

create table distribuidor
(
    id        int primary key auto_increment,
    nombre    varchar(200) not null,
    sitio_web varchar(500)
);

insert into distribuidor
(id,    nombre,            sitio_web)value
(1,     '2K',              null),
(2,     'Focus home',      null),
(3,     'Thekla',          null),
(4,     'Number one',      null),
(5,     '505 games',       null),
(6,     'Unknown Worlds',  null),
(7,     'Campo santo',     null);

alter table videojuego
add column distribuidor_id int,
add foreign key (distribuidor_id) references distribuidor(id);

update videojuego set distribuidor_id = 1 where id in (1, 5);
update videojuego set distribuidor_id = 2 where id in (2);
update videojuego set distribuidor_id = 3 where id in (3);
update videojuego set distribuidor_id = 4 where id in (4);
update videojuego set distribuidor_id = 5 where id in (6);
update videojuego set distribuidor_id = 6 where id in (7);
update videojuego set distribuidor_id = 7 where id in (8);

alter table videojuego
modify distribuidor_id int not null;