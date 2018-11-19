# WebAppRPC
Llamada a procedimientos remotos con servidor PHP, cliente JAVA e IDL Thrift

# Se implementaron dos metodos por cada tipo de respuesta
## 1: Tipo primitivo
   - Email de socio por nombre de usuario del socio
   - Localidad de filial por id de filial
   - Dia de mantenimiento de filial por localidad
## 2: Excepción
   - UserIncorrecto en traerMailSocio de Socio
   - IdIncorrecto en traerLocalidad de Filial
## 3: Entidad
   - Socio por apellido
   - Cancha por id de cancha
## 4: Lista de entidades
   - Lista de canchas que tengan un determinado deporte
   - Lista de turnos segun el estado
