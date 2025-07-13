use SISTEMA_CAHSANDCOLLECT
go
CREATE PROCEDURE sp_Eliminarproducto
    @id int
AS
BEGIN
    -- Lógica del procedimiento
    delete from productos where ID_PRODUCTO = @id
END;
go
CREATE PROCEDURE sp_Agregarproducto
    @Nombre varchar,
	@Descripcion varchar(300),
	@precio_costo decimal(10,2),
	@idcategoria int,
	@idproveedor int,
	@estado varchar,
	@fechavencimiento date,
	@fechaproduccion date

AS
BEGIN
    INSERT INTO productos(NOMBRE,DESCRIPCION,PRECIO_COSTO,ID_CATEGORIA,ID_PROVEEDOR,ESTADO,FECHA_VENCIMIENTO,FECHA_PRODUCCION)values
	(@Nombre,@Descripcion,@precio_costo,@idcategoria,@idproveedor,@estado,@fechavencimiento,@fechaproduccion)
    
END;
go
CREATE PROCEDURE sp_Seleccionarproducto
AS
BEGIN
    -- Lógica del procedimiento
    select * from productos
END;