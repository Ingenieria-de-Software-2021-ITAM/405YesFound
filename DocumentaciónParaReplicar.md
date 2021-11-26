# Documentación para replicar
Se utilizará Docker para estandarizar el ambiente, ya sea de desarrollo, pruebas o producción.

## Requerimientos
Se requiere:
- glassfish5
- Java JDK 1.8
- Windows 10 para el servidor 

Para instanciar una imagen con Docker see puede ver este [tutorial](https://github.com/docker/labs/blob/master/windows/windows-containers/README.md)

# Procedimiento para cargar la BD
1. Descargar el archivo script.sql que se encuentra en la raíz del proyecto.
2. Ejecutar el archivo ij.bat que se encuentra en la ruta ..\glassfish5\javadb\bin
3. Ejecutar el siguiente comando

```
RUN '.../script.sql';
```

# Procedimiento para iniciar el servidor y hacer el deploy de la app

1. Descargar glassfish5 [aquí](https://download.oracle.com/glassfish/5.0/release/index.html)
2. Descargar el zip con los war del proyecto [aquí](https://drive.google.com/file/d/1CLyUzMjUDQMgdmazkUWmzB14S9B57D3G/view?usp=sharing)
3. Ingresar a la ruta ..\glassfish5\glassfish\domains\domain1\applications\__internal\ y descomprimir el archivo rar del paso anterior.
4. Entrar a la carpeta \glassfish5\bin y ejecutar el archivo asadmin.bat
5. Cuando se abra la terminal ejecutaremos el siguiente código para empezar el servidor:
```
asadmin start-domain --verbose
```
6. Puedes abrir la página web en http://{YOUR_IP_ADDRESS}:8080/ProyectoFinal/index.html



