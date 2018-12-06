Descargar JDK version 8
-https://www.oracle.com/technetwork/java/javase/downloads/
- instalar Java 

Editar variables de entorno
- Agregar nueva variable del sistema 
    - Nombre: JAVA_HOME
    - Valor: (agregar la ruta de la carpeta bin de Java) 
      Ejemplo:  C:\Program Files\Java\jdk1.7.0_80\bin
 
 -Editar Path 
    - Nuevo: %JAVA_HOME%\
    - Nuevo: (agregar la ruta de la carpeta bin de Java) 
    
Descargar Netbeans
Instalar Netbeans 
Instalar glassfish
 - Entrar a Services en netbeans 
 - Clik derecho en servers
 - Agregar Server 
 - Seleccionar Glassfish
 - Seleccionar Remote Domain 
 - Descargar 
 
Descargar proyecto 
Editar conexión
  - SilverJuridico->Other Sources ->src/main/resources ->default package->hibernate.cfg.xml
  - Modificar url, username, password para conexión local 

Desplegar proyecto
  -clck derecho sobre el proyecto ->run
  
