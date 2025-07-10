var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
// Variables
var tableData = [];
var nextId = 1;
// Elementos del DOM
var tableBody = document.querySelector('#table1 tbody');
var addSampleBtn = document.getElementById('addSampleData');
var clearTableBtn = document.getElementById('clearTable');
var addRowBtn = document.getElementById('addRowBtn');
var nameInput = document.getElementById('nameInput');
var ageInput = document.getElementById('ageInput');
var emailInput = document.getElementById('emailInput');
// Función para renderizar la tabla
function renderTable() {
    tableBody.innerHTML = '';
    tableData.forEach(function (persona) {
        var row = document.createElement('tr');
        row.innerHTML = "\n                    <td>".concat(persona.nombre, "</td>\n                    <td>").concat(persona.edad, "</td>\n                    <td>").concat(persona.email, "</td>\n                    <td>\n                        <button class=\"delete-btn\" data-id=\"").concat(persona.id, "\">Eliminar</button>\n                    </td>\n                ");
        tableBody.appendChild(row);
    });
    // Agregar event listeners para los botones de eliminar
    document.querySelectorAll('.delete-btn').forEach(function (btn) {
        btn.addEventListener('click', function (e) {
            var id = parseInt(e.target.getAttribute('data-id'));
            deleteRow(id);
        });
    });
}
// Función para añadir una persona
function addPerson(persona) {
    tableData.push(__assign({ id: nextId++ }, persona));
    renderTable();
}
// Función para eliminar una fila
function deleteRow(id) {
    tableData = tableData.filter(function (persona) { return persona.id !== id; });
    renderTable();
}
// Event Listeners
addSampleBtn.addEventListener('click', function () {
    var sampleData = [
        { nombre: 'Juan Pérez', edad: 30, email: 'juan@example.com' },
        { nombre: 'María García', edad: 25, email: 'maria@example.com' },
        { nombre: 'Carlos López', edad: 35, email: 'carlos@example.com' }
    ];
    sampleData.forEach(function (persona) { return addPerson(persona); });
});
clearTableBtn.addEventListener('click', function () {
    tableData = [];
    renderTable();
});
addRowBtn.addEventListener('click', function () {
    var nombre = nameInput.value.trim();
    var edad = parseInt(ageInput.value);
    var email = emailInput.value.trim();
    if (!nombre || isNaN(edad) || !email) {
        alert('Por favor, complete todos los campos correctamente');
        return;
    }
    addPerson({ nombre: nombre, edad: edad, email: email });
    // Limpiar inputs
    nameInput.value = '';
    ageInput.value = '';
    emailInput.value = '';
    nameInput.focus();
});
// Permitir añadir con Enter
document.querySelectorAll('input').forEach(function (input) {
    input.addEventListener('keypress', function (e) {
        if (e.key === 'Enter') {
            addRowBtn.click();
        }
    });
});
