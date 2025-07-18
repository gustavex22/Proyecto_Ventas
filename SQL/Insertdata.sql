USE SISTEMA_CAHSANDCOLLECT
GO

-- 1. SUCURSALES_BODEGAS
INSERT INTO SUCURSALES_BODEGAS (NOMBRE, DIRECCION, CIUDAD) VALUES
('Bodega Central', 'Av. Principal 123', 'Ciudad A'),
('Bodega Norte', 'Calle Secundaria 456', 'Ciudad B');

-- 2. ROLES
INSERT INTO ROLES (NOMBRE_ROL) VALUES
('ADMINISTRADOR_BODEGA'),
('CLIENTE');

-- 3. PROVEEDOR
INSERT INTO PROVEEDOR (NOMBRE, TELEFONO, CORREO, DIRECCION, FECHA, Total_Compra) VALUES
('Proveedor Uno', '123456789', 'proveedor1@mail.com', 'Calle 1', GETDATE(), 10000),
('Proveedor Dos', '987654321', 'proveedor2@mail.com', 'Calle 2', GETDATE(), 20000);

-- 4. BODEGAS_PROVEEDOR
INSERT INTO BODEGAS_PROVEEDOR (ID_BODEGA, ID_PROVEEDOR) VALUES
(1, 1),
(2, 2);

-- 5. USUARIO
INSERT INTO USUARIO (NOMBRE, CORREO, USUARIO, CONTRASEÑA, TELEFONO, ID_ROL, ACTIVO, IP_ADDRESS, FECHA_CREACION) VALUES
('Juan Perez', 'juan@mail.com', 'juanp', 'pass123', '111111111', 1, 1, '192.168.1.1', GETDATE()),
('Maria Lopez', 'maria@mail.com', 'marial', 'pass456', '222222222', 2, 1, '192.168.1.2', GETDATE());

-- 6. CLIENTE
INSERT INTO CLIENTE (ID_CLIENTE, ID_ROL, PREFERENCIAS, DIRECCION, CODIGO_POSTAL, TARJETA, TIENDA_PREDETERMINADA_ID) VALUES
(2, 2, 'Sin azúcar', 'Calle Cliente', '12345', '1234567890123456', 1);

-- 7. ADMINISTRADOR_BODEGA
INSERT INTO ADMINISTRADOR_BODEGA (ADMIN_ID, ID_ROL, ID_BODEGA, ROL_ADMINISTRATIVO) VALUES
(1, 1, 1, 'ADMINISTRADOR');

-- 8. PEDIDOS
INSERT INTO PEDIDOS (ID_USUARIO, ID_BODEGA, ESTADO, METODO_PAGO, TOTAL) VALUES
(1, 1, 1, 'EFECTIVO', 500),
(2, 2, 1, 'TARJETA', 300);

-- 9. VENTAS
INSERT INTO VENTAS (ID_PEDIDO, ID_USUARIO, FECHA_VENTA, ESTADO) VALUES
(1, 1, '2024-06-25', 'COMPLETADO'),
(2, 2, '2024-06-25', 'PENDIENTE');

-- 10. LOGIN_AUDITORIA
INSERT INTO LOGIN_AUDITORIA (ID_USUARIO, ID_ROL, ESTADO_LOGIN, TIPO_ACCION, CAMPO_MODIFICADO, DATO_ANTERIOR, DATO_NUEVO, FECHA_CREACION, FECHA_ACCION, IP_ADDRESS) VALUES
(1, 1, 'EXITOSO', 'LOGIN', NULL, NULL, NULL, GETDATE(), GETDATE(), '192.168.1.1'),
(2, 2, 'FALLIDO', 'LOGIN', NULL, NULL, NULL, GETDATE(), GETDATE(), '192.168.1.2');

--11. CATEGORIA_PRODUCTOS
INSERT INTO CATEGORIAS_PRODUCTOS(TIPO_CATEGORIA)VALUES 
('ALIMENTOS-BASICOS'),
('BEBIDAS'),
('LIMPIEZA-ASEOPERSONAL'),
('DULCES-SNACKS'),
('PRODUCTOS-FRESCOS'),
('OTROS')


-- 12. PRODUCTOS
INSERT INTO PRODUCTOS (NOMBRE, DESCRIPCION, PRECIO_COSTO, ID_CATEGORIA, ID_PROVEEDOR, ESTADO, FECHA_VENCIMIENTO, FECHA_PRODUCCION) VALUES
('Producto A', 'Descripción A', 10.5, 3, 1, 'ACTIVO', '2025-12-31', '2024-01-01'),
('Producto B', 'Descripción B', 20.0, 4, 2, 'PROMOCION', '2025-11-30', '2024-02-01');

-- 13. INVENTARIO
INSERT INTO INVENTARIO (ID_PRODUCTO, ID_BODEGA, ID_PROVEEDOR, CANTIDAD, FECHA_INGRESO, FECHA_ACTUALIZACION, COSTO_UNITARIO, COSTO_VENTA, ESTADO, MINIMO_STOCK, MAXIMO_STOCK) VALUES
(1, 1, 1, 100, GETDATE(), GETDATE(), 10.5, 15.0, 'ACTIVO', 10, 200),
(2, 2, 2, 50, GETDATE(), GETDATE(), 20.0, 25.0, 'BAJO STOCK', 5, 100);

-- 14. AUDITORIA_STOCK
INSERT INTO AUDITORIA_STOCK (ID_PRODUCTO, ID_INVENTARIO, TIPO_MOVIMIENTO, CANTIDAD_ANTERIOR, CANTIDAD_NUEVA, DESCRIPCION) VALUES
(1, 1, 'INGRESAR', 0, 100, 'Ingreso inicial de stock'),
(2, 2, 'SALIDA', 50, 45, 'Venta de producto');

-- 15. DETALLE_VENTAS
INSERT INTO DETALLE_VENTAS (ID_DETALLE, ID_VENTAS, ID_PRODUCTO, CANTIDAD, PRECIO_UNITARIO) VALUES
(1, 1, 1, 2, 15.0),
(2, 2, 2, 1, 25.0);

-- 16. DEVOLUCION
INSERT INTO DEVOLUCION (ID_VENTAS, ID_USUARIO, ID_PRODUCTO, MOTIVO, FECHA, CANTIDAD_DEVUELTA) VALUES
(1, 1, 1, 'Producto defectuoso', GETDATE(), 1),
(2, 2, 2, 'No era lo esperado', GETDATE(), 1);