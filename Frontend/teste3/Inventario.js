let productos = [];
let idCounter = 1;
let editandoId = null;

// Inputs
const nombreInput = document.getElementById("nombreInput");
const categoriaInput = document.getElementById("categoriaInput");
const precioInput = document.getElementById("precioInput");
const stockInput = document.getElementById("stockInput");
const tablaBody = document.getElementById("tablaBody");

// Botones
document.getElementById("btnAgregar").addEventListener("click", agregarProducto);
document.getElementById("btnEjemplo").addEventListener("click", cargarEjemplos);
document.getElementById("btnLimpiar").addEventListener("click", () => {
  productos = [];
  renderTabla();
});

// Agregar o editar
function agregarProducto() {
  const nombre = nombreInput.value.trim();
  const categoria = categoriaInput.value.trim();
  const precio = parseFloat(precioInput.value);
  const stock = parseInt(stockInput.value);

  if (!nombre || !categoria || isNaN(precio) || isNaN(stock)) {
    alert("Por favor, completa todos los campos.");
    return;
  }

  if (editandoId !== null) {
    // Editar existente
    const producto = productos.find(p => p.id === editandoId);
    producto.nombre = nombre;
    producto.categoria = categoria;
    producto.precio = precio;
    producto.stock = stock;
    editandoId = null;
  } else {
    // Agregar nuevo
    productos.push({ id: idCounter++, nombre, categoria, precio, stock });
  }

  limpiarFormulario();
  renderTabla();
}

function renderTabla() {
  tablaBody.innerHTML = "";

  productos.forEach(p => {
    const fila = document.createElement("tr");
    fila.innerHTML = `
      <td>${p.nombre}</td>
      <td>${p.categoria}</td>
      <td>S/. ${p.precio.toFixed(2)}</td>
      <td>${p.stock}</td>
      <td>
        <button class="btn-edit" onclick="editar(${p.id})">Editar</button>
        <button class="btn-delete" onclick="eliminar(${p.id})">Eliminar</button>
      </td>
    `;
    tablaBody.appendChild(fila);
  });
}

function editar(id) {
  const producto = productos.find(p => p.id === id);
  if (producto) {
    nombreInput.value = producto.nombre;
    categoriaInput.value = producto.categoria;
    precioInput.value = producto.precio;
    stockInput.value = producto.stock;
    editandoId = id;
  }
}

function eliminar(id) {
  if (confirm("¿Eliminar este producto?")) {
    productos = productos.filter(p => p.id !== id);
    renderTabla();
  }
}

function cargarEjemplos() {
  const ejemplos = [
    { nombre: "Laptop HP", categoria: "Tecnología", precio: 2500, stock: 8 },
    { nombre: "Mouse Logitech", categoria: "Accesorios", precio: 80, stock: 50 },
    { nombre: "Teclado Redragon", categoria: "Accesorios", precio: 120, stock: 30 }
  ];
  ejemplos.forEach(e => {
    productos.push({ ...e, id: idCounter++ });
  });
  renderTabla();
}

function limpiarFormulario() {
  nombreInput.value = "";
  categoriaInput.value = "";
  precioInput.value = "";
  stockInput.value = "";
  editandoId = null;
}
