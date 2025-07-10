
        // Definición de interfaces

        //? se define cada interfaz para ordenar los los datos recibidos del JSON
        interface Proveedor {
            id_PROVEEDOR: number;
            direccion: string;
            telefono: string;
            total_COMPRA: number;
            fecha: string;
            nombre: string;
            correo: string;
        }

        interface Producto {
            proveedor: Proveedor;
            id_PRODUCTO: number;
            descripcion: string;
            precio_COSTO: number;
            nombre_CATEGORIA: string;
            fecha_VENCIMIENTO: string;
            fecha_PRODUCCION: string;
            estado: string;
            nombre: string;
        }

        // Función para obtener productos


        async function obtenerProductos() { //? async , indica que contiene operaciones con un tiempo variado de ejecucion , en este caso usa una url  por red por lo que es valido usarlo
            try {
                const response = await fetch('http://localhost:8080/api/productos'); //? fetch , comando para hacer solicitudes get a urls , await se usa para darle tiempo al ocmando fetch en la solicitud http
                const productos: Producto[] = await response.json();
                mostrarProductos(productos);
            } catch (error) {
                console.error('Error al obtener productos:', error);
            }
        }

        // Función para mostrar productos en la tabla
        function mostrarProductos(productos: Producto[]) {
            const tbody = document.querySelector('#productos tbody');
            if (tbody) {
                tbody.innerHTML = ''; // Limpiar el cuerpo de la tabla
                productos.forEach(producto => {
                    const row = document.createElement('tr');
                    row.innerHTML = `
                        <td>${producto.nombre}</td>
                        <td>${producto.descripcion}</td>
                        <td>$${producto.precio_COSTO}</td>
                        <td>${producto.proveedor.nombre}</td>
                        <td>${producto.estado}</td>
                    `;
                    tbody.appendChild(row);
                });
            }
        }

        // Función para agregar un nuevo producto
        document.getElementById('productoForm')?.addEventListener('submit', function(event) {
            event.preventDefault(); // Prevenir el envío del formulario

            const nuevoProducto: Producto = {
                proveedor: {
                    id_PROVEEDOR: 0, // Asigna un ID adecuado o maneja esto en el backend
                    direccion: '',
                    telefono: '',
                    total_COMPRA: 0,
                    fecha: '',
                    nombre: document.getElementById('proveedor')?.value || '',
                    correo: ''
                },
                id_PRODUCTO: 0, // Asigna un ID adecuado o maneja esto en el backend
                descripcion: document.getElementById('descripcion')?.value || '',
                precio_COSTO: parseFloat(document.getElementById('precio')?.value || '0'),
                nombre_CATEGORIA: '', // Asigna una categoría adecuada
                fecha_VENCIMIENTO: '', // Asigna una fecha adecuada
                fecha_PRODUCCION: '', // Asigna una fecha adecuada
                estado: document.getElementById('estado')?.value || '',
                nombre: document.getElementById('nombre')?.value || ''
            };

            // Aquí puedes enviar el nuevo producto al backend
            console.log('Nuevo producto:', nuevoProducto);
            // Puedes hacer un POST a tu API aquí

            // Limpiar el formulario
            document.getElementById('productoForm')?.reset();
        });

        // Llamar a la función para obtener productos al cargar la página
        window.onload = obtenerProductos;