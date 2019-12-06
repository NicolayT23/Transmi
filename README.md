# Transmi
Consulta e insertar datos desde GET Y POST1
1. Crear Db a traves de  docker usando las siguientes instrucciones 
 docker run -d -p 33060:3306 --name mysql-db -e MYSQL_ROOT_PASSWORD=secret
docker exec -it mysql-db mysql -p

2. Se debe crear una Base de datos en la cual podremos insertar nuestras tablas
 create data base nombre_DB
 
 3. configurar IDE sql y parametrizar ip/localhost / usuario / puerto/ Base de datos
 
 4. Este proyecto solo tiene desarrollados los metodos GET y POST para cada una de las tablas. 
