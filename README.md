Backend:
  paso N°1: Crear un proyecto de java usando Sprint boot
  paso N°2: Abrir Application .properties , y conectarlo a una base de datos en sql
  


Ejecutar Proyecto backend

#limpiar copilacion
  mvn clean package

#Ejecutar proyecto
  mvn spring-boot:run

#Entrar a la pagina
  http://localhost:8080/api/productos

  #Cambiar la ultima palabra por la tabla que quieras observar

#Extra , la url a la que consultes mostrara el registo en la terminal-