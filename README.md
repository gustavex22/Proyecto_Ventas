# Backend:
  paso N°1: Crear un proyecto de java usando Sprint boot
  paso N°2: Abrir Application .properties , y conectarlo a una base de datos en sql
  


Ejecutar Proyecto backend

# Instalar Maven Terminal

#Usar el Bin complementos y Descomprimirlo 

#Añadir en las variables de entorno

MAVEN_HOME: Crea una nueva variable de entorno llamada MAVEN_HOME y apunta al directorio raíz de Maven (donde se encuentra la carpeta bin). 
M2_HOME: Crea una nueva variable de entorno llamada M2_HOME y también apunta al directorio raíz de Maven. 
PATH: Agrega el directorio bin de Maven a la variable de entorno PATH. Esto permite ejecutar el comando mvn desde cualquier ubicación en la terminal. 


# Comprobar Instalacion usando el comando mvn -version en la terminal (Se requiere reiniciar PC) 


# limpiar copilacion
  mvn clean package -DskipTests

# Ejecutar proyecto
  mvn spring-boot:run

# Alternativa usar el mvnw ,agregado al proyecto , no necesita instalacion solo reemplazar (mvn) por (./mvnw) solo funciona en la terminal de powershell

# Entrar a la pagina
  http://localhost:8080/api/productos

  #Cambiar la ultima palabra por la tabla que quieras observar

#Extra , la url a la que consultes mostrara el registo en la terminal-





# Copilar codigo TS a JS
  usar tsc --init para inciar el copilador

  # usar ( tsc nombre_del_archivo.ts) o solo (tsc) para compilar todos los archivos ts
  esto genera un archivo js basado del archivo ts ,para uso en tml5 
