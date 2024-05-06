-- 1º
-- Crear usuario juan
-- Indicar siempre localhost
-- password: null
-- Privilegios: solo accede a bbdd test
create user juan@localhost;

-- 2º
-- Crear usuario pedro
-- Indicar siempre localhost
-- password: 123456
-- Privilegios: solo accede a bbdd test
create user pedro@localhost identified by '123456';

-- 3º
-- Crear usuario maria
-- Indicar siempre localhost
-- password: encriptada 123456
-- Privilegios: solo accede a bbdd test
-- Aunque password salga subrayado lo ejecuta bien, sino le ponemos el password lo que hace es encriptar como si fuera una contrasenia no encriptada
create user maria@localhost identified by password '*6BB4837EB74329105EE4568DDA7DC67ED2CA2AD9';

-- 4º
-- Eliminar a maria
drop user maria@localhost;
drop user juan@localhost;
drop user pedro@localhost;